package defpackage;

import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.navigation.model.Maneuver;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fipd {
    public static int a(int i) {
        return 4 - (i % 4);
    }

    public static int b(char c, CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int c(char c, CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            if (charSequence.charAt(i) != c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int d(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            if (charAt != '\t' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int e(CharSequence charSequence, int i, int i2) {
        while (i >= i2) {
            char charAt = charSequence.charAt(i);
            if (charAt != '\t' && charAt != ' ') {
                return i;
            }
            i--;
        }
        return i2 - 1;
    }

    public static boolean f(char c) {
        switch (c) {
            case '!':
            case '\"':
            case '#':
            case '$':
            case '%':
            case '&':
            case Maneuver.TYPE_DESTINATION /* 39 */:
            case '(':
            case ')':
            case '*':
            case '+':
            case ',':
            case '-':
            case '.':
            case '/':
                return true;
            default:
                switch (c) {
                    case ':':
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                    case '?':
                    case '@':
                        return true;
                    default:
                        switch (c) {
                            case '[':
                            case '\\':
                            case ']':
                            case '^':
                            case '_':
                            case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                                return true;
                            default:
                                switch (c) {
                                    case '{':
                                    case '|':
                                    case '}':
                                    case '~':
                                        return true;
                                    default:
                                        return false;
                                }
                        }
                }
        }
    }

    public static boolean g(int i) {
        int type = Character.getType(i);
        if (type != 29 && type != 30) {
            switch (type) {
                default:
                    if (i != 36 && i != 43 && i != 94 && i != 96 && i != 124 && i != 126) {
                        switch (i) {
                            case 60:
                            case 61:
                            case 62:
                                break;
                            default:
                                return false;
                        }
                    }
                    break;
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                    return true;
            }
        }
        return true;
    }

    public static boolean h(CharSequence charSequence, int i) {
        if (i >= charSequence.length()) {
            return false;
        }
        char charAt = charSequence.charAt(i);
        return charAt == '\t' || charAt == ' ';
    }

    public static boolean i(int i) {
        return i == 9 || i == 10 || i == 12 || i == 13 || i == 32 || Character.getType(i) == 12;
    }
}
