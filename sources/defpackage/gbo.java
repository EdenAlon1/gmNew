package defpackage;

import androidx.compose.foundation.lazy.ParentSizeElement;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gbo extends ffkk implements ffjo {
    final /* synthetic */ ham a;
    final /* synthetic */ haq b;
    final /* synthetic */ ffji c;
    final /* synthetic */ hal d;
    final /* synthetic */ Long e;
    final /* synthetic */ fzr f;
    final /* synthetic */ gae g;
    final /* synthetic */ dmug h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbo(ham hamVar, haq haqVar, ffji ffjiVar, hal halVar, Long l, gae gaeVar, dmug dmugVar, fzr fzrVar) {
        super(4);
        this.a = hamVar;
        this.b = haqVar;
        this.c = ffjiVar;
        this.d = halVar;
        this.e = l;
        this.g = gaeVar;
        this.h = dmugVar;
        this.f = fzrVar;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        edi ediVar = (edi) obj;
        int intValue = ((Number) obj2).intValue();
        hfd hfdVar = (hfd) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (true != hfdVar.D(ediVar) ? 2 : 4) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= true != hfdVar.B(intValue) ? 16 : 32;
        }
        if ((i & 147) == 146 && hfdVar.I()) {
            hfdVar.s();
        } else {
            haq h = this.a.h(this.b, intValue);
            hve hveVar = hvi.e;
            ParentSizeElement parentSizeElement = new ParentSizeElement(ediVar.a);
            ffji ffjiVar = this.c;
            hal halVar = this.d;
            Long l = this.e;
            gae gaeVar = this.g;
            dmug dmugVar = this.h;
            fzr fzrVar = this.f;
            ham hamVar = this.a;
            int i2 = huo.a;
            ipn a = dyc.a(hum.a, false);
            int a2 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b = huz.b(hfdVar, parentSizeElement);
            int i3 = ist.a;
            ffix ffixVar = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a, iss.e);
            hlc.b(hfdVar, c, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar, b, iss.c);
            gcy.o(h, ffjiVar, halVar.c, l, gaeVar, dmugVar, fzrVar, hamVar.a, hfdVar, 221184);
            hfdVar.n();
        }
        return ffcu.a;
    }
}
