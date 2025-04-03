package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xoj implements ffjm {
    final /* synthetic */ dmzz a;

    public xoj(dmzz dmzzVar) {
        this.a = dmzzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dwho.a(dnaa.a(this.a, hfdVar), jii.a(R.string.close_button_content_description, hfdVar), null, dooy.e(hfdVar).h, hfdVar, 0, 4);
        }
        return ffcu.a;
    }
}
