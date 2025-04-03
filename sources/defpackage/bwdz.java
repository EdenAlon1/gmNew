package defpackage;

import android.content.ContentValues;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bwdz extends dtrr {
    public bdhg a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public long g;
    public long h;
    public String i;
    public int j;
    public long k;
    public byze l;
    public fayv m;
    public boolean n;
    public String o;
    public String p;
    public boolean q;
    public boolean r;
    public boolean s;

    public bwdz() {
        super(bwgw.e());
        this.a = bdhg.a;
        this.q = false;
        this.r = false;
        this.s = false;
    }

    public final bwdu a(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        bwdu bwduVar = (bwdu) obj;
        bwduVar.aC(aB());
        bwduVar.a = this.a;
        bwduVar.b = this.b;
        bwduVar.c = this.c;
        bwduVar.d = this.d;
        bwduVar.e = this.e;
        bwduVar.f = this.f;
        bwduVar.g = this.g;
        bwduVar.h = this.h;
        bwduVar.i = this.i;
        bwduVar.j = this.j;
        bwduVar.k = this.k;
        bwduVar.l = this.l;
        bwduVar.m = this.m;
        bwduVar.n = this.n;
        bwduVar.o = this.o;
        bwduVar.p = this.p;
        bwduVar.q = this.q;
        bwduVar.r = this.r;
        bwduVar.s = this.s;
        bwduVar.cK = aC();
        return bwduVar;
    }

    public final void b() {
        bwdu a = a(new Supplier() { // from class: bwdy
            @Override // java.util.function.Supplier
            public final Object get() {
                return new bwdv();
            }
        });
        final dtve b = bwgw.b();
        dtub.b(bwgw.b(), "pending_incoming_message_rcs_table", a, new Function() { // from class: bwdr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dtve.this.S("pending_incoming_message_rcs_table", (ContentValues) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: bwds
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void c(String str) {
        int i = this.aB;
        if (i < 58820) {
            dtub.w("conference_uri", i);
        }
        aE(15);
        this.p = str;
    }

    public final void d(String str) {
        aE(4);
        this.e = str;
    }

    public final void e(String str) {
        int i = this.aB;
        if (i < 58820) {
            dtub.w("conversation_id", i);
        }
        aE(14);
        this.o = str;
    }

    public final void f(fayv fayvVar) {
        int i = this.aB;
        if (i < 44020) {
            dtub.w("custom_headers", i);
        }
        aE(12);
        this.m = fayvVar;
    }

    public final void g(boolean z) {
        int i = this.aB;
        if (i < 58870) {
            dtub.w("is_delivery_report_requested", i);
        }
        aE(16);
        this.q = z;
    }

    public final void h(boolean z) {
        int i = this.aB;
        if (i < 58870) {
            dtub.w("is_display_report_requested", i);
        }
        aE(17);
        this.r = z;
    }

    public final void i(boolean z) {
        int i = this.aB;
        if (i < 58820) {
            dtub.w("is_group", i);
        }
        aE(13);
        this.n = z;
    }

    public final void j(boolean z) {
        int i = this.aB;
        if (i < 60560) {
            dtub.w("is_negative_delivery_report_requested", i);
        }
        aE(18);
        this.s = z;
    }

    public final void k(byze byzeVar) {
        aE(11);
        this.l = byzeVar;
    }

    public final void l(String str) {
        aE(3);
        this.d = str;
    }

    public final void m(bdhg bdhgVar) {
        aE(0);
        this.a = bdhgVar;
    }

    public final void n(long j) {
        aE(7);
        this.h = j;
    }

    public final void o(String str) {
        aE(5);
        this.f = str;
    }

    public final void p(String str) {
        aE(1);
        this.b = str;
    }

    public final void q(String str) {
        int i = this.aB;
        if (i < 59410) {
            dtub.w("self_identity", i);
        }
        aE(2);
        this.c = str;
    }

    public final void r(long j) {
        aE(6);
        this.g = j;
    }

    public final void s(long j) {
        aE(10);
        this.k = j;
    }

    public final void t(String str) {
        aE(8);
        this.i = str;
    }

    public final void u(int i) {
        aE(9);
        this.j = i;
    }
}
