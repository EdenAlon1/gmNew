package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwmh extends dwmz {
    final /* synthetic */ dwmi a;

    public dwmh(dwmi dwmiVar) {
        this.a = dwmiVar;
    }

    @Override // defpackage.dwmz
    public final void a(int i) {
        this.a.e(i);
    }

    @Override // defpackage.dwmz
    public final void b() {
        final dwmi dwmiVar = this.a;
        if (dwmiVar.c) {
            String str = dwmiVar.b;
            if (efaz.a(str, str) && dwmiVar.ai == 1 && dwmiVar.ah != null) {
                dwlz b = dwmiVar.b();
                if (b != null) {
                    ((ensz) dvsn.a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/gm/taptarget/FeatureHighlightController$1", "onTaskComplete", 80, "FeatureHighlightController.java")).q("FeatureHighlight task complete");
                    evvt evvtVar = evvt.POSITIVE_RESPONSE;
                    dvsm dvsmVar = (dvsm) b;
                    dvsn dvsnVar = dvsmVar.b;
                    dvsnVar.e.a(dvsnVar.b, evvtVar);
                    dvsmVar.a = true;
                }
                dwmiVar.p();
                dwmiVar.ah.f(new Runnable() { // from class: dwmg
                    @Override // java.lang.Runnable
                    public final void run() {
                        dwmi.this.f();
                    }
                });
            }
        }
    }

    @Override // defpackage.dwmz
    public final void c() {
        dwmi dwmiVar = this.a;
        long j = dwmiVar.d;
        if (j > 0) {
            dwmiVar.ah.postDelayed(dwmiVar.aj, j);
        }
    }

    @Override // defpackage.dwmz
    public final void d() {
        dwmi dwmiVar = this.a;
        if (dwmiVar.d > 0) {
            dwmiVar.ah.removeCallbacks(dwmiVar.aj);
        }
    }
}
