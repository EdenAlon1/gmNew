package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.didd;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class FastPairAccountKeyParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FastPairAccountKeyParcelable> CREATOR = new didd();
    private final byte[] a;

    public FastPairAccountKeyParcelable(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int a = dfxk.a(parcel);
        dfxk.f(parcel, 1, (byte[]) bArr.clone(), false);
        dfxk.c(parcel, a);
    }
}
