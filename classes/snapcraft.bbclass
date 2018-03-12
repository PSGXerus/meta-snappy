DEPENDS += "snapcraft-native"
RDEPENDS_${PN} += "snapd"

SNAP_ARCH = "${TARGET_ARCH}"
SNAP_ARCH_i586 = "i386"

GLIBC_DIR_YOCTO = "${COMPONENTS_DIR}/${TARGET_ARCH}/glibc"

EXTRANATIVEPATH += "python3-native"

#unloading pseudo makes clearing LD_LIBRARY_PATH possible
do_configure(){
  export LD_LIBRARY_PATH=""
  export PSEUDO_UNLOAD=1
  export GLIBC_DIR_YOCTO=${GLIBCDIR_YOCTO}
}

do_compile(){
  cd ${B} && snapcraft --target-arch=${SNAP_ARCH}
}

FILES_${PN} += "/var/lib/snapd/snaps"

do_install(){
  install -d ${D}/var/lib/snapd/snaps
  install -m 644 ${B}/*.snap ${D}/var/lib/snapd/snaps
}

inherit python3native pythonnative
