package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class enq extends eik {
    public final eln a;
    private final ffjo b;
    private final ffji c;

    public enq(ffjo ffjoVar, ffji ffjiVar, int i) {
        this.b = ffjoVar;
        this.c = ffjiVar;
        eln elnVar = new eln();
        elnVar.b(i, new enc(ffjiVar, ffjoVar));
        this.a = elnVar;
    }

    @Override // defpackage.eik
    public final eln b() {
        return this.a;
    }
}
