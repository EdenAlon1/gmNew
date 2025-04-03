package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fivl {
    public static /* synthetic */ String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "KIND_NOT_SET" : "INT64_LIST" : "FLOAT_LIST" : "BYTES_LIST";
    }

    public static int b(int i) {
        if (i == 0) {
            return 4;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    return 0;
                }
            }
        }
        return i2;
    }
}
