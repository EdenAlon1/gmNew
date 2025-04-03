package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaes extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aaex b;
    final /* synthetic */ alxr c;
    final /* synthetic */ ajiy d;
    final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaes(aaex aaexVar, alxr alxrVar, ajiy ajiyVar, boolean z, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aaexVar;
        this.c = alxrVar;
        this.d = ajiyVar;
        this.e = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aaes) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            fgad fgadVar = new fgad(aqfu.a(this.b.d.h(this.c.b())), new aaer(this.d, this.e, null));
            this.a = 1;
            if (ffyk.a(fgadVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aaes(this.b, this.c, this.d, this.e, ffguVar);
    }
}
