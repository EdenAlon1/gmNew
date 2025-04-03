package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pgt extends pgs {
    private final Object a;
    private final String b;
    private final int c;

    public pgt(Object obj, String str, int i) {
        this.a = obj;
        this.b = str;
        this.c = i;
    }

    @Override // defpackage.pgs
    public final pgs a(String str, ffji ffjiVar) {
        return ((Boolean) ffjiVar.invoke(this.a)).booleanValue() ? this : new pgr(this.a, this.b, str, this.c);
    }

    @Override // defpackage.pgs
    public final Object b() {
        return this.a;
    }
}
