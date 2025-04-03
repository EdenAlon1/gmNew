package defpackage;

import androidx.compose.animation.SkipToLookaheadElement;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cvy extends ffkk implements ffjn {
    final /* synthetic */ crw a;
    final /* synthetic */ cue b;
    final /* synthetic */ cug c;
    final /* synthetic */ cvn d;
    final /* synthetic */ cvm e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvy(crw crwVar, cue cueVar, cug cugVar, cvn cvnVar, cvm cvmVar) {
        super(3);
        this.a = crwVar;
        this.b = cueVar;
        this.c = cugVar;
        this.d = cvnVar;
        this.e = cvmVar;
    }

    @Override // defpackage.ffjn
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        hfdVar.v(-419341573);
        cvn cvnVar = this.d;
        dbe a = this.a.a();
        boolean F = hfdVar.F(cvnVar);
        Object f = hfdVar.f();
        if (F || f == hfc.a) {
            f = new cvw(this.d);
            hfdVar.y(f);
        }
        cug cugVar = this.c;
        Object obj4 = this.d.a;
        Objects.toString(obj4);
        hvi i = ctt.i(a, this.b, cugVar, (ffix) f, "enter/exit for ".concat((String) obj4), hfdVar, 0, 0);
        hfdVar.v(-805568624);
        cvm cvmVar = this.e;
        cvn cvnVar2 = this.d;
        hve hveVar = hvi.e;
        boolean F2 = hfdVar.F(cvnVar2);
        cvn cvnVar3 = this.d;
        Object f2 = hfdVar.f();
        if (F2 || f2 == hfc.a) {
            f2 = new cvx(cvnVar3);
            hfdVar.y(f2);
        }
        cuq cuqVar = (cuq) cvmVar;
        ffix ffixVar = (ffix) f2;
        hvi a2 = (ffkj.e(cuqVar.a, ino.a) ? icf.a(hvi.e, new cwy(ffixVar)) : hvi.e).a(new SkipToLookaheadElement(cuqVar, ffixVar));
        hfdVar.o();
        hvi a3 = i.a(a2);
        hfdVar.o();
        return a3;
    }
}
