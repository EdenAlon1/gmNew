package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfxk;
import defpackage.eigv;
import defpackage.eigx;
import defpackage.eigy;
import defpackage.eihh;
import defpackage.eihn;
import defpackage.eyee;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class MessageReceipt implements Parcelable, eihn {
    public static final Parcelable.Creator<MessageReceipt> CREATOR = new eigv();

    public abstract eigx a();

    public abstract Instant b();

    public abstract Optional c();

    public abstract String d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract String e();

    @Override // defpackage.eihn
    public final void hz(eigy eigyVar) {
        eigyVar.g(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, a().ordinal());
        dfxk.m(parcel, 2, d(), false);
        eihh.d(parcel, 3, b());
        dfxk.m(parcel, 4, e(), false);
        if (c().isPresent()) {
            dfxk.f(parcel, 5, ((eyee) c().get()).I(), false);
        }
        dfxk.c(parcel, a);
    }
}
