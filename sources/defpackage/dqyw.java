package defpackage;

import androidx.compose.ui.platform.ComposeView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqyw implements ffjm {
    final /* synthetic */ ComposeView a;
    final /* synthetic */ boolean b;
    final /* synthetic */ ffix c;
    final /* synthetic */ dqyz d;

    public dqyw(ComposeView composeView, boolean z, ffix ffixVar, dqyz dqyzVar) {
        this.a = composeView;
        this.b = z;
        this.c = ffixVar;
        this.d = dqyzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dopp.a(null, null, null, null, null, null, null, null, null, false, null, null, hpx.d(-666926481, new dqyv(this.a, this.b, this.c, this.d), hfdVar), hfdVar, 0, 384, 4095);
        }
        return ffcu.a;
    }
}
