package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kjh extends kjv {
    ArrayList a;
    private int b;

    public kjh(kiu kiuVar, int i) {
        super(kiuVar);
        kiu kiuVar2;
        this.a = new ArrayList();
        this.g = i;
        kiu kiuVar3 = this.d;
        kiu n = kiuVar3.n(i);
        while (true) {
            kiu kiuVar4 = n;
            kiuVar2 = kiuVar3;
            kiuVar3 = kiuVar4;
            if (kiuVar3 == null) {
                break;
            } else {
                n = kiuVar3.n(this.g);
            }
        }
        this.d = kiuVar2;
        this.a.add(kiuVar2.o(this.g));
        kiu m = kiuVar2.m(this.g);
        while (m != null) {
            this.a.add(m.o(this.g));
            m = m.m(this.g);
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            kjv kjvVar = (kjv) arrayList.get(i2);
            int i3 = this.g;
            if (i3 == 0) {
                kjvVar.d.m = this;
            } else if (i3 == 1) {
                kjvVar.d.n = this;
            }
        }
        if (this.g == 0 && ((kiv) this.d.ae).e && this.a.size() > 1) {
            this.d = ((kjv) this.a.get(r6.size() - 1)).d;
        }
        this.b = this.g == 0 ? this.d.at : this.d.au;
    }

    private final kiu g() {
        for (int i = 0; i < this.a.size(); i++) {
            kiu kiuVar = ((kjv) this.a.get(i)).d;
            if (kiuVar.ar != 8) {
                return kiuVar;
            }
        }
        return null;
    }

    private final kiu n() {
        kiu kiuVar;
        int size = this.a.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
            kiuVar = ((kjv) this.a.get(size)).d;
        } while (kiuVar.ar == 8);
        return kiuVar;
    }

    @Override // defpackage.kjv
    public final long a() {
        int size = this.a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = j + r4.i.e + ((kjv) this.a.get(i)).a() + r4.j.e;
        }
        return j;
    }

    @Override // defpackage.kjv
    public final void b() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((kjv) arrayList.get(i)).b();
        }
        int size2 = this.a.size();
        if (size2 <= 0) {
            return;
        }
        kiu kiuVar = ((kjv) this.a.get(0)).d;
        kiu kiuVar2 = ((kjv) this.a.get(size2 - 1)).d;
        if (this.g == 0) {
            kit kitVar = kiuVar.T;
            kit kitVar2 = kiuVar2.V;
            kjk l = l(kitVar, 0);
            int b = kitVar.b();
            kiu g = g();
            if (g != null) {
                b = g.T.b();
            }
            if (l != null) {
                j(this.i, l, b);
            }
            kjk l2 = l(kitVar2, 0);
            int b2 = kitVar2.b();
            kiu n = n();
            if (n != null) {
                b2 = n.V.b();
            }
            if (l2 != null) {
                j(this.j, l2, -b2);
            }
        } else {
            kit kitVar3 = kiuVar.U;
            kit kitVar4 = kiuVar2.W;
            kjk l3 = l(kitVar3, 1);
            int b3 = kitVar3.b();
            kiu g2 = g();
            if (g2 != null) {
                b3 = g2.U.b();
            }
            if (l3 != null) {
                j(this.i, l3, b3);
            }
            kjk l4 = l(kitVar4, 1);
            int b4 = kitVar4.b();
            kiu n2 = n();
            if (n2 != null) {
                b4 = n2.W.b();
            }
            if (l4 != null) {
                j(this.j, l4, -b4);
            }
        }
        this.i.a = this;
        this.j.a = this;
    }

    @Override // defpackage.kjv
    public final void c() {
        for (int i = 0; i < this.a.size(); i++) {
            ((kjv) this.a.get(i)).c();
        }
    }

    @Override // defpackage.kjv
    public final void d() {
        this.e = null;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((kjv) arrayList.get(i)).d();
        }
    }

    @Override // defpackage.kjv
    public final boolean e() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (!((kjv) this.a.get(i)).e()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:286:0x03cc, code lost:
    
        r2 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00bb, code lost:
    
        if (r13.i != false) goto L56;
     */
    @Override // defpackage.kjv, defpackage.kji
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 1010
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kjh.f():void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.g == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            kjv kjvVar = (kjv) arrayList.get(i);
            sb.append("<");
            sb.append(kjvVar);
            sb.append("> ");
        }
        return sb.toString();
    }
}
