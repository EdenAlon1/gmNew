package com.google.android.apps.messaging.shared.datamodel.data.datatypes;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bdgk;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ConversationIdType implements Parcelable {
    public static final Parcelable.Creator<ConversationIdType> CREATOR = new bdgk();
    public final long a;

    public ConversationIdType(long j) {
        this.a = j == 0 ? -1L : j;
    }

    public final String a() {
        return String.valueOf(this.a);
    }

    public final boolean b() {
        return this.a < 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ConversationIdType) && this.a == ((ConversationIdType) obj).a;
    }

    public final int hashCode() {
        return (int) (this.a & 65535);
    }

    public final String toString() {
        return String.valueOf(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
    }
}
