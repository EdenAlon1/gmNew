package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import defpackage.dgiq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum AttestationConveyancePreference implements Parcelable {
    NONE("none"),
    INDIRECT("indirect"),
    DIRECT("direct");

    public static final Parcelable.Creator<AttestationConveyancePreference> CREATOR = new Parcelable.Creator() { // from class: dgip
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return AttestationConveyancePreference.a(parcel.readString());
            } catch (dgiq e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new AttestationConveyancePreference[i];
        }
    };
    public final String d;

    AttestationConveyancePreference(String str) {
        this.d = str;
    }

    public static AttestationConveyancePreference a(String str) {
        for (AttestationConveyancePreference attestationConveyancePreference : values()) {
            if (str.equals(attestationConveyancePreference.d)) {
                return attestationConveyancePreference;
            }
        }
        throw new dgiq(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.d);
    }
}
