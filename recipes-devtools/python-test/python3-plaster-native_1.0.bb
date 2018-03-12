SUMMARY = "A loader interface around multiple config file formats."
HOMEPAGE = "https://docs.pylonsproject.org/projects/plaster/en/latest/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2fc91495963af6389c06667be08ccc5c"

SRC_URI[md5sum] = "80e6beb4760c16fea31754babcc0576e"
SRC_URI[sha256sum] = "8351c7c7efdf33084c1de88dd0f422cbe7342534537b553c49b857b12d98c8c3"

DEPENDS += "python3-setuptools-native \
"

inherit setuptools3 pypi native
