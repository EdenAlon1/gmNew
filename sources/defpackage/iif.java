package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iif extends iib {
    public final igv a;
    public String b;
    public boolean c;
    public ffix d;
    public final hho e;
    public final hho f;
    public float g;
    public float h;
    private final igr i;
    private ibx j;
    private long k;
    private final ffji l;

    public iif(igv igvVar) {
        this.a = igvVar;
        igvVar.e = new iic(this);
        this.b = "";
        this.c = true;
        this.i = new igr();
        this.d = iie.a;
        this.e = new hic(null, hla.a);
        this.f = new hic(new iar(0L), hla.a);
        this.k = 9205357640488583168L;
        this.g = 1.0f;
        this.h = 1.0f;
        this.l = new iid(this);
    }

    @Override // defpackage.iib
    public final void b(ifr ifrVar) {
        g(ifrVar, 1.0f, null);
    }

    public final long c() {
        return ((iar) this.f.a()).a;
    }

    public final ibx d() {
        return (ibx) this.e.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.ifr r27, float r28, defpackage.ibx r29) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iif.g(ifr, float, ibx):void");
    }

    public final String toString() {
        return "Params: \tname: " + this.b + "\n\tviewportWidth: " + Float.intBitsToFloat((int) (c() >> 32)) + "\n\tviewportHeight: " + Float.intBitsToFloat((int) (c() & 4294967295L)) + "\n";
    }
}
