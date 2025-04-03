package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddaj implements adf {
    final /* synthetic */ ddae a;

    public ddaj(ddae ddaeVar) {
        this.a = ddaeVar;
    }

    @Override // defpackage.adf
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ddae ddaeVar = this.a;
        ddaeVar.s = (efto) obj;
        ddaeVar.j();
        ddae ddaeVar2 = this.a;
        ddaeVar2.c().removeTextChangedListener(ddaeVar2.t);
        ddae ddaeVar3 = this.a;
        ddaeVar3.c().addTextChangedListener(ddaeVar3.e());
        this.a.l();
    }
}
