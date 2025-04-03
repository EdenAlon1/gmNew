package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhzl extends fhzr {
    public final int a;
    public final int b;
    public final int c;

    public fhzl(fhzk fhzkVar) {
        super(fhzkVar);
        this.a = fhzkVar.a;
        this.b = fhzkVar.b;
        this.c = fhzkVar.c;
    }

    @Override // defpackage.fhzr
    protected final byte[] a() {
        int i = this.a;
        byte[] a = super.a();
        ficw.e(i, a, 16);
        ficw.e(this.b, a, 20);
        ficw.e(this.c, a, 24);
        return a;
    }
}
