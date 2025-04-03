package com.google.android.gms.telephonyspam;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhrw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class LookupSpamStatusOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LookupSpamStatusOptions> CREATOR = new dhrw();
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final boolean f;

    public LookupSpamStatusOptions(int i, String str, String str2, boolean z, String str3, boolean z2) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = str3;
        this.f = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.m(parcel, 3, this.c, false);
        dfxk.d(parcel, 4, this.d);
        dfxk.m(parcel, 5, this.e, false);
        dfxk.d(parcel, 6, this.f);
        dfxk.c(parcel, a);
    }
}
