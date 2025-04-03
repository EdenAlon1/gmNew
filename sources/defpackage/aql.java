package defpackage;

import android.os.Build;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aql {
    public final aqt a;

    public aql(aqt aqtVar) {
        this.a = aqtVar;
    }

    public final Surface a() {
        return this.a.a();
    }

    public final void b(int i) {
        this.a.h(i);
    }

    public final void c(String str) {
        this.a.g(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aql) {
            return this.a.equals(((aql) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public aql(Surface surface) {
        if (Build.VERSION.SDK_INT >= 33) {
            this.a = new aqs(surface);
        } else if (Build.VERSION.SDK_INT >= 28) {
            this.a = new aqr(surface);
        } else {
            this.a = new aqp(surface);
        }
    }
}
