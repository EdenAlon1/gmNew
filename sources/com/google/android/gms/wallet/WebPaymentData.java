package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhxh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class WebPaymentData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WebPaymentData> CREATOR = new dhxh();
    String a;
    Bundle b;

    private WebPaymentData() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 2, this.a, false);
        dfxk.p(parcel, 3, this.b);
        dfxk.c(parcel, a);
    }

    public WebPaymentData(String str, Bundle bundle) {
        this.a = str;
        this.b = bundle;
    }
}
