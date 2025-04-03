package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avoz extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ avpd c;
    final /* synthetic */ aoku d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avoz(avpd avpdVar, aoku aokuVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = avpdVar;
        this.d = aokuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avoz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
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
            avpd avpdVar = this.c;
            aoku aokuVar = this.d;
            ekzz f = eleg.f("UnifiedCacheRcsCapabilitiesDataSource#getCapabilities#attemptUnlatch");
            try {
                avoy avoyVar = avpdVar.f;
                this.a = f;
                this.b = 1;
                Object a = ((avov) avoyVar).a(aokuVar, this);
                if (a != ffhh.a) {
                    a = ffcu.a;
                }
                if (a == ffhhVar) {
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
        return new avoz(this.c, this.d, ffguVar);
    }
}
