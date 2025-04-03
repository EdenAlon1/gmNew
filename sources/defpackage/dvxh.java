package defpackage;

import androidx.car.app.navigation.model.Maneuver;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvxh {
    public final dvxk a;

    public dvxh(dvxk dvxkVar) {
        this.a = dvxkVar;
    }

    public static dvxh a() {
        return new dvxf(27).a();
    }

    public static dvxh b() {
        return new dvxf(36).a();
    }

    public static dvxh c() {
        return new dvxf(31).a();
    }

    public static dvxh d() {
        return new dvxf(13).a();
    }

    public static dvxh e() {
        return new dvxf(5).a();
    }

    public final String toString() {
        String str;
        String obj = super.toString();
        dvxk dvxkVar = this.a;
        int a = erku.a(dvxkVar.c);
        if (a != 0) {
            switch (a) {
                case 1:
                    break;
                case 2:
                    str = "AUTOMATED";
                    break;
                case 3:
                    str = "USER";
                    break;
                case 4:
                    str = "GENERIC_CLICK";
                    break;
                case 5:
                    str = "TAP";
                    break;
                case 6:
                    str = "KEYBOARD_ENTER";
                    break;
                case 7:
                    str = "MOUSE_CLICK";
                    break;
                case 8:
                    str = "LEFT_CLICK";
                    break;
                case 9:
                    str = "RIGHT_CLICK";
                    break;
                case 10:
                    str = "HOVER";
                    break;
                case 11:
                    str = "INTO_BOUNDING_BOX";
                    break;
                case 12:
                    str = "OUT_OF_BOUNDING_BOX";
                    break;
                case 13:
                    str = "PINCH";
                    break;
                case 14:
                    str = "PINCH_OPEN";
                    break;
                case 15:
                    str = "PINCH_CLOSED";
                    break;
                case 16:
                    str = "INPUT_TEXT";
                    break;
                case 17:
                    str = "INPUT_KEYBOARD";
                    break;
                case 18:
                    str = "INPUT_VOICE";
                    break;
                case 19:
                    str = "RESIZE_BROWSER";
                    break;
                case 20:
                    str = "ROTATE_SCREEN";
                    break;
                case 21:
                    str = "DIRECTIONAL_MOVEMENT";
                    break;
                case 22:
                    str = "SWIPE";
                    break;
                case 23:
                    str = "SCROLL_BAR";
                    break;
                case 24:
                    str = "MOUSE_WHEEL";
                    break;
                case 25:
                    str = "ARROW_KEYS";
                    break;
                case 26:
                    str = "NAVIGATE";
                    break;
                case 27:
                    str = "BACK_BUTTON";
                    break;
                case 28:
                    str = "UNKNOWN_ACTION";
                    break;
                case 29:
                    str = "HEAD_MOVEMENT";
                    break;
                case 30:
                    str = "SHAKE";
                    break;
                case 31:
                    str = "DRAG";
                    break;
                case 32:
                    str = "LONG_PRESS";
                    break;
                case 33:
                    str = "KEY_PRESS";
                    break;
                case 34:
                    str = "ACTION_BY_TIMER";
                    break;
                case 35:
                    str = "DOUBLE_CLICK";
                    break;
                case 36:
                    str = "DOUBLE_TAP";
                    break;
                case 37:
                    str = "ROLL";
                    break;
                case 38:
                    str = "DROP";
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    str = "FORCE_TOUCH";
                    break;
                case 40:
                    str = "MULTI_KEY_PRESS";
                    break;
                case 41:
                    str = "TWO_FINGER_DRAG";
                    break;
                case 42:
                    str = "ENTER_PROXIMITY";
                    break;
                case 43:
                case 44:
                case 45:
                default:
                    str = "null";
                    break;
                case 46:
                    str = "CAUSAL_USER_ACTION";
                    break;
                case 47:
                    str = "CAUSAL_AUTOMATED";
                    break;
                case 48:
                    str = "INPUT_STYLUS";
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    str = "TWO_FINGER_DRAG_UP";
                    break;
                case 50:
                    str = "TWO_FINGER_DRAG_DOWN";
                    break;
                case 51:
                    str = "BROWSER_ACTION";
                    break;
                case 52:
                    str = "VIDEO_STATS";
                    break;
                case 53:
                    str = "DRAW_CIRCLE";
                    break;
                case 54:
                    str = "DRAW_STRIKETHROUGH";
                    break;
            }
            return obj + " " + str + " " + String.valueOf(dvxkVar);
        }
        str = "UNASSIGNED_USER_ACTION_ID";
        return obj + " " + str + " " + String.valueOf(dvxkVar);
    }
}
