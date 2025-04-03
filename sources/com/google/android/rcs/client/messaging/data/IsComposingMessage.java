package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfxk;
import defpackage.eigb;
import defpackage.eigd;
import defpackage.eigy;
import defpackage.eihn;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class IsComposingMessage implements Parcelable, eihn {
    public static final Parcelable.Creator<IsComposingMessage> CREATOR = new eigb();

    public abstract eigd a();

    public abstract Optional b();

    public abstract Optional c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.eihn
    public final void hz(eigy eigyVar) {
        eigyVar.e(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, a().ordinal());
        dfxk.j(parcel, 2, ((Duration) b().get()).getSeconds());
        if (c().isPresent()) {
            dfxk.j(parcel, 3, ((Instant) c().get()).toEpochMilli());
        }
        dfxk.c(parcel, a);
    }
}
