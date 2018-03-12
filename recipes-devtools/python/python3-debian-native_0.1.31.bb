SUMMARY = "Debian package related modules"
HOMEPAGE = "http://packages.debian.org/sid/python-debian"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://setup.py;beginline=5;endline=17;md5=f368e29137ede871f08348258e5d663d"

SRC_URI[md5sum] = "6e14795278707dee5a8beb0c0ed3b98f"
SRC_URI[sha256sum] = "21465ccb8a4cb2942f15e74b6c9b92caff5188365e22ab4a0dcc778b90f28479"

PYPI_PACKAGE = "python-debian"

inherit setuptools3 pypi native

