package defpackage;

import j$.util.Objects;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhey {
    public final fhfw a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final fhfh e;
    public final fhfa f;
    public final Proxy g;
    public final ProxySelector h;
    public final fhgk i;
    public final List j;
    public final List k;

    public fhey(String str, int i, fhfw fhfwVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, fhfh fhfhVar, fhfa fhfaVar, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.a = fhfwVar;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = fhfhVar;
        this.f = fhfaVar;
        this.g = proxy;
        this.h = proxySelector;
        fhgi fhgiVar = new fhgi();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (ffpc.j(str2, "http", true)) {
            fhgiVar.a = "http";
        } else {
            if (!ffpc.j(str2, "https", true)) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            fhgiVar.a = "https";
        }
        char[] cArr = fhgk.a;
        String a = fhhi.a(fhgj.c(str, 0, 0, false, 7));
        if (a == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        fhgiVar.d = a;
        if (i <= 0) {
            throw new IllegalArgumentException(a.h(i, "unexpected port: "));
        }
        fhgiVar.e = i;
        this.i = fhgiVar.a();
        this.j = fhhl.o(list);
        this.k = fhhl.o(list2);
    }

    public final boolean a(fhey fheyVar) {
        fheyVar.getClass();
        if (ffkj.e(this.a, fheyVar.a) && ffkj.e(this.f, fheyVar.f) && ffkj.e(this.j, fheyVar.j) && ffkj.e(this.k, fheyVar.k) && ffkj.e(this.h, fheyVar.h) && ffkj.e(this.g, fheyVar.g) && ffkj.e(this.c, fheyVar.c) && ffkj.e(this.d, fheyVar.d) && ffkj.e(this.e, fheyVar.e)) {
            return this.i.d == fheyVar.i.d;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fhey)) {
            return false;
        }
        fhey fheyVar = (fhey) obj;
        return ffkj.e(this.i, fheyVar.i) && a(fheyVar);
    }

    public final int hashCode() {
        return ((((((((((((((((((this.i.hashCode() + 527) * 31) + this.a.hashCode()) * 31) + this.f.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.h.hashCode()) * 31) + Objects.hashCode(this.g)) * 31) + Objects.hashCode(this.c)) * 31) + Objects.hashCode(this.d)) * 31) + Objects.hashCode(this.e);
    }

    public final String toString() {
        String obj;
        String str;
        Proxy proxy = this.g;
        if (proxy != null) {
            java.util.Objects.toString(proxy);
            obj = proxy.toString();
            str = "proxy=";
        } else {
            ProxySelector proxySelector = this.h;
            java.util.Objects.toString(proxySelector);
            obj = proxySelector.toString();
            str = "proxySelector=";
        }
        String concat = str.concat(obj);
        fhgk fhgkVar = this.i;
        return "Address{" + fhgkVar.c + ":" + fhgkVar.d + ", " + concat + "}";
    }
}
