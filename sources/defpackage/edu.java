package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class edu extends ffkk implements ffix {
    final /* synthetic */ hkx a;
    final /* synthetic */ eey b;
    final /* synthetic */ edi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edu(hkx hkxVar, eey eeyVar, edi ediVar) {
        super(0);
        this.a = hkxVar;
        this.b = eeyVar;
        this.c = ediVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        edp edpVar = (edp) this.a.a();
        elp elpVar = new elp(this.b.d.c.a(), edpVar);
        return new edr(this.b, edpVar, this.c, elpVar);
    }
}
