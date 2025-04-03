package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rhe implements rjz {
    final /* synthetic */ Context a;

    public rhe(Context context) {
        this.a = context;
    }

    @Override // defpackage.rjz
    public final /* bridge */ /* synthetic */ Object a() {
        return (ConnectivityManager) this.a.getSystemService("connectivity");
    }
}
