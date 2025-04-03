package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmuc implements ffjm {
    final /* synthetic */ ffix a;
    final /* synthetic */ gcz b;

    public dmuc(ffix ffixVar, gcz gczVar) {
        this.a = ffixVar;
        this.b = gczVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            String a = jii.a(R.string.datetime_picker_dialog_next_button, hfdVar);
            hfdVar.v(-228423938);
            final gcz gczVar = this.b;
            Object f = hfdVar.f();
            if (f == hfc.a) {
                ffix ffixVar = new ffix() { // from class: dmub
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        return Boolean.valueOf(gcz.this.d() != null);
                    }
                };
                hqg hqgVar = hkg.a;
                hgk hgkVar = new hgk(ffixVar, null);
                hfdVar.y(hgkVar);
                f = hgkVar;
            }
            hfdVar.o();
            dmuy.a(null, this.a, a, ((Boolean) ((hkx) f).a()).booleanValue(), hfdVar, 0, 1);
        }
        return ffcu.a;
    }
}
