package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bqiv extends dtrr {
    public String a;
    public String b;
    public bqkx c;
    public bqkw d;
    public epeg e;
    public int f;
    public String g;
    public ccce h;
    public int i;
    public int j;
    public String k;

    public bqiv() {
        super(bqkv.e());
        this.e = epeg.b(0);
        this.f = -1;
        this.g = "-1";
        this.j = -1;
        this.k = "-1";
    }

    public final bqir a() {
        return b(new Supplier() { // from class: bqiu
            @Override // java.util.function.Supplier
            public final Object get() {
                return new bqis();
            }
        });
    }

    public final bqir b(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        bqir bqirVar = (bqir) obj;
        bqirVar.aC(aB());
        bqirVar.a = this.a;
        bqirVar.b = this.b;
        bqirVar.c = this.c;
        bqirVar.d = this.d;
        bqirVar.e = this.e;
        bqirVar.f = this.f;
        bqirVar.g = this.g;
        bqirVar.h = this.h;
        bqirVar.i = this.i;
        bqirVar.j = this.j;
        bqirVar.k = this.k;
        bqirVar.cK = aC();
        return bqirVar;
    }

    public final void c(bqkw bqkwVar) {
        aE(3);
        this.d = bqkwVar;
    }

    public final void d(String str) {
        int i = this.aB;
        if (i < 57090) {
            dtub.w("backup_dependency_bugle_id", i);
        }
        aE(10);
        this.k = str;
    }

    public final void e(int i) {
        int i2 = this.aB;
        if (i2 < 57090) {
            dtub.w("backup_dependency_table_type", i2);
        }
        aE(9);
        this.j = i;
    }

    public final void f(int i) {
        int i2 = this.aB;
        if (i2 < 57090) {
            dtub.w("backup_flags", i2);
        }
        aE(8);
        this.i = i;
    }

    public final void g(String str) {
        int i = this.aB;
        if (i < 57090) {
            dtub.w("bugle_id", i);
        }
        aE(6);
        this.g = str;
    }

    public final void h(int i) {
        int i2 = this.aB;
        if (i2 < 57090) {
            dtub.w("bugle_table_type", i2);
        }
        aE(5);
        this.f = i;
    }

    public final void i(ccce ccceVar) {
        int i = this.aB;
        if (i < 57090) {
            dtub.w("cms_backup_parameters", i);
        }
        aE(7);
        this.h = ccceVar;
    }

    public final void j(bqkx bqkxVar) {
        aE(2);
        this.c = bqkxVar;
    }

    public final void k(String str) {
        aE(1);
        this.b = str;
    }

    public final void l(epeg epegVar) {
        aE(4);
        this.e = epegVar;
    }
}
