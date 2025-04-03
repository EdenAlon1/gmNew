package defpackage;

import j$.util.Map;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egvx implements ffjm {
    final /* synthetic */ egvy a;

    public egvx(egvy egvyVar) {
        this.a = egvyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        egub egubVar;
        egse egseVar;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            egvy egvyVar = this.a;
            hfdVar.v(1295943903);
            boolean F = hfdVar.F(this.a);
            egvy egvyVar2 = this.a;
            Object f = hfdVar.f();
            if (F || f == hfc.a) {
                f = new egvw(egvyVar2, null);
                hfdVar.y(f);
            }
            hfdVar.o();
            hgs.g(egvyVar.a, (ffjm) f, hfdVar);
            Map map = egvz.a;
            String str = (String) Map.EL.getOrDefault(egvz.a, this.a.c, "unkn");
            egvy egvyVar3 = this.a;
            egub egubVar2 = egvyVar3.f;
            if (egubVar2 == null) {
                ffkj.c("viewModel");
                egubVar = null;
            } else {
                egubVar = egubVar2;
            }
            egvy egvyVar4 = this.a;
            dvyu b = egvyVar4.b();
            egse egseVar2 = egvyVar4.h;
            if (egseVar2 == null) {
                ffkj.c("helpAndFeedbackLauncher");
                egseVar = null;
            } else {
                egseVar = egseVar2;
            }
            egxj.f(str, egvyVar3.b, egvyVar3.a, egubVar, b, egseVar, null, hfdVar, 4096);
        }
        return ffcu.a;
    }
}
