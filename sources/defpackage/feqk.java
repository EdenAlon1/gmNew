package defpackage;

import j$.util.DesugarCollections;
import java.lang.reflect.Method;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feqk extends feaw {
    private static final Method v;
    ferd d;
    public ferd e;
    fecf f;
    final List g;
    final String h;
    String i;
    final String j;
    fdyv k;
    fdxz l;
    long m;
    public boolean n;
    final fdzq o;
    Map p;
    public final feqd q;
    private final List w;
    private final feqe x;
    private static final Logger r = Logger.getLogger(feqk.class.getName());
    static final long a = TimeUnit.MINUTES.toMillis(30);
    static final long b = TimeUnit.SECONDS.toMillis(1);
    private static final ferd s = new fevn(fend.o);
    private static final fdyv t = fdyv.b;
    private static final fdxz u = fdxz.a;
    static final Pattern c = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

    static {
        Method method = null;
        try {
            Class<?> cls = Class.forName("fehp");
            Class<?> cls2 = Boolean.TYPE;
            method = cls.getDeclaredMethod("getClientInterceptor", cls2, cls2, cls2, cls2);
        } catch (ClassNotFoundException e) {
            r.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "<clinit>", "Unable to apply census stats", (Throwable) e);
        } catch (NoSuchMethodException e2) {
            r.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "<clinit>", "Unable to apply census stats", (Throwable) e2);
        }
        v = method;
    }

    public feqk(String str, feqe feqeVar, feqd feqdVar) {
        ferd ferdVar = s;
        this.d = ferdVar;
        this.e = ferdVar;
        this.w = new ArrayList();
        this.f = fecf.b();
        this.g = new ArrayList();
        this.j = "pick_first";
        this.k = t;
        this.l = u;
        this.m = a;
        this.n = true;
        this.o = fdzq.b;
        new ArrayList();
        str.getClass();
        this.h = str;
        this.x = feqeVar;
        this.q = feqdVar;
        fdzt.b();
    }

    static feqj b(String str, fecf fecfVar, Collection collection) {
        URI uri;
        StringBuilder sb = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e) {
            sb.append(e.getMessage());
            uri = null;
        }
        fecd a2 = uri != null ? fecfVar.a(uri.getScheme()) : null;
        if (a2 == null && !c.matcher(str).matches()) {
            try {
                uri = new URI(fecfVar.c(), "", a.t(str, "/"), null);
                a2 = fecfVar.a(uri.getScheme());
            } catch (URISyntaxException e2) {
                throw new IllegalArgumentException(e2);
            }
        }
        if (a2 == null) {
            throw new IllegalArgumentException(String.format("Could not find a NameResolverProvider for %s%s", str, sb.length() > 0 ? a.b(sb, " (", ")") : ""));
        }
        if (collection == null || collection.containsAll(a2.c())) {
            return new feqj(uri, a2);
        }
        throw new IllegalArgumentException(String.format("Address types of NameResolver '%s' for '%s' not supported by transport", uri.getScheme(), str));
    }

    static String l(SocketAddress socketAddress) {
        try {
            return new URI("directaddress", "", a.C(socketAddress, "/"), null).toString();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    private static List m(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            if (obj == null) {
                arrayList.add(null);
            } else if (obj instanceof Map) {
                arrayList.add(n((Map) obj));
            } else if (obj instanceof List) {
                arrayList.add(m((List) obj));
            } else if (obj instanceof String) {
                arrayList.add(obj);
            } else if (obj instanceof Double) {
                arrayList.add(obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("The entry '" + obj.toString() + "' is of type '" + String.valueOf(obj.getClass()) + "', which is not supported");
                }
                arrayList.add(obj);
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    private static Map n(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            emxf.f(entry.getKey() instanceof String, "The key of the entry '%s' is not of String type", entry);
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                linkedHashMap.put(str, null);
            } else if (value instanceof Map) {
                linkedHashMap.put(str, n((Map) value));
            } else if (value instanceof List) {
                linkedHashMap.put(str, m((List) value));
            } else if (value instanceof String) {
                linkedHashMap.put(str, value);
            } else if (value instanceof Double) {
                linkedHashMap.put(str, value);
            } else {
                if (!(value instanceof Boolean)) {
                    throw new IllegalArgumentException("The value of the map entry '" + String.valueOf(entry) + "' is of type '" + String.valueOf(value.getClass()) + "', which is not supported");
                }
                linkedHashMap.put(str, value);
            }
        }
        return DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:11|12|(10:14|15|16|(1:18)|19|20|21|(1:23)|24|25)|40|(0)|19|20|21|(0)|24|25) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e6, code lost:
    
        defpackage.feqk.r.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (java.lang.Throwable) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c4, code lost:
    
        defpackage.feqk.r.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (java.lang.Throwable) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d5, code lost:
    
        defpackage.feqk.r.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (java.lang.Throwable) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b3, code lost:
    
        defpackage.feqk.r.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (java.lang.Throwable) r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f7  */
    @Override // defpackage.feaw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.feau a() {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.feqk.a():feau");
    }

    @Override // defpackage.feaw
    public final /* synthetic */ void c(fdxz fdxzVar) {
        this.l = fdxzVar;
    }

    @Override // defpackage.feaw
    public final /* bridge */ /* synthetic */ void d(fdyv fdyvVar) {
        if (fdyvVar != null) {
            this.k = fdyvVar;
        } else {
            this.k = t;
        }
    }

    @Override // defpackage.feaw
    public final /* bridge */ /* synthetic */ void e(Map map) {
        this.p = n(map);
    }

    @Override // defpackage.feaw
    public final /* bridge */ /* synthetic */ void f() {
        this.n = true;
    }

    @Override // defpackage.feaw
    public final /* bridge */ /* synthetic */ void g(Executor executor) {
        if (executor != null) {
            this.d = new femo(executor);
        } else {
            this.d = s;
        }
    }

    @Override // defpackage.feaw
    public final /* bridge */ /* synthetic */ void h(long j, TimeUnit timeUnit) {
        emxf.e(j > 0, "idle timeout is %s, but must be positive", j);
        if (timeUnit.toDays(j) >= 30) {
            this.m = -1L;
        } else {
            this.m = Math.max(timeUnit.toMillis(j), b);
        }
    }

    @Override // defpackage.feaw
    public final /* bridge */ /* synthetic */ void i(fdxp[] fdxpVarArr) {
        this.w.addAll(Arrays.asList(fdxpVarArr));
    }

    @Override // defpackage.feaw
    public final /* bridge */ /* synthetic */ void j(Executor executor) {
        if (executor != null) {
            this.e = new femo(executor);
        } else {
            this.e = s;
        }
    }

    @Override // defpackage.feaw
    public final /* synthetic */ void k(String str) {
        this.i = str;
    }

    public feqk(SocketAddress socketAddress, String str, feqe feqeVar) {
        ferd ferdVar = s;
        this.d = ferdVar;
        this.e = ferdVar;
        this.w = new ArrayList();
        this.f = fecf.b();
        this.g = new ArrayList();
        this.j = "pick_first";
        this.k = t;
        this.l = u;
        this.m = a;
        this.n = true;
        this.o = fdzq.b;
        new ArrayList();
        this.h = l(socketAddress);
        this.x = feqeVar;
        fecf fecfVar = new fecf();
        fecfVar.e(new feqg(socketAddress, str));
        this.f = fecfVar;
        this.q = new feqi();
        fdzt.b();
    }
}
