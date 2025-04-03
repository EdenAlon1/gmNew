package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fds extends ffkk implements ffjm {
    final /* synthetic */ ffjm a;
    final /* synthetic */ fft b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fds(ffjm ffjmVar, fft fftVar) {
        super(2);
        this.a = ffjmVar;
        this.b = fftVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        fcv e;
        fcv e2;
        hfd hfdVar = (hfd) obj;
        int intValue = ((Number) obj2).intValue();
        if (hfdVar.J((intValue & 3) != 2, intValue & 1)) {
            this.a.a(hfdVar, 0);
            if (this.b.B() && this.b.y() && !this.b.D()) {
                hfdVar.v(-881553831);
                fcy f = this.b.f();
                if (f == null) {
                    hfdVar.v(-881514989);
                } else {
                    hfdVar.v(-881514988);
                    fft fftVar = this.b;
                    hfdVar.v(1495586214);
                    List g = ffdx.g(true, false);
                    int size = g.size();
                    for (int i = 0; i < size; i++) {
                        boolean booleanValue = ((Boolean) g.get(i)).booleanValue();
                        boolean E = hfdVar.E(booleanValue);
                        Object f2 = hfdVar.f();
                        if (E || f2 == hfc.a) {
                            f2 = new ffh(booleanValue, fftVar);
                            hfdVar.y(f2);
                        }
                        evy evyVar = (evy) f2;
                        boolean E2 = hfdVar.E(booleanValue);
                        Object f3 = hfdVar.f();
                        if (E2 || f3 == hfc.a) {
                            f3 = booleanValue ? new fdq(fftVar) : new fdr(fftVar);
                            hfdVar.y(f3);
                        }
                        ffix ffixVar = (ffix) f3;
                        jyi jyiVar = booleanValue ? f.a.a : f.b.a;
                        float f4 = 0.0f;
                        if (booleanValue) {
                            fcy f5 = fftVar.f();
                            if (f5 != null && (e2 = fftVar.e(f5.a)) != null) {
                                f4 = e2.b(f5.a.b);
                            }
                        } else {
                            fcy f6 = fftVar.f();
                            if (f6 != null && (e = fftVar.e(f6.b)) != null) {
                                f4 = e.b(f6.b.b);
                            }
                        }
                        float f7 = f4;
                        jyi jyiVar2 = jyiVar;
                        fdz fdzVar = new fdz(ffixVar);
                        boolean z = f.c;
                        hve hveVar = hvi.e;
                        boolean F = hfdVar.F(evyVar);
                        Object f8 = hfdVar.f();
                        if (F || f8 == hfc.a) {
                            f8 = new fdp(evyVar);
                            hfdVar.y(f8);
                        }
                        fci.d(fdzVar, booleanValue, jyiVar2, z, 0L, f7, ilv.a(hveVar, evyVar, (PointerInputEventHandler) f8), hfdVar, 0);
                    }
                    hfdVar.o();
                }
                hfdVar.o();
                hfdVar.o();
            } else {
                hfdVar.v(-879541497);
                hfdVar.o();
            }
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
