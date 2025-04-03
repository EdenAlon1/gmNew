package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhwq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class InstrumentInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<InstrumentInfo> CREATOR = new dhwq();
    public String a;
    public String b;
    private int c;

    private InstrumentInfo() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 2, this.a, false);
        dfxk.m(parcel, 3, this.b, false);
        int i2 = this.c;
        dfxk.i(parcel, 4, (i2 == 1 || i2 == 2 || i2 == 3) ? i2 : 0);
        dfxk.c(parcel, a);
    }

    public InstrumentInfo(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }
}
