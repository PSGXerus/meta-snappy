SUMMARY = "the modular source code checker: pep8, pyflakes and co"
HOMEPAGE = "https://gitlab.com/pycqa/flake8"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=75b26781f1adf1aa310bda6098937878"

SRC_URI[md5sum] = "7e5fe39d578a2c2d0962b61b35b8c3fc"
SRC_URI[sha256sum] = "7253265f7abd8b313e3892944044a365e3f4ac3fcdcfb4298f55ee9ddf188ba0"

DEPENDS += "	python3-mccabe-native (>=0.6.0,<0.7.0) \
		python3-pycodestyle-native (>=2.0.0,<2.4.0) \
		python3-pyflakes-native (>=1.5.0,<1.7.0) \
"

inherit setuptools3 pypi native


