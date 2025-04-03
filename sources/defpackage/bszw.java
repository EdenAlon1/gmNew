package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import j$.time.Instant;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bszw extends dtrr {
    public bdhg a;
    public byte[] b;
    public byte[] c;
    public int d;
    public byte[] e;
    public byte[] f;
    public int g;
    public Instant h;
    public Uri i;
    public String j;
    public byte[] k;
    public byte[] l;
    public String m;
    public Instant n;
    public String o;
    public String p;
    public String q;
    public espe r;

    public bszw() {
        super(btck.e());
        this.a = bdhg.a;
        this.h = bdgw.b(0L);
        this.n = Instant.EPOCH;
    }

    public final bszs a(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        bszs bszsVar = (bszs) obj;
        bszsVar.aC(aB());
        bszsVar.a = this.a;
        bszsVar.b = this.b;
        bszsVar.c = this.c;
        bszsVar.d = this.d;
        bszsVar.e = this.e;
        bszsVar.f = this.f;
        bszsVar.g = this.g;
        bszsVar.h = this.h;
        bszsVar.i = this.i;
        bszsVar.j = this.j;
        bszsVar.k = this.k;
        bszsVar.l = this.l;
        bszsVar.m = this.m;
        bszsVar.n = this.n;
        bszsVar.o = this.o;
        bszsVar.p = this.p;
        bszsVar.q = this.q;
        bszsVar.r = this.r;
        bszsVar.cK = aC();
        return bszsVar;
    }

    @Deprecated
    public final void b() {
        bszs a = a(new Supplier() { // from class: bszu
            @Override // java.util.function.Supplier
            public final Object get() {
                return new bszt();
            }
        });
        final dtve b = btck.b();
        dtub.b(btck.b(), "etouffee_rcs_metadata", a, new Function() { // from class: bszp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dtve.this.R("etouffee_rcs_metadata", (ContentValues) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: bszq
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void c(byte[] bArr) {
        aE(5);
        this.f = bArr;
    }

    public final void d(byte[] bArr) {
        aE(4);
        this.e = bArr;
    }

    public final void e(int i) {
        aE(6);
        this.g = i;
    }

    public final void f(Uri uri) {
        int i = this.aB;
        if (i < 35060) {
            dtub.w("attachment_uri", i);
        }
        aE(8);
        this.i = uri;
    }

    public final void g(Instant instant) {
        aE(7);
        this.h = instant;
    }

    public final void h(byte[] bArr) {
        int i = this.aB;
        if (i < 37020) {
            dtub.w("custom_delivery_receipt_content", i);
        }
        aE(10);
        this.k = bArr;
    }

    public final void i(String str) {
        int i = this.aB;
        if (i < 37020) {
            dtub.w("custom_delivery_receipt_mime_type", i);
        }
        aE(9);
        this.j = str;
    }

    public final void j(String str) {
        int i = this.aB;
        if (i < 56020) {
            dtub.w("plaintext_attachment_content_type", i);
        }
        aE(15);
        this.p = str;
    }

    public final void k(String str) {
        int i = this.aB;
        if (i < 56020) {
            dtub.w("plaintext_attachment_name", i);
        }
        aE(14);
        this.o = str;
    }

    public final void l(String str) {
        int i = this.aB;
        if (i < 56020) {
            dtub.w("plaintext_thumbnail_content_type", i);
        }
        aE(16);
        this.q = str;
    }

    public final void m(byte[] bArr) {
        aE(2);
        this.c = bArr;
    }

    public final void n(byte[] bArr) {
        aE(1);
        this.b = bArr;
    }

    public final void o(int i) {
        aE(3);
        this.d = i;
    }

    public final void p(bdhg bdhgVar) {
        aE(0);
        this.a = bdhgVar;
    }
}
