package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dezt;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetHubTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetHubTokenRequest> CREATOR = new dezt();
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public GetHubTokenRequest(String str, String str2, String str3, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.m(parcel, 3, this.c, false);
        dfxk.i(parcel, 4, this.d);
        dfxk.c(parcel, a);
    }
}
