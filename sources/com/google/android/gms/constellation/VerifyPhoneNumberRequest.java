package com.google.android.gms.constellation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dgac;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class VerifyPhoneNumberRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<VerifyPhoneNumberRequest> CREATOR = new dgac();
    public final String a;
    public final long b;
    public final IdTokenRequest c;
    public final Bundle d;
    public final List e;
    public final boolean f;
    public final int g;
    public final List h;

    public VerifyPhoneNumberRequest(String str, long j, IdTokenRequest idTokenRequest, Bundle bundle, List list, boolean z, int i, List list2) {
        this.a = str;
        this.b = j;
        this.c = idTokenRequest;
        this.d = bundle;
        this.e = list;
        this.f = z;
        this.g = i;
        this.h = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.j(parcel, 2, this.b);
        dfxk.k(parcel, 3, this.c, i, false);
        dfxk.p(parcel, 4, this.d);
        dfxk.n(parcel, 5, this.e, false);
        dfxk.d(parcel, 6, this.f);
        dfxk.i(parcel, 7, this.g);
        dfxk.w(parcel, 8, this.h);
        dfxk.c(parcel, a);
    }
}
