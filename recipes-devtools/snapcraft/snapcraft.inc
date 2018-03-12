SUMMARY = "Snapcraft is a delightful packaging tool"

DESCRIPTION = "\
Snapcraft helps you assemble a whole project in a single tree out of many pieces. \
It can drive a very wide range of build and packaging systems, so that you can simply  \
list all the upstream projects you want and have them built and installed together as a single tree."

HOMEPAGE = "https://snapcraft.io"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "	https://github.com/snapcore/snapcraft/archive/${PV}.tar.gz \
		file://0001-don-t-check-installed-packages-in-yocto.patch \
		file://0002-don-t-use-dpkg-to-check-glibc.patch \
"
SRC_URI[md5sum] = "2e54ae05721ae424bca96cf21cf90943"
SRC_URI[sha256sum] = "61bb5f4d6123540d13a9993ea8fe6d4b2bb37f822b3d6993bd0f92dd03cbec5f"

# file-native was patched to replace file-magic (=0.3.0)
DEPENDS += "	python3-click-native (>=6.2) \
		python3-configparser-native (=3.5.0) \
		python3-docopt-native (=0.6.2) \
		file-native \
		python3-jsonschema-native (=2.5.1) \
		python3-libarchive-c-native (=2.5) \
		python3-progressbar33-native (=2.4) \
		python3-pyyaml-native (=3.11) \
		python3-pyxdg-native (=0.25) \
		python3-requests-native (=2.9.1) \
		python3-requests-unixsocket-native (=0.1.5) \
		python3-apt-native (=1.1.0) \
		python3-distutils-extra-native (=2.39) \
		python3-requests-toolbelt-native (=0.6.0) \
		python3-responses-native (=0.5.1) \
		python3-petname-native (=1.12) \
		python3-pymacaroons-native (=0.9.2) \
		python3-pysha3-native (=1.0b1) \
		python3-simplejson-native (=3.8.2) \
		python3-tabulate-native (=0.7.5) \
		python3-debian-native (=0.1.28) \
		squashfs-tools-native \
		bzr-native \
		mercurial-native \
		subversion-native \
		glibc \
		"

inherit setuptools3 native



