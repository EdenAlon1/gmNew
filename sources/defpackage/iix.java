package defpackage;

import android.view.KeyEvent;

/* compiled from: PG */
@ffiv
/* loaded from: classes.dex */
public final class iix {
    public final KeyEvent a;

    public final boolean equals(Object obj) {
        return (obj instanceof iix) && ffkj.e(this.a, ((iix) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.a + ')';
    }
}
