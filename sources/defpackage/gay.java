package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gay extends ffkk implements ffjn {
    final /* synthetic */ long a;
    final /* synthetic */ hho b;
    final /* synthetic */ ffsk c;
    final /* synthetic */ eey d;
    final /* synthetic */ ffmj e;
    final /* synthetic */ haq f;
    final /* synthetic */ ham g;
    final /* synthetic */ fzr h;
    final /* synthetic */ dmug i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gay(long j, hho hhoVar, ffsk ffskVar, eey eeyVar, ffmj ffmjVar, haq haqVar, dmug dmugVar, ham hamVar, fzr fzrVar) {
        super(3);
        this.a = j;
        this.b = hhoVar;
        this.c = ffskVar;
        this.d = eeyVar;
        this.e = ffmjVar;
        this.f = haqVar;
        this.i = dmugVar;
        this.g = hamVar;
        this.h = fzrVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi c;
        ffmj ffmjVar;
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        String b = hcb.b(R.string.m3c_date_picker_year_picker_pane_title, hfdVar);
        hve hveVar = hvi.e;
        boolean D = hfdVar.D(b);
        Object f = hfdVar.f();
        if (D || f == hfc.a) {
            f = new gav(b);
            hfdVar.y(f);
        }
        c = jjs.c(hveVar, false, (ffji) f);
        long j = this.a;
        hho hhoVar = this.b;
        ffsk ffskVar = this.c;
        eey eeyVar = this.d;
        ffmj ffmjVar2 = this.e;
        haq haqVar = this.f;
        dmug dmugVar = this.i;
        ham hamVar = this.g;
        fzr fzrVar = this.h;
        dxq dxqVar = dxu.c;
        int i = huo.a;
        ipn a = dyo.a(dxqVar, hum.j, hfdVar, 0);
        int a2 = hey.a(hfdVar);
        hgb c2 = hfdVar.c();
        hvi b2 = huz.b(hfdVar, c);
        int i2 = ist.a;
        ffix ffixVar = iss.a;
        hfdVar.M();
        hfdVar.x();
        if (hfdVar.H()) {
            hfdVar.j(ffixVar);
        } else {
            hfdVar.z();
        }
        hlc.b(hfdVar, a, iss.e);
        hlc.b(hfdVar, c2, iss.d);
        ffjm ffjmVar = iss.f;
        if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a2))) {
            Integer valueOf = Integer.valueOf(a2);
            hfdVar.y(valueOf);
            hfdVar.h(valueOf, ffjmVar);
        }
        hlc.b(hfdVar, b2, iss.c);
        hve hveVar2 = hvi.e;
        ebe ebeVar = gcy.a;
        hvi i3 = eba.i(ebs.g(hveVar2, 335.0f), 12.0f, 0.0f, 2);
        boolean D2 = hfdVar.D(hhoVar) | hfdVar.F(ffskVar) | hfdVar.D(eeyVar) | hfdVar.F(ffmjVar2) | hfdVar.D(haqVar);
        Object f2 = hfdVar.f();
        if (D2 || f2 == hfc.a) {
            f2 = new gax(ffskVar, hhoVar, eeyVar, ffmjVar2, haqVar);
            ffmjVar = ffmjVar2;
            hfdVar.y(f2);
        } else {
            ffmjVar = ffmjVar2;
        }
        gcy.k(i3, j, (ffji) f2, dmugVar, hamVar, ffmjVar, fzrVar, hfdVar, 6);
        gdo.a(null, 0.0f, fzrVar.x, hfdVar, 0, 3);
        hfdVar.n();
        return ffcu.a;
    }
}
