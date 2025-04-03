package defpackage;

import android.graphics.Insets;
import android.view.WindowInsetsAnimation;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kwh {
    public final kpt a;
    public final kpt b;

    public kwh(kpt kptVar, kpt kptVar2) {
        this.a = kptVar;
        this.b = kptVar2;
    }

    public final String toString() {
        return "Bounds{lower=" + this.a + " upper=" + this.b + "}";
    }

    public kwh(WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        lowerBound = bounds.getLowerBound();
        this.a = kpt.e(lowerBound);
        upperBound = bounds.getUpperBound();
        this.b = kpt.e(upperBound);
    }
}
