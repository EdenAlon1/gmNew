package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abrq extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ absj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abrq(absj absjVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = absjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abrq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ?? r0;
        ekzz ekzzVar;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            r0 = this.a;
            try {
                ffci.b(obj);
                ekzzVar = r0;
            } catch (Throwable th) {
                th = th;
                try {
                    throw th;
                } catch (Throwable th2) {
                    ffig.a(r0, th);
                    throw th2;
                }
            }
        } else {
            ffci.b(obj);
            absj absjVar = this.c;
            if (!ekxi.b(u())) {
                throw new IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            ekzz f = eleg.f("ForkedConversationReporterV2#evaluate");
            try {
                albq albqVar = absjVar.e;
                abrp abrpVar = new abrp(absjVar, null);
                this.a = f;
                this.b = 1;
                if (albs.a(albqVar, "Bugle.Custodian.ForkedConversationReporterV2.Duration", abrpVar, this) == ffhhVar) {
                    return ffhhVar;
                }
                ekzzVar = f;
            } catch (Throwable th3) {
                th = th3;
                r0 = f;
                throw th;
            }
        }
        ffig.a(ekzzVar, null);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new abrq(this.c, ffguVar);
    }
}
