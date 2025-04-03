package defpackage;

import com.google.android.libraries.compose.ui.keyboard.detector.KeyboardDetectorViewInsetsListener;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsns extends dsnu {
    public final dsod a;
    public final KeyboardDetectorViewInsetsListener b;
    public final dsmn c;

    public dsns(dsod dsodVar, KeyboardDetectorViewInsetsListener keyboardDetectorViewInsetsListener, dsmn dsmnVar) {
        this.a = dsodVar;
        this.b = keyboardDetectorViewInsetsListener;
        this.c = dsmnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsns)) {
            return false;
        }
        dsns dsnsVar = (dsns) obj;
        return ffkj.e(this.a, dsnsVar.a) && ffkj.e(this.b, dsnsVar.b) && ffkj.e(this.c, dsnsVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Attached(detectorView=" + this.a + ", insetsListener=" + this.b + ", stateListener=" + this.c + ")";
    }
}
