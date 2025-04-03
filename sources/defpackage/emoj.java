package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emoj {
    public final String a;
    public final String b;
    public final String c;
    private final String d;
    private final int e;

    public emoj(String str, String str2, String str3, int i, int i2) {
        this.d = str;
        this.c = str2;
        this.b = str3;
        this.e = i2;
        if (!a()) {
            this.a = str;
            return;
        }
        this.a = str.substring(0, i) + str2 + str.substring(i2);
    }

    public final boolean a() {
        return this.c != null;
    }
}
