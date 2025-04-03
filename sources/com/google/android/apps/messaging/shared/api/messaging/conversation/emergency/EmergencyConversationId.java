package com.google.android.apps.messaging.shared.api.messaging.conversation.emergency;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.protobuf.contrib.android.ProtoParsers;
import defpackage.amrf;
import defpackage.amwj;
import defpackage.amwk;
import defpackage.amwl;
import defpackage.ffbz;
import defpackage.ffca;
import defpackage.ffix;
import defpackage.ffkj;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class EmergencyConversationId implements ConversationId {
    public static final Parcelable.Creator<ConversationId> CREATOR = new amrf();
    public final ConversationIdType a;
    private final ffbz b;

    public EmergencyConversationId(ConversationIdType conversationIdType) {
        conversationIdType.getClass();
        this.a = conversationIdType;
        this.b = ffca.a(new ffix() { // from class: amre
            @Override // defpackage.ffix
            public final Object invoke() {
                return new BugleConversationId(EmergencyConversationId.this.a);
            }
        });
        if (conversationIdType.b()) {
            throw new IllegalArgumentException("id cannot be null or empty");
        }
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId
    public final amwk a() {
        return amwk.EMERGENCY;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId
    public final String b() {
        String conversationIdType = this.a.toString();
        conversationIdType.getClass();
        return conversationIdType;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId
    public final byte[] c() {
        amwj amwjVar = (amwj) amwl.a.createBuilder();
        amwk amwkVar = amwk.EMERGENCY;
        amwjVar.copyOnWrite();
        ((amwl) amwjVar.instance).b = amwkVar.a();
        String conversationIdType = this.a.toString();
        amwjVar.copyOnWrite();
        amwl amwlVar = (amwl) amwjVar.instance;
        conversationIdType.getClass();
        amwlVar.c = conversationIdType;
        return ((amwl) amwjVar.build()).toByteArray();
    }

    public final BugleConversationId d() {
        return (BugleConversationId) this.b.a();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmergencyConversationId) {
            return ffkj.e(this.a, ((EmergencyConversationId) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String conversationIdType = this.a.toString();
        conversationIdType.getClass();
        return conversationIdType;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        amwj amwjVar = (amwj) amwl.a.createBuilder();
        amwk amwkVar = amwk.EMERGENCY;
        amwjVar.copyOnWrite();
        ((amwl) amwjVar.instance).b = amwkVar.a();
        String conversationIdType = this.a.toString();
        amwjVar.copyOnWrite();
        amwl amwlVar = (amwl) amwjVar.instance;
        conversationIdType.getClass();
        amwlVar.c = conversationIdType;
        Bundle bundle = new Bundle();
        bundle.putParcelable("proto", new ProtoParsers.InternalDontUse(null, amwjVar.build()));
        parcel.writeBundle(bundle);
    }
}
