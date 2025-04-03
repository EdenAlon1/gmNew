package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class cuyn implements eroh {
    public final /* synthetic */ chkk a;

    @Override // defpackage.eroh
    public final ListenableFuture a(Object obj) {
        etez etezVar = (etez) obj;
        eteh etehVar = (eteh) this.a.a.a().j(((Long) chhs.h.e()).longValue(), TimeUnit.MILLISECONDS);
        fdxk fdxkVar = etehVar.a;
        febs febsVar = etei.d;
        if (febsVar == null) {
            synchronized (etei.class) {
                febsVar = etei.d;
                if (febsVar == null) {
                    febp a = febs.a();
                    a.c = febr.UNARY;
                    a.d = febs.c("google.communications.verifiedsms.v1.MessageVerificationService", "ReportDiagnosticInfo");
                    a.b();
                    etez etezVar2 = etez.a;
                    eyfc eyfcVar = ffag.a;
                    a.a = new ffae(etezVar2);
                    a.b = new ffae(etfb.a);
                    febsVar = a.a();
                    etei.d = febsVar;
                }
            }
        }
        return elfl.g(ffat.a(fdxkVar.a(febsVar, etehVar.b), etezVar));
    }
}
