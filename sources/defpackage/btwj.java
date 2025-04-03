package defpackage;

import java.util.UUID;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class btwj extends dtrr {
    public long a;
    public UUID b;
    public byzb c;
    public String d;

    public btwj() {
        super(btxi.a().P());
        this.b = bdhh.b();
    }

    public final btwf a(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        btwf btwfVar = (btwf) obj;
        btwfVar.aC(aB());
        btwfVar.a = this.a;
        btwfVar.b = this.b;
        btwfVar.c = this.c;
        btwfVar.d = this.d;
        btwfVar.cK = aC();
        return btwfVar;
    }

    public final void b(String str) {
        aE(3);
        this.d = str;
    }

    public final void c(byzb byzbVar) {
        aE(2);
        this.c = byzbVar;
    }

    public final void d(UUID uuid) {
        aE(1);
        this.b = uuid;
    }
}
