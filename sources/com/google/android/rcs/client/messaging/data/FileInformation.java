package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfxk;
import defpackage.eifh;
import defpackage.eifi;
import defpackage.eifj;
import defpackage.eihh;
import defpackage.eyee;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class FileInformation implements Parcelable {
    public static final Parcelable.Creator<FileInformation> CREATOR = new eifh();

    public abstract int a();

    public abstract ContentType b();

    public abstract eifi c();

    public abstract Instant d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract Optional e();

    @Deprecated
    public abstract Optional f();

    public abstract Optional g();

    public abstract Optional h();

    public abstract String i();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        if (h().isPresent()) {
            dfxk.m(parcel, 1, (String) h().get(), false);
        }
        dfxk.i(parcel, 2, a());
        dfxk.k(parcel, 3, b(), i, false);
        dfxk.m(parcel, 4, i(), false);
        eihh.d(parcel, 5, d());
        if (g().isPresent()) {
            dfxk.i(parcel, 6, ((eifj) g().get()).ordinal());
        }
        if (f().isPresent()) {
            dfxk.f(parcel, 7, ((eyee) f().get()).I(), false);
        }
        if (e().isPresent()) {
            dfxk.j(parcel, 8, ((Duration) e().get()).getSeconds());
        }
        dfxk.c(parcel, a);
    }
}
