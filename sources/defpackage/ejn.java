package defpackage;

import android.view.View;
import androidx.compose.foundation.lazy.layout.TraversablePrefetchStateModifierElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ejn extends ffkk implements ffjn {
    final /* synthetic */ ekh a;
    final /* synthetic */ hvi b;
    final /* synthetic */ ffjm c;
    final /* synthetic */ hkx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejn(ekh ekhVar, hvi hviVar, ffjm ffjmVar, hkx hkxVar) {
        super(3);
        this.a = ekhVar;
        this.b = hviVar;
        this.c = ffjmVar;
        this.d = hkxVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi a;
        elx elxVar;
        hqu hquVar = (hqu) obj;
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        Object f = hfdVar.f();
        if (f == hfc.a) {
            ejc ejcVar = new ejc(hquVar, new ejm(this.d));
            hfdVar.y(ejcVar);
            f = ejcVar;
        }
        ejc ejcVar2 = (ejc) f;
        Object f2 = hfdVar.f();
        if (f2 == hfc.a) {
            f2 = new irf(new eji(ejcVar2));
            hfdVar.y(f2);
        }
        irf irfVar = (irf) f2;
        if (this.a != null) {
            hfdVar.v(204281539);
            hfdVar.v(6591363);
            if (elz.a != null) {
                hfdVar.v(1213929743);
                hfdVar.o();
                elxVar = elz.a;
            } else {
                hfdVar.v(1213968648);
                View view = (View) hfdVar.e(AndroidCompositionLocals_androidKt.g);
                boolean D = hfdVar.D(view);
                Object f3 = hfdVar.f();
                if (D || f3 == hfc.a) {
                    f3 = new eho(view);
                    hfdVar.y(f3);
                }
                elxVar = (eho) f3;
                hfdVar.o();
            }
            hfdVar.o();
            ekh ekhVar = this.a;
            Object[] objArr = {ekhVar, ejcVar2, irfVar, elxVar};
            boolean D2 = hfdVar.D(ekhVar) | hfdVar.F(ejcVar2) | hfdVar.F(irfVar) | hfdVar.F(elxVar);
            ekh ekhVar2 = this.a;
            Object f4 = hfdVar.f();
            if (D2 || f4 == hfc.a) {
                f4 = new ejk(ekhVar2, ejcVar2, irfVar, elxVar);
                hfdVar.y(f4);
            }
            hgs.d(objArr, (ffji) f4, hfdVar);
            hfdVar.o();
        } else {
            hfdVar.v(204710145);
            hfdVar.o();
        }
        hvi hviVar = this.b;
        ekh ekhVar3 = this.a;
        long j = eki.a;
        if (ekhVar3 != null && (a = hviVar.a(new TraversablePrefetchStateModifierElement(ekhVar3))) != null) {
            hviVar = a;
        }
        boolean D3 = hfdVar.D(ejcVar2) | hfdVar.D(this.c);
        ffjm ffjmVar = this.c;
        Object f5 = hfdVar.f();
        if (D3 || f5 == hfc.a) {
            f5 = new ejl(ejcVar2, ffjmVar);
            hfdVar.y(f5);
        }
        ira.b(irfVar, hviVar, (ffjm) f5, hfdVar, 8);
        return ffcu.a;
    }
}
