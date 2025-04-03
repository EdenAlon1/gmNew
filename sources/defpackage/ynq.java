package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ynq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ you b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ynq(you youVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = youVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ynq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            you youVar = this.b;
            ynp ynpVar = new ynp(youVar);
            this.a = 1;
            if (fgct.g((fgct) youVar.l, ynpVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        throw new ffbx();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ynq(this.b, ffguVar);
    }
}
