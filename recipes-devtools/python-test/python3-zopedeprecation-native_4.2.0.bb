SUMMARY = "Zope Deprecation Infrastructure"
HOMEPAGE = "http://github.com/zopefoundation/zope.deprecation"

LICENSE = "ZPL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=78ccb3640dc841e1baecb3e27a6966b2"

SRC_URI[md5sum] = "5d110c34ab7b313490c1a8533bbdc7a0"
SRC_URI[sha256sum] = "ff32c5bb5388b77b22c83ed1f1aa01cdbb076d9f2cfa2b825450ce9e2ecfd738"

PYPI_PACKAGE = "zope.deprecation"

DEPENDS += "python3-setuptools-native \
"

inherit setuptools3 pypi native

