package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class csy extends ffkk implements ffji {
    final /* synthetic */ cue a;
    final /* synthetic */ cug b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csy(cue cueVar, cug cugVar) {
        super(1);
        this.a = cueVar;
        this.b = cugVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int ordinal = ((cst) obj).ordinal();
        float f = 1.0f;
        if (ordinal == 0) {
            cui cuiVar = this.a.b().a;
            if (cuiVar != null) {
                f = cuiVar.a;
            }
        } else if (ordinal != 1) {
            if (ordinal != 2) {
                throw new ffcd();
            }
            cui cuiVar2 = this.b.b().a;
            if (cuiVar2 != null) {
                f = cuiVar2.a;
            }
        }
        return Float.valueOf(f);
    }
}
