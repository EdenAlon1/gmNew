package defpackage;

import j$.time.Instant;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bwjr extends dtrr {
    public cjlk a;
    public cjkh b;
    public String c;
    public Instant d;
    public long e;
    public cjli f;
    public String g;
    public byte[] h;

    public bwjr() {
        super(bwlg.a().P());
        this.a = null;
        this.b = cjkh.a;
        this.d = Instant.EPOCH;
        this.e = 0L;
    }

    public final bwjn a(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        bwjn bwjnVar = (bwjn) obj;
        bwjnVar.aC(aB());
        bwjnVar.a = this.a;
        bwjnVar.b = this.b;
        bwjnVar.c = this.c;
        bwjnVar.d = this.d;
        bwjnVar.e = this.e;
        bwjnVar.f = this.f;
        bwjnVar.g = this.g;
        bwjnVar.h = this.h;
        bwjnVar.cK = aC();
        return bwjnVar;
    }

    public final void b(String str) {
        aE(6);
        this.g = str;
    }

    public final void c(cjli cjliVar) {
        aE(5);
        this.f = cjliVar;
    }

    public final void d(Instant instant) {
        aE(3);
        this.d = instant;
    }

    public final void e(byte[] bArr) {
        aE(7);
        this.h = bArr;
    }

    public final void f(cjkh cjkhVar) {
        aE(1);
        this.b = cjkhVar;
    }

    public final void g(String str) {
        aE(2);
        this.c = str;
    }

    public final void h(cjlk cjlkVar) {
        aE(0);
        this.a = cjlkVar;
    }
}
