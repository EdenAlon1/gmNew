package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zjr extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ zjt c;
    final /* synthetic */ ffix d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zjr(ffgu ffguVar, zjt zjtVar, ffix ffixVar) {
        super(3, ffguVar);
        this.c = zjtVar;
        this.d = ffixVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        zjr zjrVar = new zjr((ffgu) obj3, this.c, this.d);
        zjrVar.e = (ffxy) obj;
        zjrVar.b = obj2;
        return zjrVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffxx ffygVar;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r8 = this.e;
            alxr alxrVar = (alxr) this.b;
            if (alxrVar != null) {
                zjt zjtVar = this.c;
                ffygVar = new zjg(new fgcp(new zvh((zvj) zjtVar.e, alxrVar, null)), alxrVar, zjtVar, this.d);
            } else {
                ffygVar = new ffyg(null);
            }
            this.a = 1;
            if (ffyk.c(r8, ffygVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
