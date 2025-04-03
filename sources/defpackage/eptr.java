package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eptr implements eygg {
    static final eygg a = new eptr();

    private eptr() {
    }

    @Override // defpackage.eygg
    public final boolean a(int i) {
        epts eptsVar;
        switch (i) {
            case 0:
                eptsVar = epts.UNKNOWN_COMPOSE_SCREEN_CATEGORY;
                break;
            case 1:
                eptsVar = epts.ALL;
                break;
            case 2:
                eptsVar = epts.CAMERA_GALLERY;
                break;
            case 3:
                eptsVar = epts.CAMERA;
                break;
            case 4:
                eptsVar = epts.GALLERY;
                break;
            case 5:
                eptsVar = epts.EXTERNAL;
                break;
            case 6:
                eptsVar = epts.EMOJI;
                break;
            case 7:
                eptsVar = epts.GIF;
                break;
            case 8:
                eptsVar = epts.STICKER;
                break;
            case 9:
                eptsVar = epts.LOCATION;
                break;
            case 10:
                eptsVar = epts.SEND_MONEY;
                break;
            case 11:
                eptsVar = epts.REQUEST_MONEY;
                break;
            case 12:
                eptsVar = epts.CONTACT;
                break;
            case 13:
                eptsVar = epts.VOICE;
                break;
            case 14:
                eptsVar = epts.FILE;
                break;
            case 15:
                eptsVar = epts.REACTION;
                break;
            case 16:
                eptsVar = epts.ASSISTANT;
                break;
            case 17:
                eptsVar = epts.REPLY_DRAFT;
                break;
            case 18:
                eptsVar = epts.EMOTIVE;
                break;
            case 19:
                eptsVar = epts.EMOTIFY;
                break;
            case 20:
                eptsVar = epts.SELFIE_GIF;
                break;
            default:
                eptsVar = null;
                break;
        }
        return eptsVar != null;
    }
}
