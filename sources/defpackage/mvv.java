package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mvv implements mvr {
    public static final /* synthetic */ int a = 0;
    private static final enom b = new enen(new encx(new emwl() { // from class: mvt
        @Override // defpackage.emwl
        public final Object apply(Object obj) {
            int i = mvv.a;
            return Long.valueOf(((njp) obj).b);
        }
    }, enoe.a), new encx(new emwl() { // from class: mvu
        @Override // defpackage.emwl
        public final Object apply(Object obj) {
            int i = mvv.a;
            return Long.valueOf(((njp) obj).c);
        }
    }, enpf.a));
    private final List c = new ArrayList();

    @Override // defpackage.mvr
    public final long a(long j) {
        int i = 0;
        long j2 = -9223372036854775807L;
        while (true) {
            if (i >= this.c.size()) {
                break;
            }
            long j3 = ((njp) this.c.get(i)).b;
            long j4 = ((njp) this.c.get(i)).d;
            if (j < j3) {
                j2 = j2 != -9223372036854775807L ? Math.min(j2, j3) : j3;
            } else {
                if (j < j4) {
                    j2 = j2 == -9223372036854775807L ? j4 : Math.min(j2, j4);
                }
                i++;
            }
        }
        if (j2 != -9223372036854775807L) {
            return j2;
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.mvr
    public final long b(long j) {
        if (this.c.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < ((njp) this.c.get(0)).b) {
            return -9223372036854775807L;
        }
        long j2 = ((njp) this.c.get(0)).b;
        for (int i = 0; i < this.c.size(); i++) {
            long j3 = ((njp) this.c.get(i)).b;
            long j4 = ((njp) this.c.get(i)).d;
            if (j4 > j) {
                if (j3 > j) {
                    break;
                }
                j2 = Math.max(j2, j3);
            } else {
                j2 = Math.max(j2, j4);
            }
        }
        return j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mvr
    public final engw c(long j) {
        if (!this.c.isEmpty()) {
            if (j >= ((njp) this.c.get(0)).b) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < this.c.size(); i++) {
                    njp njpVar = (njp) this.c.get(i);
                    if (j >= njpVar.b && j < njpVar.d) {
                        arrayList.add(njpVar);
                    }
                    if (j < njpVar.b) {
                        break;
                    }
                }
                engw E = engw.E(b, arrayList);
                engr engrVar = new engr();
                for (int i2 = 0; i2 < ((enou) E).c; i2++) {
                    engrVar.j(((njp) E.get(i2)).a);
                }
                return engrVar.g();
            }
        }
        int i3 = engw.d;
        return enou.a;
    }

    @Override // defpackage.mvr
    public final void d() {
        this.c.clear();
    }

    @Override // defpackage.mvr
    public final void e(long j) {
        int i = 0;
        while (i < this.c.size()) {
            long j2 = ((njp) this.c.get(i)).b;
            if (j > j2 && j > ((njp) this.c.get(i)).d) {
                this.c.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }

    @Override // defpackage.mvr
    public final boolean f(njp njpVar, long j) {
        lti.a(njpVar.b != -9223372036854775807L);
        lti.a(njpVar.c != -9223372036854775807L);
        boolean z = njpVar.b <= j && j < njpVar.d;
        int size = this.c.size();
        do {
            size--;
            if (size < 0) {
                this.c.add(0, njpVar);
                return z;
            }
        } while (njpVar.b < ((njp) this.c.get(size)).b);
        this.c.add(size + 1, njpVar);
        return z;
    }
}
