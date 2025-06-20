package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import defpackage.dgjj;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum ErrorCode implements Parcelable {
    NOT_SUPPORTED_ERR(9),
    INVALID_STATE_ERR(11),
    SECURITY_ERR(18),
    NETWORK_ERR(19),
    ABORT_ERR(20),
    TIMEOUT_ERR(23),
    ENCODING_ERR(27),
    UNKNOWN_ERR(28),
    CONSTRAINT_ERR(29),
    DATA_ERR(30),
    NOT_ALLOWED_ERR(35),
    ATTESTATION_NOT_PRIVATE_ERR(36);

    public static final Parcelable.Creator<ErrorCode> CREATOR = new Parcelable.Creator() { // from class: dgji
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return ErrorCode.a(parcel.readInt());
            } catch (dgjj e) {
                throw new IllegalArgumentException(e);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new ErrorCode[i];
        }
    };
    public final int m;

    ErrorCode(int i) {
        this.m = i;
    }

    public static ErrorCode a(int i) {
        for (ErrorCode errorCode : values()) {
            if (i == errorCode.m) {
                return errorCode;
            }
        }
        throw new dgjj(i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.m);
    }
}
