package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.dfxk;
import defpackage.dktx;
import defpackage.eihh;
import defpackage.eihj;
import j$.time.Instant;
import j$.util.Optional;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class SubjectExtension implements Parcelable {
    public static final Parcelable.Creator<SubjectExtension> CREATOR = new eihj();

    public abstract Optional a();

    public abstract Optional b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return String.format("SubjectExtension {%s}", TextUtils.join(",", Arrays.asList(String.format("participant=%s", dktx.PHONE_NUMBER.c(a())), String.format("timestamp=%s", b()))));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [android.os.Parcelable, java.lang.Object] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        if (a().isPresent()) {
            dfxk.k(parcel, 1, a().get(), i, false);
        }
        if (b().isPresent()) {
            eihh.d(parcel, 2, (Instant) b().get());
        }
        dfxk.c(parcel, a);
    }
}
