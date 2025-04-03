package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axob extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffji b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axob(ffgu ffguVar, ffji ffjiVar) {
        super(2, ffguVar);
        this.b = ffjiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axob) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ffji ffjiVar = this.b;
        this.a = 1;
        Object invoke = ffjiVar.invoke(this);
        return invoke == ffhhVar ? ffhhVar : invoke;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        axob axobVar = new axob(ffguVar, this.b);
        axobVar.c = obj;
        return axobVar;
    }
}
