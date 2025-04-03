package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eemw extends eely {
    @Override // defpackage.eemm
    public final eeku b() {
        eelh eelhVar = new eelh();
        this.a.a(2070);
        this.a.h();
        this.a.a(58);
        this.a.h();
        while (true) {
            eelg eelgVar = new eelg();
            super.b(eelgVar);
            eelhVar.g(eelgVar);
            this.a.h();
            if (this.a.o(0) != ',') {
                break;
            }
            this.a.a(44);
            this.a.h();
        }
        if (this.a.o(0) == '\n') {
            return eelhVar;
        }
        throw f("unexpected char");
    }
}
