package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eegc {
    public static final dktn a = new dktn("MsrpMessage");
    public eyee b;
    public final edzh c;
    public final List d;
    public long e;
    public long f;
    public eefm g;
    public String h;
    public String i;
    public String j;
    public boolean k;
    public eefl l;
    public boolean m;
    public eegg n;
    public String o;
    public int p;
    public long q;
    public int r;
    public int s;

    public eegc() {
        this.b = eyee.b;
        this.d = new ArrayList();
        this.e = 0L;
        this.k = false;
        this.m = false;
        this.n = null;
        this.r = 2;
        this.s = 1;
        this.l = new eefl();
        this.g = new eefm();
        this.c = new edzc(eyee.b, 0);
    }

    private static void h(String str) {
        if (!"yes".equals(str) && !"no".equals(str)) {
            throw new IllegalArgumentException("Undefined report required value: ".concat(str));
        }
    }

    public final String a() {
        return this.g.a("From-Path");
    }

    public final String b() {
        return this.g.a("Message-ID");
    }

    final String c() {
        return (String) enjk.j(this.d);
    }

    public final String d() {
        return this.g.a("To-Path");
    }

    public final void e(String str) {
        h(str);
        this.j = str;
    }

    public final void f(String str) {
        this.g.b("Message-ID", str);
    }

    public final void g() {
        h("no");
        this.i = "no";
    }

    public final String toString() {
        String obj;
        boolean booleanValue = ((Boolean) dinr.g.a()).booleanValue();
        String b = b();
        String str = this.h;
        long j = this.e;
        String d = booleanValue ? d() : "(redacted)";
        String a2 = booleanValue ? a() : "(redacted)";
        boolean z = this.k;
        boolean z2 = this.m;
        String str2 = this.i;
        String str3 = this.j;
        if (((Boolean) dinr.g.a()).booleanValue() || (obj = this.o) == null) {
            obj = this.c.toString();
            dkty.p(a, "Message content is not displayed as the inputStream can only be read once.", new Object[0]);
        }
        return "Message ID: " + b + "\r\nContent array type: " + str + "\r\nContent array length: " + j + "\r\nTo: " + d + "\r\nFrom: " + a2 + "\r\nSilent: " + z + "\r\nCanceled: " + z2 + "\r\nSuccess report required: " + str2 + "\r\nFailure report required: " + str3 + "\r\nContent array value: \r\n" + obj;
    }

    public eegc(edzh edzhVar, String str) {
        this.b = eyee.b;
        this.d = new ArrayList();
        this.e = 0L;
        this.k = false;
        this.m = false;
        this.n = null;
        this.r = 2;
        this.s = 1;
        this.c = edzhVar;
        this.h = str;
        this.e = edzhVar.j();
        this.g = new eefm();
    }

    public eegc(Map map) {
        this.b = eyee.b;
        this.d = new ArrayList();
        this.e = 0L;
        this.k = false;
        this.m = false;
        this.n = null;
        this.r = 2;
        this.l = new eefl();
        this.s = 2;
        this.g = new eefm();
        String str = (String) map.get("Message-ID");
        if (str != null) {
            this.g.b("Message-ID", str);
        }
        String str2 = (String) map.get("From-Path");
        if (str2 != null) {
            this.g.b("From-Path", str2);
        }
        String str3 = (String) map.get("To-Path");
        if (str3 != null) {
            this.g.b("To-Path", str3);
        }
        this.i = (String) map.get("Success-Report");
        this.j = (String) map.get("Failure-Report");
        this.h = (String) map.get(fhpi.a);
        String str4 = (String) map.get("Byte-Range");
        if (str4 != null) {
            List i = emye.b('/').i(str4);
            if (((String) i.get(1)).equals("*")) {
                this.e = Long.MIN_VALUE;
            } else {
                this.e = Long.parseLong((String) i.get(1));
            }
        }
        this.c = new edzc(eyee.b, 0);
    }

    public eegc(byte[] bArr) {
        this.b = eyee.b;
        this.d = new ArrayList();
        this.e = 0L;
        this.k = false;
        this.m = false;
        this.n = null;
        this.r = 2;
        this.s = 1;
        this.b = eyee.x(bArr);
        this.c = new edzc(eyee.b, 0);
        this.h = "message/cpim";
        this.e = bArr.length;
        this.g = new eefm();
    }
}
