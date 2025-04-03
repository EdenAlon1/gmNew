package defpackage;

import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhmk implements URLStreamHandlerFactory, Cloneable {
    static final Set a = new LinkedHashSet(Arrays.asList("OPTIONS", "GET", "HEAD", "POST", "PUT", "DELETE", "TRACE", "PATCH"));
    static final TimeZone b = DesugarTimeZone.getTimeZone("GMT");
    static final ThreadLocal c = new fhly();
    static final Comparator d = new Comparator() { // from class: fhlx
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            int i = fhmk.e;
            if (str == str2) {
                return 0;
            }
            if (str == null) {
                return -1;
            }
            if (str2 == null) {
                return 1;
            }
            return str.compareToIgnoreCase(str2);
        }
    };
    public static final /* synthetic */ int e = 0;
    private final fhgs f;

    public fhmk(fhgs fhgsVar) {
        this.f = fhgsVar;
    }

    static IOException a(Throwable th) {
        if (th instanceof IOException) {
            throw ((IOException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        throw new AssertionError();
    }

    static String b(fhhb fhhbVar) {
        fhgt fhgtVar = fhhbVar.b;
        fhgt fhgtVar2 = fhgt.a;
        StringBuilder sb = new StringBuilder();
        sb.append(fhgtVar == fhgtVar2 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(" ");
        sb.append(fhhbVar.d);
        sb.append(" ");
        sb.append(fhhbVar.c);
        return sb.toString();
    }

    static Map e(fhgh fhghVar, String str) {
        TreeMap treeMap = new TreeMap(d);
        int a2 = fhghVar.a();
        for (int i = 0; i < a2; i++) {
            String c2 = fhghVar.c(i);
            String d2 = fhghVar.d(i);
            ArrayList arrayList = new ArrayList();
            List list = (List) treeMap.get(c2);
            if (list != null) {
                arrayList.addAll(list);
            }
            arrayList.add(d2);
            treeMap.put(c2, DesugarCollections.unmodifiableList(arrayList));
        }
        if (str != null) {
            treeMap.put(null, DesugarCollections.unmodifiableList(Collections.singletonList(str)));
        }
        return DesugarCollections.unmodifiableMap(treeMap);
    }

    static boolean f(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    static String g() {
        try {
            String property = System.getProperty("http.agent");
            if (property != null) {
                return property;
            }
            return null;
        } catch (AccessControlException unused) {
            return null;
        }
    }

    public final HttpURLConnection c(URL url) {
        return d(url, this.f.l);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return new fhmk(this.f);
    }

    @Override // java.net.URLStreamHandlerFactory
    public final URLStreamHandler createURLStreamHandler(String str) {
        if (str.equals("http") || str.equals("https")) {
            return new fhlz(this, str);
        }
        return null;
    }

    final HttpURLConnection d(URL url, Proxy proxy) {
        String protocol = url.getProtocol();
        fhgr fhgrVar = new fhgr(this.f);
        if (!ffkj.e(proxy, fhgrVar.j)) {
            fhgrVar.x = null;
        }
        fhgrVar.j = proxy;
        fhgs fhgsVar = new fhgs(fhgrVar);
        if (protocol.equals("http")) {
            return new fhmd(url, fhgsVar);
        }
        if (protocol.equals("https")) {
            return new fhme(url, fhgsVar);
        }
        throw new IllegalArgumentException("Unexpected protocol: ".concat(String.valueOf(protocol)));
    }
}
