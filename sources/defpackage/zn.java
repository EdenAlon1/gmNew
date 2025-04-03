package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zn {
    public final cpn a = new cpn();
    public final cno b = new cno();

    public final vq a(wr wrVar, int i) {
        zm zmVar;
        vq vqVar;
        int c = this.a.c(wrVar);
        if (c >= 0 && (zmVar = (zm) this.a.g(c)) != null) {
            int i2 = zmVar.b;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                zmVar.b = i3;
                if (i == 4) {
                    vqVar = zmVar.c;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    vqVar = zmVar.d;
                }
                if ((i3 & 12) == 0) {
                    this.a.e(c);
                    zm.b(zmVar);
                }
                return vqVar;
            }
        }
        return null;
    }

    final void b(wr wrVar) {
        zm zmVar = (zm) this.a.get(wrVar);
        if (zmVar == null) {
            cpn cpnVar = this.a;
            zm a = zm.a();
            cpnVar.put(wrVar, a);
            zmVar = a;
        }
        zmVar.b |= 1;
    }

    public final void c(long j, wr wrVar) {
        this.b.h(j, wrVar);
    }

    public final void d(wr wrVar, vq vqVar) {
        zm zmVar = (zm) this.a.get(wrVar);
        if (zmVar == null) {
            cpn cpnVar = this.a;
            zm a = zm.a();
            cpnVar.put(wrVar, a);
            zmVar = a;
        }
        zmVar.d = vqVar;
        zmVar.b |= 8;
    }

    public final void e(wr wrVar, vq vqVar) {
        zm zmVar = (zm) this.a.get(wrVar);
        if (zmVar == null) {
            cpn cpnVar = this.a;
            zm a = zm.a();
            cpnVar.put(wrVar, a);
            zmVar = a;
        }
        zmVar.c = vqVar;
        zmVar.b |= 4;
    }

    public final void f() {
        this.a.clear();
        this.b.g();
    }

    final void g(wr wrVar) {
        zm zmVar = (zm) this.a.get(wrVar);
        if (zmVar == null) {
            return;
        }
        zmVar.b &= -2;
    }

    final void h(wr wrVar) {
        int b = this.b.b();
        while (true) {
            b--;
            if (b < 0) {
                break;
            }
            if (wrVar == this.b.e(b)) {
                cno cnoVar = this.b;
                Object[] objArr = cnoVar.c;
                Object obj = objArr[b];
                Object obj2 = cnp.a;
                if (obj != obj2) {
                    objArr[b] = obj2;
                    cnoVar.a = true;
                }
            }
        }
        zm zmVar = (zm) this.a.remove(wrVar);
        if (zmVar != null) {
            zm.b(zmVar);
        }
    }

    public final boolean i(wr wrVar) {
        zm zmVar = (zm) this.a.get(wrVar);
        return (zmVar == null || (zmVar.b & 1) == 0) ? false : true;
    }
}
