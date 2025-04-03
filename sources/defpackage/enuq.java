package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class enuq extends ento {
    private final String a;

    protected enuq(String str) {
        this.a = str;
    }

    @Override // defpackage.ento
    public String d() {
        return this.a;
    }

    @Override // defpackage.ento
    public void g(RuntimeException runtimeException, entl entlVar) {
        Log.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }
}
