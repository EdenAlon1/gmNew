package defpackage;

import android.content.Context;
import java.net.URI;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class evbp {
    public static final long n = TimeUnit.SECONDS.toMillis(20);

    public abstract int a();

    public abstract long b();

    public abstract long c();

    public abstract long d();

    public abstract Context e();

    public abstract emyl f();

    public abstract evag g();

    public abstract Integer h();

    public abstract Integer i();

    public abstract String j();

    public abstract URI k();

    public abstract Executor l();

    public abstract Executor m();

    public abstract Executor n();

    public abstract ScheduledExecutorService o();

    public abstract void p();

    public final int q() {
        return k().getPort();
    }

    public final String r() {
        return k().getHost();
    }
}
