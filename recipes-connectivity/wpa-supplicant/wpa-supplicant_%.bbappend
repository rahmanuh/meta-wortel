# Use our build config

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"
SRC_URI += "file://defconfig"

DEPENDS += "readline"

do_configure:append() {
        cat ${WORKDIR}/defconfig > ${B}/wpa_supplicant/.config
}
