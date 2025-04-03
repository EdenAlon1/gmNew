package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmnj {
    public static final void a(final dmpj dmpjVar, hvi hviVar, hzi hziVar, hfd hfdVar, final int i, final int i2) {
        int i3;
        dmpjVar.getClass();
        int i4 = i2 & 1;
        hfd b = hfdVar.b(-11901093);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != b.D(dmpjVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            int i6 = 128;
            if ((i2 & 4) == 0 && b.D(hziVar)) {
                i6 = 256;
            }
            i3 |= i6;
        }
        if ((i3 & 147) == 146 && b.I()) {
            b.s();
        } else {
            int i7 = i2 & 4;
            b.t();
            if ((i & 1) == 0 || b.G()) {
                if (i5 != 0) {
                    hviVar = hvi.e;
                }
                if (i7 != 0) {
                    i3 &= -897;
                    hziVar = hzi.a;
                }
            } else {
                b.s();
                if (i7 != 0) {
                    i3 &= -897;
                }
            }
            b.l();
            int i8 = i3 & 1022;
            if (dmpjVar.g.a) {
                b.v(-653442337);
                dmkw.b(dmpjVar, hviVar, hziVar, b, i8);
                ((hfm) b).Z();
            } else {
                b.v(-653381825);
                dmkt.b(dmpjVar, hviVar, hziVar, b, i8);
                ((hfm) b).Z();
            }
        }
        final hvi hviVar2 = hviVar;
        final hzi hziVar2 = hziVar;
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmni
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmpj dmpjVar2 = dmpj.this;
                    hvi hviVar3 = hviVar2;
                    dmnj.a(dmpjVar2, hviVar3, hziVar2, (hfd) obj, hip.a(i | 1), i2);
                    return ffcu.a;
                }
            };
        }
    }
}
