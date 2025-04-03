package com.google.android.apps.messaging.multishare.chip;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import defpackage.ahup;
import defpackage.ahur;
import defpackage.aoku;
import defpackage.aolm;
import defpackage.ffkj;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ChipId extends Parcelable {

    /* compiled from: PG */
    public static final class Conversation implements ChipId {
        public static final Parcelable.Creator<Conversation> CREATOR = new ahup();
        public final ConversationId a;

        public Conversation(ConversationId conversationId) {
            conversationId.getClass();
            this.a = conversationId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Conversation) && ffkj.e(this.a, ((Conversation) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Conversation(conversationId=" + this.a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Bundle bundle = new Bundle();
            bundle.putParcelable("conversation_id", this.a);
            parcel.writeBundle(bundle);
        }
    }

    /* compiled from: PG */
    public static final class Identity implements ChipId {
        public static final Parcelable.Creator<Identity> CREATOR = new ahur();
        public final aoku a;

        public Identity(aoku aokuVar) {
            aokuVar.getClass();
            this.a = aokuVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Identity) && ffkj.e(this.a, ((Identity) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Identity(messagingIdentity=" + this.a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Bundle bundle = new Bundle();
            bundle.putParcelable("identity", aolm.f(this.a));
            parcel.writeBundle(bundle);
        }
    }

    /* compiled from: PG */
    public interface a {
        aolm I();
    }
}
