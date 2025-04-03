package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zub extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ zum c;
    final /* synthetic */ ffsk d;
    final /* synthetic */ zst e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zub(ffgu ffguVar, zum zumVar, ffsk ffskVar, zst zstVar) {
        super(3, ffguVar);
        this.c = zumVar;
        this.d = ffskVar;
        this.e = zstVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        zub zubVar = new zub((ffgu) obj3, this.c, this.d, this.e);
        zubVar.f = (ffxy) obj;
        zubVar.b = obj2;
        return zubVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r6 = this.f;
            axrc b = this.c.b(this.d, this.e, (dnto) this.b);
            this.a = 1;
            if (ffyk.c(r6, b, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
