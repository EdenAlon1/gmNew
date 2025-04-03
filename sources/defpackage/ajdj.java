package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajdj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ajee b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajdj(ffgu ffguVar, ajee ajeeVar) {
        super(2, ffguVar);
        this.b = ajeeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajdj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        long j = ffpw.a;
        Object e = ctjd.aA.e();
        e.getClass();
        long e2 = ffpy.e(((Number) e).longValue(), ffpz.d);
        ajdl ajdlVar = new ajdl(this.b, null);
        this.a = 1;
        Object b = ffvm.b(e2, ajdlVar, this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ajdj ajdjVar = new ajdj(ffguVar, this.b);
        ajdjVar.c = obj;
        return ajdjVar;
    }
}
