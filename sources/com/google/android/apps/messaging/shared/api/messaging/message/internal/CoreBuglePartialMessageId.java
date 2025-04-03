package com.google.android.apps.messaging.shared.api.messaging.message.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.message.BugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.apsz;
import defpackage.bdhg;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class CoreBuglePartialMessageId implements BugleMessageId {
    public static final Parcelable.Creator<MessageId> CREATOR = new apsz();
    public final MessageIdType a;
    public final long b;
    private final String c;

    public CoreBuglePartialMessageId(MessageIdType messageIdType, long j) {
        this.a = messageIdType;
        this.b = j;
        this.c = String.format(Locale.US, "%s-%d", messageIdType, Long.valueOf(j));
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.MessageId
    public final String a() {
        return this.c;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.message.BugleMessageId
    public final long b() {
        return this.b;
    }

    @Override // defpackage.apah
    public final MessageIdType c() {
        return this.a;
    }

    @Override // defpackage.apbu
    public final bdhg d() {
        return bdhg.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.apbu
    public final bdhg e() {
        return bdhg.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof BugleMessageId)) {
            BugleMessageId bugleMessageId = (BugleMessageId) obj;
            if (this.a.equals(bugleMessageId.c()) && this.b == bugleMessageId.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeLong(this.b);
    }
}
