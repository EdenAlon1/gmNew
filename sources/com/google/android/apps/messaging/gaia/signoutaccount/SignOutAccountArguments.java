package com.google.android.apps.messaging.gaia.signoutaccount;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.adoe;
import defpackage.eisx;
import defpackage.ffkj;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SignOutAccountArguments implements Parcelable {
    public static final Parcelable.Creator<SignOutAccountArguments> CREATOR = new adoe();
    public final eisx a;

    public SignOutAccountArguments(eisx eisxVar) {
        this.a = eisxVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SignOutAccountArguments) && ffkj.e(this.a, ((SignOutAccountArguments) obj).a);
    }

    public final int hashCode() {
        eisx eisxVar = this.a;
        if (eisxVar == null) {
            return 0;
        }
        return eisxVar.hashCode();
    }

    public final String toString() {
        return "SignOutAccountArguments(accountIdToSwitchTo=" + this.a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
    }
}
