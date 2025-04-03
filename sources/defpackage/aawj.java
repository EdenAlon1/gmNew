package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aawj {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final int a(String str) {
        char c;
        try {
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            switch (upperCase.hashCode()) {
                case -1665858682:
                    if (upperCase.equals("SCREEN_EFFECTS_SAD")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case -566859894:
                    if (upperCase.equals("SCREEN_EFFECTS_OLYMPICS")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case -329346054:
                    if (upperCase.equals("SCREEN_EFFECTS_UNKNOWN")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -102398549:
                    if (upperCase.equals("SCREEN_EFFECTS_FALL")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -102206046:
                    if (upperCase.equals("SCREEN_EFFECTS_LOVE")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case -83996996:
                    if (upperCase.equals("SCREEN_EFFECTS_FIREWORKS")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 378663367:
                    if (upperCase.equals("SCREEN_EFFECTS_THANKSGIVING")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 765452349:
                    if (upperCase.equals("SCREEN_EFFECTS_SPRING")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 769924575:
                    if (upperCase.equals("SCREEN_EFFECTS_SUMMER")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 873395445:
                    if (upperCase.equals("SCREEN_EFFECTS_WINTER")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1116377015:
                    if (upperCase.equals("SCREEN_EFFECTS_ANGER")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1126161969:
                    if (upperCase.equals("SCREEN_EFFECTS_LAUGH")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 1301766167:
                    if (upperCase.equals("SCREEN_EFFECTS_GOODMORNING")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 1309439257:
                    if (upperCase.equals("SCREEN_EFFECTS_SURPRISE")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 1570801963:
                    if (upperCase.equals("SCREEN_EFFECTS_GOODNIGHT")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 1612716919:
                    if (upperCase.equals("SCREEN_EFFECTS_CELEBRATE")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    return 1;
                case 1:
                    return 2;
                case 2:
                    return 3;
                case 3:
                    return 4;
                case 4:
                    return 5;
                case 5:
                    return 6;
                case 6:
                    return 7;
                case 7:
                    return 8;
                case '\b':
                    return 10;
                case '\t':
                    return 11;
                case '\n':
                    return 12;
                case 11:
                    return 13;
                case '\f':
                    return 16;
                case '\r':
                    return 18;
                case 14:
                    return 21;
                case 15:
                    return 22;
                default:
                    throw new IllegalArgumentException();
            }
        } catch (Exception unused) {
            return 1;
        }
    }
}
