package defpackage;

import j$.util.Objects;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dkjt {
    public dkjs a;
    public String b;
    public String c;
    public String d;
    public String e;
    public byte[] f;
    public edzh g;
    public String h;
    public fayv i;
    public long j;
    public String k;
    public int l;
    public String m;
    public String n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public final int t;

    public dkjt(dkjs dkjsVar) {
        this(dkjsVar, 1);
    }

    public final String a() {
        byte[] bArr = this.f;
        if (bArr == null) {
            return null;
        }
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public final String b() {
        String str = this.n;
        if (str != null) {
            return str;
        }
        String str2 = this.h;
        String str3 = this.k;
        edzh edzhVar = this.g;
        return "Type: " + str2 + "\r\nRCS message ID: " + str3 + "\r\nContent length: " + (edzhVar == null ? "0" : Long.valueOf(edzhVar.j())).toString();
    }

    public final String c() {
        return toString() + ": '" + dktx.MESSAGE_CONTENT.c(a()) + "'";
    }

    public final void d(String str, byte[] bArr) {
        this.f = bArr;
        e(str);
    }

    public final void e(String str) {
        this.h = str;
        if (str != null) {
            emuz.c(str).startsWith("message/cpim");
        }
        this.a = dkjs.a(str);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof dkjt)) {
            return false;
        }
        dkjt dkjtVar = (dkjt) obj;
        if (this.j == dkjtVar.j && this.a == dkjtVar.a && Objects.equals(null, null) && Objects.equals(this.h, dkjtVar.h) && Objects.equals(this.b, dkjtVar.b) && Objects.equals(this.e, dkjtVar.e) && Objects.equals(this.c, dkjtVar.c) && Arrays.equals(this.f, dkjtVar.f) && this.t == dkjtVar.t) {
            return Objects.equals(this.g, dkjtVar.g);
        }
        return false;
    }

    public final void f(String str, edzh edzhVar) {
        this.g = edzhVar;
        e(str);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, this.h, this.b, this.e, this.c, this.f, Integer.valueOf(this.t)});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String c = dktx.USER_ID.c(this.b);
        String str = this.e;
        String c2 = dktx.USER_ID.c(this.c);
        String str2 = this.k;
        String str3 = this.h;
        edzh edzhVar = this.g;
        Object valueOf2 = edzhVar == null ? "0" : Long.valueOf(edzhVar.j());
        int i = this.t;
        return "{ type: " + valueOf + ", messaging method: " + dkks.a(i) + ", receiver: " + c + ", remote instance: " + str + ", sender: " + c2 + ", id: " + str2 + ", contentType: " + str3 + ", length: " + valueOf2.toString() + " }";
    }

    public dkjt(dkjs dkjsVar, int i) {
        this.j = System.currentTimeMillis();
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = true;
        this.s = false;
        if (i == 2) {
            emxf.b(dkjsVar.equals(dkjs.CPIM_MESSAGE), "SLM allows only CPIM");
        }
        this.a = dkjsVar;
        this.t = i;
    }

    public dkjt(String str, edzi edziVar) {
        this.j = System.currentTimeMillis();
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = true;
        this.s = false;
        this.b = str;
        this.f = edziVar.s();
        this.h = "message/cpim";
        edziVar.e();
        this.a = dkjs.a("message/cpim");
        this.t = 1;
    }

    public dkjt(String str, byte[] bArr, String str2) {
        this.j = System.currentTimeMillis();
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = true;
        this.s = false;
        this.b = str;
        this.f = bArr;
        this.h = str2;
        this.a = dkjs.a(str2);
        this.t = 1;
    }
}
