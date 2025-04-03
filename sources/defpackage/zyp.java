package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zyp extends ffhv implements ffjm {
    int a;
    /* synthetic */ boolean b;
    final /* synthetic */ zyq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zyp(zyq zyqVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = zyqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((zyp) c(bool, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        boolean z;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            z = this.b;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            z = this.b;
        }
        while (z) {
            zyq zyqVar = this.c;
            zyqVar.i.f(zyqVar.d != null ? new Long(r2.getCurrentPosition()) : new Long(0L));
            this.b = true;
            this.a = 1;
            if (ffsw.c(100L, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        zyp zypVar = new zyp(this.c, ffguVar);
        zypVar.b = ((Boolean) obj).booleanValue();
        return zypVar;
    }
}
