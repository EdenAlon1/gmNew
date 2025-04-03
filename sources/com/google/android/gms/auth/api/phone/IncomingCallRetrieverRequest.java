package com.google.android.gms.auth.api.phone;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfdm;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class IncomingCallRetrieverRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<IncomingCallRetrieverRequest> CREATOR = new dfdm();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public IncomingCallRetrieverRequest(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.m(parcel, 3, this.c, false);
        dfxk.m(parcel, 4, this.d, false);
        dfxk.c(parcel, a);
    }
}
