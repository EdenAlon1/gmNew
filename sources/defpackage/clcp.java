package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class clcp extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ clcv c;
    final /* synthetic */ ckep d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clcp(clcv clcvVar, ckep ckepVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = clcvVar;
        this.d = ckepVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((clcp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ?? r0;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            r0 = this.a;
            try {
                ffci.b(obj);
                r0 = r0;
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
            clcv clcvVar = this.c;
            ckep ckepVar = this.d;
            if (!ekxi.b(u())) {
                throw new IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            ekzz f = eleg.f("IncomingRcsMessageProcessor.process");
            try {
                this.a = f;
                this.b = 1;
                obj = clcvVar.d(ckepVar, this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
                r0 = f;
            } catch (Throwable th3) {
                th = th3;
                r0 = f;
                throw th;
            }
        }
        MessageCoreData messageCoreData = (MessageCoreData) obj;
        ffig.a(r0, null);
        return messageCoreData;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new clcp(this.c, this.d, ffguVar);
    }
}
