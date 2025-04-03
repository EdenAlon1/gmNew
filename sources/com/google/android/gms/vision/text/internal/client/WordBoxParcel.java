package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhwg;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class WordBoxParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WordBoxParcel> CREATOR = new dhwg();
    public final SymbolBoxParcel[] a;
    public final BoundingBoxParcel b;
    public final BoundingBoxParcel c;
    public final String d;
    public final float e;
    public final String f;
    public final boolean g;

    public WordBoxParcel(SymbolBoxParcel[] symbolBoxParcelArr, BoundingBoxParcel boundingBoxParcel, BoundingBoxParcel boundingBoxParcel2, String str, float f, String str2, boolean z) {
        this.a = symbolBoxParcelArr;
        this.b = boundingBoxParcel;
        this.c = boundingBoxParcel2;
        this.d = str;
        this.e = f;
        this.f = str2;
        this.g = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.E(parcel, 2, this.a, i);
        dfxk.k(parcel, 3, this.b, i, false);
        dfxk.k(parcel, 4, this.c, i, false);
        dfxk.m(parcel, 5, this.d, false);
        dfxk.h(parcel, 6, this.e);
        dfxk.m(parcel, 7, this.f, false);
        dfxk.d(parcel, 8, this.g);
        dfxk.c(parcel, a);
    }
}
