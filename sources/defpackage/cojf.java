package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cojf extends ffhv implements ffjm {
    final /* synthetic */ cojg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cojf(cojg cojgVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cojgVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cojf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((akzt) this.a.b.b()).c("Bugle.ScreenCapture.Detection.Counts");
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cojf(this.a, ffguVar);
    }
}
