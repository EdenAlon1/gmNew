package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.dfxk;
import defpackage.dktx;
import defpackage.eihb;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class RcsDestinationId implements Parcelable {
    public static final Parcelable.Creator<RcsDestinationId> CREATOR = new eihb();

    public abstract String a();

    public abstract int b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return String.format("RcsDestinationId {%s}", TextUtils.join(",", Arrays.asList(String.format("id=%s", dktx.PHONE_NUMBER.c(a())), String.format("type=%s", b() != 1 ? "SIP_URI" : "PHONE"))));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, b() - 1);
        dfxk.m(parcel, 2, a(), false);
        dfxk.c(parcel, a);
    }
}
