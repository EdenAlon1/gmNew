package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhzj extends fhzr {
    public final int a;
    public final int b;
    public final int c;

    public fhzj(fhzi fhziVar) {
        super(fhziVar);
        this.a = fhziVar.a;
        this.b = fhziVar.b;
        this.c = fhziVar.c;
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
