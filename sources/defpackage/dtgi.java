package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtgi extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ dtgp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtgi(dtgp dtgpVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = dtgpVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dtgi dtgiVar = new dtgi(this.c, (ffgu) obj3);
        dtgiVar.b = (Exception) obj2;
        return dtgiVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            Object obj2 = this.b;
            dtgp dtgpVar = this.c;
            this.a = 1;
            if (dtgpVar.e((Exception) obj2, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
