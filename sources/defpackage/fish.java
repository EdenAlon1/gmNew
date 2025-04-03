package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class fish extends fise {
    private static final int[] H = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] I = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final long[] J = new long[12];
    private static final long[] K = new long[12];
    private static final long serialVersionUID = 538276888268L;

    static {
        int i = 0;
        long j = 0;
        long j2 = 0;
        while (i < 11) {
            j += H[i] * 86400000;
            int i2 = i + 1;
            J[i2] = j;
            j2 += I[i] * 86400000;
            K[i2] = j2;
            i = i2;
        }
    }

    public fish(firb firbVar, int i) {
        super(firbVar, i);
    }

    @Override // defpackage.fise
    public final int R(int i, int i2) {
        int i3 = i2 - 1;
        return ag(i) ? I[i3] : H[i3];
    }

    @Override // defpackage.fise
    public final int T(long j, int i) {
        long ac = j - ac(i);
        boolean ag = ag(i);
        int i2 = (int) (ac >> 10);
        if (i2 < (true != ag ? 15271875 : 15356250)) {
            if (i2 < (true != ag ? 7593750 : 7678125)) {
                if (i2 < 2615625) {
                    return 1;
                }
                return i2 >= (true != ag ? 4978125 : 5062500) ? 3 : 2;
            }
            if (i2 < (true != ag ? 10125000 : 10209375)) {
                return 4;
            }
            return i2 >= (true != ag ? 12740625 : 12825000) ? 6 : 5;
        }
        if (i2 < (true != ag ? 23034375 : 23118750)) {
            if (i2 < (true != ag ? 17887500 : 17971875)) {
                return 7;
            }
            return i2 >= (true != ag ? 20503125 : 20587500) ? 9 : 8;
        }
        if (i2 < (true != ag ? 25650000 : 25734375)) {
            return 10;
        }
        return i2 >= (true != ag ? 28181250 : 28265625) ? 12 : 11;
    }

    @Override // defpackage.fise
    public final long ab(int i, int i2) {
        int i3 = i2 - 1;
        return ag(i) ? K[i3] : J[i3];
    }

    @Override // defpackage.fise
    public final long ae(long j, int i) {
        int Y = Y(j);
        int P = P(j, Y);
        if (P > 59) {
            if (ag(Y)) {
                if (!ag(i)) {
                    P--;
                }
            } else if (ag(i)) {
                P++;
            }
        }
        return ad(i, 1, P) + S(j);
    }

    @Override // defpackage.fise
    public final boolean af(long j) {
        return this.k.a(j) == 29 && this.m.t(j);
    }
}
