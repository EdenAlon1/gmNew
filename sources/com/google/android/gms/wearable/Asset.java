package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwq;
import defpackage.dfwv;
import defpackage.dfxk;
import defpackage.dhyw;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class Asset extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Asset> CREATOR = new dhyw();
    public final byte[] a;
    public final String b;
    public final ParcelFileDescriptor c;
    public final Uri d;

    public Asset(byte[] bArr, String str, ParcelFileDescriptor parcelFileDescriptor, Uri uri) {
        this.a = bArr;
        this.b = str;
        this.c = parcelFileDescriptor;
        this.d = uri;
    }

    public static Asset a(ParcelFileDescriptor parcelFileDescriptor) {
        dfwv.n(parcelFileDescriptor);
        return new Asset(null, null, parcelFileDescriptor, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Asset)) {
            return false;
        }
        Asset asset = (Asset) obj;
        return Arrays.equals(this.a, asset.a) && dfwq.a(this.b, asset.b) && dfwq.a(this.c, asset.c) && dfwq.a(this.d, asset.d);
    }

    public final int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Asset[@");
        sb.append(Integer.toHexString(hashCode()));
        if (this.b == null) {
            sb.append(", nodigest");
        } else {
            sb.append(", ");
            sb.append(this.b);
        }
        if (this.a != null) {
            sb.append(", size=");
            byte[] bArr = this.a;
            dfwv.n(bArr);
            sb.append(bArr.length);
        }
        if (this.c != null) {
            sb.append(", fd=");
            sb.append(this.c);
        }
        if (this.d != null) {
            sb.append(", uri=");
            sb.append(this.d);
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dfwv.n(parcel);
        byte[] bArr = this.a;
        int a = dfxk.a(parcel);
        dfxk.f(parcel, 2, bArr, false);
        dfxk.m(parcel, 3, this.b, false);
        int i2 = i | 1;
        dfxk.k(parcel, 4, this.c, i2, false);
        dfxk.k(parcel, 5, this.d, i2, false);
        dfxk.c(parcel, a);
    }
}
