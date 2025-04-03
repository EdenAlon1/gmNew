package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pvc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ pvf b;
    final /* synthetic */ ffxe c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvc(pvf pvfVar, ffxe ffxeVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = pvfVar;
        this.c = ffxeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((pvc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            pvf pvfVar = this.b;
            this.a = 1;
            if (ffsw.c(pvfVar.b, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        ppt.c().a(pvq.a, "NetworkRequestConstraintController didn't receive neither  onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after " + this.b.b + " ms");
        this.c.b(new puz(7));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new pvc(this.b, this.c, ffguVar);
    }
}
