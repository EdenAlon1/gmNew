package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnrd implements PointerInputEventHandler {
    final /* synthetic */ hkx a;
    final /* synthetic */ iir b;
    final /* synthetic */ ffix c;

    public dnrd(hkx hkxVar, iir iirVar, ffix ffixVar) {
        this.a = hkxVar;
        this.b = iirVar;
        this.c = ffixVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ild ildVar, ffgu<? super ffcu> ffguVar) {
        final ffji ffjiVar = dnre.b(this.a).t;
        ffji ffjiVar2 = ffjiVar != null ? new ffji() { // from class: dnra
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ffji.this.invoke(dnse.a);
                return ffcu.a;
            }
        } : null;
        final iir iirVar = this.b;
        final hkx hkxVar = this.a;
        ffji ffjiVar3 = new ffji() { // from class: dnrb
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                iak iakVar = (iak) obj;
                iir.this.a(0);
                dnre.b(hkxVar).s.a(Integer.valueOf((int) Float.intBitsToFloat((int) (iakVar.a >> 32))), Integer.valueOf((int) Float.intBitsToFloat((int) (iakVar.a & 4294967295L))));
                return ffcu.a;
            }
        };
        final ffix ffixVar = this.c;
        Object i = dtr.i(ildVar, ffjiVar2, ffjiVar3, null, new ffji() { // from class: dnrc
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                hkx hkxVar2 = hkxVar;
                if (!((Boolean) dnre.b(hkxVar2).r.invoke()).booleanValue() && !((Boolean) dnre.b(hkxVar2).q.invoke()).booleanValue()) {
                    ffix.this.invoke();
                }
                return ffcu.a;
            }
        }, ffguVar, 4);
        return i == ffhh.a ? i : ffcu.a;
    }
}
