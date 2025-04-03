package com.google.android.gms.mdh.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.mdh.internal.ByteArraySafeParcelable;
import defpackage.dhed;
import defpackage.dhfz;
import defpackage.dhga;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ByteArraySafeParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ByteArraySafeParcelable> CREATOR = new dhga(new dhed());
    public final byte[] a;

    public ByteArraySafeParcelable(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dhga.a(this, parcel, new dhfz() { // from class: dhec
            @Override // defpackage.dhfz
            public final void a(SafeParcelable safeParcelable, Parcel parcel2) {
                byte[] bArr = ((ByteArraySafeParcelable) safeParcelable).a;
                int a = dfxk.a(parcel2);
                dfxk.f(parcel2, 1, bArr, false);
                dfxk.c(parcel2, a);
            }
        });
    }
}
