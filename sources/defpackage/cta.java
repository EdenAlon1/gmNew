package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cta extends ffkk implements ffji {
    final /* synthetic */ cue a;
    final /* synthetic */ cug b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cta(cue cueVar, cug cugVar) {
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
            cup cupVar = this.a.b().d;
            return (cupVar == null || (cyqVar2 = cupVar.c) == null) ? ctt.a : cyqVar2;
        }
        if (!dauVar.d(cst.b, cst.c)) {
            return ctt.a;
        }
        cup cupVar2 = this.b.b().d;
        return (cupVar2 == null || (cyqVar = cupVar2.c) == null) ? ctt.a : cyqVar;
    }
}
