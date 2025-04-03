package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyst implements ffjm {
    final /* synthetic */ boolean a;

    public cyst(boolean z) {
        this.a = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dwho.a(dnaa.a(dmzz.aR, hfdVar), jii.a(R.string.edit_group_icon, hfdVar), ebs.k(hvi.e, true != this.a ? 15.0f : 22.0f), 0L, hfdVar, 0, 8);
        }
        return ffcu.a;
    }
}
