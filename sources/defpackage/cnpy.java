package defpackage;

import android.content.Context;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnpy {
    public final evgy a;
    private final Context b;
    private final errl c;

    public cnpy(evgy evgyVar, Context context, errl errlVar) {
        context.getClass();
        errlVar.getClass();
        this.a = evgyVar;
        this.b = context;
        this.c = errlVar;
        HashMap hashMap = new HashMap();
        feez.b("stargate.DatagramNotificationService", evcv.a(context, new enpx("com.google.android.apps.stargate"), errlVar), hashMap);
        feez.b("stargate.SatelliteSessionStateNotificationService", evcv.a(context, new enpx("com.google.android.apps.stargate"), errlVar), hashMap);
        evgyVar.b(feez.a(hashMap));
    }
}
