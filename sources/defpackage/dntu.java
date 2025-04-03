package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dntu implements ffjm {
    public static final dntu a = new dntu();

    @Override // defpackage.ffjm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        hvi a2;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            a2 = dlsj.a(eba.d(hvi.e, 3.0f), jii.a(R.string.progress_bar_overlay_processing_spinner_content_description, hfdVar), true);
            dwij.a(a2, ibw.d, 2.0f, ibw.g, 0, 0.0f, hfdVar, 3456, 48);
        }
        return ffcu.a;
    }
}
