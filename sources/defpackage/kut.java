package defpackage;

import android.view.VelocityTracker;
import j$.util.DesugarCollections;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kut {
    public static final Map a = DesugarCollections.synchronizedMap(new WeakHashMap());

    public static kuu a(VelocityTracker velocityTracker) {
        return (kuu) a.get(velocityTracker);
    }
}
