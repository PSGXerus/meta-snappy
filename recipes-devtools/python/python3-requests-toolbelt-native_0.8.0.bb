SUMMARY = "A utility belt for advanced users of python-requests"
HOMEPAGE = "https://toolbelt.readthedocs.org"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=71760e0f1dda8cff91b0bc9246caf571"

SRC_URI[md5sum] = "1028a6044b175440fdc7671e94430cbe"
SRC_URI[sha256sum] = "f6a531936c6fa4c6cfce1b9c10d5c4f498d16528d2a54a22ca00011205a187b5"

DEPENDS += "python3-requests-native (>=2.0.1,<3.0.0)"

inherit setuptools3 pypi native
