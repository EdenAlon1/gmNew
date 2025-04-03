package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egwn implements ffjn {
    final /* synthetic */ boolean a;

    public egwn(boolean z) {
        this.a = z;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((ebq) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else if (this.a) {
            hfdVar.v(1901381281);
            dwho.a(jie.a(R.drawable.quantum_gm_ic_photo_camera_vd_theme_24, hfdVar, 0), jii.a(R.string.pqe_edit_profile_picture_button_a11y_label, hfdVar), null, 0L, hfdVar, 0, 12);
            hfdVar.o();
        } else {
            hfdVar.v(1901634985);
            dwij.a(ebs.c(hvi.e, 0.75f), 0L, 0.0f, 0L, 0, 0.0f, hfdVar, 6, 62);
            hfdVar.o();
        }
        return ffcu.a;
    }
}
