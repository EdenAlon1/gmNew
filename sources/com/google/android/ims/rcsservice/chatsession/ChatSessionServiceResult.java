package com.google.android.ims.rcsservice.chatsession;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dkmo;
import defpackage.dvvu;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ChatSessionServiceResult extends dvvu {
    public static final Parcelable.Creator<ChatSessionServiceResult> CREATOR = new dkmo();
    private long a;
    private String b;

    public ChatSessionServiceResult(int i) {
        this(0L, i);
    }

    @Override // defpackage.dvvu
    public final String toString() {
        return "Session ID: " + this.a + ", message ID: " + this.b + ", result: " + super.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.code);
        parcel.writeString(this.description);
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
    }

    public ChatSessionServiceResult(long j, int i) {
        this(j, i, (String) null);
    }

    public ChatSessionServiceResult(long j, int i, String str) {
        this(j, null, i, str);
    }

    public ChatSessionServiceResult(long j, String str, int i) {
        this(j, str, i, null);
    }

    public ChatSessionServiceResult(long j, String str, int i, String str2) {
        this.a = j;
        this.code = i;
        this.description = str2;
        this.b = str;
    }

    public ChatSessionServiceResult(Parcel parcel) {
        this.a = -1L;
        this.code = parcel.readInt();
        this.description = parcel.readString();
        this.a = parcel.readLong();
        this.b = parcel.readString();
    }
}
