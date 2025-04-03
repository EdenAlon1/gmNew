package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwas extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cwat b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwas(cwat cwatVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cwatVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwas) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxx a = ((cwis) this.b.b.b()).a();
            cwar cwarVar = new cwar(this.b);
            this.a = 1;
            if (a.a(cwarVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cwas(this.b, ffguVar);
    }
}
