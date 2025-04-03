package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class aztt extends dtrr {
    public int a;
    public String b;
    public String c;
    public azsu d;
    public azsu e;

    public aztt() {
        super(azuy.g());
        this.d = null;
        this.e = null;
    }

    public final aztp a() {
        return b(new Supplier() { // from class: aztr
            @Override // java.util.function.Supplier
            public final Object get() {
                return new aztq();
            }
        });
    }

    public final aztp b(Supplier supplier) {
        Object obj;
        try {
            azsu azsuVar = this.d;
            if (azsuVar != null) {
                d(azsuVar);
            }
            obj = supplier.get();
            aztp aztpVar = (aztp) obj;
            aztpVar.aC(aB());
            aztpVar.a = this.a;
            aztpVar.b = this.b;
            aztpVar.c = this.c;
            aztpVar.d = this.d;
            aztpVar.e = this.e;
            aztpVar.cK = aC();
            return aztpVar;
        } catch (Throwable th) {
            throw new dtqp(th);
        }
    }

    public final void c(azsu azsuVar) {
        int i = this.aB;
        if (i < 59450) {
            dtub.w("my_identity_token", i);
        }
        aE(3);
        this.d = azsuVar;
    }

    public final void d(azsu azsuVar) {
        if (this.aB < 60160) {
            return;
        }
        aE(4);
        this.e = azsuVar;
    }

    public final void e(String str) {
        aE(1);
        this.b = str;
    }

    public final void f(int i) {
        aE(0);
        this.a = i;
    }

    public final void g(String str) {
        aE(2);
        this.c = str;
    }
}
