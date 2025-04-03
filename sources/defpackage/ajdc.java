package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajdc extends ajdf {
    public final Intent a;

    public ajdc(Intent intent) {
        this.a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ajdc) && ffkj.e(this.a, ((ajdc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RecoverableError(recoverableIntent=" + this.a + ")";
    }
}
