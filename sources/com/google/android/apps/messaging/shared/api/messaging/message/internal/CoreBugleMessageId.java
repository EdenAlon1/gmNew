package com.google.android.apps.messaging.shared.api.messaging.message.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.message.BugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.apsy;
import defpackage.bdhb;
import defpackage.bdhg;
import defpackage.emxf;
import defpackage.ersy;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class CoreBugleMessageId implements BugleMessageId {
    public static final Parcelable.Creator<MessageId> CREATOR = new apsy();
    public final MessageIdType a;
    private final long b;
    private final bdhg c;
    private final bdhg d;

    public CoreBugleMessageId(MessageIdType messageIdType, long j) {
        emxf.a(!messageIdType.equals(bdhb.a));
        this.a = messageIdType;
        this.b = j;
        bdhg bdhgVar = bdhg.a;
        this.c = bdhgVar;
        this.d = bdhgVar;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.MessageId
    public final String a() {
        return this.a.b();
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
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.apbu
    public final bdhg e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof CoreBugleMessageId) {
            return this.a.equals(((CoreBugleMessageId) obj).a);
        }
        if (obj instanceof CoreBuglePartialMessageId) {
            CoreBuglePartialMessageId coreBuglePartialMessageId = (CoreBuglePartialMessageId) obj;
            if (this.a.equals(coreBuglePartialMessageId.a) && this.b == coreBuglePartialMessageId.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        return ersy.a("bugle.enable_improve_media_bubble_logs", "bugle") ? this.a.toString() : super.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeLong(this.b);
        parcel.writeString(this.c.b);
        parcel.writeString(this.d.b);
    }

    public CoreBugleMessageId(MessageIdType messageIdType, long j, bdhg bdhgVar, bdhg bdhgVar2) {
        emxf.a(!messageIdType.equals(bdhb.a));
        this.a = messageIdType;
        this.b = j;
        this.c = bdhgVar;
        this.d = bdhgVar2;
    }

    public CoreBugleMessageId(String str) {
        this.a = bdhb.b(str);
        this.b = -1L;
        bdhg bdhgVar = bdhg.a;
        this.c = bdhgVar;
        this.d = bdhgVar;
    }
}
