package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dotj implements ffjm {
    public static final dotj a = new dotj();

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            doud.d(dmzz.dz, jii.a(R.string.transcription_in_progress_text, hfdVar), eba.e(hvi.e, 24.0f, 11.0f), hfdVar, 6, 0);
        }
        return ffcu.a;
    }
}
