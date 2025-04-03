package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kxt {
    final Object a;

    public kxt(Object obj) {
        this.a = obj;
    }

    public static kxt a(int i, int i2, int i3, int i4, boolean z) {
        return new kxt(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z));
    }
}
