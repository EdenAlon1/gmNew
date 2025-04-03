package com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.appi;
import defpackage.bdhb;
import defpackage.bdur;
import defpackage.cfup;
import defpackage.cfvl;
import defpackage.emyl;
import defpackage.ffkd;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class RbmSuggestionData implements SuggestionData {
    public final ConversationSuggestion b;
    public final MessageIdType c;
    public final appi d;
    public static final emyl a = cfvl.x(223258190, "use_bugle_message_id_in_rbm_suggestion_data");
    public static final Parcelable.Creator<RbmSuggestionData> CREATOR = new bdur();

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ RbmSuggestionData(android.os.Parcel r3, defpackage.ffkd r4) {
        /*
            r2 = this;
            android.os.Parcelable$Creator<com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion> r4 = com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion.CREATOR
            java.lang.Object r4 = r4.createFromParcel(r3)
            r4.getClass()
            com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion r4 = (com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion) r4
            java.lang.String r3 = r3.readString()
            emyl r0 = com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData.a
            java.lang.Object r0 = r0.get()
            cfup r0 = (defpackage.cfup) r0
            java.lang.Object r0 = r0.e()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L2c
            java.lang.String r0 = "noMessageIdSentinel"
            boolean r0 = defpackage.ffkj.e(r0, r3)
            if (r0 == 0) goto L2d
        L2c:
            r3 = r1
        L2d:
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r3 = defpackage.bdhb.b(r3)
            r2.<init>(r4, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData.<init>(android.os.Parcel, ffkd):void");
    }

    @Override // defpackage.anzh
    public final String a() {
        return this.b.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_DISPLAY_TEXT);
    }

    @Override // defpackage.anzh
    public final String b() {
        throw new UnsupportedOperationException("Not used");
    }

    @Override // defpackage.anzh
    public final String c() {
        String b = x().b();
        b.getClass();
        return b;
    }

    @Override // defpackage.anzh
    public final String d() {
        return this.b.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.anzh
    public final String e() {
        throw new UnsupportedOperationException("Type not supported for RBM suggestions");
    }

    @Override // defpackage.anzh
    public final boolean f() {
        return this.b.getSuggestionType() == 0;
    }

    public final String g() {
        String rcsMessageId = this.b.getRcsMessageId();
        if (rcsMessageId != null) {
            return rcsMessageId;
        }
        throw new IllegalStateException("missing rcsMessageId");
    }

    public final String toString() {
        appi appiVar = this.d;
        if (appiVar == null) {
            String conversationSuggestion = this.b.toString();
            conversationSuggestion.getClass();
            return conversationSuggestion;
        }
        ConversationSuggestion conversationSuggestion2 = this.b;
        return appiVar.c() + " " + appiVar.d() + " " + conversationSuggestion2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.b.writeToParcel(parcel, i);
        if (((Boolean) ((cfup) a.get()).e()).booleanValue()) {
            parcel.writeString(this.c.b());
        } else {
            parcel.writeString("noMessageIdSentinel");
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData
    public final MessageIdType x() {
        if (((Boolean) ((cfup) a.get()).e()).booleanValue()) {
            MessageIdType messageIdType = this.c;
            if (!messageIdType.c()) {
                return messageIdType;
            }
        }
        return bdhb.b(this.b.getTargetRcsMessageId());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RbmSuggestionData(ConversationSuggestion conversationSuggestion, MessageIdType messageIdType) {
        this(conversationSuggestion, messageIdType, null, 4, null);
        conversationSuggestion.getClass();
        messageIdType.getClass();
    }

    public RbmSuggestionData(ConversationSuggestion conversationSuggestion, MessageIdType messageIdType, appi appiVar) {
        conversationSuggestion.getClass();
        messageIdType.getClass();
        this.b = conversationSuggestion;
        this.c = messageIdType;
        this.d = appiVar;
    }

    public /* synthetic */ RbmSuggestionData(ConversationSuggestion conversationSuggestion, MessageIdType messageIdType, appi appiVar, int i, ffkd ffkdVar) {
        this(conversationSuggestion, messageIdType, (i & 4) != 0 ? null : appiVar);
    }
}
