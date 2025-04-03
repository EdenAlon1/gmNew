package defpackage;

import j$.util.Optional;
import java.util.Date;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class cfeb extends dtrr {
    public String a;
    public Optional b;
    public Date c;
    public Date d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;

    public cfeb() {
        super(cfft.d());
        this.b = bdhj.a;
        this.c = bdgs.a;
        this.d = bdgs.a;
    }

    public final cfdx a(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        cfdx cfdxVar = (cfdx) obj;
        cfdxVar.aC(aB());
        cfdxVar.a = this.a;
        cfdxVar.b = this.b;
        cfdxVar.c = this.c;
        cfdxVar.d = this.d;
        cfdxVar.e = this.e;
        cfdxVar.f = this.f;
        cfdxVar.g = this.g;
        cfdxVar.h = this.h;
        cfdxVar.i = this.i;
        cfdxVar.cK = aC();
        return cfdxVar;
    }

    public final void b(Date date) {
        aE(3);
        this.d = date;
    }

    public final void c(String str) {
        aE(0);
        this.a = str;
    }

    public final void d(boolean z) {
        aE(7);
        this.h = z;
    }

    public final void e(boolean z) {
        aE(5);
        this.f = z;
    }

    public final void f(boolean z) {
        aE(6);
        this.g = z;
    }

    public final void g(int i) {
        aE(4);
        this.e = i;
    }

    public final void h(boolean z) {
        aE(8);
        this.i = z;
    }

    public final void i(Date date) {
        aE(2);
        this.c = date;
    }

    public final void j(Optional optional) {
        aE(1);
        this.b = optional;
    }
}
