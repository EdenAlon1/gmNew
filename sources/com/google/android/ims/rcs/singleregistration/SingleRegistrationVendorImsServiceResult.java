package com.google.android.ims.rcs.singleregistration;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dklw;
import defpackage.dvvu;
import defpackage.eyul;
import defpackage.eywy;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class SingleRegistrationVendorImsServiceResult extends dvvu {
    public static final Parcelable.Creator<SingleRegistrationVendorImsServiceResult> CREATOR = new dklw();
    public final eyul a;
    public final eywy b;

    public SingleRegistrationVendorImsServiceResult(int i) {
        this(i, eywy.FAILURE_REASON_UNKNOWN, eyul.IMS_EXCEPTION_CODE_ERROR_UNSPECIFIED);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.code);
        parcel.writeInt(this.b.j);
        parcel.writeInt(this.a.e);
    }

    public SingleRegistrationVendorImsServiceResult(int i, eyul eyulVar) {
        this(i, eywy.FAILURE_REASON_IMS_EXCEPTION, eyulVar);
    }

    public SingleRegistrationVendorImsServiceResult(int i, eywy eywyVar) {
        this(i, eywyVar, eyul.IMS_EXCEPTION_CODE_ERROR_UNSPECIFIED);
    }

    private SingleRegistrationVendorImsServiceResult(int i, eywy eywyVar, eyul eyulVar) {
        this.code = i;
        this.b = eywyVar;
        this.a = eyulVar;
    }

    public SingleRegistrationVendorImsServiceResult(Parcel parcel) {
        this.code = parcel.readInt();
        this.b = eywy.b(parcel.readInt());
        this.a = eyul.b(parcel.readInt());
    }
}
