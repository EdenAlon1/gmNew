package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ctb extends ffkk implements ffji {
    final /* synthetic */ cue a;
    final /* synthetic */ cug b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctb(cue cueVar, cug cugVar) {
        super(1);
        this.a = cueVar;
        this.b = cugVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int ordinal = ((cst) obj).ordinal();
        float f = 1.0f;
        if (ordinal == 0) {
            cup cupVar = this.a.b().d;
            if (cupVar != null) {
                f = cupVar.a;
            }
        } else if (ordinal != 1) {
            if (ordinal != 2) {
                throw new ffcd();
            }
            cup cupVar2 = this.b.b().d;
            if (cupVar2 != null) {
                f = cupVar2.a;
            }
        }
        return Float.valueOf(f);
    }
}
