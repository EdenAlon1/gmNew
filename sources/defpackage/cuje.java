package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuje extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ cujh c;
    final /* synthetic */ ConversationIdType d;
    final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuje(cujh cujhVar, ConversationIdType conversationIdType, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = cujhVar;
        this.d = conversationIdType;
        this.e = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cuje) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
        if (this.b == 0) {
            ffci.b(obj);
            cujh cujhVar = this.c;
            ConversationIdType conversationIdType = this.d;
            String str = this.e;
            ekzz f = eleg.f("CarrierSpamReporter#reportSpam-conversationId");
            try {
                bdmq bdmqVar = (bdmq) cujhVar.g.b();
                Object e = cubs.h.e();
                e.getClass();
                engw G = bdmqVar.G(conversationIdType, ((Number) e).intValue());
                if (G != null && !G.isEmpty()) {
                    engw a = G.a();
                    a.getClass();
                    this.a = f;
                    this.b = 1;
                    if (cujhVar.a(str, a, this) == ffhhVar) {
                        return ffhhVar;
                    }
                    ekzzVar = f;
                }
                ffcu ffcuVar = ffcu.a;
                ffig.a(f, null);
                return ffcuVar;
            } catch (Throwable th) {
                th = th;
                r0 = f;
                throw th;
            }
        }
        r0 = this.a;
        try {
            ffci.b(obj);
            ekzzVar = r0;
        } catch (Throwable th2) {
            th = th2;
            try {
                throw th;
            } catch (Throwable th3) {
                ffig.a(r0, th);
                throw th3;
            }
        }
        ffig.a(ekzzVar, null);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cuje(this.c, this.d, this.e, ffguVar);
    }
}
