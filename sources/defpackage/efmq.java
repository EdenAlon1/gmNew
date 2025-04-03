package defpackage;

import android.content.Context;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efmq extends efme {
    @Deprecated
    public static efmq c(Context context, CronetEngine cronetEngine) {
        efoa efoaVar = new efoa(cronetEngine);
        context.getClass();
        emxf.b(true, "SDK < 16 isn't supported");
        efmx efmxVar = efmx.a;
        efpb efpbVar = new efpb();
        if (efor.b == null) {
            synchronized (efor.a) {
                if (efor.b == null) {
                    efor.b = context;
                }
            }
        }
        efor.c = efpbVar;
        long j = efow.a;
        efmu.a.c = new efne(context);
        efos.a().a = new efnf();
        efmu.a.d = efoaVar;
        return new efmq();
    }
}
