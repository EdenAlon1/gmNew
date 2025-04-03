package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aygm {
    public static /* synthetic */ String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "SavedStateHandle" : "Bundle" : "Intent" : "Factory" : "Unknown";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int b(String str) {
        char c;
        switch (str.hashCode()) {
            case -2099895620:
                if (str.equals("Intent")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -60841678:
                if (str.equals("SavedStateHandle")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 572770538:
                if (str.equals("Factory")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1379812394:
                if (str.equals("Unknown")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 2000952482:
                if (str.equals("Bundle")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return 1;
        }
        if (c == 1) {
            return 2;
        }
        if (c == 2) {
            return 3;
        }
        if (c == 3) {
            return 4;
        }
        if (c == 4) {
            return 5;
        }
        throw new IllegalArgumentException();
    }
}
