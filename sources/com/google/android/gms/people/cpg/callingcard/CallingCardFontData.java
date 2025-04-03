package com.google.android.gms.people.cpg.callingcard;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhif;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CallingCardFontData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CallingCardFontData> CREATOR = new dhif();
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final int g;
    public final int h;
    public final float i;

    public CallingCardFontData(float f, float f2, float f3, float f4, float f5, float f6, int i, int i2, float f7) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = i;
        this.h = i2;
        this.i = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CallingCardFontData) {
            CallingCardFontData callingCardFontData = (CallingCardFontData) obj;
            if (this.a == callingCardFontData.a && this.b == callingCardFontData.b && this.c == callingCardFontData.c && this.d == callingCardFontData.d && this.e == callingCardFontData.e && this.f == callingCardFontData.f && this.g == callingCardFontData.g && this.h == callingCardFontData.h && this.i == callingCardFontData.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.d), Float.valueOf(this.e), Float.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), Float.valueOf(this.i)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        float f = this.a;
        int a = dfxk.a(parcel);
        dfxk.h(parcel, 1, f);
        dfxk.h(parcel, 2, this.b);
        dfxk.h(parcel, 3, this.c);
        dfxk.h(parcel, 4, this.d);
        dfxk.h(parcel, 5, this.e);
        dfxk.h(parcel, 6, this.f);
        dfxk.i(parcel, 7, this.g);
        dfxk.i(parcel, 8, this.h);
        dfxk.h(parcel, 9, this.i);
        dfxk.c(parcel, a);
    }
}
