package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eptl implements eygg {
    static final eygg a = new eptl();

    private eptl() {
    }

    @Override // defpackage.eygg
    public final boolean a(int i) {
        eptm eptmVar;
        switch (i) {
            case 0:
                eptmVar = eptm.UNKNOWN_OPENING_SOURCE;
                break;
            case 1:
                eptmVar = eptm.PLUS_BUTTON;
                break;
            case 2:
                eptmVar = eptm.CAMERA_GALLERY_BUTTON;
                break;
            case 3:
                eptmVar = eptm.CATEGORY_HEADER;
                break;
            case 4:
                eptmVar = eptm.CATEGORY_OVERFLOW;
                break;
            case 5:
                eptmVar = eptm.SUGGESTION;
                break;
            case 6:
                eptmVar = eptm.EXPAND;
                break;
            case 7:
                eptmVar = eptm.FAVORITES;
                break;
            case 8:
                eptmVar = eptm.QUERY;
                break;
            case 9:
                eptmVar = eptm.CAMERA;
                break;
            case 10:
                eptmVar = eptm.MINI_CAMERA;
                break;
            case 11:
                eptmVar = eptm.DRAFT_END_EMOJI_BUTTON;
                break;
            case 12:
                eptmVar = eptm.MESSAGE_LONG_PRESS;
                break;
            case 13:
                eptmVar = eptm.MESSAGE_BADGE_CLICK;
                break;
            case 14:
                eptmVar = eptm.MESSAGE_REPLY_BUTTON_CLICK;
                break;
            case 15:
                eptmVar = eptm.MESSAGE_REPLY_SWIPE;
                break;
            case 16:
                eptmVar = eptm.ADD_CUSTOM_REACTION_BUTTON_CLICK;
                break;
            default:
                eptmVar = null;
                break;
        }
        return eptmVar != null;
    }
}
