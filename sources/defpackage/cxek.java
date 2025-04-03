package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxek implements eivv {
    final /* synthetic */ cxel a;
    private final ffbr b;

    public cxek(cxel cxelVar, ffbr ffbrVar) {
        this.a = cxelVar;
        this.b = ffbrVar;
    }

    @Override // defpackage.eivv
    public final void aa(eivt eivtVar) {
        if (this.a.c.a() <= 1) {
            cxel cxelVar = this.a;
            cxelVar.b.T(cxelVar.a, eivtVar.a());
        } else {
            cxel cxelVar2 = this.a;
            cxelVar2.b.N(cxelVar2.a, eivtVar.a());
        }
        this.a.a.finish();
    }

    @Override // defpackage.eivv
    public final void ac(eiup eiupVar) {
        ((adio) this.b.b()).a(eiupVar);
    }

    @Override // defpackage.eivv
    public final /* synthetic */ void ab() {
    }

    @Override // defpackage.eivv
    public final /* synthetic */ void d() {
    }
}
