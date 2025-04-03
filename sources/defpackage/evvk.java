package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evvk implements eygg {
    static final eygg a = new evvk();

    private evvk() {
    }

    @Override // defpackage.eygg
    public final boolean a(int i) {
        evvl evvlVar;
        switch (i) {
            case 0:
                evvlVar = evvl.PROMO_NOT_SHOWN_UNKNOWN;
                break;
            case 1:
                evvlVar = evvl.PROMO_NOT_SHOWN_INTERNAL_ERROR;
                break;
            case 2:
                evvlVar = evvl.PROMO_NOT_SHOWN_CLIENT_BLOCK;
                break;
            case 3:
                evvlVar = evvl.PROMO_NOT_SHOWN_CONTROL_GROUP;
                break;
            case 4:
                evvlVar = evvl.PROMO_NOT_SHOWN_VIEW_NOT_IN_SCREEN;
                break;
            case 5:
                evvlVar = evvl.PROMO_NOT_SHOWN_KEYBOARD_PRESENT;
                break;
            case 6:
                evvlVar = evvl.PROMO_NOT_SHOWN_VOICE_OVER_ENABLED;
                break;
            case 7:
                evvlVar = evvl.PROMO_NOT_SHOWN_IMAGE_NOT_PREFETCHED;
                break;
            case 8:
                evvlVar = evvl.PROMO_NOT_SHOWN_NO_VALID_SCHEME;
                break;
            case 9:
                evvlVar = evvl.PROMO_NOT_SHOWN_ACCESSIBILITY_ENABLED;
                break;
            case 10:
                evvlVar = evvl.PROMO_NOT_SHOWN_CLIENT_CALLBACK_NOT_REGISTERED;
                break;
            case 11:
                evvlVar = evvl.PROMO_NOT_SHOWN_CLIENT_RETURNED_NULL_ACTIVITY;
                break;
            case 12:
                evvlVar = evvl.PROMO_NOT_SHOWN_CLIENT_RETURNED_NULL_PROMO_RESPONSE;
                break;
            case 13:
                evvlVar = evvl.PROMO_NOT_SHOWN_THEME_NOT_FOUND;
                break;
            case 14:
            default:
                evvlVar = null;
                break;
            case 15:
                evvlVar = evvl.PROMO_NOT_SHOWN_UNSUPPORTED_PROMO_UI;
                break;
            case 16:
                evvlVar = evvl.PROMO_NOT_SHOWN_VIEW_MOSTLY_HIDDEN;
                break;
            case 17:
                evvlVar = evvl.PROMO_NOT_SHOWN_RENDERER_INTERNAL_ERROR;
                break;
            case 18:
                evvlVar = evvl.PROMO_NOT_SHOWN_INVALID_PROMOTION;
                break;
            case 19:
                evvlVar = evvl.PROMO_NOT_SHOWN_PERMISSION_GRANTED;
                break;
            case 20:
                evvlVar = evvl.PROMO_NOT_SHOWN_APPLICATION_IN_BACKGROUND;
                break;
            case 21:
                evvlVar = evvl.PROMO_NOT_SHOWN_ALREADY_PRESENTING;
                break;
            case 22:
                evvlVar = evvl.PROMO_NOT_SHOWN_MODAL_OPEN;
                break;
            case 23:
                evvlVar = evvl.PROMO_NOT_SHOWN_ANOTHER_PROMO_SELECTED;
                break;
            case 24:
                evvlVar = evvl.PROMO_NOT_SHOWN_PENDING_SYNC;
                break;
            case 25:
                evvlVar = evvl.PROMO_NOT_SHOWN_VIEW_MISSING_WINDOW;
                break;
            case 26:
                evvlVar = evvl.PROMO_NOT_SHOWN_VIEW_TRANSPARENT;
                break;
            case 27:
                evvlVar = evvl.PROMO_NOT_SHOWN_VIEW_DISABLED;
                break;
            case 28:
                evvlVar = evvl.PROMO_NOT_SHOWN_VIEW_NOT_LAID_OUT;
                break;
            case 29:
                evvlVar = evvl.PROMO_NOT_SHOWN_NOT_ENOUGH_SPACE;
                break;
            case 30:
                evvlVar = evvl.PROMO_NOT_SHOWN_UNSUPPORTED_CUSTOM_UI_TYPE;
                break;
            case 31:
                evvlVar = evvl.PROMO_NOT_SHOWN_INVALID_CUSTOM_UI_PROTO;
                break;
            case 32:
                evvlVar = evvl.PROMO_NOT_SHOWN_MISSING_ASSETS;
                break;
        }
        return evvlVar != null;
    }
}
