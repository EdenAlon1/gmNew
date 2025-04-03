package defpackage;

import androidx.compose.ui.input.pointer.SuspendPointerInputElement;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fon extends ffkk implements ffjm {
    final /* synthetic */ hvi a;
    final /* synthetic */ idh b;
    final /* synthetic */ long c;
    final /* synthetic */ float d;
    final /* synthetic */ float e;
    final /* synthetic */ ffjm f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fon(hvi hviVar, idh idhVar, long j, float f, float f2, ffjm ffjmVar) {
        super(2);
        this.a = hviVar;
        this.b = idhVar;
        this.c = j;
        this.d = f;
        this.e = f2;
        this.f = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi a;
        hvi a2;
        hfd hfdVar = (hfd) obj;
        int intValue = ((Number) obj2).intValue();
        int i = intValue & 3;
        if (hfdVar.J(i != 2, intValue & 1)) {
            a = hxo.a(dee.a(hyc.a(this.a, this.e, r0, 0L, 0L, 24).a(hvi.e), C0001for.c(this.c, (fjc) hfdVar.e(fkd.a), this.d, hfdVar), r0), this.b);
            a2 = jjs.c(a, false, fol.a).a(new SuspendPointerInputElement(ffcu.a, null, null, new ilu(new fom(null)), 6));
            ffjm ffjmVar = this.f;
            int i2 = huo.a;
            ipn a3 = dyc.a(hum.a, true);
            int a4 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b = huz.b(hfdVar, a2);
            int i3 = ist.a;
            ffix ffixVar = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a3, iss.e);
            hlc.b(hfdVar, c, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a4))) {
                Integer valueOf = Integer.valueOf(a4);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar2);
            }
            hlc.b(hfdVar, b, iss.c);
            ffjmVar.a(hfdVar, 0);
            hfdVar.n();
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
