package defpackage;

import j$.util.Optional;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class cezg extends dtrr {
    public long a;
    public String b;
    public byte[] c;
    public int d;
    public long e;
    public String f;
    public String g;
    public boolean h;
    public Optional i;
    public Date j;
    public String k;

    public cezg() {
        super(cfbf.e());
        this.i = bdhj.a;
        this.j = bdgs.a;
    }

    public final ceze a() {
        cezf cezfVar = new cezf();
        cezfVar.aC(aB());
        String str = this.f;
        if (str == null) {
            throw new IllegalStateException("field queue cannot be null");
        }
        cezfVar.a = this.a;
        cezfVar.b = this.b;
        cezfVar.c = this.c;
        cezfVar.d = this.d;
        cezfVar.e = this.e;
        cezfVar.f = str;
        cezfVar.g = this.g;
        cezfVar.h = this.h;
        cezfVar.i = this.i;
        cezfVar.j = this.j;
        cezfVar.k = this.k;
        cezfVar.cK = aC();
        return cezfVar;
    }

    public final void b(String str) {
        int i = this.aB;
        if (i < 48020) {
            dtub.w("cancellation_tag", i);
        }
        aE(10);
        this.k = str;
    }

    public final void c(String str) {
        int i = this.aB;
        if (i < 42050) {
            dtub.w("deduplication_tag", i);
        }
        aE(6);
        this.g = str;
    }

    public final void d(Date date) {
        int i = this.aB;
        if (i < 46070) {
            dtub.w("minimum_start_time", i);
        }
        aE(9);
        this.j = date;
    }

    public final void e(String str) {
        int i = this.aB;
        if (i < 41030) {
            dtub.w("queue", i);
        }
        aE(5);
        this.f = str;
    }

    public final void f(byte[] bArr) {
        aE(2);
        this.c = bArr;
    }

    public final void g(long j) {
        aE(4);
        this.e = j;
    }

    public final void h(String str) {
        aE(1);
        this.b = str;
    }
}
