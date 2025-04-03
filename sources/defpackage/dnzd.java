package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnzd implements ffjm {
    final /* synthetic */ cxj a;
    final /* synthetic */ hho b;

    public dnzd(cxj cxjVar, hho hhoVar) {
        this.a = cxjVar;
        this.b = hhoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dwho.a(dnaa.a(dmzz.bO, hfdVar), jii.a(true != dnzj.e(this.b) ? R.string.zippy_expand_description : R.string.zippy_collapse_description, hfdVar), hxz.a(ebs.k(hvi.e, 24.0f), ((Number) this.a.d()).floatValue()), 0L, hfdVar, 0, 8);
        }
        return ffcu.a;
    }
}
