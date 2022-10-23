# Use our build config

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += " file://defconfig "

do_configure:append() {
        cat ${WORKDIR}/defconfig > ${B}/.config
}

