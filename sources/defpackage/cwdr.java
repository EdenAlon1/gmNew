package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwdr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cwds b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwdr(cwds cwdsVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cwdsVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwdr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxx a = ffyo.a(this.b.a.a());
            cwdq cwdqVar = new cwdq(this.b);
            this.a = 1;
            if (a.a(cwdqVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cwdr(this.b, ffguVar);
    }
}
