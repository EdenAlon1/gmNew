package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class btcu extends dtrr {
    public long a;
    public long b;
    public aliq c;
    public String d;

    public btcu() {
        super(btdw.b());
        this.b = 0L;
        this.c = aliq.b(0);
    }

    public final btcq a(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        btcq btcqVar = (btcq) obj;
        btcqVar.aC(aB());
        btcqVar.a = this.a;
        btcqVar.b = this.b;
        btcqVar.c = this.c;
        btcqVar.d = this.d;
        btcqVar.cK = aC();
        return btcqVar;
    }

    public final void b(String str) {
        aE(3);
        this.d = str;
    }

    public final void c(aliq aliqVar) {
        aE(2);
        this.c = aliqVar;
    }

    public final void d(long j) {
        aE(1);
        this.b = j;
    }
}
