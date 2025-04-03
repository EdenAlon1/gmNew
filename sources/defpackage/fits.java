package defpackage;

import java.io.IOException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fits {
    public final fiuq a;
    public final fiuo b;
    public final firb c;
    public final firk d;

    public fits(fiuq fiuqVar, fiuo fiuoVar) {
        this.a = fiuqVar;
        this.b = fiuoVar;
        this.c = null;
        this.d = null;
    }

    private final fiuq e() {
        fiuq fiuqVar = this.a;
        if (fiuqVar != null) {
            return fiuqVar;
        }
        throw new UnsupportedOperationException("Printing not supported");
    }

    public final String a(firt firtVar) {
        StringBuilder sb = new StringBuilder(e().b());
        try {
            Map map = firh.a;
            long millis = firtVar.getMillis();
            firb a = firtVar.a();
            if (a == null) {
                a = fist.N();
            }
            fiuq e = e();
            firb b = b(a);
            firk z = b.z();
            int a2 = z.a(millis);
            long j = a2;
            long j2 = millis + j;
            if ((millis ^ j2) >= 0 || (j ^ millis) < 0) {
                millis = j2;
            } else {
                z = firk.a;
                a2 = 0;
            }
            e.d(sb, millis, b.a(), a2, z, null);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    public final firb b(firb firbVar) {
        firb firbVar2 = this.c;
        firb c = firh.c(firbVar);
        if (firbVar2 == null) {
            firbVar2 = c;
        }
        firk firkVar = this.d;
        return firkVar != null ? firbVar2.b(firkVar) : firbVar2;
    }

    public final fits c() {
        firk firkVar = this.d;
        firk firkVar2 = firk.a;
        return firkVar == firkVar2 ? this : new fits(this.a, this.b, this.c, firkVar2);
    }

    public final fiup d() {
        return fiup.b(this.b);
    }

    public fits(fiuq fiuqVar, fiuo fiuoVar, firb firbVar, firk firkVar) {
        this.a = fiuqVar;
        this.b = fiuoVar;
        this.c = firbVar;
        this.d = firkVar;
    }
}
