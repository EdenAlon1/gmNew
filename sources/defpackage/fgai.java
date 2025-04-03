package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgai extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffxx b;
    final /* synthetic */ ffjn c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgai(ffxx ffxxVar, ffjn ffjnVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffxxVar;
        this.c = ffjnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fgai) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        fgah fgahVar;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            fgahVar = (fgah) this.d;
            try {
                ffci.b(obj);
            } catch (fgdu e) {
                e = e;
                fgfb.a(e, fgahVar);
                return ffcu.a;
            }
        } else {
            ffci.b(obj);
            ffxy ffxyVar = (ffxy) this.d;
            ffxx ffxxVar = this.b;
            fgah fgahVar2 = new fgah(this.c, ffxyVar);
            try {
                this.d = fgahVar2;
                this.a = 1;
                if (ffxxVar.a(fgahVar2, this) == ffhhVar) {
                    return ffhhVar;
                }
            } catch (fgdu e2) {
                e = e2;
                fgahVar = fgahVar2;
                fgfb.a(e, fgahVar);
                return ffcu.a;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        fgai fgaiVar = new fgai(this.b, this.c, ffguVar);
        fgaiVar.d = obj;
        return fgaiVar;
    }
}
