package com.google.android.ims.rcsservice.contacts;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dkmw;
import defpackage.dvvu;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ContactsServiceResult extends dvvu {
    public static final Parcelable.Creator<ContactsServiceResult> CREATOR = new dkmw();
    private long a;

    public ContactsServiceResult(int i, String str) {
        this(0L, i, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.code);
        parcel.writeString(this.description);
        parcel.writeLong(this.a);
    }

    public ContactsServiceResult(long j, int i, String str) {
        this.a = j;
        this.code = i;
        this.description = str;
    }

    public ContactsServiceResult(Parcel parcel) {
        this.a = 0L;
        this.code = parcel.readInt();
        this.description = parcel.readString();
        this.a = parcel.readLong();
    }
}
