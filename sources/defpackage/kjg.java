package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kjg {
    public final kiv b;
    public final ArrayList a = new ArrayList();
    private final kje c = new kje();

    public kjg(kiv kivVar) {
        this.b = kivVar;
    }

    public final void a(kiv kivVar) {
        this.a.clear();
        int size = kivVar.aL.size();
        for (int i = 0; i < size; i++) {
            kiu kiuVar = (kiu) kivVar.aL.get(i);
            if (kiuVar.X() == 3 || kiuVar.Y() == 3) {
                this.a.add(kiuVar);
            }
        }
        kivVar.c();
    }

    public final boolean b(kjf kjfVar, kiu kiuVar, int i) {
        this.c.i = kiuVar.X();
        this.c.j = kiuVar.Y();
        this.c.a = kiuVar.j();
        kje kjeVar = this.c;
        kjeVar.b = kiuVar.h();
        kjeVar.g = false;
        kjeVar.h = i;
        int i2 = kjeVar.i;
        int i3 = kjeVar.j;
        boolean z = i2 == 3 && kiuVar.ah > 0.0f;
        boolean z2 = i3 == 3 && kiuVar.ah > 0.0f;
        if (z && kiuVar.E[0] == 4) {
            kjeVar.i = 1;
        }
        if (z2 && kiuVar.E[1] == 4) {
            kjeVar.j = 1;
        }
        kjfVar.b(kiuVar, kjeVar);
        kiuVar.N(this.c.c);
        kiuVar.C(this.c.d);
        kje kjeVar2 = this.c;
        kiuVar.P = kjeVar2.f;
        kiuVar.y(kjeVar2.e);
        kje kjeVar3 = this.c;
        kjeVar3.h = 0;
        return kjeVar3.g;
    }

    public final void c(kiv kivVar, int i, int i2, int i3) {
        int i4 = kivVar.am;
        int i5 = kivVar.an;
        kivVar.K(0);
        kivVar.J(0);
        kivVar.N(i2);
        kivVar.C(i3);
        kivVar.K(i4);
        kivVar.J(i5);
        kiv kivVar2 = this.b;
        kivVar2.c = i;
        kivVar2.ae();
    }
}
