package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebxg implements erqj {
    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            return;
        }
        Log.e("OneGoogle", "Failed to grant account access to app");
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        Log.w("OneGoogle", "Failed to grant account access to app", th);
    }
}
