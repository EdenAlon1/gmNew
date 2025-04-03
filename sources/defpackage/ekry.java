package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekry extends eewk {
    final /* synthetic */ eksb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekry(eksb eksbVar) {
        super("forceWakeup");
        this.a = eksbVar;
    }

    @Override // defpackage.eewl
    public final String c(Context context, String[] strArr) {
        try {
            ekzz f = eleg.f("forceWakeup");
            try {
                ListenableFuture b = ((ektp) this.a.a.b()).b();
                f.b(b);
                b.get();
                f.close();
                return "Done.\n";
            } catch (Throwable th) {
                try {
                    f.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (InterruptedException | ExecutionException e) {
            return "Error: ".concat(String.valueOf(e.toString()));
        }
    }
}
