SUMMARY = "Macaroon library for Python"
HOMEPAGE = "https://github.com/ecordell/pymacaroons"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://docs/index.rst;beginline=29;endline=32;md5=7f0186cc43f72209a78f84dcbd3f93f1"

SRC_URI[md5sum] = "a3b6cb10bbc4804a199a135b9f04f327"
SRC_URI[sha256sum] = "e5fd325cfa845c88f3cb8b5c07a5363e7032fa5cbdb7b48ae0b50445c32167bf"

DEPENDS += "	python3-six-native (>=1.8.0) \
		python3-pynacl-native (>=1.1.2,<2.0) \
		python3-libnacl-native \
"

inherit setuptools3 pypi native
