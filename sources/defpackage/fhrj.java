package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhrj {
    private final String a;
    private final String b;

    public fhrj(String str) {
        this.a = a.a(str, "-----BEGIN ", "-----");
        this.b = a.a(str, "-----END ", "-----");
    }

    public final boolean a(String str) {
        return str.startsWith(this.b);
    }

    public final boolean b(String str) {
        return str.startsWith(this.a);
    }
}
