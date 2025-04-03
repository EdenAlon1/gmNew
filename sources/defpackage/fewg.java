package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fewg extends ffhv implements ffjm {
    int a;
    final /* synthetic */ fewc b;
    final /* synthetic */ fdxo c;
    final /* synthetic */ fews d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fewg(fewc fewcVar, fdxo fdxoVar, fews fewsVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = fewcVar;
        this.c = fdxoVar;
        this.d = fewsVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fewg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                fewc fewcVar = this.b;
                fdxo fdxoVar = this.c;
                this.a = 1;
                fdxoVar.f(((fewb) fewcVar).a);
                if (ffcu.a == ffhhVar) {
                    return ffhhVar;
                }
            }
            this.c.d();
            return ffcu.a;
        } catch (Exception e) {
            this.c.c("Collection of requests completed exceptionally", e);
            throw e;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new fewg(this.b, this.c, this.d, ffguVar);
    }
}
