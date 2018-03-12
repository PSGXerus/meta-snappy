SUMMARY = "Python bindings for libsodium based on ctypes"
HOMEPAGE = "https://libnacl.readthedocs.org/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1cb1960468b1cf32de0c44f78d390f44"

SRC_URI[md5sum] = "8f2ed9f9ad5f57576bdaa2d46a833412"
SRC_URI[sha256sum] = "c58390b0d191db948fc9ab681f07fdfce2a573cd012356bada47d56795d00ee2"

DEPENDS += "libsodium-native \
"

inherit setuptools3 pypi native


