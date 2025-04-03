package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfxk;
import defpackage.eifo;
import defpackage.eigy;
import defpackage.eihn;
import defpackage.eyee;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class FileTransferInformation implements Parcelable, eihn {
    public static final Parcelable.Creator<FileTransferInformation> CREATOR = new eifo();

    public abstract FileInformation a();

    public abstract Optional b();

    public abstract Optional c();

    public abstract Optional d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.eihn
    public final void hz(eigy eigyVar) {
        eigyVar.d(this);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [android.os.Parcelable, java.lang.Object] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, a(), i, false);
        if (d().isPresent()) {
            dfxk.k(parcel, 2, d().get(), i, false);
        }
        if (b().isPresent()) {
            dfxk.f(parcel, 3, ((eyee) b().get()).I(), false);
        }
        if (c().isPresent()) {
            dfxk.f(parcel, 4, ((eyee) c().get()).I(), false);
        }
        dfxk.c(parcel, a);
    }
}
