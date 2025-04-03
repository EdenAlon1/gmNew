package com.google.android.ims.rcsservice.contacts;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.dkhs;
import defpackage.dkht;
import defpackage.dkmx;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ImsCapabilities extends dkht implements Parcelable {
    public static final long k = TimeUnit.SECONDS.toMillis(5);
    public static final Parcelable.Creator<ImsCapabilities> CREATOR = new dkmx();

    public ImsCapabilities(long j) {
        super(j);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeLong(this.e);
        parcel.writeInt(this.g);
        parcel.writeStringList(this.i);
        Bundle bundle = new Bundle(this.h.size());
        for (Map.Entry entry : this.h.entrySet()) {
            bundle.putString(((dkhs) entry.getKey()).toString(), (String) entry.getValue());
        }
        parcel.writeBundle(bundle);
        parcel.writeLong(this.f);
        parcel.writeString(this.j.isEmpty() ? null : (String) this.j.get());
    }

    public ImsCapabilities(Parcel parcel) {
        this.c = parcel.readInt() == 1;
        this.e = parcel.readLong();
        this.g = parcel.readInt();
        parcel.readStringList(this.i);
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        readBundle.getClass();
        for (dkhs dkhsVar : dkhs.values()) {
            String string = readBundle.getString(dkhsVar.toString());
            if (!TextUtils.isEmpty(string)) {
                this.h.put(dkhsVar, string);
            }
        }
        long readLong = parcel.readLong();
        if (readLong > 0) {
            this.f = readLong;
        } else {
            this.f = k;
        }
        this.j = Optional.ofNullable(parcel.readString());
    }

    public ImsCapabilities(dkht dkhtVar) {
        super(dkhtVar);
    }
}
