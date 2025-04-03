package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgdz extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ fgea c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgdz(fgea fgeaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = fgeaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fgdz) c((ffxe) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxe ffxeVar = (ffxe) this.b;
            fgea fgeaVar = this.c;
            this.a = 1;
            if (fgeaVar.b(ffxeVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        fgdz fgdzVar = new fgdz(this.c, ffguVar);
        fgdzVar.b = obj;
        return fgdzVar;
    }
}
