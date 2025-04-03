package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwge extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cwgg b;
    final /* synthetic */ aoku c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwge(cwgg cwggVar, aoku aokuVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cwggVar;
        this.c = aokuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwge) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cwgg cwggVar = this.b;
            aoku aokuVar = this.c;
            aqux d = cwggVar.d();
            this.a = 1;
            if (cwggVar.d.a(aokuVar, d, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cwge(this.b, this.c, ffguVar);
    }
}
