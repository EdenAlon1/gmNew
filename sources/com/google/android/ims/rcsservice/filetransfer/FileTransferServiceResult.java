package com.google.android.ims.rcsservice.filetransfer;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dknx;
import defpackage.dvvu;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class FileTransferServiceResult extends dvvu {
    public static final Parcelable.Creator<FileTransferServiceResult> CREATOR = new dknx();
    public long a;
    private long b;
    private String c;
    private String d;

    public FileTransferServiceResult(long j, long j2, String str, int i, String str2, String str3) {
        this.code = i;
        this.a = j;
        this.b = j2;
        this.description = str2;
        this.c = str;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.code);
        parcel.writeString(this.description);
        parcel.writeLong(this.a);
        parcel.writeString(this.c);
        parcel.writeByte(this.d != null ? (byte) 1 : (byte) 0);
        parcel.writeString(this.d);
        parcel.writeLong(this.b);
    }

    public FileTransferServiceResult(long j, String str, int i, String str2) {
        this(j, -1L, str, i, str2, null);
    }

    public FileTransferServiceResult(long j, String str, int i, String str2, String str3) {
        this(j, -1L, str, i, str2, str3);
    }

    public FileTransferServiceResult(Parcel parcel) {
        this.code = parcel.readInt();
        this.description = parcel.readString();
        this.a = parcel.readLong();
        this.c = parcel.readString();
        byte readByte = parcel.readByte();
        String readString = parcel.readString();
        if (readByte > 0) {
            this.d = readString;
        }
        this.b = parcel.readLong();
    }
}
