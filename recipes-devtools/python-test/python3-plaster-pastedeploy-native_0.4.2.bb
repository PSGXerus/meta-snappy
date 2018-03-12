SUMMARY = "A loader implementing the PasteDeploy syntax to be used by plaster."
HOMEPAGE = "https://github.com/Pylons/plaster_pastedeploy"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2fc91495963af6389c06667be08ccc5c"

SRC_URI[md5sum] = "58fd7852002909378e818c9d5b71e90a"
SRC_URI[sha256sum] = "2a401228c7cfbe38f728249e75af7a666f91c61d642cbb8fcb78a71df69d2754"

PYPI_PACKAGE = "plaster_pastedeploy"

DEPENDS += "	python3-plaster-native (>=0.5) \
		python3-pastedeploy-native (>=1.5.0) \
"

inherit setuptools3 pypi native

