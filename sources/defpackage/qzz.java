package defpackage;

import java.net.URL;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qzz implements qtp {
    public final rab b;
    public final URL c;
    public final String d;
    public String e;
    public URL f;
    private volatile byte[] g;
    private int h;

    public qzz(String str, rab rabVar) {
        this.c = null;
        rkf.c(str);
        this.d = str;
        rkf.f(rabVar);
        this.b = rabVar;
    }

    @Override // defpackage.qtp
    public final void a(MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = b().getBytes(a);
        }
        messageDigest.update(this.g);
    }

    public final String b() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        URL url = this.c;
        rkf.f(url);
        return url.toString();
    }

    @Override // defpackage.qtp
    public final boolean equals(Object obj) {
        if (obj instanceof qzz) {
            qzz qzzVar = (qzz) obj;
            if (b().equals(qzzVar.b()) && this.b.equals(qzzVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.qtp
    public final int hashCode() {
        int i = this.h;
        if (i != 0) {
            return i;
        }
        int hashCode = b().hashCode();
        this.h = hashCode;
        int hashCode2 = (hashCode * 31) + this.b.hashCode();
        this.h = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        return b();
    }

    public qzz(URL url) {
        rab rabVar = rab.b;
        rkf.f(url);
        this.c = url;
        this.d = null;
        rkf.f(rabVar);
        this.b = rabVar;
    }
}
