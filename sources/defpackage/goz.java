package defpackage;

import androidx.compose.material3.internal.ChildSemanticsNodeElement;

/* compiled from: PG */
/* loaded from: classes.dex */
final class goz extends ffkk implements ffjm {
    final /* synthetic */ hvi a;
    final /* synthetic */ idh b;
    final /* synthetic */ long c;
    final /* synthetic */ float d;
    final /* synthetic */ der e;
    final /* synthetic */ boolean f;
    final /* synthetic */ boolean g;
    final /* synthetic */ ffji h;
    final /* synthetic */ ffjm i;
    final /* synthetic */ dwn j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public goz(hvi hviVar, idh idhVar, long j, float f, der derVar, boolean z, dwn dwnVar, boolean z2, ffji ffjiVar, ffjm ffjmVar) {
        super(2);
        this.a = hviVar;
        this.b = idhVar;
        this.c = j;
        this.d = f;
        this.e = derVar;
        this.f = z;
        this.j = dwnVar;
        this.g = z2;
        this.h = ffjiVar;
        this.i = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        long c;
        hvi a;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hvi hviVar = this.a;
            idh idhVar = this.b;
            long j = this.c;
            float f = this.d;
            hvi a2 = gex.a(hviVar);
            c = fyc.c(gft.a(hfdVar), j, f, hfdVar);
            a = epy.a(gpa.a(a2, idhVar, c, this.e, ((jzn) hfdVar.e(jdr.e)).em(0.0f)), this.f, this.j, gkw.a(false, 0.0f, 0L, 7), this.g, null, this.h).a(new ChildSemanticsNodeElement(har.a));
            hvi a3 = get.a(a, this.j);
            ffjm ffjmVar = this.i;
            int i = huo.a;
            ipn a4 = dyc.a(hum.a, true);
            int a5 = hey.a(hfdVar);
            hgb c2 = hfdVar.c();
            hvi b = huz.b(hfdVar, a3);
            int i2 = ist.a;
            ffix ffixVar = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a4, iss.e);
            hlc.b(hfdVar, c2, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a5))) {
                Integer valueOf = Integer.valueOf(a5);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar2);
            }
            hlc.b(hfdVar, b, iss.c);
            ffjmVar.a(hfdVar, 0);
            hfdVar.n();
        }
        return ffcu.a;
    }
}
