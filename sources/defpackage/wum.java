package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wum extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    private /* synthetic */ Object c;

    public wum(ffgu ffguVar) {
        super(3, ffguVar);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        wum wumVar = new wum((ffgu) obj3);
        wumVar.c = (ffxy) obj;
        wumVar.b = obj2;
        return wumVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r4 = this.c;
            ffxx ffxxVar = (ffxx) this.b;
            this.a = 1;
            if (ffyk.c(r4, ffxxVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
