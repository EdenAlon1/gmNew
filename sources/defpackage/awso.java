package defpackage;

import android.os.Bundle;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awso implements awrh {
    public static final cskc a = cskc.g("BugleDataModel", "UnencryptedSinglePartIncomingChatMessageProcessor");
    public final eikl b;
    public final awsk c;
    public final ffbr d;
    private final errl e;
    private final avtx f;

    public awso(errl errlVar, eikl eiklVar, avtx avtxVar, awsk awskVar, ffbr ffbrVar) {
        this.b = eiklVar;
        this.f = avtxVar;
        this.c = awskVar;
        this.e = errlVar;
        this.d = ffbrVar;
    }

    @Override // defpackage.awrh
    public final elfl a(awrj awrjVar) {
        return b(awrjVar, Bundle.EMPTY);
    }

    public final elfl b(final awrj awrjVar, final Bundle bundle) {
        final eijp eijpVar;
        final ContentType a2;
        final String str;
        ekzz f = eleg.f("UnencryptedSinglePartIncomingChatMessageProcessor::process");
        try {
            eijpVar = (eijp) this.f.m().fP(awrjVar.e());
            a2 = eijpVar.a();
            str = awrjVar.b().l;
            csjb c = a.c();
            c.I("Processing incoming message");
            c.h(bdhg.a(str));
            c.A("contentType", a2);
            c.r();
        } catch (Throwable th) {
            th = th;
        }
        try {
            elfl f2 = elfl.g(kfg.a(new kfd() { // from class: awsl
                @Override // defpackage.kfd
                public final Object a(kfb kfbVar) {
                    awso awsoVar = awso.this;
                    eihn a3 = awsoVar.b.a(a2).a(eijpVar);
                    awsn awsnVar = new awsn(kfbVar);
                    awrj awrjVar2 = awrjVar;
                    awrjVar2.getClass();
                    Bundle bundle2 = bundle;
                    bundle2.getClass();
                    awsk awskVar = awsoVar.c;
                    errl errlVar = (errl) awskVar.a.b();
                    errlVar.getClass();
                    cqoh cqohVar = (cqoh) awskVar.b.b();
                    cqohVar.getClass();
                    atmb atmbVar = (atmb) awskVar.t.b();
                    atmbVar.getClass();
                    a3.hz(new awsj(awrjVar2, awsnVar, bundle2, errlVar, cqohVar, awskVar.c, awskVar.d, awskVar.e, awskVar.f, awskVar.g, awskVar.h, awskVar.i, awskVar.j, awskVar.k, awskVar.l, awskVar.m, awskVar.n, awskVar.o, awskVar.p, awskVar.q, awskVar.r, awskVar.s, atmbVar, awskVar.u));
                    return "UnencryptedIncomingChatMessageVisitor for messageId:".concat(String.valueOf(str));
                }
            })).f(eikm.class, new eroh() { // from class: awsm
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    csjb e = awso.a.e();
                    e.I("Deserialization of the incoming message failed");
                    e.h(bdhg.a(str));
                    e.A("contentType", a2);
                    e.s((eikm) obj);
                    ((avkz) awso.this.d.b()).e(awrjVar.b(), eqwy.CHAT_API_FAILED_PERMANENTLY, 10);
                    return elfo.e(avui.FAIL_NO_RETRY);
                }
            }, this.e);
            f.b(f2);
            f.close();
            return f2;
        } catch (Throwable th2) {
            th = th2;
            Throwable th3 = th;
            try {
                f.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }
}
