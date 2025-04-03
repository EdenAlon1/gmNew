package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekjg {
    public static final efkj a;
    public final Context b;
    public final edyp c;
    public final ExecutorService d;
    public final ScheduledExecutorService e;
    public final int f;
    public final Map g;
    public final enru h;
    public final boolean i;
    public final Map j;
    private final Map k;
    private final fazb l;

    static {
        efkc efkcVar = new efkc();
        efkcVar.c("CREATE TABLE ListenerSuccessfulRuns (listener_key, version_code INTEGER NOT NULL);");
        efkcVar.c("CREATE TABLE AllListenersSucceededVersionTable (version_code INTEGER PRIMARY KEY ON CONFLICT REPLACE);");
        a = efkcVar.a();
    }

    public ekjg(Context context, edyp edypVar, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService, int i, Map map, Map map2, fazb fazbVar) {
        context.getClass();
        executorService.getClass();
        scheduledExecutorService.getClass();
        fazbVar.getClass();
        this.b = context;
        this.c = edypVar;
        this.d = executorService;
        this.e = scheduledExecutorService;
        this.f = i;
        this.k = map;
        this.g = map2;
        this.l = fazbVar;
        if (!ffdx.ao(((enhk) map).keySet(), ((enhk) map2).keySet()).isEmpty()) {
            Set ao = ffdx.ao(((enhk) map).keySet(), ((enhk) map2).keySet());
            Objects.toString(ao);
            throw new IllegalStateException("Don't provide both an unannotated and @AllProcessesStartupAfterPackageReplacedListener StartupAfterPackageReplacedListener provider for keys ".concat(ao.toString()));
        }
        this.h = enru.c("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner");
        Boolean bool = false;
        bool.getClass();
        this.i = false;
        this.j = edypVar.a() ? ffew.j(map, map2) : map2;
    }

    public final efiv a() {
        return (efiv) this.l.b();
    }
}
