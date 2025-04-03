package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dzsg {
    public abstract engw a();

    public abstract String b();

    /* JADX WARN: Multi-variable type inference failed */
    public final String c() {
        String b = b();
        engw a = a();
        int i = ((enou) a).c;
        int i2 = 0;
        while (i2 < i) {
            dzsf dzsfVar = (dzsf) a.get(i2);
            String b2 = dzsfVar.b();
            int a2 = dzsfVar.a();
            String b3 = dyhl.a().b(a2);
            if (a2 != 0) {
                b = emxe.c(b3) ? "" : b.replace(b2, b3);
            }
            i2++;
            if (emxe.c(b)) {
                return "";
            }
        }
        return b;
    }
}
