package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_GroupNotification;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.GroupEvent;
import com.google.android.rcs.client.messaging.data.GroupInformation;
import com.google.android.rcs.client.messaging.data.GroupNotification;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiek extends eify {
    private Conversation a;
    private Optional b = Optional.empty();
    private Optional c = Optional.empty();

    @Override // defpackage.eify
    public final GroupNotification a() {
        Conversation conversation = this.a;
        if (conversation != null) {
            return new AutoValue_GroupNotification(conversation, this.b, this.c);
        }
        throw new IllegalStateException("Missing required properties: conversation");
    }

    @Override // defpackage.eify
    public final void b(Conversation conversation) {
        if (conversation == null) {
            throw new NullPointerException("Null conversation");
        }
        this.a = conversation;
    }

    @Override // defpackage.eify
    public final void c(GroupEvent groupEvent) {
        this.c = Optional.of(groupEvent);
    }

    @Override // defpackage.eify
    public final void d(GroupInformation groupInformation) {
        this.b = Optional.of(groupInformation);
    }
}
