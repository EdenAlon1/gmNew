package defpackage;

import androidx.compose.ui.input.pointer.SuspendPointerInputElement;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gow extends ffkk implements ffjm {
    final /* synthetic */ hvi a;
    final /* synthetic */ idh b;
    final /* synthetic */ long c;
    final /* synthetic */ float d;
    final /* synthetic */ der e;
    final /* synthetic */ float f;
    final /* synthetic */ ffjm g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gow(hvi hviVar, idh idhVar, long j, float f, der derVar, float f2, ffjm ffjmVar) {
        super(2);
        this.a = hviVar;
        this.b = idhVar;
        this.c = j;
        this.d = f;
        this.e = derVar;
        this.f = f2;
        this.g = ffjmVar;
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
            c = fyc.c(gft.a(hfdVar), this.c, this.d, hfdVar);
            a = jjs.c(gpa.a(hviVar, idhVar, c, this.e, ((jzn) hfdVar.e(jdr.e)).em(this.f)), false, gou.a).a(new SuspendPointerInputElement(ffcu.a, null, null, new ilu(new gov(null)), 6));
            ffjm ffjmVar = this.g;
            int i = huo.a;
            ipn a2 = dyc.a(hum.a, true);
            int a3 = hey.a(hfdVar);
            hgb c2 = hfdVar.c();
            hvi b = huz.b(hfdVar, a);
            int i2 = ist.a;
            ffix ffixVar = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a2, iss.e);
            hlc.b(hfdVar, c2, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
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
