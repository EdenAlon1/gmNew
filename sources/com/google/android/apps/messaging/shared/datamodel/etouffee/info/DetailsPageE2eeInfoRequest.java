package com.google.android.apps.messaging.shared.datamodel.etouffee.info;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import defpackage.capk;
import defpackage.eozn;
import defpackage.ffkd;
import defpackage.ffkj;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class DetailsPageE2eeInfoRequest implements Parcelable {
    public static final Parcelable.Creator<DetailsPageE2eeInfoRequest> CREATOR = new capk();
    public final String a;
    public final Conversation b;
    public final eozn c;

    public DetailsPageE2eeInfoRequest(String str, Conversation conversation, eozn eoznVar) {
        str.getClass();
        eoznVar.getClass();
        this.a = str;
        this.b = conversation;
        this.c = eoznVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DetailsPageE2eeInfoRequest)) {
            return false;
        }
        DetailsPageE2eeInfoRequest detailsPageE2eeInfoRequest = (DetailsPageE2eeInfoRequest) obj;
        return ffkj.e(this.a, detailsPageE2eeInfoRequest.a) && ffkj.e(this.b, detailsPageE2eeInfoRequest.b) && this.c == detailsPageE2eeInfoRequest.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Conversation conversation = this.b;
        return ((hashCode + (conversation == null ? 0 : conversation.hashCode())) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "DetailsPageE2eeInfoRequest(conversationId=" + this.a + ", conversation=" + this.b + ", reason=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c.name());
    }

    public /* synthetic */ DetailsPageE2eeInfoRequest(String str, Conversation conversation, eozn eoznVar, int i, ffkd ffkdVar) {
        this(str, (i & 2) != 0 ? null : conversation, eoznVar);
    }
}
