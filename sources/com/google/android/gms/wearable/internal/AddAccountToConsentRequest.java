package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dibb;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AddAccountToConsentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AddAccountToConsentRequest> CREATOR = new dibb();
    public final String a;
    public final boolean b;

    public AddAccountToConsentRequest(String str, boolean z) {
        this.a = str;
        this.b = z;
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
