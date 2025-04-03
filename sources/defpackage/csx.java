package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class csx extends ffkk implements ffji {
    final /* synthetic */ cue a;
    final /* synthetic */ cug b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csx(cue cueVar, cug cugVar) {
        super(1);
        this.a = cueVar;
        this.b = cugVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        cyq cyqVar;
        cyq cyqVar2;
        dau dauVar = (dau) obj;
        if (dauVar.d(cst.a, cst.b)) {
            cui cuiVar = this.a.b().a;
            return (cuiVar == null || (cyqVar2 = cuiVar.b) == null) ? ctt.a : cyqVar2;
        }
        if (!dauVar.d(cst.b, cst.c)) {
            return ctt.a;
        }
        cui cuiVar2 = this.b.b().a;
        return (cuiVar2 == null || (cyqVar = cuiVar2.b) == null) ? ctt.a : cyqVar;
    }
}
