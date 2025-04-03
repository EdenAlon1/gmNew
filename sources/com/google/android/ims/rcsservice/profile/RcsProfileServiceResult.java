package com.google.android.ims.rcsservice.profile;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dkoy;
import defpackage.dvvu;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class RcsProfileServiceResult extends dvvu {
    public static final Parcelable.Creator<RcsProfileServiceResult> CREATOR = new dkoy();
    private int a;
    private String b;

    public RcsProfileServiceResult(int i, String str) {
        this(0, "OK", i, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.code);
        parcel.writeString(this.description);
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
    }

    public RcsProfileServiceResult(int i, String str, int i2, String str2) {
        this.code = i;
        this.description = str;
        this.a = i2;
        this.b = str2;
    }

    public RcsProfileServiceResult(Parcel parcel) {
        this.a = -1;
        this.code = parcel.readInt();
        this.description = parcel.readString();
        this.a = parcel.readInt();
        this.b = parcel.readString();
    }
}
