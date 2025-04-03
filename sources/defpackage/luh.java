package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
final class luh implements lui {
    @Override // defpackage.lui
    public final void a(String str, String str2, Throwable th) {
        Log.d(str, luj.a(str2, th));
    }

    @Override // defpackage.lui
    public final void b(String str, String str2, Throwable th) {
        Log.e(str, luj.a(str2, th));
    }

    @Override // defpackage.lui
    public final void c(String str, String str2, Throwable th) {
        Log.w(str, luj.a(str2, th));
    }
}
