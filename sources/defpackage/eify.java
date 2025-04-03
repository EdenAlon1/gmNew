package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_GroupNotification;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.GroupEvent;
import com.google.android.rcs.client.messaging.data.GroupInformation;
import com.google.android.rcs.client.messaging.data.GroupNotification;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eify {
    public abstract GroupNotification a();

    public abstract void b(Conversation conversation);

    public abstract void c(GroupEvent groupEvent);

    public abstract void d(GroupInformation groupInformation);

    public final GroupNotification e() {
        GroupNotification a = a();
        if (djag.n()) {
            AutoValue_GroupNotification autoValue_GroupNotification = (AutoValue_GroupNotification) a;
            boolean z = true;
            if (autoValue_GroupNotification.b.isPresent() && autoValue_GroupNotification.c.isPresent()) {
                z = false;
            }
            emxf.b(z, "Not allowed to have both GroupInformation and GroupEvent in GroupNotification.");
        }
        return a;
    }
}
