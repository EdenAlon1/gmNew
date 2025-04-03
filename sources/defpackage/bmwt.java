package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bmwt extends dtrr {
    public MessageIdType a;
    public MessageIdType b;
    public long c;
    public String d;
    public int e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String[] j;
    public String[] k;
    public Uri[] l;
    public String[] m;
    public String[] n;
    public long[] o;
    public long[] p;
    public String q;
    public long r;
    public String s;
    public String t;
    public boolean u;

    public bmwt() {
        super(bnlv.d());
        MessageIdType messageIdType = bdhb.a;
        this.a = messageIdType;
        this.b = messageIdType;
        this.c = 0L;
        this.e = -2;
        this.r = 0L;
        this.u = false;
    }

    public final bmwr a() {
        bmws bmwsVar = new bmws();
        bmwsVar.aC(aB());
        bmwsVar.a = this.a;
        bmwsVar.b = this.b;
        bmwsVar.c = this.c;
        bmwsVar.e = this.d;
        bmwsVar.f = this.e;
        bmwsVar.g = this.f;
        bmwsVar.h = this.g;
        bmwsVar.i = this.h;
        bmwsVar.j = this.i;
        bmwsVar.l = this.j;
        bmwsVar.m = this.k;
        bmwsVar.n = this.l;
        bmwsVar.o = this.m;
        bmwsVar.p = this.n;
        bmwsVar.q = this.o;
        bmwsVar.r = this.p;
        bmwsVar.t = this.q;
        bmwsVar.u = this.r;
        bmwsVar.v = this.s;
        bmwsVar.w = this.t;
        bmwsVar.x = this.u;
        bmwsVar.g();
        bmwsVar.cK = aC();
        return bmwsVar;
    }

    public final void b(String[] strArr) {
        aE(12);
        this.m = strArr;
    }

    public final void c(String str) {
        aE(6);
        if (!this.aC) {
            str = cuxd.a(str);
        }
        this.g = str;
    }

    public final void d(long[] jArr) {
        int i = this.aB;
        if (i < 26040) {
            dtub.w("duration", i);
        }
        aE(14);
        this.o = jArr;
    }

    public final void e(long j) {
        aE(17);
        this.r = j;
    }

    public final void f(String[] strArr) {
        int i = this.aB;
        if (i < 26000) {
            dtub.w("file_name", i);
        }
        aE(13);
        this.n = strArr;
    }

    public final void g(String str) {
        aE(8);
        if (!this.aC) {
            str = cuxs.a(str);
        }
        this.i = str;
    }

    public final void h(String str) {
        aE(7);
        if (!this.aC) {
            str = cuxs.a(str);
        }
        this.h = str;
    }

    public final void i(MessageIdType messageIdType) {
        aE(1);
        this.b = messageIdType;
    }

    public final void j(String str) {
        aE(3);
        this.d = str;
    }

    public final void k(String[] strArr) {
        aE(9);
        this.j = strArr;
    }

    public final void l(String str) {
        aE(19);
        this.t = str;
    }

    public final void m(boolean z) {
        int i = this.aB;
        if (i < 22020) {
            dtub.w("link_preview_failed", i);
        }
        aE(20);
        this.u = z;
    }

    public final void n(String str) {
        aE(18);
        if (!this.aC) {
            str = cuxs.a(str);
        }
        this.s = str;
    }

    public final void o(MessageIdType messageIdType) {
        aE(0);
        this.a = messageIdType;
    }

    public final void p(String str) {
        aE(5);
        if (!this.aC) {
            str = cuxd.a(str);
        }
        this.f = str;
    }

    @Deprecated
    public final void q(long[] jArr) {
        int i = this.aB;
        if (i < 0) {
            dtub.w("parts.rowid", i);
        }
        aE(15);
        this.p = jArr;
    }

    public final void r(long j) {
        aE(2);
        this.c = j;
    }

    public final void s(int i) {
        aE(4);
        this.e = i;
    }

    public final void t(String[] strArr) {
        aE(10);
        this.k = strArr;
    }

    public final void u(String str) {
        aE(16);
        this.q = str;
    }

    public final void v(Uri[] uriArr) {
        aE(11);
        this.l = uriArr;
    }
}
