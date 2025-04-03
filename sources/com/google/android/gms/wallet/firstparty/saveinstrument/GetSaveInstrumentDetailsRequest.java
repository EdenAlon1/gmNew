package com.google.android.gms.wallet.firstparty.saveinstrument;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhxy;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetSaveInstrumentDetailsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetSaveInstrumentDetailsRequest> CREATOR = new dhxy();
    String a;
    long b;

    private GetSaveInstrumentDetailsRequest() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, this.a, false);
        dfxk.j(parcel, 2, this.b);
        dfxk.c(parcel, a);
    }

    public GetSaveInstrumentDetailsRequest(String str, long j) {
        this.a = str;
        this.b = j;
    }
}
