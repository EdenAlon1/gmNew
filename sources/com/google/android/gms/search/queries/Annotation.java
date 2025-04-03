package com.google.android.gms.search.queries;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhoj;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class Annotation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Annotation> CREATOR = new dhoj();
    public final int a;
    public final byte[] b;

    public Annotation(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.f(parcel, 5, this.b, false);
        dfxk.c(parcel, a);
    }
}
