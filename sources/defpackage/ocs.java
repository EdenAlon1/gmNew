package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ocs extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ocy b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ocs(ocy ocyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ocyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ocs) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxy ffxyVar = (ffxy) this.c;
            ffkz ffkzVar = new ffkz();
            ffkzVar.a = Integer.MIN_VALUE;
            ocy ocyVar = this.b;
            fgad fgadVar = new fgad(ocyVar.c, new ocp(null));
            ocr ocrVar = new ocr(ffkzVar, ffxyVar);
            this.a = 1;
            if (fgadVar.a(ocrVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ocs ocsVar = new ocs(this.b, ffguVar);
        ocsVar.c = obj;
        return ocsVar;
    }
}
