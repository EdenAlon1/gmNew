package defpackage;

import j$.time.Instant;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bced extends dtrr {
    public Instant a;
    public int b;
    public String c;

    public bced() {
        super(bcfa.d());
        this.a = Instant.EPOCH;
    }

    public final bcdz a(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        bcdz bcdzVar = (bcdz) obj;
        bcdzVar.aC(aB());
        bcdzVar.a = this.a;
        bcdzVar.b = this.b;
        bcdzVar.c = this.c;
        bcdzVar.cK = aC();
        return bcdzVar;
    }

    public final void b(String str) {
        int i = this.aB;
        if (i < 0) {
            dtub.w("backup_id", i);
        }
        aE(2);
        this.c = str;
    }

    public final void c(Instant instant) {
        int i = this.aB;
        if (i < 0) {
            dtub.w("created_timestamp", i);
        }
        aE(0);
        this.a = instant;
    }

    public final void d(int i) {
        int i2 = this.aB;
        if (i2 < 0) {
            dtub.w("schema_version", i2);
        }
        aE(1);
        this.b = i;
    }
}
