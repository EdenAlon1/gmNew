package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwgf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cwgg b;
    final /* synthetic */ ambn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwgf(cwgg cwggVar, ambn ambnVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cwggVar;
        this.c = ambnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwgf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cwgg cwggVar = this.b;
            aoku b = this.c.b();
            aqux d = cwggVar.d();
            this.a = 1;
            if (cwggVar.d.a(b, d, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cwgf(this.b, this.c, ffguVar);
    }
}
