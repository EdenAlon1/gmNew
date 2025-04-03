package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eyxi implements eygg {
    static final eygg a = new eyxi();

    private eyxi() {
    }

    @Override // defpackage.eygg
    public final boolean a(int i) {
        eyxj eyxjVar;
        switch (i) {
            case 0:
                eyxjVar = eyxj.UNKNOWN_CAPABILITY;
                break;
            case 1:
                eyxjVar = eyxj.RCSE_FILETRANSFER_CAPABILITY;
                break;
            case 2:
                eyxjVar = eyxj.RCSE_IMAGE_SHARE_CAPABILITY;
                break;
            case 3:
                eyxjVar = eyxj.RCSE_VIDEO_SHARE_CAPABILITY;
                break;
            case 4:
                eyxjVar = eyxj.RCSE_SOCIAL_PRESENCE_CAPABILITY;
                break;
            case 5:
                eyxjVar = eyxj.RCSE_CAPABILITY_PRESENCE_CAPABILITY;
                break;
            case 6:
                eyxjVar = eyxj.MMTEL_VOICECALLING_CAPABILITY;
                break;
            case 7:
                eyxjVar = eyxj.VIDEO_CAPABILITY;
                break;
            case 8:
                eyxjVar = eyxj.RCS_IPCALLING_CAPABILITY;
                break;
            case 9:
                eyxjVar = eyxj.RCS_VIDEOCALLINGONLY_CAPABILITY;
                break;
            case 10:
                eyxjVar = eyxj.RCS_FILETRANSFER_THUMBNAIL_CAPABILITY;
                break;
            case 11:
                eyxjVar = eyxj.RCS_LOCATION_PUSH_CAPABILITY;
                break;
            case 12:
                eyxjVar = eyxj.RCS_LOCATION_PULL_CAPABILITY;
                break;
            case 13:
                eyxjVar = eyxj.RCS_LOCATION_PULL_FT_CAPABILITY;
                break;
            case 14:
                eyxjVar = eyxj.BLACKBIRD_FULLY_INTEGRATED_MESSAGING_CAPABILITY;
                break;
            case 15:
                eyxjVar = eyxj.JIBE_STICKERS_CAPABILITY;
                break;
            case 16:
                eyxjVar = eyxj.RCS_POST_CALL_CAPABILITY;
                break;
            case 17:
                eyxjVar = eyxj.RCS_SHARED_MAP_CAPABILITY;
                break;
            case 18:
                eyxjVar = eyxj.RCS_SHARED_SKETCH_CAPABILITY;
                break;
            case 19:
                eyxjVar = eyxj.RCS_MESSAGE_REVOKE_CAPABILITY;
                break;
            case 20:
                eyxjVar = eyxj.RCS_FILE_TRANSFER_VIA_SMS_CAPABILITY;
                break;
            case 21:
                eyxjVar = eyxj.RCS_FILE_TRANSFER_VIA_HTTP_CAPABILITY;
                break;
            case 22:
                eyxjVar = eyxj.RCS_FILE_TRANSFER_VIA_MSRP_CAPABILITY;
                break;
            case 23:
                eyxjVar = eyxj.RCS_LOCATION_VIA_SMS_CAPABILITY;
                break;
            case 24:
                eyxjVar = eyxj.RCS_GROUP_CHAT_CAPABILITY;
                break;
            case 25:
                eyxjVar = eyxj.RCS_RBM_CAPABILITY;
                break;
            case 26:
                eyxjVar = eyxj.RCS_RBM_BOT_CAPABILITY;
                break;
            default:
                eyxjVar = null;
                break;
        }
        return eyxjVar != null;
    }
}
