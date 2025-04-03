package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhwe;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class LineBoxParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LineBoxParcel> CREATOR = new dhwe();
    public final WordBoxParcel[] a;
    public final BoundingBoxParcel b;
    public final BoundingBoxParcel c;
    public final BoundingBoxParcel d;
    public final String e;
    public final float f;
    public final String g;
    public final int h;
    public final boolean i;
    public final int j;
    public final int k;

    public LineBoxParcel(WordBoxParcel[] wordBoxParcelArr, BoundingBoxParcel boundingBoxParcel, BoundingBoxParcel boundingBoxParcel2, BoundingBoxParcel boundingBoxParcel3, String str, float f, String str2, int i, boolean z, int i2, int i3) {
        this.a = wordBoxParcelArr;
        this.b = boundingBoxParcel;
        this.c = boundingBoxParcel2;
        this.d = boundingBoxParcel3;
        this.e = str;
        this.f = f;
        this.g = str2;
        this.h = i;
        this.i = z;
        this.j = i2;
        this.k = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.E(parcel, 2, this.a, i);
        dfxk.k(parcel, 3, this.b, i, false);
        dfxk.k(parcel, 4, this.c, i, false);
        dfxk.k(parcel, 5, this.d, i, false);
        dfxk.m(parcel, 6, this.e, false);
        dfxk.h(parcel, 7, this.f);
        dfxk.m(parcel, 8, this.g, false);
        dfxk.i(parcel, 9, this.h);
        dfxk.d(parcel, 10, this.i);
        dfxk.i(parcel, 11, this.j);
        dfxk.i(parcel, 12, this.k);
        dfxk.c(parcel, a);
    }
}
