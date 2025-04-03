package com.google.android.apps.messaging.shared.conversation.draft;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import defpackage.aygr;
import defpackage.cskw;
import defpackage.ffkd;
import defpackage.ffkj;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class EditingData implements Parcelable {
    public static final Parcelable.Creator<EditingData> CREATOR = new aygr();
    public final MessageId a;
    public final String b;
    public final MessageId c;

    public EditingData(MessageId messageId, String str, MessageId messageId2) {
        messageId.getClass();
        messageId2.getClass();
        this.a = messageId;
        this.b = str;
        this.c = messageId2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditingData)) {
            return false;
        }
        EditingData editingData = (EditingData) obj;
        return ffkj.e(this.a, editingData.a) && ffkj.e(this.b, editingData.b) && ffkj.e(this.c, editingData.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode();
    }

    public final String toString() {
        String str = this.b;
        CharSequence c = str != null ? cskw.c(str) : null;
        return "EditingData(editedMessageId=" + this.a + ", editMessageText=" + ((Object) c) + ", lastEditMessageId=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
    }

    public /* synthetic */ EditingData(MessageId messageId, String str, MessageId messageId2, int i, ffkd ffkdVar) {
        this(messageId, (i & 2) != 0 ? null : str, messageId2);
    }
}
