package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlfl {
    public static final int a(dlfs dlfsVar) {
        int ordinal = dlfsVar.ordinal();
        if (ordinal == 0) {
            return 3;
        }
        if (ordinal == 1) {
            return 4;
        }
        if (ordinal == 2) {
            return 5;
        }
        if (ordinal == 3) {
            return 1;
        }
        if (ordinal == 4) {
            return 2;
        }
        if (ordinal == 5) {
            return 6;
        }
        throw new ffcd();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final int b(String str) {
        switch (str.hashCode()) {
            case -908719937:
                if (str.equals("GIFT_CARD")) {
                    return 5;
                }
                break;
            case -664540516:
                if (str.equals("PHISHING")) {
                    return 6;
                }
                break;
            case 2402104:
                if (str.equals("NONE")) {
                    return 2;
                }
                break;
            case 140722205:
                if (str.equals("NOT_AVAILABLE")) {
                    return 4;
                }
                break;
            case 618719069:
                if (str.equals("SUSPICIOUS")) {
                    return 7;
                }
                break;
            case 854821378:
                if (str.equals("NOT_SUPPORTED")) {
                    return 3;
                }
                break;
        }
        try {
            switch (str) {
                case "UNKNOWN_POLICY_VIOLATION":
                    return 1;
                case "NO_POLICY_VIOLATION":
                    return 2;
                case "UNSUPPORTED_POLICY_VIOLATION":
                    return 3;
                case "NOT_AVAILABLE_POLICY_VIOLATION":
                    return 4;
                case "GIFT_CARD":
                    return 5;
                case "PHISHING":
                    return 6;
                case "SUSPICIOUS":
                    return 7;
                case "SENSITIVE_POLICY_VIOLATION":
                    return 8;
                default:
                    throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException unused) {
            return 1;
        }
    }
}
