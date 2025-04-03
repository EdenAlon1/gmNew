package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fghg {
    public static final fgho a = new fgho("REMOVE_FROZEN");
    private final int c;
    private final boolean d;
    private final int e;
    private final ffqj g;
    private final ffqn f = new ffqn(null, ffqo.a);
    public final ffqm b = new ffqm(0, ffqo.a);

    public fghg(int i, boolean z) {
        this.c = i;
        this.d = z;
        int i2 = i - 1;
        this.e = i2;
        this.g = new ffqj(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Object obj) {
        while (true) {
            long j = this.b.c;
            if ((3458764513820540928L & j) != 0) {
                return (j & 2305843009213693952L) != 0 ? 2 : 1;
            }
            int i = this.e;
            int i2 = (int) ((j & 1152921503533105152L) >> 30);
            int i3 = (int) (1073741823 & j);
            if (((i2 + 2) & i) == (i3 & i)) {
                return 1;
            }
            if (!this.d) {
                if (this.g.a(i2 & i).a != null) {
                    int i4 = this.c;
                    if (i4 < 1024 || ((i2 - i3) & 1073741823) > (i4 >> 1)) {
                        break;
                    }
                }
            }
            if (this.b.c(j, (((i2 + 1) & 1073741823) << 30) | fghe.a(j, 1152921503533105152L))) {
                this.g.a(i2 & i).c(obj);
                fghg fghgVar = this;
                while ((fghgVar.b.c & 1152921504606846976L) != 0) {
                    fghgVar = fghgVar.c();
                    Object obj2 = fghgVar.g.a(fghgVar.e & i2).a;
                    if ((obj2 instanceof fghf) && ((fghf) obj2).a == i2) {
                        fghgVar.g.a(fghgVar.e & i2).c(obj);
                    } else {
                        fghgVar = null;
                    }
                    if (fghgVar == null) {
                        return 0;
                    }
                }
                return 0;
            }
        }
        return 1;
    }

    public final Object b() {
        long j;
        while (true) {
            long j2 = this.b.c;
            long j3 = 1152921504606846976L;
            if ((j2 & 1152921504606846976L) != 0) {
                return a;
            }
            long j4 = 1073741823;
            int i = this.e;
            int i2 = (int) (j2 & 1073741823);
            int i3 = i2 & i;
            if ((((int) ((1152921503533105152L & j2) >> 30)) & i) == i3) {
                return null;
            }
            Object obj = this.g.a(i3).a;
            if (obj == null) {
                if (this.d) {
                    return null;
                }
            } else {
                if (obj instanceof fghf) {
                    return null;
                }
                int i4 = (i2 + 1) & 1073741823;
                if (this.b.c(j2, fghe.b(j2, i4))) {
                    this.g.a(this.e & i2).c(null);
                    return obj;
                }
                if (this.d) {
                    fghg fghgVar = this;
                    while (true) {
                        ffqm ffqmVar = fghgVar.b;
                        while (true) {
                            long j5 = ffqmVar.c;
                            j = j3;
                            long j6 = j5 & j4;
                            boolean z = ffso.a;
                            if ((j5 & j) != 0) {
                                fghgVar = fghgVar.c();
                                break;
                            }
                            if (fghgVar.b.c(j5, fghe.b(j5, i4))) {
                                fghgVar.g.a(fghgVar.e & ((int) j6)).c(null);
                                fghgVar = null;
                                break;
                            }
                            j3 = j;
                            j4 = 1073741823;
                        }
                        if (fghgVar == null) {
                            return obj;
                        }
                        j3 = j;
                        j4 = 1073741823;
                    }
                }
            }
        }
    }

    public final fghg c() {
        long j;
        while (true) {
            ffqm ffqmVar = this.b;
            j = ffqmVar.c;
            if ((j & 1152921504606846976L) != 0) {
                break;
            }
            long j2 = j | 1152921504606846976L;
            if (ffqmVar.c(j, j2)) {
                j = j2;
                break;
            }
        }
        ffqn ffqnVar = this.f;
        while (true) {
            fghg fghgVar = (fghg) ffqnVar.a;
            if (fghgVar != null) {
                return fghgVar;
            }
            ffqn ffqnVar2 = this.f;
            int i = this.c;
            fghg fghgVar2 = new fghg(i + i, this.d);
            long j3 = 1152921503533105152L & j;
            int i2 = (int) (1073741823 & j);
            while (true) {
                int i3 = this.e;
                int i4 = i2 & i3;
                if (i4 != (i3 & ((int) (j3 >> 30)))) {
                    Object obj = this.g.a(i4).a;
                    if (obj == null) {
                        obj = new fghf(i2);
                    }
                    fghgVar2.g.a(fghgVar2.e & i2).c(obj);
                    i2++;
                }
            }
            fghgVar2.b.c = fghe.a(j, 1152921504606846976L);
            ffqnVar2.d(null, fghgVar2);
        }
    }

    public final boolean d() {
        ffqm ffqmVar;
        long j;
        do {
            ffqmVar = this.b;
            j = ffqmVar.c;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!ffqmVar.c(j, 2305843009213693952L | j));
        return true;
    }

    public final boolean e() {
        long j = this.b.c;
        return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
    }
}
