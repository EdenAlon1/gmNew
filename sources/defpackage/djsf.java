package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djsf extends ffhv implements ffjm {
    final /* synthetic */ djsh a;
    final /* synthetic */ String b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djsf(ffgu ffguVar, djsh djshVar, String str) {
        super(2, ffguVar);
        this.a = djshVar;
        this.b = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((djsf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return fflm.b(((dkcp) this.a.c.b()).i(this.b));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        djsf djsfVar = new djsf(ffguVar, this.a, this.b);
        djsfVar.c = obj;
        return djsfVar;
    }
}
