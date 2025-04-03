package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbti extends lml {
    public boolean a = true;
    public boolean b = false;
    private boolean d = false;
    public final llg c = new llg(false);

    private final void e() {
        boolean z = false;
        if (this.b && this.a) {
            z = true;
        }
        if (this.d != z) {
            this.d = z;
            this.c.j(Boolean.valueOf(z));
        }
    }

    public final void a(boolean z) {
        this.a = z;
        e();
    }

    public final void b(boolean z) {
        this.b = z;
        e();
    }

    public final void c() {
        this.b = !this.b;
        e();
    }
}
