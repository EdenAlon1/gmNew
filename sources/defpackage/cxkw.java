package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxkw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cxkx b;
    final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxkw(cxkx cxkxVar, Object obj, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cxkxVar;
        this.c = obj;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cxkw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            curb curbVar = (curb) this.b.c.b();
            boolean booleanValue = ((Boolean) this.c).booleanValue();
            this.a = 1;
            if (curbVar.b(booleanValue, true, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cxkw(this.b, this.c, ffguVar);
    }
}
