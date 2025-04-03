package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfcr;
import defpackage.dfwv;
import defpackage.dfxk;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class FetchVerifiedPhoneNumbersResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FetchVerifiedPhoneNumbersResult> CREATOR = new dfcr();
    public final List a;
    public final String b;
    public final int c;

    public FetchVerifiedPhoneNumbersResult(List list, String str, int i) {
        dfwv.n(list);
        this.a = list;
        this.b = str;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = dfxk.a(parcel);
        dfxk.D(parcel, 1, list);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.i(parcel, 3, this.c);
        dfxk.c(parcel, a);
    }
}
