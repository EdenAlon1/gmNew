package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmkw {
    public static final void a(final ebq ebqVar, final dmpg dmpgVar, final float f, final ffjm ffjmVar, hfd hfdVar, final int i) {
        int i2;
        hvi a;
        hfd hfdVar2;
        ffjmVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(1765724902);
        if (i3 == 0) {
            i2 = (true != b.D(ebqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dmpgVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.A(f) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.F(ffjmVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            a = ebqVar.a(hvi.e, 1.0f, true);
            hfdVar2 = b;
            gpa.c(a, eqm.b(true != ((Boolean) dooy.b(b).i.invoke()).booleanValue() ? 24.0f : 30.0f), dmmi.m(dmpgVar, f, b), 0L, 0.0f, 0.0f, null, ffjmVar, hfdVar2, 120);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmku
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ebq ebqVar2 = ebq.this;
                    dmpg dmpgVar2 = dmpgVar;
                    float f2 = f;
                    dmkw.a(ebqVar2, dmpgVar2, f2, ffjmVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final dmpj dmpjVar, final hvi hviVar, final hzi hziVar, hfd hfdVar, final int i) {
        int i2;
        hziVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(-710451877);
        if (i3 == 0) {
            i2 = (true != b.D(dmpjVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(hziVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            dmnh dmnhVar = dmpjVar.c;
            if (dmnhVar != null) {
                b.v(1208191821);
                int i4 = i2;
                dmms dmmsVar = dmpjVar.a;
                dmov dmovVar = dmpjVar.b;
                dmpg dmpgVar = dmpjVar.d;
                float f = dmpjVar.e;
                dmpi dmpiVar = dmpjVar.g;
                dmrb.e(dmmsVar, dmovVar, dmnhVar, dmpgVar, f, dmpiVar.b, hviVar, hziVar, dmpjVar.f, dmpiVar, b, (i4 << 15) & 33030144);
                ((hfm) b).Z();
            } else {
                b.v(1208619776);
                dmro.c(dmpjVar.a, dmpjVar.d, dmpjVar.e, hviVar, hziVar, dmpjVar.g, b, (i2 << 6) & 64512);
                ((hfm) b).Z();
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmkv
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmpj dmpjVar2 = dmpj.this;
                    hvi hviVar2 = hviVar;
                    int i5 = i;
                    dmkw.b(dmpjVar2, hviVar2, hziVar, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
