package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ynt extends ffhv implements ffjm {
    int a;
    final /* synthetic */ you b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ynt(you youVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = youVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ynt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            elfl a = this.b.c().a();
            this.a = 1;
            if (fgfz.c(a, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ynt(this.b, ffguVar);
    }
}
