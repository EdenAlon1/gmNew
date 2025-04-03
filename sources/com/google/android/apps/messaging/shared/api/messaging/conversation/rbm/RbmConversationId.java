package com.google.android.apps.messaging.shared.api.messaging.conversation.rbm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.protobuf.contrib.android.ProtoParsers;
import defpackage.amwj;
import defpackage.amwk;
import defpackage.amwl;
import defpackage.amxt;
import defpackage.bdgq;
import defpackage.emxf;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class RbmConversationId implements ConversationId {
    public static final Parcelable.Creator<ConversationId> CREATOR = new amxt();
    public final ConversationIdType a;
    public final BugleConversationId b;

    public RbmConversationId(ConversationIdType conversationIdType) {
        boolean z = false;
        if (conversationIdType != null && !conversationIdType.b()) {
            z = true;
        }
        emxf.a(z);
        this.a = conversationIdType;
        this.b = new BugleConversationId(conversationIdType);
    }

    public static RbmConversationId d(String str) {
        return new RbmConversationId(bdgq.b(str));
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId
    public final amwk a() {
        return amwk.RBM;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId
    public final String b() {
        return this.a.toString();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId
    public final byte[] c() {
        amwj amwjVar = (amwj) amwl.a.createBuilder();
        amwk amwkVar = amwk.RBM;
        amwjVar.copyOnWrite();
        ((amwl) amwjVar.instance).b = amwkVar.a();
        String conversationIdType = this.a.toString();
        amwjVar.copyOnWrite();
        amwl amwlVar = (amwl) amwjVar.instance;
        conversationIdType.getClass();
        amwlVar.c = conversationIdType;
        return ((amwl) amwjVar.build()).toByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof RbmConversationId) {
            return this.a.equals(((RbmConversationId) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        amwj amwjVar = (amwj) amwl.a.createBuilder();
        amwk amwkVar = amwk.RBM;
        amwjVar.copyOnWrite();
        ((amwl) amwjVar.instance).b = amwkVar.a();
        String conversationIdType = this.a.toString();
        amwjVar.copyOnWrite();
        amwl amwlVar = (amwl) amwjVar.instance;
        conversationIdType.getClass();
        amwlVar.c = conversationIdType;
        Bundle bundle = new Bundle();
        bundle.putParcelable("proto", new ProtoParsers.InternalDontUse(null, (amwl) amwjVar.build()));
        parcel.writeBundle(bundle);
    }
}
