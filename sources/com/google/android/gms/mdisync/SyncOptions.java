package com.google.android.gms.mdisync;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhel;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SyncOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SyncOptions> CREATOR = new dhel();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dfxk.c(parcel, dfxk.a(parcel));
    }
}
