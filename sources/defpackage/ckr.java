package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ckr {
    public final Object a;
    public final String b;

    public ckr(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    final String a() {
        return "[" + this.b + ", " + cku.e(this.a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
