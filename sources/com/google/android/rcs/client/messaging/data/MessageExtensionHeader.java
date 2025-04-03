package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.dfxk;
import defpackage.dktx;
import defpackage.eigq;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class MessageExtensionHeader implements Parcelable {
    public static final Parcelable.Creator<MessageExtensionHeader> CREATOR = new eigq();

    public abstract String a();

    public abstract String b();

    public abstract String c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return String.format("MessageExtensionHeader {%s}", TextUtils.join(",", Arrays.asList(String.format("namespace=%s", b()), String.format("name=%s", dktx.GENERIC.c(a())), String.format("value=%s", dktx.GENERIC.c(c())))));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, b(), false);
        dfxk.m(parcel, 2, a(), false);
        dfxk.m(parcel, 3, c(), false);
        dfxk.c(parcel, a);
    }
}
