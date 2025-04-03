package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.dfxk;
import defpackage.dktx;
import defpackage.eifs;
import defpackage.engw;
import j$.util.Optional;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class GroupInformation implements Parcelable {
    public static final Parcelable.Creator<GroupInformation> CREATOR = new eifs();

    public abstract engw a();

    public abstract Optional b();

    public abstract Optional c();

    public abstract String d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract String e();

    public abstract String f();

    public final String toString() {
        return String.format("GroupInformation {%s}", TextUtils.join(",", Arrays.asList(String.format("id=%s", e()), String.format("subject=%s", dktx.MESSAGE_CONTENT.c(f())), String.format("conferenceUri=%s", dktx.URI.c(d())), String.format("groupMembers=[%s]", a()), String.format("groupRemoteCapabilities=%s", b()), String.format("subjectExtension=%s", c()))));
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.os.Parcelable, java.lang.Object] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, e(), false);
        dfxk.m(parcel, 2, f(), false);
        dfxk.m(parcel, 3, d(), false);
        dfxk.n(parcel, 4, a(), false);
        if (b().isPresent()) {
            dfxk.k(parcel, 5, b().get(), i, false);
        }
        if (c().isPresent()) {
            dfxk.k(parcel, 6, c().get(), i, false);
        }
        dfxk.c(parcel, a);
    }
}
