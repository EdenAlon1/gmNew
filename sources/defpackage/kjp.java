package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kjp extends kjv {
    public kjp(kiu kiuVar) {
        super(kiuVar);
    }

    private final void g(kjk kjkVar) {
        this.i.j.add(kjkVar);
        kjkVar.k.add(this.i);
    }

    @Override // defpackage.kjv
    public final void b() {
        kiu kiuVar = this.d;
        if (kiuVar instanceof kiq) {
            kjk kjkVar = this.i;
            kjkVar.b = true;
            kiq kiqVar = (kiq) kiuVar;
            int i = kiqVar.a;
            boolean z = kiqVar.b;
            int i2 = 0;
            if (i == 0) {
                kjkVar.l = 4;
                while (i2 < kiqVar.aM) {
                    kiu kiuVar2 = kiqVar.aL[i2];
                    if (z || kiuVar2.ar != 8) {
                        kjk kjkVar2 = kiuVar2.o.i;
                        kjkVar2.j.add(this.i);
                        this.i.k.add(kjkVar2);
                    }
                    i2++;
                }
                g(this.d.o.i);
                g(this.d.o.j);
                return;
            }
            if (i == 1) {
                kjkVar.l = 5;
                while (i2 < kiqVar.aM) {
                    kiu kiuVar3 = kiqVar.aL[i2];
                    if (z || kiuVar3.ar != 8) {
                        kjk kjkVar3 = kiuVar3.o.j;
                        kjkVar3.j.add(this.i);
                        this.i.k.add(kjkVar3);
                    }
                    i2++;
                }
                g(this.d.o.i);
                g(this.d.o.j);
                return;
            }
            if (i == 2) {
                kjkVar.l = 6;
                while (i2 < kiqVar.aM) {
                    kiu kiuVar4 = kiqVar.aL[i2];
                    if (z || kiuVar4.ar != 8) {
                        kjk kjkVar4 = kiuVar4.p.i;
                        kjkVar4.j.add(this.i);
                        this.i.k.add(kjkVar4);
                    }
                    i2++;
                }
                g(this.d.p.i);
                g(this.d.p.j);
                return;
            }
            if (i != 3) {
                return;
            }
            kjkVar.l = 7;
            while (i2 < kiqVar.aM) {
                kiu kiuVar5 = kiqVar.aL[i2];
                if (z || kiuVar5.ar != 8) {
                    kjk kjkVar5 = kiuVar5.p.j;
                    kjkVar5.j.add(this.i);
                    this.i.k.add(kjkVar5);
                }
                i2++;
            }
            g(this.d.p.i);
            g(this.d.p.j);
        }
    }

    @Override // defpackage.kjv
    public final void c() {
        kiu kiuVar = this.d;
        if (kiuVar instanceof kiq) {
            int i = ((kiq) kiuVar).a;
            if (i == 0 || i == 1) {
                kiuVar.aj = this.i.f;
            } else {
                kiuVar.ak = this.i.f;
            }
        }
    }

    @Override // defpackage.kjv
    public final void d() {
        this.e = null;
        this.i.b();
    }

    @Override // defpackage.kjv
    public final boolean e() {
        return false;
    }

    @Override // defpackage.kjv, defpackage.kji
    public final void f() {
        kiq kiqVar = (kiq) this.d;
        int i = kiqVar.a;
        Iterator it = this.i.k.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((kjk) it.next()).f;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            this.i.c(i3 + kiqVar.c);
        } else {
            this.i.c(i2 + kiqVar.c);
        }
    }
}
