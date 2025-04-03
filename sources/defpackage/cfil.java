package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfil extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffss b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfil(ffgu ffguVar, ffss ffssVar) {
        super(2, ffguVar);
        this.b = ffssVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfil) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffss ffssVar = this.b;
            if (ffssVar == null) {
                return null;
            }
            this.a = 1;
            if (ffssVar.c(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cfil cfilVar = new cfil(ffguVar, this.b);
        cfilVar.c = obj;
        return cfilVar;
    }
}
