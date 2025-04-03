package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgdd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ fgdj b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgdd(fgdj fgdjVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = fgdjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fgdd) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxy ffxyVar = (ffxy) this.c;
            ffkx ffkxVar = new ffkx();
            fgcq fgcqVar = this.b;
            fgdc fgdcVar = new fgdc(ffkxVar, ffxyVar);
            this.a = 1;
            if (fgct.g((fgct) fgcqVar, fgdcVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        throw new ffbx();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        fgdd fgddVar = new fgdd(this.b, ffguVar);
        fgddVar.c = obj;
        return fgddVar;
    }
}
