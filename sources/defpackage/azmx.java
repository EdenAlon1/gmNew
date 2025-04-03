package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class azmx extends dtrr {
    public azsu a;
    public azsu b;
    public String c;
    public boolean d;
    public azon e;
    public String f;
    public String g;

    public azmx() {
        super(azoi.e());
        this.a = null;
        this.b = null;
        this.d = false;
    }

    public final azmt a() {
        return b(new Supplier() { // from class: azmw
            @Override // java.util.function.Supplier
            public final Object get() {
                return new azmu();
            }
        });
    }

    public final azmt b(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        azmt azmtVar = (azmt) obj;
        azmtVar.aC(aB());
        azmtVar.a = this.a;
        azmtVar.b = this.b;
        azmtVar.c = this.c;
        azmtVar.d = this.d;
        azmtVar.e = this.e;
        azmtVar.f = this.f;
        azmtVar.g = this.g;
        azmtVar.cK = aC();
        return azmtVar;
    }

    public final void c(String str) {
        aE(5);
        this.f = str;
    }

    public final void d(azon azonVar) {
        if (this.aB < 59980) {
            return;
        }
        aE(4);
        this.e = azonVar;
    }

    public final void e(String str) {
        int i = this.aB;
        if (i < 60120) {
            dtub.w("display_name", i);
        }
        aE(6);
        this.g = str;
    }

    public final void f(String str) {
        int i = this.aB;
        if (i < 59990) {
            dtub.w("provisioning_id", i);
        }
        aE(2);
        this.c = str;
    }

    public final void g(azsu azsuVar) {
        aE(0);
        this.a = azsuVar;
    }
}
