package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kxs {
    public final Object a;

    public kxs(Object obj) {
        this.a = obj;
    }

    public static kxs a(int i, int i2, int i3) {
        return new kxs(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, i3));
    }
}
