package defpackage;

import androidx.window.extensions.embedding.ActivityStack;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class phj {
    public static final pgz a(ActivityStack activityStack) {
        List activities;
        boolean isEmpty;
        activities = activityStack.getActivities();
        activities.getClass();
        isEmpty = activityStack.isEmpty();
        return new pgz(activities, isEmpty, null);
    }
}
