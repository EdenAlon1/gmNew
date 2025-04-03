package com.google.android.gms.telephonyspam;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhsb;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SettingsLookupResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SettingsLookupResult> CREATOR = new dhsb();
    public final int a;
    public final boolean b;

    public SettingsLookupResult(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.d(parcel, 2, this.b);
        dfxk.c(parcel, a);
    }
}
