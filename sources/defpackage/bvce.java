package defpackage;

import j$.time.Instant;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bvce extends dtrr {
    public Instant a;
    public emrk b;

    public bvce() {
        super(bvcy.a().P());
        this.a = Instant.EPOCH;
    }

    public final bvca a(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        bvca bvcaVar = (bvca) obj;
        bvcaVar.aC(aB());
        emrk emrkVar = this.b;
        if (emrkVar == null) {
            throw new IllegalStateException("field features cannot be null");
        }
        bvcaVar.a = this.a;
        bvcaVar.b = emrkVar;
        bvcaVar.cK = aC();
        return bvcaVar;
    }

    public final void b(Instant instant) {
        aE(0);
        this.a = instant;
    }

    public final void c(emrk emrkVar) {
        aE(1);
        this.b = emrkVar;
    }
}
