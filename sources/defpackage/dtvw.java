package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtvw {
    final String a;
    final engw b;
    final dtyq c;
    private final String d;
    private final int e;

    public dtvw(String str, String str2, engw engwVar, dtyq dtyqVar, int i) {
        this.a = str;
        this.d = str2;
        this.b = engwVar;
        this.c = dtyqVar;
        this.e = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int a() {
        dtve e = dtub.e(this.d);
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT ");
        sb.append(emxe.b(dtub.j(this.e)));
        sb.append(" INTO ");
        sb.append(this.a);
        sb.append(" (");
        engw engwVar = this.b;
        int i = ((enou) engwVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(dtub.o((String) engwVar.get(i2)));
            sb.append(",");
        }
        sb.setLength(sb.length() - 1);
        sb.append(") ");
        dtyq dtyqVar = this.c;
        sb.append(dtyqVar.G(new dtzu(dtyqVar.m, dtyqVar.e, true, null), true, null));
        String sb2 = sb.toString();
        dtwf c = dtwg.c(e, this.a, new dtvv(this));
        ekzz f = eleg.f("Insert#insert update");
        try {
            int c2 = e.c(e.j().compileStatement(sb2), new dtui(this.a, "-insert"));
            f.close();
            c.a(c2 > 0);
            return c2;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
