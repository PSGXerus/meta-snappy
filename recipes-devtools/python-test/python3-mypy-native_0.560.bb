SUMMARY = "Optional static typing for Python"
HOMEPAGE = "http://www.mypy-lang.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8d438618dacdddfdf08836bfe5e4b8a7"

SRC_URI[md5sum] = "13e2f02928e65457849b11b0a78a7fb7"
SRC_URI[sha256sum] = "bd0c9a2fcf0c4f7a54a2b625f466fcc000d415f371298d96fa5d2acc69074aca"

DEPENDS += "python3-typed-ast-native (>=1.1.0,<1.2.0) \
"

inherit setuptools3 pypi native

