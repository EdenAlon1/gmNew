package com.google.android.apps.messaging.shared.api.messaging.conversation;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.amew;
import defpackage.amwk;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class InvalidConversationId implements ConversationId {
    public static final InvalidConversationId a = new InvalidConversationId();
    public static final Parcelable.Creator<ConversationId> CREATOR = new amew();

    private InvalidConversationId() {
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId
    public final amwk a() {
        return amwk.UNKNOWN;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId
    public final String b() {
        return "INVALID MAPI conversation id";
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId
    public final byte[] c() {
        throw new UnsupportedOperationException("InvalidConversationId should never be serialized.");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        throw new UnsupportedOperationException("InvalidConversationId should never be serialized.");
    }
}
