package defpackage;

import android.os.Bundle;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class dgps {
    final int a;
    final dhri b = new dhri();
    final Bundle c;

    public dgps(int i, Bundle bundle) {
        this.a = i;
        this.c = bundle;
    }

    final void a(dgpt dgptVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", a.c(dgptVar, this, "Failing ", " with "));
        }
        this.b.a(dgptVar);
    }

    public abstract void b(Bundle bundle);

    public final String toString() {
        return "Request { what=1 id=" + this.a + " oneWay=false}";
    }
}
