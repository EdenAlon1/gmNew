package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnrm implements PointerInputEventHandler {
    final /* synthetic */ hho a;
    final /* synthetic */ ffji b;
    final /* synthetic */ ffix c;
    final /* synthetic */ kah d;
    final /* synthetic */ dnsh e;
    final /* synthetic */ boolean f;
    final /* synthetic */ iir g;

    public dnrm(hho hhoVar, ffji ffjiVar, ffix ffixVar, kah kahVar, dnsh dnshVar, boolean z, iir iirVar) {
        this.a = hhoVar;
        this.b = ffjiVar;
        this.c = ffixVar;
        this.d = kahVar;
        this.e = dnshVar;
        this.f = z;
        this.g = iirVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ild ildVar, ffgu<? super ffcu> ffguVar) {
        final ffkx ffkxVar = new ffkx();
        ffji ffjiVar = new ffji() { // from class: dnri
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ffkx.this.a = false;
                return ffcu.a;
            }
        };
        final hho hhoVar = this.a;
        final ffji ffjiVar2 = this.b;
        final ffix ffixVar = this.c;
        ffix ffixVar2 = new ffix() { // from class: dnrj
            @Override // defpackage.ffix
            public final Object invoke() {
                hho hhoVar2 = hho.this;
                Float valueOf = Float.valueOf(0.0f);
                hhoVar2.b(valueOf);
                ffjiVar2.invoke(valueOf);
                ffkx ffkxVar2 = ffkxVar;
                if (ffkxVar2.a) {
                    ffixVar.invoke();
                    ffkxVar2.a = false;
                }
                return ffcu.a;
            }
        };
        ffix ffixVar3 = new ffix() { // from class: dnrk
            @Override // defpackage.ffix
            public final Object invoke() {
                ffkx.this.a = false;
                return ffcu.a;
            }
        };
        final dnsh dnshVar = this.e;
        final kah kahVar = this.d;
        final boolean z = this.f;
        final iir iirVar = this.g;
        Object b = dpu.b(ildVar, new doh(ffjiVar, new ffjm() { // from class: dnrl
            @Override // defpackage.ffjm
            public final Object a(Object obj, Object obj2) {
                iku ikuVar = (iku) obj;
                float floatValue = ((Float) obj2).floatValue();
                ikuVar.getClass();
                if (kah.this == kah.b) {
                    floatValue = -floatValue;
                }
                boolean z2 = z;
                dnsh dnshVar2 = dnshVar;
                hho hhoVar2 = hhoVar;
                float floatValue2 = ((Number) hhoVar2.a()).floatValue() + floatValue;
                if (floatValue2 <= 0.0f && dnrv.o(dnshVar2)) {
                    if (dnshVar2.B.g && z2) {
                        z2 = true;
                    }
                    return ffcu.a;
                }
                dnor dnorVar = dnshVar2.f;
                if (((dnorVar != dnor.a || floatValue2 > 0.0f) && (dnorVar != dnor.c || floatValue2 < 0.0f)) || (dnrv.o(dnshVar2) && (!dnshVar2.B.g || !z2))) {
                    ffkx ffkxVar2 = ffkxVar;
                    if (Math.abs(floatValue2) > 250.0f) {
                        floatValue2 = ((Number) hhoVar2.a()).floatValue() + (floatValue / 3.0f);
                        if (!ffkxVar2.a) {
                            iirVar.a(0);
                        }
                        ffkxVar2.a = true;
                    } else if (ilq.b(ikuVar.i, 1)) {
                        ffkxVar2.a = false;
                    }
                    ffji ffjiVar3 = ffjiVar2;
                    Float valueOf = Float.valueOf(floatValue2);
                    hhoVar2.b(valueOf);
                    ffjiVar3.invoke(valueOf);
                    return ffcu.a;
                }
                return ffcu.a;
            }
        }, ffixVar2, ffixVar3, null), ffguVar);
        ffhh ffhhVar = ffhh.a;
        if (b != ffhhVar) {
            b = ffcu.a;
        }
        return b == ffhhVar ? b : ffcu.a;
    }
}
