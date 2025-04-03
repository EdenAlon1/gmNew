package defpackage;

import androidx.car.app.model.Alert;
import java.security.GeneralSecurityException;
import java.util.EnumSet;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fexv extends fdyx {
    static final feyy a;
    static final ferd b;
    public static final /* synthetic */ int o = 0;
    private static final long p;
    private static final fevl q;
    public fevv c;
    public ferd d;
    public ferd e;
    public SSLSocketFactory f;
    public final boolean g;
    public feyy h;
    public long i;
    public long j;
    public int k;
    public int l;
    public int m;
    public int n;
    private final feqk r;

    static {
        Logger.getLogger(fexv.class.getName());
        feyx feyxVar = new feyx(feyy.a);
        feyxVar.a(feyw.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, feyw.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, feyw.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, feyw.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, feyw.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, feyw.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256);
        feyxVar.c(fezk.TLS_1_2);
        feyxVar.b();
        a = new feyy(feyxVar);
        p = TimeUnit.DAYS.toNanos(1000L);
        fexp fexpVar = new fexp();
        q = fexpVar;
        b = new fevn(fexpVar);
        EnumSet.of(fedu.MTLS, fedu.CUSTOM_MANAGERS);
    }

    public fexv(String str) {
        this.c = fevw.a;
        this.d = b;
        this.e = new fevn(fend.p);
        this.h = a;
        this.n = 1;
        this.i = Long.MAX_VALUE;
        this.j = fend.l;
        this.k = 65535;
        this.l = 4194304;
        this.m = Alert.DURATION_SHOW_INDEFINITELY;
        this.r = new feqk(str, new fexs(this), new fexr(this));
        this.g = false;
    }

    @Override // defpackage.fdyx
    protected final feaw b() {
        return this.r;
    }

    final SSLSocketFactory l() {
        int i = this.n;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 != 0) {
            throw new RuntimeException("Unknown negotiation type: ".concat(fexq.a(1)));
        }
        try {
            if (this.f == null) {
                this.f = SSLContext.getInstance("Default", fezi.b.c).getSocketFactory();
            }
            return this.f;
        } catch (GeneralSecurityException e) {
            throw new RuntimeException("TLS Provider failure", e);
        }
    }

    public final void m(long j, TimeUnit timeUnit) {
        emxf.b(j > 0, "keepalive time must be positive");
        long nanos = timeUnit.toNanos(j);
        this.i = nanos;
        long max = Math.max(nanos, feop.a);
        this.i = max;
        if (max >= p) {
            this.i = Long.MAX_VALUE;
        }
    }

    public final void n(long j, TimeUnit timeUnit) {
        emxf.b(j > 0, "keepalive timeout must be positive");
        long nanos = timeUnit.toNanos(j);
        this.j = nanos;
        this.j = Math.max(nanos, feop.b);
    }

    public final void o(Executor executor) {
        if (executor == null) {
            this.d = b;
        } else {
            this.d = new femo(executor);
        }
    }

    public final void p() {
        emxf.m(true, "Cannot change security when using ChannelCredentials");
        this.n = 1;
    }

    public fexv(String str, int i) {
        this(fend.d(str, i));
    }
}
