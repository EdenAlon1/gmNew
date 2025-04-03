package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fefx implements fecw {
    @Override // defpackage.fecw
    public final fect a(fecu fecuVar, febo feboVar, fecv fecvVar) {
        ListenableFuture h;
        Status withDescription;
        fefz fefzVar = (fefz) fecuVar.f().a(fega.a);
        febs d = fecuVar.d();
        String str = d.c;
        boolean z = d.f;
        if (!z || (h = (ListenableFuture) fefzVar.b.get(str)) == null) {
            feel feelVar = fefzVar.d;
            int i = fefzVar.a;
            fefa fefaVar = feelVar.a;
            feey feeyVar = (feey) fefaVar.b.getOrDefault(str, fefaVar.a);
            if (feeyVar instanceof feeg) {
                h = ((feeg) feeyVar).b(i);
            } else {
                try {
                    h = erqt.i(feeyVar.a(i));
                } catch (Exception e) {
                    h = erqt.h(e);
                }
            }
            if (z) {
                fefzVar.b.putIfAbsent(str, h);
                erqt.r(h, new fefy(fefzVar, str, h), erpp.a);
            }
        }
        if (!h.isDone()) {
            Executor executor = fefzVar.c;
            fehg fehgVar = new fehg();
            erqt.r(h, new fefw(fecuVar, fehgVar, feboVar, fecvVar), executor);
            return fehgVar;
        }
        try {
            withDescription = (Status) erqt.q(h);
        } catch (CancellationException | ExecutionException e2) {
            Status d2 = Status.o.d(e2);
            String message = e2.getMessage();
            withDescription = message != null ? d2.withDescription(message) : d2;
        }
        if (withDescription.f()) {
            return fecvVar.a(fecuVar, feboVar);
        }
        fecuVar.a(withDescription, new febo());
        return new fefv();
    }
}
