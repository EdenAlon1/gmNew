package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eemu extends eely {
    @Override // defpackage.eemm
    public final eeku b() {
        eele eeleVar = new eele();
        this.a.a(2092);
        this.a.h();
        this.a.a(58);
        this.a.h();
        while (true) {
            eeld eeldVar = new eeld();
            super.b(eeldVar);
            eeleVar.g(eeldVar);
            this.a.h();
            if (this.a.o(0) != ',') {
                break;
            }
            this.a.a(44);
            this.a.h();
        }
        if (this.a.o(0) == '\n') {
            return eeleVar;
        }
        throw f("unexpected char");
    }
}
