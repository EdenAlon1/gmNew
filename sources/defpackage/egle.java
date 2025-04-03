package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egle extends egjj {
    public final llf a;
    public final eghu b;

    public egle(eghu eghuVar) {
        llf llfVar = new llf();
        this.a = llfVar;
        this.b = eghuVar;
        llfVar.p(eghuVar.e, new llh() { // from class: egld
            @Override // defpackage.llh
            public final void a(Object obj) {
                egle.this.a.j((eghw) obj);
            }
        });
    }

    @Override // defpackage.egjj
    public final void a(int i) {
        this.b.a(i);
    }
}
