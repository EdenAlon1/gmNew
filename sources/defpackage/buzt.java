package defpackage;

import j$.time.Instant;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class buzt extends dtrr {
    public bdhk a;
    public Instant b;
    public float c;

    public buzt() {
        super(bvar.c());
        this.a = bdhk.a;
        this.b = Instant.EPOCH;
    }

    public final buzp a(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        buzp buzpVar = (buzp) obj;
        buzpVar.aC(aB());
        buzpVar.a = this.a;
        buzpVar.b = this.b;
        buzpVar.c = this.c;
        buzpVar.cK = aC();
        return buzpVar;
    }

    public final void b(Instant instant) {
        aE(1);
        this.b = instant;
    }

    public final void c(bdhk bdhkVar) {
        aE(0);
        this.a = bdhkVar;
    }

    public final void d(float f) {
        aE(2);
        this.c = f;
    }
}
