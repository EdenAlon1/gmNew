package com.google.android.apps.messaging.conversation2.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import defpackage.alxk;
import defpackage.ffkj;
import defpackage.xdz;
import defpackage.xea;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class OpenConversation2Arguments implements Parcelable {
    public static final Parcelable.Creator<OpenConversation2Arguments> CREATOR = new xea();
    public final ConversationId a;
    public final MessageId b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final alxk f;
    private final Boolean g;

    public OpenConversation2Arguments(ConversationId conversationId, MessageId messageId, String str, Boolean bool, boolean z, boolean z2, alxk alxkVar) {
        conversationId.getClass();
        alxkVar.getClass();
        this.a = conversationId;
        this.b = messageId;
        this.c = str;
        this.g = bool;
        this.d = z;
        this.e = z2;
        this.f = alxkVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenConversation2Arguments)) {
            return false;
        }
        OpenConversation2Arguments openConversation2Arguments = (OpenConversation2Arguments) obj;
        return ffkj.e(this.a, openConversation2Arguments.a) && ffkj.e(this.b, openConversation2Arguments.b) && ffkj.e(this.c, openConversation2Arguments.c) && ffkj.e(this.g, openConversation2Arguments.g) && this.d == openConversation2Arguments.d && this.e == openConversation2Arguments.e && this.f == openConversation2Arguments.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        MessageId messageId = this.b;
        int hashCode2 = (hashCode + (messageId == null ? 0 : messageId.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.g;
        return ((((((hashCode3 + (bool != null ? bool.hashCode() : 0)) * 31) + xdz.a(this.d)) * 31) + xdz.a(this.e)) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "OpenConversation2Arguments(conversationId=" + this.a + ", messageId=" + this.b + ", searchQuery=" + this.c + ", canNavigateBack=" + this.g + ", renderAddPeople=" + this.d + ", isBubbleActivity=" + this.e + ", conversationOpenMode=" + this.f + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        Boolean bool = this.g;
        if (bool == null) {
            i2 = 0;
        } else {
            parcel.writeInt(1);
            i2 = bool.booleanValue();
        }
        parcel.writeInt(i2);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeString(this.f.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ OpenConversation2Arguments(com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r9, com.google.android.apps.messaging.shared.api.messaging.MessageId r10, java.lang.String r11, java.lang.Boolean r12, boolean r13, boolean r14, defpackage.alxk r15, int r16, defpackage.ffkd r17) {
        /*
            r8 = this;
            r0 = r16 & 64
            if (r0 == 0) goto L6
            alxk r15 = defpackage.alxk.FOR_DISPLAY
        L6:
            r7 = r15
            r15 = r16 & 32
            r0 = r16 & 16
            r1 = r16 & 8
            r2 = r16 & 4
            r3 = r16 & 2
            r4 = 0
            r5 = 1
            if (r15 == 0) goto L17
            r15 = r4
            goto L18
        L17:
            r15 = r5
        L18:
            if (r0 == 0) goto L1b
            goto L1c
        L1b:
            r4 = r5
        L1c:
            r6 = r15 & r14
            r5 = r4 & r13
            r13 = 0
            if (r1 == 0) goto L25
            r4 = r13
            goto L26
        L25:
            r4 = r12
        L26:
            if (r2 == 0) goto L29
            r11 = r13
        L29:
            if (r3 == 0) goto L2d
            r2 = r13
            goto L2e
        L2d:
            r2 = r10
        L2e:
            r0 = r8
            r1 = r9
            r3 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.conversation2.api.OpenConversation2Arguments.<init>(com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId, com.google.android.apps.messaging.shared.api.messaging.MessageId, java.lang.String, java.lang.Boolean, boolean, boolean, alxk, int, ffkd):void");
    }
}
