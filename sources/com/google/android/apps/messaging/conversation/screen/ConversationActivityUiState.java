package com.google.android.apps.messaging.conversation.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import defpackage.bdgq;
import defpackage.emxe;
import defpackage.enip;
import defpackage.vjk;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ConversationActivityUiState implements Parcelable, Cloneable {
    public int b;
    public ConversationId c;

    @Deprecated
    Conversation d;
    public boolean e;
    public static final enip a = enip.r(3, 7);
    public static final Parcelable.Creator<ConversationActivityUiState> CREATOR = new vjk();

    /* compiled from: PG */
    public interface a {
        void C();
    }

    public ConversationActivityUiState(int i) {
        this.d = null;
        this.e = false;
        this.c = null;
        this.b = i;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ConversationActivityUiState clone() {
        try {
            return (ConversationActivityUiState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("ConversationActivityUiState: failed to clone(). Is there a mutable reference?", e);
        }
    }

    public final boolean b() {
        return this.b == 11;
    }

    public final boolean c() {
        int i = this.b;
        return (i == 0 || i == 1 || i == 11) ? false : true;
    }

    public final boolean d() {
        int i = this.b;
        return i == 1 || i == 11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.b == 0;
    }

    public final int f(int i) {
        int i2 = this.b;
        return i2 != 2 ? (i2 == 5 || i2 == 7 || i2 == 12 || i2 == 14) ? 3 : 1 : i == 2 ? 4 : 2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        ConversationId conversationId = this.c;
        parcel.writeString(conversationId == null ? null : conversationId.b());
        parcel.writeParcelable(this.d, i);
    }

    public ConversationActivityUiState(ConversationId conversationId, int i) {
        this.d = null;
        this.e = false;
        this.c = conversationId;
        this.b = i;
    }

    public ConversationActivityUiState(Parcel parcel) {
        this.d = null;
        this.e = false;
        this.b = parcel.readInt();
        this.c = null;
        String readString = parcel.readString();
        if (!emxe.c(readString)) {
            this.c = new BugleConversationId(bdgq.b(readString));
        }
        if (parcel.dataAvail() > 0) {
            this.d = (Conversation) parcel.readParcelable(getClass().getClassLoader());
        }
    }
}
