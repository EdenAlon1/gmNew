package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnui implements ffjm {
    final /* synthetic */ dnur a;

    public dnui(dnur dnurVar) {
        this.a = dnurVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dwho.a(dnaa.a(this.a.b, hfdVar), jii.a(R.string.progress_bar_overlay_retry_button_content_description, hfdVar), null, 0L, hfdVar, 0, 12);
        }
        return ffcu.a;
    }
}
