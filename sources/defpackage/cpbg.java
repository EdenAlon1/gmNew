package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpbg {
    public static /* synthetic */ String a(int i) {
        switch (i) {
            case 1:
                return "INT";
            case 2:
                return "BOOL";
            case 3:
                return "LONG";
            case 4:
                return "STRING";
            case 5:
                return "INT_ARRAY";
            case 6:
                return "STRING_ARRAY";
            case 7:
                return "UNKNOWN";
            default:
                return "null";
        }
    }

    public static int b(Object obj) {
        if ((obj instanceof Boolean) || obj.equals(Boolean.FALSE.toString()) || obj.equals(Boolean.TRUE.toString())) {
            return 2;
        }
        if (obj instanceof Integer) {
            return 1;
        }
        if (obj instanceof Long) {
            return 3;
        }
        if (obj instanceof int[]) {
            return 5;
        }
        if (obj instanceof String[]) {
            return 6;
        }
        return obj instanceof String ? 4 : 7;
    }
}
