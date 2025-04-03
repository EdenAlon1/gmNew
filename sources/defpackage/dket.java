package defpackage;

import java.io.PrintWriter;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface dket extends dker, djgy {
    static {
        diyv.b("use_jibe_factory_destroy_alternative");
    }

    void destroyRcsEngine();

    void dumpState(PrintWriter printWriter);

    void initializeRcsEngineForBugle();

    void onSimAbsent();

    void onSimLoaded(boolean z);

    void shutdown();

    void stop(dilc dilcVar);
}
