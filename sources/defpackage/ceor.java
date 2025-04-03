package defpackage;

import android.net.Uri;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ceor extends ejte {
    final /* synthetic */ ceos a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ceor(ceos ceosVar, elbx elbxVar) {
        super(elbxVar, "ContentChangeObserver.Observer#onChange", erpp.a);
        this.a = ceosVar;
    }

    @Override // defpackage.ejte
    public final void a(boolean z, Uri uri) {
        ceov ceovVar = (ceov) this.a.a.get();
        if (ceovVar != null) {
            ffbr ffbrVar = ceovVar.a;
            ekzz f = eleg.f("WorkerStartupModule#provideGwqWorkerStartupTask#onContentChanged");
            try {
                ((bafi) ffbrVar.b()).b().G(TimeUnit.SECONDS.toMillis(2L));
                f.close();
            } catch (Throwable th) {
                try {
                    f.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }
}
