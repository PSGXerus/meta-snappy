SUMMARY = "Bazaar is the main version control system used by Launchpad"
DESCRIPTION = "Bazaar helps people collaborate on software development, by recording the history of \
the project, providing an easy means to copy the history around, and making it easy to merge \
changes between projects."
HOMEPAGE = "https://launchpad.net/bzr"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING.txt;md5=751419260aa954499f7abaabaa882bbe"

SRC_URI = "https://launchpad.net/${BPN}/${@d.getVar('PV', True)[:3]}/${PV}/%2Bdownload/${BPN}-${PV}.tar.gz \
file://0001-bzr-Bump-to-version-2.7.1.patch"
SRC_URI[md5sum] = "8e5020502efd54f5925a14a456b88b89"
SRC_URI[sha256sum] = "0d451227b705a0dd21d8408353fe7e44d3a5069e6c4c26e5f146f1314b8fdab3"

DEPENDS += "python-cython-native"

inherit setuptools native


