package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwhc {
    public static final void a(fxz fxzVar, giz gizVar, glv glvVar, gvs gvsVar, final ffjm ffjmVar, hfd hfdVar, final int i) {
        int i2;
        gvs gvsVar2;
        final fxz fxzVar2;
        final glv glvVar2;
        final giz gizVar2;
        ffjmVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(295511914);
        if (i3 == 0) {
            i2 = (true != b.D(fxzVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(glvVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.D(gvsVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.F(ffjmVar) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && b.I()) {
            b.s();
            gvsVar2 = gvsVar;
            glvVar2 = glvVar;
            gizVar2 = gizVar;
            fxzVar2 = fxzVar;
        } else {
            b.t();
            if ((i & 1) == 0 || b.G()) {
                gizVar = new dwia();
            } else {
                b.s();
            }
            giz gizVar3 = gizVar;
            b.l();
            gvsVar2 = gvsVar;
            gga.a(fxzVar, gizVar3, glvVar, gvsVar2, hpx.d(-1166625323, new dwhb(dwhg.c(fxzVar, b), ffjmVar), b), b, (i2 & 14) | 24576 | (i2 & 896) | (i2 & 7168));
            fxzVar2 = fxzVar;
            glvVar2 = glvVar;
            gizVar2 = gizVar3;
        }
        hio L = b.L();
        if (L != null) {
            final gvs gvsVar3 = gvsVar2;
            L.d = new ffjm() { // from class: dwha
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fxz fxzVar3 = fxz.this;
                    giz gizVar4 = gizVar2;
                    glv glvVar3 = glvVar2;
                    gvs gvsVar4 = gvsVar3;
                    dwhc.a(fxzVar3, gizVar4, glvVar3, gvsVar4, ffjmVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
