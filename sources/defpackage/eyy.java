package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eyy extends ffkk implements ffji {
    final /* synthetic */ jvu a;
    final /* synthetic */ ezf b;
    final /* synthetic */ juw c;
    final /* synthetic */ ffji d;
    final /* synthetic */ ffji e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyy(jvu jvuVar, ezf ezfVar, juw juwVar, ffji ffjiVar, ffji ffjiVar2) {
        super(1);
        this.a = jvuVar;
        this.b = ezfVar;
        this.c = juwVar;
        this.d = ffjiVar;
        this.e = ffjiVar2;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        fas fasVar = (fas) obj;
        fai faiVar = this.b.b;
        fasVar.g = this.a;
        fasVar.h = this.c;
        fasVar.b = this.d;
        fasVar.c = this.e;
        fasVar.d = faiVar != null ? faiVar.b : null;
        fasVar.e = faiVar != null ? faiVar.c : null;
        fasVar.f = faiVar != null ? (jgi) isv.a(faiVar, jdr.n) : null;
        return ffcu.a;
    }
}
