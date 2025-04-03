package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axsz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffxx b;
    final /* synthetic */ long c;
    final /* synthetic */ ffjn d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axsz(ffxx ffxxVar, long j, ffjn ffjnVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffxxVar;
        this.c = j;
        this.d = ffjnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axsz) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            axsy axsyVar = new axsy(this.b, this.c, (ffxy) this.e, this.d, null);
            this.a = 1;
            if (ffsl.a(axsyVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        axsz axszVar = new axsz(this.b, this.c, this.d, ffguVar);
        axszVar.e = obj;
        return axszVar;
    }
}
