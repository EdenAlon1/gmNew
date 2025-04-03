package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.dfxk;
import defpackage.dktx;
import defpackage.eife;
import defpackage.eifg;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class Conversation implements Parcelable {
    public static final Parcelable.Creator<Conversation> CREATOR = new eife();

    public abstract RcsDestinationId a();

    public abstract String b();

    public abstract int c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return String.format("Conversation {%s}", TextUtils.join(",", Arrays.asList(String.format("id=%s", b()), String.format("destination=%s", dktx.PHONE_NUMBER.c(a())), String.format("type=%s", eifg.a(c())))));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, c() - 1);
        dfxk.m(parcel, 2, b(), false);
        dfxk.k(parcel, 3, a(), i, false);
        dfxk.c(parcel, a);
    }
}
