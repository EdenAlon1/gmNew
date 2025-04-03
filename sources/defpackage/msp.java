package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class msp implements mve {
    private final engw a;
    private long b;

    public msp(List list, List list2) {
        int i = engw.d;
        engr engrVar = new engr();
        lti.a(list.size() == list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            engrVar.h(new mso((mve) list.get(i2), (List) list2.get(i2)));
        }
        this.a = engrVar.g();
        this.b = -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mve
    public final long d() {
        int i = 0;
        long j = Long.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        while (true) {
            engw engwVar = this.a;
            if (i >= ((enou) engwVar).c) {
                break;
            }
            mso msoVar = (mso) engwVar.get(i);
            long d = msoVar.d();
            if ((msoVar.a.contains(1) || msoVar.a.contains(2) || msoVar.a.contains(4)) && d != Long.MIN_VALUE) {
                j = Math.min(j, d);
            }
            if (d != Long.MIN_VALUE) {
                j2 = Math.min(j2, d);
            }
            i++;
        }
        if (j != Long.MAX_VALUE) {
            this.b = j;
            return j;
        }
        if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j3 = this.b;
        return j3 != -9223372036854775807L ? j3 : j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mve
    public final long e() {
        int i = 0;
        long j = Long.MAX_VALUE;
        while (true) {
            engw engwVar = this.a;
            if (i >= ((enou) engwVar).c) {
                break;
            }
            long e = ((mso) engwVar.get(i)).e();
            if (e != Long.MIN_VALUE) {
                j = Math.min(j, e);
            }
            i++;
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mve
    public final void l(long j) {
        int i = 0;
        while (true) {
            engw engwVar = this.a;
            if (i >= ((enou) engwVar).c) {
                return;
            }
            ((mso) engwVar.get(i)).l(j);
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mve
    public final boolean n(mhc mhcVar) {
        boolean z;
        boolean z2 = false;
        do {
            long e = e();
            if (e == Long.MIN_VALUE) {
                break;
            }
            int i = 0;
            z = false;
            while (true) {
                engw engwVar = this.a;
                if (i >= ((enou) engwVar).c) {
                    break;
                }
                long e2 = ((mso) engwVar.get(i)).e();
                boolean z3 = e2 != Long.MIN_VALUE && e2 <= mhcVar.a;
                if (e2 == e || z3) {
                    z |= ((mso) this.a.get(i)).n(mhcVar);
                }
                i++;
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mve
    public final boolean o() {
        int i = 0;
        while (true) {
            engw engwVar = this.a;
            if (i >= ((enou) engwVar).c) {
                return false;
            }
            if (((mso) engwVar.get(i)).o()) {
                return true;
            }
            i++;
        }
    }
}
