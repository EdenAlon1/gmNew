package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwv;
import defpackage.dfxk;
import defpackage.dhyu;
import defpackage.emyk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AppRecommendationsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AppRecommendationsRequest> CREATOR = new dhyu();
    public final String a;
    public final int b;
    public final int c;

    public AppRecommendationsRequest(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final String toString() {
        return "AppRecommendationsRequest{androidId='" + this.a + "', searchFlags=" + emyk.c(Integer.toBinaryString(this.b), 8) + ", limit=" + this.c + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dfwv.o(this.a, "Android id is required");
        if ((this.b & 3) == 0) {
            throw new IllegalArgumentException("Recommendation type is required");
        }
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, this.a, false);
        dfxk.i(parcel, 2, this.b);
        dfxk.i(parcel, 3, this.c);
        dfxk.c(parcel, a);
    }
}
