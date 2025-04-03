package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpwx implements ffjm {
    final /* synthetic */ float a;

    public dpwx(float f) {
        this.a = f;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            geq.a(jie.a(R.drawable.gs_visual_effects_wght600_vd_theme_24, hfdVar, 0), jii.a(R.string.camera_effect_toggle_show_content_description, hfdVar), hxz.a(ebs.k(hvi.e, 24.0f), this.a), 0L, hfdVar, 0, 8);
        }
        return ffcu.a;
    }
}
