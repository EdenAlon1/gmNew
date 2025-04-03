package defpackage;

import android.os.Process;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtpq {
    public final Map a = new ConcurrentHashMap();
    public final Executor b;

    public dtpq(Executor executor) {
        this.b = executor;
        a(new dtpb("Main", 1, true, dtpi.a)).e(Process.myPid());
    }

    public final dtpn a(dtpg dtpgVar) {
        dtpo dtpoVar = new dtpo(dtpgVar);
        this.a.put(dtpgVar, dtpoVar);
        return dtpoVar;
    }
}
