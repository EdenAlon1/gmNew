package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfrl;
import defpackage.dfxk;
import defpackage.dhpj;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RecordConsentByConsentResultResponse extends AbstractSafeParcelable implements dfrl {
    public static final Parcelable.Creator<RecordConsentByConsentResultResponse> CREATOR = new dhpj();
    public final List a;
    public final String b;

    public RecordConsentByConsentResultResponse(List list, String str) {
        this.a = list;
        this.b = str;
    }

    @Override // defpackage.dfrl
    public final Status a() {
        return this.b != null ? Status.a : Status.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = dfxk.a(parcel);
        dfxk.D(parcel, 1, list);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.c(parcel, a);
    }
}
