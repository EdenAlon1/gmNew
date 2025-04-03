package com.google.android.gms.mdisync.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhes;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SyncResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SyncResult> CREATOR = new dhes();
    public final byte[] a;

    public SyncResult(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int a = dfxk.a(parcel);
        dfxk.f(parcel, 1, bArr, false);
        dfxk.c(parcel, a);
    }
}
