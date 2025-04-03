package com.google.android.gms.auth.proximity;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfin;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class FileParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FileParams> CREATOR = new dfin();
    public final String a;
    public final String b;
    public final ParcelFileDescriptor c;
    public final long d;

    public FileParams(String str, String str2, ParcelFileDescriptor parcelFileDescriptor, long j) {
        this.a = str;
        this.b = str2;
        this.c = parcelFileDescriptor;
        this.d = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.k(parcel, 3, this.c, i, false);
        dfxk.j(parcel, 4, this.d);
        dfxk.c(parcel, a);
    }
}
