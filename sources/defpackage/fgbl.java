package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgbl extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ffxx c;
    final /* synthetic */ fgcl d;
    final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgbl(ffxx ffxxVar, fgcl fgclVar, Object obj, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ffxxVar;
        this.d = fgclVar;
        this.e = obj;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fgbl) c((fgcw) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            int ordinal = ((fgcw) this.b).ordinal();
            if (ordinal == 0) {
                ffxx ffxxVar = this.c;
                fgcl fgclVar = this.d;
                this.a = 1;
                if (ffxxVar.a(fgclVar, this) == ffhhVar) {
                    return ffhhVar;
                }
            } else if (ordinal != 1) {
                if (ordinal != 2) {
                    throw new ffcd();
                }
                Object obj2 = this.e;
                if (obj2 == fgcu.a) {
                    this.d.e();
                } else {
                    this.d.h(obj2);
                }
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        fgbl fgblVar = new fgbl(this.c, this.d, this.e, ffguVar);
        fgblVar.b = obj;
        return fgblVar;
    }
}
