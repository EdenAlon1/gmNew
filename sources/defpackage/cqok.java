package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqok extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cqol b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqok(cqol cqolVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cqolVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cqok) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cqol cqolVar = this.b;
        this.a = 1;
        Object a = cqolVar.a(this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cqok(this.b, ffguVar);
    }
}
