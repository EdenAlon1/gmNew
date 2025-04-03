package defpackage;

import com.google.android.apps.messaging.contacts.corp.CorpContactsRefreshWorker;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tum implements AutoCloseable {
    final /* synthetic */ CorpContactsRefreshWorker a;
    private final int b;

    public tum(CorpContactsRefreshWorker corpContactsRefreshWorker, int i) {
        this.a = corpContactsRefreshWorker;
        this.b = i;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Iterator it = ((Set) this.a.l.b()).iterator();
        RuntimeException runtimeException = null;
        while (it.hasNext()) {
            try {
                ((coup) it.next()).a(this.b);
            } catch (RuntimeException e) {
                if (runtimeException != null) {
                    e.addSuppressed(runtimeException);
                }
                csjb e2 = CorpContactsRefreshWorker.f.e();
                e2.I("Wasn't able to complete onContactsRefreshCompleted() method successfully, skipping.");
                e2.s(e);
                runtimeException = e;
            }
        }
        if (runtimeException != null) {
            throw new IllegalStateException("Unable to perform onContactsRefreshCompleted operation successfully", runtimeException);
        }
    }
}
