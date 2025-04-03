package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eemf extends eely {
    @Override // defpackage.eemm
    public final eeku b() {
        d(2087);
        eekl eeklVar = new eekl();
        while (true) {
            eekk eekkVar = new eekk();
            if (this.a.o(0) == '*') {
                this.a.a(42);
                eekkVar.b = true;
            } else {
                super.b(eekkVar);
            }
            eeklVar.g(eekkVar);
            this.a.h();
            if (this.a.o(0) != ',') {
                break;
            }
            this.a.a(44);
            this.a.h();
        }
        if (this.a.o(0) == '\n') {
            return eeklVar;
        }
        throw f("unexpected char");
    }
}
