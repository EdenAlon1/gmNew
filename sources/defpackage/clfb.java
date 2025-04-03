package defpackage;

import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clfb {
    public static final cskc a = cskc.g("BugleRcs", "MessagingServiceResponseReceiver");
    private final errl b;

    public clfb(errl errlVar) {
        this.b = errlVar;
    }

    final elfl a(elfl elflVar, final String str) {
        return elflVar.e(eiby.class, new emwl() { // from class: clew
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                csjb e = clfb.a.e();
                e.I("MessagingServiceException when connecting to MessagingService");
                e.A("methodName", str);
                e.s((eiby) obj);
                return null;
            }
        }, this.b).e(IllegalArgumentException.class, new emwl() { // from class: clex
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                csjb e = clfb.a.e();
                e.I("IllegalArgumentException when connecting to MessagingService");
                e.A("methodName", str);
                e.s((IllegalArgumentException) obj);
                return null;
            }
        }, this.b).e(SecurityException.class, new emwl() { // from class: cley
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                csjb e = clfb.a.e();
                e.I("SecurityException when connecting to MessagingService");
                e.A("methodName", str);
                e.s((SecurityException) obj);
                return null;
            }
        }, this.b).e(TimeoutException.class, new emwl() { // from class: clez
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                csjb e = clfb.a.e();
                e.I("Timeout when initializing connection to MessagingService");
                e.A("methodName", str);
                e.s((TimeoutException) obj);
                return null;
            }
        }, this.b).e(cual.class, new emwl() { // from class: clfa
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                csjb e = clfb.a.e();
                e.I("RcsServiceConnectionException when connecting to MessagingService");
                e.A("methodName", str);
                e.s((cual) obj);
                return null;
            }
        }, this.b);
    }
}
