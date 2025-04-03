package com.google.android.gms.location.reporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhay;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class UlrPrivateModeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UlrPrivateModeRequest> CREATOR = new dhay();
    public final String a;
    public final boolean b;

    public UlrPrivateModeRequest(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final String toString() {
        return "UlrPrivateModeRequest{Tag='" + this.a + ", privateMode=" + this.b + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.d(parcel, 2, this.b);
        dfxk.c(parcel, a);
    }
}
