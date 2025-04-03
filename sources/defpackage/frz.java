package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class frz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ fsa b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public frz(fsa fsaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = fsaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((frz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffsk ffskVar = (ffsk) this.c;
            fsa fsaVar = this.b;
            fry fryVar = new fry(fsaVar, ffskVar);
            this.a = 1;
            if (fgct.g((fgct) fsaVar.i.a, fryVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        frz frzVar = new frz(this.b, ffguVar);
        frzVar.c = obj;
        return frzVar;
    }
}
