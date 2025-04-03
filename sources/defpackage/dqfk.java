package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqfk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dqfm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqfk(dqfm dqfmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dqfmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqfk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        dpnn dpnnVar;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0 && (dpnnVar = this.b.f) != null) {
            this.a = 1;
            if (dpnnVar.E() == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqfk(this.b, ffguVar);
    }
}
