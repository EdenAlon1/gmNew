package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhyv;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AppTheme extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AppTheme> CREATOR = new dhyv();
    public final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    public AppTheme() {
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.a = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppTheme)) {
            return false;
        }
        AppTheme appTheme = (AppTheme) obj;
        return this.c == appTheme.c && this.b == appTheme.b && this.d == appTheme.d && this.e == appTheme.e && this.a == appTheme.a;
    }

    public final int hashCode() {
        return (((((((this.c * 31) + this.b) * 31) + this.d) * 31) + this.e) * 31) + this.a;
    }

    public final String toString() {
        return "AppTheme {, deviceExperience =" + this.a + ", colorTheme =" + this.b + "dynamicColor =" + this.c + ", screenItemsSize =" + this.e + ", screenAlignment =" + this.d + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.b;
        if (i2 == 0) {
            i2 = 1;
        }
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, i2);
        int i3 = this.c;
        if (i3 == 0) {
            i3 = 1;
        }
        dfxk.i(parcel, 2, i3);
        int i4 = this.d;
        dfxk.i(parcel, 3, i4 != 0 ? i4 : 1);
        int i5 = this.e;
        dfxk.i(parcel, 4, i5 != 0 ? i5 : 3);
        dfxk.i(parcel, 5, this.a);
        dfxk.c(parcel, a);
    }

    public AppTheme(int i, int i2, int i3, int i4, int i5) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.a = i5;
    }
}
