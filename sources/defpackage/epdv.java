package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class epdv implements eygg {
    static final eygg a = new epdv();

    private epdv() {
    }

    @Override // defpackage.eygg
    public final boolean a(int i) {
        epdw epdwVar;
        switch (i) {
            case 0:
                epdwVar = epdw.UNSPECIFIED_BACKUP_TYPE;
                break;
            case 1:
                epdwVar = epdw.MESSAGE_BACKUP;
                break;
            case 2:
                epdwVar = epdw.CONVERSATION_BACKUP;
                break;
            case 3:
                epdwVar = epdw.PARTICIPANT_BACKUP;
                break;
            case 4:
                epdwVar = epdw.KEY_BACKUP;
                break;
            case 5:
                epdwVar = epdw.PARTS_UPDATE;
                break;
            case 6:
                epdwVar = epdw.PARTS_RARE_UPDATE;
                break;
            case 7:
                epdwVar = epdw.PARTS_FREQ_UPDATE;
                break;
            case 8:
                epdwVar = epdw.PARTS_CUSTOM_PART_FLAG_URI_UPDATE;
                break;
            case 9:
                epdwVar = epdw.MESSAGE_UPDATE;
                break;
            case 10:
                epdwVar = epdw.CONVERSATION_FREQ_UPDATE;
                break;
            case 11:
                epdwVar = epdw.CONVERSATION_RARE_UPDATE;
                break;
            case 12:
                epdwVar = epdw.PARTICIPANT_RARE_UPDATE;
                break;
            case 13:
                epdwVar = epdw.MESSAGE_DELETE;
                break;
            case 14:
                epdwVar = epdw.CONVERSATION_DELETE;
                break;
            case 15:
                epdwVar = epdw.PARTICIPANT_DELETE;
                break;
            case 16:
                epdwVar = epdw.PARTS_DELETE;
                break;
            case 17:
                epdwVar = epdw.KEY_DELETE;
                break;
            case 18:
                epdwVar = epdw.SELF_PARTICIPANT_BACKUP;
                break;
            case 19:
                epdwVar = epdw.MEDIA_FULL_SIZE_BACKUP;
                break;
            case 20:
                epdwVar = epdw.MEDIA_COMPRESSED_SIZE_BACKUP;
                break;
            case 21:
                epdwVar = epdw.MEDIA_PROFILE_PHOTO_BACKUP;
                break;
            default:
                epdwVar = null;
                break;
        }
        return epdwVar != null;
    }
}
