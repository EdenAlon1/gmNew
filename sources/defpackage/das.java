package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class das {
    final /* synthetic */ dbe a;
    private final dbv b;
    private final hho c = new hic(null, hla.a);

    public das(dbe dbeVar, dbv dbvVar) {
        this.a = dbeVar;
        this.b = dbvVar;
    }

    public final dar a() {
        return (dar) this.c.a();
    }

    public final hkx b(ffji ffjiVar, ffji ffjiVar2) {
        dar a = a();
        if (a == null) {
            dbe dbeVar = this.a;
            dar darVar = new dar(this, new daw(dbeVar, ffjiVar2.invoke(dbeVar.e()), cxw.a(this.b, ffjiVar2.invoke(this.a.e())), this.b), ffjiVar, ffjiVar2);
            dbe dbeVar2 = this.a;
            this.c.b(darVar);
            dbeVar2.u(darVar.a);
            a = darVar;
        }
        dbe dbeVar3 = this.a;
        a.c = ffjiVar2;
        a.b = ffjiVar;
        a.b(dbeVar3.d());
        return a;
    }
}
