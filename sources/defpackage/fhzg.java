package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhzg extends fhzr {
    public final int a;
    public final int b;

    public fhzg(fhzf fhzfVar) {
        super(fhzfVar);
        this.a = fhzfVar.a;
        this.b = fhzfVar.b;
    }

    @Override // defpackage.fhzr
    protected final byte[] a() {
        byte[] a = super.a();
        ficw.e(0, a, 16);
        ficw.e(this.a, a, 20);
        ficw.e(this.b, a, 24);
        return a;
    }
}
