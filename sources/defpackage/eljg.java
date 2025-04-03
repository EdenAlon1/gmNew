package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eljg {
    public static final /* synthetic */ int d = 0;
    private static final enru e = enru.c("com/google/apps/tiktok/tracing/debug/TraceDatabase");
    private static final efkj f;
    public final errl a;
    public final errl b;
    public final efiv c;

    static {
        efkc efkcVar = new efkc();
        efkcVar.c("CREATE TABLE tracing(name TEXT NOT NULL, start_time INTEGER NOT NULL, end_time INTEGER NOT NULL, trace_data BLOB NOT NULL)");
        efkcVar.c("CREATE INDEX tracing_start_time_index ON tracing(start_time)");
        efkcVar.c("CREATE TRIGGER tracing_purge_old_traces_trigger AFTER INSERT ON tracing WHEN (SELECT COUNT(start_time) > 2500 FROM tracing) BEGIN DELETE FROM tracing WHERE start_time < (SELECT start_time FROM tracing ORDER BY start_time DESC LIMIT 250,1); END");
        efke efkeVar = new efke();
        efkd.a("synchronous = 0", efkeVar);
        efkcVar.a = efkeVar;
        f = efkcVar.a();
    }

    public eljg(errl errlVar, errl errlVar2, efix efixVar) {
        this.a = errlVar;
        this.b = errlVar2;
        this.c = efixVar.a(new erog() { // from class: eljd
            @Override // defpackage.erog
            public final ListenableFuture a() {
                int i = eljg.d;
                return erqt.i("tracing");
            }
        }, f);
    }

    static /* synthetic */ void a(ListenableFuture listenableFuture) {
        try {
            erqt.q(listenableFuture);
        } catch (CancellationException unused) {
        } catch (ExecutionException e2) {
            ((enrr) ((enrr) ((enrr) e.i()).g(e2.getCause())).h("com/google/apps/tiktok/tracing/debug/TraceDatabase", "insert", (char) 161, "TraceDatabase.java")).q("Inserting failed");
        }
    }

    static boolean b(String str) {
        return str.startsWith("TracePager") || str.startsWith("TraceRefresh") || str.startsWith("DebugTraceActivity");
    }
}
