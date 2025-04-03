package com.google.android.apps.messaging.shared.datamodel.data.datatypes;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bdgx;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class MessageIdType implements Parcelable {
    public static final Parcelable.Creator<MessageIdType> CREATOR = new bdgx();
    public final long a;

    public MessageIdType(long j) {
        this.a = j == 0 ? -1L : j;
    }

    public static long a(MessageIdType messageIdType) {
        if (messageIdType == null) {
            return -1L;
        }
        return messageIdType.a;
    }

    public final String b() {
        return String.valueOf(this.a);
    }

    public final boolean c() {
        return this.a < 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof MessageIdType) && this.a == ((MessageIdType) obj).a;
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
