package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duxb extends ContentObserver {
    final /* synthetic */ duxc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public duxb(duxc duxcVar, Handler handler) {
        super(handler);
        this.a = duxcVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        onChange(z, null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        duxc duxcVar = this.a;
        duxcVar.e = Boolean.valueOf(duxc.b(duxcVar.c));
        ((enrr) ((enrr) duxc.a.h()).h("com/google/android/libraries/inputmethod/keypresseffect/SystemHapticSettings$1", "onChange", 124, "SystemHapticSettings.java")).t("vibration enabled: %s", this.a.e);
    }
}
