package com.google.android.gms.carrierauth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfkm;
import defpackage.dfwq;
import defpackage.dfxk;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class EAPAKARequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<EAPAKARequest> CREATOR = new dfkm();
    public final String a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final int e;

    public EAPAKARequest(String str, Integer num, Integer num2, Integer num3, int i) {
        this.a = str;
        this.b = num;
        this.c = num2;
        this.d = num3;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EAPAKARequest)) {
            return false;
        }
        EAPAKARequest eAPAKARequest = (EAPAKARequest) obj;
        return this.e == eAPAKARequest.e && dfwq.a(this.a, eAPAKARequest.a) && dfwq.a(this.b, eAPAKARequest.b) && dfwq.a(this.c, eAPAKARequest.c) && dfwq.a(this.d, eAPAKARequest.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Integer.valueOf(this.e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.x(parcel, 2, this.b);
        dfxk.x(parcel, 3, this.c);
        dfxk.x(parcel, 4, this.d);
        dfxk.i(parcel, 5, this.e);
        dfxk.c(parcel, a);
    }
}
