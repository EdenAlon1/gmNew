package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.emergencysos.EmergencySosConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wqc implements ffjm {
    final /* synthetic */ wqj a;
    final /* synthetic */ boolean b;

    public wqc(wqj wqjVar, boolean z) {
        this.a = wqjVar;
        this.b = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            fgdj fgdjVar = ((zcb) this.a.a().d.b()).g;
            hfdVar.v(-938966345);
            hkx a = fgdjVar == null ? null : hkf.a(fgdjVar, hfdVar);
            hfdVar.o();
            boolean z = this.a.a().a instanceof EmergencySosConversationId;
            fgdj c = ((abjs) this.a.i.b()).c();
            ffjm ffjmVar = a != null ? (ffjm) a.a() : null;
            boolean z2 = this.b;
            hfdVar.v(-938954973);
            boolean F = hfdVar.F(this.a);
            final wqj wqjVar = this.a;
            Object f = hfdVar.f();
            if (F || f == hfc.a) {
                f = new ffji() { // from class: wqa
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj3) {
                        ((abam) wqj.this.f.b()).h(((Boolean) obj3).booleanValue());
                        return ffcu.a;
                    }
                };
                hfdVar.y(f);
            }
            hfdVar.o();
            cwoi.a(c, ffjmVar, z2, (ffji) f, z, hpx.d(-802663644, new wqb(this.a, z), hfdVar), hfdVar, 196608, 0);
        }
        return ffcu.a;
    }
}
