package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class znv extends ffhv implements ffjm {
    int a;
    /* synthetic */ int b;
    final /* synthetic */ zkp c;
    final /* synthetic */ zmz d;
    final /* synthetic */ eey e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public znv(zkp zkpVar, zmz zmzVar, eey eeyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = zkpVar;
        this.d = zmzVar;
        this.e = eeyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((znv) c(Integer.valueOf(((Number) obj).intValue()), (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            int i2 = this.b;
            zkp zkpVar = this.c;
            this.a = 1;
            if (zkpVar.a(i2, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        zoz.d(this.d, this.e);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        znv znvVar = new znv(this.c, this.d, this.e, ffguVar);
        znvVar.b = ((Number) obj).intValue();
        return znvVar;
    }
}
