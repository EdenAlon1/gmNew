package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtie implements ffjn {
    final /* synthetic */ dtii a;
    final /* synthetic */ boolean b;
    final /* synthetic */ dteh c;

    public dtie(dtii dtiiVar, boolean z, dteh dtehVar) {
        this.a = dtiiVar;
        this.b = z;
        this.c = dtehVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        long f;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.E(booleanValue) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dtii dtiiVar = this.a;
            dtib dtibVar = booleanValue ? new dtib(new dtif(dtiiVar), R.drawable.gs_pause_circle_fill1_vd_theme_24, R.string.pause_button_content_description) : new dtib(new dtig(dtiiVar), R.drawable.gs_play_circle_fill1_vd_theme_24, R.string.play_button_content_description);
            boolean z = this.b;
            hfdVar.v(-436051288);
            long j = dtfe.c(this.c) ? ibw.a : gft.a(hfdVar).s;
            ffix ffixVar = dtibVar.a;
            hfdVar.o();
            f = iby.f(ibw.d(r0), ibw.c(r0), ibw.b(r0), fix.a(hfdVar), ibw.f(gft.a(hfdVar).q));
            gem.a(ffixVar, null, z, null, gdz.d(0L, j, 0L, f, hfdVar, 5), hpx.d(1537769752, new dtid(dtibVar), hfdVar), hfdVar, 1572864, 42);
        }
        return ffcu.a;
    }
}
