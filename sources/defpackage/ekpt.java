package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekpt {
    public static final ekpt a = new ekpt(new ekps());
    public final engw b;
    public final engw c;
    private final String d;

    private ekpt(ekps ekpsVar) {
        this.d = ekpsVar.a;
        this.b = ekpsVar.b.g();
        this.c = ekpsVar.c.g();
    }

    public final String toString() {
        return this.d + "@" + Integer.toHexString(hashCode());
    }
}
