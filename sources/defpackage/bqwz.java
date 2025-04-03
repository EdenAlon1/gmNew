package defpackage;

import android.net.Uri;
import j$.time.Instant;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bqwz extends dtrr {
    public long a;
    public long b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public Uri h;
    public Uri i;
    public String j;
    public String k;
    public Instant l;
    public String m;
    public String n;
    public long o;
    public long p;
    public String q;
    public String r;
    public String s;

    public bqwz() {
        super(bqzv.h());
        this.l = Instant.EPOCH;
    }

    public final bqwx a() {
        try {
            String str = null;
            if (ersy.a("bugle.enable_contact_deduplication", "bugle")) {
                String str2 = this.e;
                String str3 = this.d;
                String valueOf = String.valueOf(this.p);
                String str4 = this.q;
                if (str2 != null && str2.length() != 0 && str3 != null && str3.length() != 0) {
                    String str5 = str3 + "_" + str2 + "_" + valueOf + "_" + str4;
                    int i = eodh.a;
                    str = ((eocr) eocx.a).b(str5.toString().getBytes(Charset.defaultCharset())).toString();
                }
                d(str);
            } else {
                d(null);
            }
            bqwy bqwyVar = new bqwy();
            bqwyVar.aC(aB());
            bqwyVar.a = this.a;
            bqwyVar.b = this.b;
            bqwyVar.c = this.c;
            bqwyVar.d = this.d;
            bqwyVar.e = this.e;
            bqwyVar.f = this.f;
            bqwyVar.g = this.g;
            bqwyVar.h = this.h;
            bqwyVar.i = this.i;
            bqwyVar.j = this.j;
            bqwyVar.k = this.k;
            bqwyVar.l = this.l;
            bqwyVar.m = this.m;
            bqwyVar.n = this.n;
            bqwyVar.o = this.o;
            bqwyVar.p = this.p;
            bqwyVar.q = this.q;
            bqwyVar.r = this.r;
            bqwyVar.s = this.s;
            bqwyVar.cK = aC();
            return bqwyVar;
        } catch (Throwable th) {
            throw new dtqp(th);
        }
    }

    public final void b(String str) {
        aE(10);
        this.k = str;
    }

    public final void c(String str) {
        aE(9);
        this.j = str;
    }

    public final void d(String str) {
        if (this.aB < 60690) {
            return;
        }
        aE(18);
        this.s = str;
    }

    public final void e(long j) {
        aE(1);
        this.b = j;
    }

    public final void f(long j) {
        int i = this.aB;
        if (i < 59080) {
            dtub.w("contact_type", i);
        }
        aE(15);
        this.p = j;
    }

    public final void g(long j) {
        aE(0);
        this.a = j;
    }

    public final void h(String str) {
        int i = this.aB;
        if (i < 59120) {
            dtub.w("display_destination", i);
        }
        aE(17);
        this.r = str;
    }

    public final void i(String str) {
        aE(4);
        this.e = str;
    }

    public final void j(String str) {
        aE(6);
        this.g = str;
    }

    public final void k(String str) {
        aE(5);
        this.f = str;
    }

    public final void l(Instant instant) {
        aE(11);
        this.l = instant;
    }

    public final void m(String str) {
        aE(2);
        this.c = str;
    }

    public final void n(String str) {
        aE(3);
        this.d = str;
    }

    public final void o(long j) {
        int i = this.aB;
        if (i < 59070) {
            dtub.w("phonebook_bucket", i);
        }
        aE(14);
        this.o = j;
    }

    public final void p(String str) {
        int i = this.aB;
        if (i < 59070) {
            dtub.w("phonebook_label", i);
        }
        aE(13);
        this.n = str;
    }

    public final void q(Uri uri) {
        aE(7);
        this.h = uri;
    }

    public final void r(String str) {
        int i = this.aB;
        if (i < 59070) {
            dtub.w("sort_key", i);
        }
        aE(12);
        this.m = str;
    }

    public final void s(Uri uri) {
        aE(8);
        this.i = uri;
    }

    public final void t(String str) {
        int i = this.aB;
        if (i < 60150) {
            dtub.w("type_label", i);
        }
        aE(16);
        this.q = str;
    }
}
