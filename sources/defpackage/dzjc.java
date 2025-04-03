package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dzjc {
    public abstract void a(String str);

    public abstract void b(String str);

    public abstract void c(Set set);

    public abstract void d(String str);

    public final void e(dzpg dzpgVar) {
        d(dzpgVar.e());
        dzpf dzpfVar = dzpf.UNKNOWN;
        int ordinal = dzpgVar.b().ordinal();
        if (ordinal == 1) {
            c(new enpx(dzpgVar.d()));
            return;
        }
        if (ordinal == 2) {
            b(dzpgVar.d());
            c(enpd.a);
        } else if (ordinal == 4) {
            a(dzpgVar.d());
            c(enpd.a);
        } else {
            dyhr.c("AccountUsers", "Absent contact type");
            b(dzpgVar.d());
            c(enpd.a);
        }
    }
}
