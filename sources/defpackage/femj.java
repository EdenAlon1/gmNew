package defpackage;

import j$.util.DesugarCollections;
import java.net.InetAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class femj extends fecc {
    public static final Logger a;
    public static final Set b;
    static final boolean c;
    static final boolean d;
    protected static final boolean e;
    public static final femi f;
    private static final String s;
    private static final String t;
    private static final String u;
    private static String v;
    private feby A;
    final fecp g;
    public final String j;
    public final int k;
    public final long l;
    public final feds m;
    public final fecb n;
    public final emyg o;
    protected boolean p;
    public boolean q;
    private final String w;
    private final ferd x;
    private boolean y;
    private Executor z;
    public final Random h = new Random();
    protected volatile int r = 1;
    public final AtomicReference i = new AtomicReference();

    static {
        Logger logger = Logger.getLogger(femj.class.getName());
        a = logger;
        b = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        s = property;
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        t = property2;
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        u = property3;
        c = Boolean.parseBoolean(property);
        d = Boolean.parseBoolean(property2);
        e = Boolean.parseBoolean(property3);
        femi femiVar = null;
        try {
            try {
                try {
                    femi femiVar2 = (femi) Class.forName("io.grpc.internal.JndiResourceResolverFactory", true, femj.class.getClassLoader()).asSubclass(femi.class).getConstructor(new Class[0]).newInstance(new Object[0]);
                    if (femiVar2.b() != null) {
                        logger.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "JndiResourceResolverFactory not available, skipping.", femiVar2.b());
                    } else {
                        femiVar = femiVar2;
                    }
                } catch (Exception e2) {
                    a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e2);
                }
            } catch (Exception e3) {
                a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e3);
            }
        } catch (ClassCastException e4) {
            a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e4);
        } catch (ClassNotFoundException e5) {
            a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e5);
        }
        f = femiVar;
    }

    protected femj(String str, febv febvVar, fevl fevlVar, emyg emygVar, boolean z) {
        febvVar.getClass();
        str.getClass();
        URI create = URI.create("//".concat(str));
        emxf.f(create.getHost() != null, "Invalid DNS name: %s", str);
        String authority = create.getAuthority();
        authority.getClass();
        this.w = authority;
        this.j = create.getHost();
        if (create.getPort() == -1) {
            this.k = febvVar.a;
        } else {
            this.k = create.getPort();
        }
        this.g = febvVar.b;
        Executor executor = febvVar.f;
        if (executor != null) {
            this.x = new femo(executor);
        } else {
            this.x = new fevn(fevlVar);
        }
        long j = 0;
        if (!z) {
            String property = System.getProperty("networkaddress.cache.ttl");
            long j2 = 30;
            if (property != null) {
                try {
                    j2 = Long.parseLong(property);
                } catch (NumberFormatException unused) {
                    a.logp(Level.WARNING, "io.grpc.internal.DnsNameResolver", "getNetworkAddressCacheTtlNanos", "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
                }
            }
            j = j2 > 0 ? TimeUnit.SECONDS.toNanos(j2) : j2;
        }
        this.l = j;
        this.o = emygVar;
        this.m = febvVar.c;
        this.n = febvVar.d;
    }

    public static String e() {
        if (v == null) {
            try {
                v = InetAddress.getLocalHost().getHostName();
            } catch (UnknownHostException e2) {
                throw new RuntimeException(e2);
            }
        }
        return v;
    }

    private final void f() {
        if (this.q || this.y) {
            return;
        }
        if (this.p) {
            long j = this.l;
            if (j != 0 && (j <= 0 || this.o.a(TimeUnit.NANOSECONDS) <= this.l)) {
                return;
            }
        }
        this.q = true;
        this.z.execute(new femg(this, this.A));
    }

    @Override // defpackage.fecc
    public final String a() {
        return this.w;
    }

    @Override // defpackage.fecc
    public final void b() {
        emxf.m(this.A != null, "not started");
        f();
    }

    @Override // defpackage.fecc
    public final void c() {
        if (this.y) {
            return;
        }
        this.y = true;
        Executor executor = this.z;
        if (executor != null) {
            this.x.b(executor);
            this.z = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.fecc
    public final void d(feby febyVar) {
        emxf.m(this.A == null, "already started");
        this.z = this.x.a();
        this.A = febyVar;
        f();
    }
}
