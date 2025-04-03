package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gug extends ffkk implements ffji {
    final /* synthetic */ ftb a;
    final /* synthetic */ grs b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gug(ftb ftbVar, grs grsVar) {
        super(1);
        this.a = ftbVar;
        this.b = grsVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ifo ifoVar = (ifo) obj;
        long a = ial.a(ifoVar.em(jzt.a(guj.d(this.a))), ifoVar.em(jzt.b(guj.d(this.a))));
        float em = ((ifoVar.em(48.0f) / 2.0f) * ifoVar.eo(this.a.c())) / ifoVar.eo(256.0f);
        ifq.e(ifoVar, ibw.a, em, a, null, 0, 56);
        ifoVar.p();
        long j = this.b.b;
        ifq.e(ifoVar, j, em, a, null, 11, 56);
        ifq.m(ifoVar, j, ias.b(ifoVar.b()), iak.e(a, ial.a(((float) Math.cos(this.a.b())) * em, ((float) Math.sin(this.a.b())) * em)), ifoVar.em(2.0f), 3, 240);
        ifq.e(ifoVar, j, ifoVar.em(8.0f) / 2.0f, ias.b(ifoVar.b()), null, 0, 120);
        ifq.e(ifoVar, this.b.a(true), em, a, null, 4, 56);
        return ffcu.a;
    }
}
