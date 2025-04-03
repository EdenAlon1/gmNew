package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejxb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffji b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejxb(ffgu ffguVar, ffji ffjiVar) {
        super(2, ffguVar);
        this.b = ffjiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ejxb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffji ffjiVar = this.b;
            this.a = 1;
            if (ffjiVar.invoke(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ejxb ejxbVar = new ejxb(ffguVar, this.b);
        ejxbVar.c = obj;
        return ejxbVar;
    }
}
