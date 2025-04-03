package defpackage;

import io.grpc.Status;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fepn extends feby {
    final fepl a;
    final fecc b;
    final /* synthetic */ feqc c;

    public fepn(feqc feqcVar, fepl feplVar, fecc feccVar) {
        this.c = feqcVar;
        this.a = feplVar;
        feccVar.getClass();
        this.b = feccVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0218, code lost:
    
        if (r15.a.c().equals(r0.c()) == false) goto L81;
     */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.feby
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.grpc.Status a(defpackage.feca r15) {
        /*
            Method dump skipped, instructions count: 647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fepn.a(feca):io.grpc.Status");
    }

    public final void b(Status status) {
        feqc.a.logp(Level.WARNING, "io.grpc.internal.ManagedChannelImpl$NameResolverListener", "handleErrorInSyncContext", "[{0}] Failed to resolve name. status={1}", new Object[]{this.c.h, status});
        fepw fepwVar = this.c.J;
        if (fepwVar.a.get() == feqc.e) {
            feqp feqpVar = fepwVar.c.L;
            if (feqpVar != null) {
                fepwVar.d(feqpVar.a());
                feqc feqcVar = fepwVar.c;
                feqcVar.K = feqcVar.L;
                feqcVar.H.a(4, "Initial Name Resolution error, using default service config");
            } else {
                fepwVar.d(null);
            }
        }
        feqc feqcVar2 = this.c;
        if (feqcVar2.U != 3) {
            feqcVar2.H.b(3, "Failed to resolve name: {0}", status);
            this.c.U = 3;
        }
        fepl feplVar = this.a;
        if (feplVar != this.c.u) {
            return;
        }
        feplVar.a.b.b(status);
    }
}
