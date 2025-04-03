package defpackage;

import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhgu {
    private fhgk a;
    private String b;
    private fhgf c;
    private fhgz d;
    private Map e;

    public fhgu() {
        this.e = new LinkedHashMap();
        this.b = "GET";
        this.c = new fhgf();
    }

    public final fhgv a() {
        Map unmodifiableMap;
        fhgk fhgkVar = this.a;
        if (fhgkVar == null) {
            throw new IllegalStateException("url == null");
        }
        String str = this.b;
        fhgh b = this.c.b();
        fhgz fhgzVar = this.d;
        Map map = this.e;
        byte[] bArr = fhhl.a;
        map.getClass();
        if (map.isEmpty()) {
            unmodifiableMap = ffem.a;
        } else {
            unmodifiableMap = DesugarCollections.unmodifiableMap(new LinkedHashMap(map));
            unmodifiableMap.getClass();
        }
        return new fhgv(fhgkVar, str, b, fhgzVar, unmodifiableMap);
    }

    public final void b(String str, String str2) {
        str2.getClass();
        this.c.d(str, str2);
    }

    public final void c(fhgh fhghVar) {
        this.c = fhghVar.e();
    }

    public final void d(String str, fhgz fhgzVar) {
        str.getClass();
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (fhgzVar == null) {
            if (ffkj.e(str, "POST") || ffkj.e(str, "PUT") || ffkj.e(str, "PATCH") || ffkj.e(str, "PROPPATCH") || ffkj.e(str, "REPORT")) {
                throw new IllegalArgumentException(a.a(str, "method ", " must have a request body."));
            }
        } else if (!fhit.a(str)) {
            throw new IllegalArgumentException(a.a(str, "method ", " must not have a request body."));
        }
        this.b = str;
        this.d = fhgzVar;
    }

    public final void e(String str) {
        this.c.f(str);
    }

    public final void f(Class cls, Object obj) {
        cls.getClass();
        if (obj == null) {
            this.e.remove(cls);
            return;
        }
        if (this.e.isEmpty()) {
            this.e = new LinkedHashMap();
        }
        Map map = this.e;
        Object cast = cls.cast(obj);
        cast.getClass();
        map.put(cls, cast);
    }

    public final void g(fhgk fhgkVar) {
        fhgkVar.getClass();
        this.a = fhgkVar;
    }

    public fhgu(fhgv fhgvVar) {
        Map m;
        this.e = new LinkedHashMap();
        this.a = fhgvVar.a;
        this.b = fhgvVar.b;
        this.d = fhgvVar.d;
        if (fhgvVar.e.isEmpty()) {
            m = new LinkedHashMap();
        } else {
            m = ffew.m(fhgvVar.e);
        }
        this.e = m;
        this.c = fhgvVar.c.e();
    }
}
