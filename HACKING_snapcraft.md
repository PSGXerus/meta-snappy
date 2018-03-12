# Snapcraft as a native tool for the meta-snappy layer

## Table of contents

 - [Introduction](#introduction)
    - [Scope](#scope)
    - [Markup](#markup)
  - [1. Development Setup](#1-development-setup)
  - [2. Testing Snapcraft](#2-testing-snapcraft)
      - [Snapcraft testing](#snapcraft-testing)
      - [Hello world snap](#hello-world-snap)
  - [Appendix](#appendix)

## Introduction

### Scope

This document shows the current state of snapcraft as a native tool for meta-snappy.

**TASKS:**  
In order to function properly, a backend for yocto, based on snapcraft/internal/repo/_base.py has to be written. Currently, build-packages and installed-packages are hardcoded to [].

###  Markup

* [Automatic TOC generation](http://tableofcontent.eu/)
* [General form](https://docs.gitlab.com/ee/user/markdown.html)

* Git Flavored Markdown editor Ghostwriter

```shell
$ sudo add-apt-repository ppa:wereturtle/ppa
$ sudo apt update
$ sudo apt install ghostwriter
```

## 1. Development setup

```shell
$ git clone git://git.yoctoproject.org/poky --branch rocko
$ cd poky
$ git clone git://git.openembedded.org/meta-openembedded --branch rocko
$ git clone https://github.com/PSGXerus/meta-snappy.git --branch js/support-for-snapcraft
$ . ./oe-init-build-env
```
Add these layers to build/conf/bblayers.conf BBLAYERS

>
> \<your\_dir>/poky/meta-openembedded/meta-filesystems  
> \<your\_dir>/poky/meta-openembedded/meta-oe  
> \<your\_dir>/poky/meta-openembedded/meta-python  
> \<your\_dir>/poky/meta-snappy  
>

Add this to build/conf/local.conf

>
>DISTRO\_FEATURES\_append = " systemd"  
>VIRTUAL-RUNTIME\_init\_manager = "systemd"  
>DISTRO\_FEATURES\_BACKFILL\_CONSIDERED = "sysvinit"  
>VIRTUAL-RUNTIME\_initscripts = ""  
>ROOT\_HOME = "/root"  
>

## 2. Testing Snapcraft

#### [Snapcraft testing](https://raw.githubusercontent.com/snapcore/snapcraft/master/TESTING.md)
Currently fails at manifest creation due to missing yocto backend.

```shell
$ bitbake snapcraft-test-native -c devshell
$ ./runtests.sh snapcraft/tests/unit/
```

#### Hello world snap

```shell
$ bitbake snapd-demo-image
$ runqemu
$ root
$ snap install --devmode /var/lib/snapd/snaps/hello_2.10_i386.snap
$ hello
```

## Appendix

* [Yocto mega manual](https://www.yoctoproject.org/docs/latest/mega-manual/mega-manual.html)
* [Source for python packages](https://pypi.python.org/pypi)
* [Using devtool (does not require extensible SDK)](https://wiki.yoctoproject.org/wiki/Application_Development_with_Extensible_SDK)
* [Snapcraft forum](https://forum.snapcraft.io/c/snapcraft)
