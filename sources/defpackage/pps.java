package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pps extends ppt {
    public final int a;

    public pps(int i) {
        this.a = i;
    }

    @Override // defpackage.ppt
    public final void a(String str, String str2) {
        if (this.a <= 3) {
            Log.d(str, str2);
        }
    }

    @Override // defpackage.ppt
    public final void b(String str, String str2, Throwable th) {
        if (this.a <= 3) {
            Log.d(str, str2, th);
        }
    }
}
