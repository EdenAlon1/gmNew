package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djse extends ffhv implements ffjm {
    final /* synthetic */ djsh a;
    final /* synthetic */ djtp b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djse(ffgu ffguVar, djsh djshVar, djtp djtpVar) {
        super(2, ffguVar);
        this.a = djshVar;
        this.b = djtpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((djse) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return fflm.b(((djtn) this.a.e.b()).a(this.b));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        djse djseVar = new djse(ffguVar, this.a, this.b);
        djseVar.c = obj;
        return djseVar;
    }
}
