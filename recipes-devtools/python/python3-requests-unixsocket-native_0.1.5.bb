SUMMARY = "Use requests to talk HTTP via a UNIX domain socket"
HOMEPAGE = "https://github.com/msabramo/requests-unixsocket"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d2794c0df5b907fdace235a619d80314"

SRC_URI[md5sum] = "08453c8ef7dc03863ff4a30b901e7c20"
SRC_URI[sha256sum] = "a91bc0138f61fb3396de6358fa81e2cd069a150ade5111f869df01d8bc9d294c"

DEPENDS += "	python3-requests-native (>=1.1) \
		python3-urllib3-native (>=1.8) \
"

inherit setuptools3 pypi native


