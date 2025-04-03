package com.google.android.gms.asterism;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.deyx;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SetAsterismConsentResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SetAsterismConsentResponse> CREATOR = new deyx();
    public final int a;
    public final String b;
    public final String c;

    public SetAsterismConsentResponse(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, i2);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.m(parcel, 3, this.c, false);
        dfxk.c(parcel, a);
    }
}
