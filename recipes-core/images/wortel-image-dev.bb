SUMMARY = "Wortel image with some features"

IMAGE_FEATURES += "ssh-server-dropbear package-management"

IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL} "

IMAGE_INSTALL += " \
                wpa-supplicant \
                hostapd \
"


IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image

IMAGE_ROOTFS_SIZE ?= "8192"
IMAGE_ROOTFS_EXTRA_SPACE:append = "${@bb.utils.contains("DISTRO_FEATURES", "systemd", " + 4096", "", d)}"