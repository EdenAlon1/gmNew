package com.google.android.ims.rcsservice.ims;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dilc;
import defpackage.dkon;
import defpackage.dkoo;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ImsRegistrationState implements Parcelable {
    public static final Parcelable.Creator<ImsRegistrationState> CREATOR = new dkon();
    public final dkoo a;
    public final dilc b;

    public ImsRegistrationState(dkoo dkooVar) {
        this.a = dkooVar;
        this.b = dilc.UNKNOWN;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImsRegistrationState)) {
            return false;
        }
        ImsRegistrationState imsRegistrationState = (ImsRegistrationState) obj;
        return imsRegistrationState.b == this.b && imsRegistrationState.a == this.a;
    }

    public final int hashCode() {
        return this.a.l ^ 47;
    }

    public final String toString() {
        dilc dilcVar = this.b;
        return "RegistrationState " + this.a.name() + ", reason " + String.valueOf(dilcVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.l);
        parcel.writeInt(this.b.ordinal());
    }

    public ImsRegistrationState(dkoo dkooVar, dilc dilcVar) {
        this.a = dkooVar;
        this.b = dilcVar;
    }

    public ImsRegistrationState(Parcel parcel) {
        this.a = dkoo.a(parcel.readInt());
        this.b = dilc.a(parcel.readInt());
    }
}
