package com.google.android.gms.kids;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwq;
import defpackage.dfxk;
import defpackage.dgst;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UriWithType extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UriWithType> CREATOR = new dgst();
    public Uri a;
    public int b;
    public String c;

    public UriWithType() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UriWithType) {
            UriWithType uriWithType = (UriWithType) obj;
            if (dfwq.a(this.a, uriWithType.a) && dfwq.a(Integer.valueOf(this.b), Integer.valueOf(uriWithType.b)) && dfwq.a(this.c, uriWithType.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, this.a, i, false);
        dfxk.i(parcel, 2, this.b);
        dfxk.m(parcel, 3, this.c, false);
        dfxk.c(parcel, a);
    }

    public UriWithType(Uri uri, int i, String str) {
        this.a = uri;
        this.b = i;
        this.c = str;
    }
}
