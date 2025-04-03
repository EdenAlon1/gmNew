package defpackage;

import com.google.android.rcs.client.messaging.data.GroupNotification;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djfy extends djga {
    public GroupNotification a;

    @Override // defpackage.djga
    public final djgb a() {
        GroupNotification groupNotification = this.a;
        if (groupNotification != null) {
            return new djfz(groupNotification);
        }
        throw new IllegalStateException("Missing required properties: groupNotification");
    }
}
