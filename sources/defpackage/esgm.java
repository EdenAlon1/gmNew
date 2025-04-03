package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esgm {
    public static int a(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int b(String str) {
        char c;
        switch (str.hashCode()) {
            case -2132800435:
                if (str.equals("PENPAL_ALS_MODEL_UNSPECIFIED")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 573789423:
                if (str.equals("UNRECOGNIZED")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1073609822:
                if (str.equals("MODEL_PENPAL_PROD")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1420093966:
                if (str.equals("MODEL_PENPAL_DEV")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1430474003:
                if (str.equals("MODEL_PENPAL_DOGFOOD")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return 2;
        }
        if (c == 1) {
            return 3;
        }
        if (c == 2) {
            return 4;
        }
        if (c == 3) {
            return 5;
        }
        if (c == 4) {
            return 1;
        }
        throw new IllegalArgumentException();
    }
}
