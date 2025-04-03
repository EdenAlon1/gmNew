package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rne {
    public static int a(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -678927291) {
            if (str.equals("percent")) {
                c = '\b';
            }
            c = 65535;
        } else if (hashCode == 3178) {
            if (str.equals("cm")) {
                c = 4;
            }
            c = 65535;
        } else if (hashCode == 3240) {
            if (str.equals("em")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode == 3251) {
            if (str.equals("ex")) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode == 3365) {
            if (str.equals("in")) {
                c = 3;
            }
            c = 65535;
        } else if (hashCode == 3488) {
            if (str.equals("mm")) {
                c = 5;
            }
            c = 65535;
        } else if (hashCode == 3571) {
            if (str.equals("pc")) {
                c = 7;
            }
            c = 65535;
        } else if (hashCode != 3588) {
            if (hashCode == 3592 && str.equals("px")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("pt")) {
                c = 6;
            }
            c = 65535;
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
                return 9;
            default:
                throw new IllegalArgumentException();
        }
    }
}
