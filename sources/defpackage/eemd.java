package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eemd extends eemm {
    public final void c(eeke eekeVar) {
        this.a.h();
        this.a.a(4095);
        eejb eejbVar = this.a;
        eejj eejjVar = eejbVar.e;
        eejbVar.h();
        eekeVar.a = eejjVar.a;
        while (this.a.o(0) != '\n') {
            eekeVar.j(a());
            this.a.h();
            if (this.a.o(0) == '\n' || this.a.o(0) == 0) {
                return;
            }
            this.a.a(44);
            this.a.h();
        }
    }
}
