package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhfo {
    public static final fhfo a;
    public static final fhfo b;
    private static final fhfk[] g;
    private static final fhfk[] h;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final String[] f;

    static {
        fhfk fhfkVar = fhfk.r;
        fhfk fhfkVar2 = fhfk.s;
        fhfk fhfkVar3 = fhfk.k;
        fhfk fhfkVar4 = fhfk.m;
        fhfk fhfkVar5 = fhfk.l;
        fhfk fhfkVar6 = fhfk.n;
        fhfk fhfkVar7 = fhfk.p;
        fhfk fhfkVar8 = fhfk.o;
        fhfk[] fhfkVarArr = {fhfk.q, fhfkVar, fhfkVar2, fhfkVar3, fhfkVar4, fhfkVar5, fhfkVar6, fhfkVar7, fhfkVar8};
        g = fhfkVarArr;
        fhfk[] fhfkVarArr2 = {fhfk.q, fhfkVar, fhfkVar2, fhfkVar3, fhfkVar4, fhfkVar5, fhfkVar6, fhfkVar7, fhfkVar8, fhfk.i, fhfk.j, fhfk.g, fhfk.h, fhfk.e, fhfk.f, fhfk.d};
        h = fhfkVarArr2;
        fhfn fhfnVar = new fhfn(true);
        fhfnVar.e((fhfk[]) Arrays.copyOf(fhfkVarArr, 9));
        fhfnVar.f(fhhh.a, fhhh.b);
        fhfnVar.c();
        fhfnVar.a();
        fhfn fhfnVar2 = new fhfn(true);
        fhfnVar2.e((fhfk[]) Arrays.copyOf(fhfkVarArr2, 16));
        fhfnVar2.f(fhhh.a, fhhh.b);
        fhfnVar2.c();
        a = fhfnVar2.a();
        fhfn fhfnVar3 = new fhfn(true);
        fhfnVar3.e((fhfk[]) Arrays.copyOf(fhfkVarArr2, 16));
        fhfnVar3.f(fhhh.a, fhhh.b, fhhh.c, fhhh.d);
        fhfnVar3.c();
        fhfnVar3.a();
        b = new fhfn(false).a();
    }

    public fhfo(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = strArr2;
    }

    public final List a() {
        String[] strArr = this.e;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(fhfk.a.a(str));
        }
        return ffdx.ak(arrayList);
    }

    public final List b() {
        String[] strArr = this.f;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            fhhh fhhhVar = fhhh.a;
            arrayList.add(fhhg.a(str));
        }
        return ffdx.ak(arrayList);
    }

    public final boolean c(SSLSocket sSLSocket) {
        if (!this.c) {
            return false;
        }
        String[] strArr = this.f;
        if (strArr != null && !fhhl.u(strArr, sSLSocket.getEnabledProtocols(), ffgm.a)) {
            return false;
        }
        String[] strArr2 = this.e;
        return strArr2 == null || fhhl.u(strArr2, sSLSocket.getEnabledCipherSuites(), fhfk.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fhfo)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z = this.c;
        fhfo fhfoVar = (fhfo) obj;
        if (z != fhfoVar.c) {
            return false;
        }
        return !z || (Arrays.equals(this.e, fhfoVar.e) && Arrays.equals(this.f, fhfoVar.f) && this.d == fhfoVar.d);
    }

    public final int hashCode() {
        if (!this.c) {
            return 17;
        }
        String[] strArr = this.e;
        int hashCode = strArr != null ? Arrays.hashCode(strArr) : 0;
        String[] strArr2 = this.f;
        return ((((hashCode + 527) * 31) + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.d ? 1 : 0);
    }

    public final String toString() {
        if (!this.c) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(b(), "[all enabled]") + ", supportsTlsExtensions=" + this.d + ")";
    }
}
