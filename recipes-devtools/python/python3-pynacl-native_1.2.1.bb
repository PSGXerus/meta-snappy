SUMMARY = "Python binding to the Networking and Cryptography (NaCl) library"
HOMEPAGE = "https://github.com/pyca/pynacl/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8cc789b082b3d97e1ccc5261f8594d3f"

SRC_URI[md5sum] = "1db3e111775fbe6b66772ff30af7a956"
SRC_URI[sha256sum] = "e0d38fa0a75f65f556fb912f2c6790d1fa29b7dd27a1d9cc5591b281321eaaa9"

PYPI_PACKAGE = "PyNaCl"

DEPENDS += "	libsodium-native \
		libffi-native \
"

inherit setuptools3 pypi native



