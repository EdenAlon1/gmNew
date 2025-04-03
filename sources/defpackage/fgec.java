package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgec extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffxx b;
    final /* synthetic */ fgfm c;
    final /* synthetic */ fgjh d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgec(ffxx ffxxVar, fgfm fgfmVar, fgjh fgjhVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffxxVar;
        this.c = fgfmVar;
        this.d = fgjhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fgec) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                ffxx ffxxVar = this.b;
                fgfm fgfmVar = this.c;
                this.a = 1;
                if (ffxxVar.a(fgfmVar, this) == ffhhVar) {
                    return ffhhVar;
                }
            }
            this.d.h();
            return ffcu.a;
        } catch (Throwable th) {
            this.d.h();
            throw th;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new fgec(this.b, this.c, this.d, ffguVar);
    }
}
