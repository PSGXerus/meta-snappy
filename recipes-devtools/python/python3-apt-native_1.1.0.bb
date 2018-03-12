SUMMARY = "Python bindings for APT"
DESCRIPTION = "This is a Python library interface to libapt, \
which allows you to query and manipulat APT package repository \
information using the Python programming language."
HOMEPAGE = "https://launchpad.net/python-apt"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING.GPL;md5=0636e73ff0215e8d672dc4c32c317bb3"

SRC_URI = "https://launchpad.net/ubuntu/%2Barchive/primary/%2Bfiles/python-apt_1.1.0%7Ebeta1build1.tar.xz"
SRC_URI[md5sum] = "115a87b2373dc1a67f1ae9dc7dd1026e"
SRC_URI[sha256sum] = "8d0a855299b8eb114476bdc7bef1b6fd6b35a4ee7ae90d4d56a2018977784148"

S = "${WORKDIR}/python-apt-1.1.0~beta1"

DEPENDS += "	apt-native \
		python3-pyflakes-native \
"

inherit setuptools3 native


