SUMMARY = "A first snap"

DESCRIPTION = "A hello world snap to test the build process"

FILESEXTRAPATHS_prepend := "${THISDIR}:"

S = "${WORKDIR}/files"

SRC_URI = "file://files"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "\
    file://COPYING;md5=c79ff39f19dfec6d293b95dea7b07891 \
"

inherit snapcraft
