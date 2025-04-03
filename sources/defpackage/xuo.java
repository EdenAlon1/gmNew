package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xuo extends ffhv implements ffjm {
    int a;
    final /* synthetic */ xuw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xuo(xuw xuwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = xuwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xuo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            xuw xuwVar = this.b;
            xun xunVar = new xun(xuwVar);
            this.a = 1;
            if (xuwVar.j.a(xunVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        throw new ffbx();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new xuo(this.b, ffguVar);
    }
}
