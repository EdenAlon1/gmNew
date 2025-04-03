package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aozi extends IllegalArgumentException {
    public aozi(MessageId messageId) {
        super(String.format("Message not found: %s", messageId.a()));
    }
}
