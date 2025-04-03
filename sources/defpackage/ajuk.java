package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajuk implements ffjm {
    public static final ajuk a = new ajuk();

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hvi h = ebs.h(hvi.e, jif.a(R.dimen.snippet_dismiss_icon_size, hfdVar));
            geq.a(jie.a(R.drawable.quantum_gm_ic_clear_gm_grey_24, hfdVar, 0), jii.a(R.string.snippet_dismiss_icon_content_description, hfdVar), h, gft.a(hfdVar).A, hfdVar, 0, 0);
        }
        return ffcu.a;
    }
}
