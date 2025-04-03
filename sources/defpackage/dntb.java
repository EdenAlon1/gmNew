package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dntb extends ffhv implements ffjm {
    final /* synthetic */ dntl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dntb(dntl dntlVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dntlVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dntb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ffix ffixVar = this.a.c;
        if (ffixVar != null) {
            ffixVar.invoke();
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dntb(this.a, ffguVar);
    }
}
