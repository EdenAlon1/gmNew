package defpackage;

import com.google.android.gms.location.ActivityTransition;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgye implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        ActivityTransition activityTransition = (ActivityTransition) obj;
        ActivityTransition activityTransition2 = (ActivityTransition) obj2;
        dfwv.n(activityTransition);
        dfwv.n(activityTransition2);
        int i = activityTransition.a;
        int i2 = activityTransition2.a;
        if (i != i2) {
            return i < i2 ? -1 : 1;
        }
        int i3 = activityTransition.b;
        int i4 = activityTransition2.b;
        if (i3 == i4) {
            return 0;
        }
        return i3 < i4 ? -1 : 1;
    }
}
