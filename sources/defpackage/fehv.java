package defpackage;

import java.net.InetSocketAddress;
import java.util.concurrent.ScheduledExecutorService;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fehv extends fdyx {
    public ScheduledExecutorService a;
    public final CronetEngine b;
    public final fevv c = fevw.a;
    public int d = 4194304;
    public boolean e;
    public int f;
    public boolean g;
    public int h;
    private final feqk i;

    private fehv(String str, int i, CronetEngine cronetEngine) {
        this.i = new feqk(InetSocketAddress.createUnresolved(str, i), fend.d(str, i), new fehr(this));
        this.b = cronetEngine;
    }

    public static fehv l(String str, int i, CronetEngine cronetEngine) {
        cronetEngine.getClass();
        return new fehv(str, i, cronetEngine);
    }

    @Override // defpackage.fdyx
    protected final feaw b() {
        return this.i;
    }

    public final void m(int i) {
        this.e = true;
        this.f = i;
    }
}
