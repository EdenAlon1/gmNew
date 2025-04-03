package com.google.android.gms.auth.api.accounttransfer.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfbm;
import defpackage.dfwv;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class NotifyCompletionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<NotifyCompletionRequest> CREATOR = new dfbm();
    public final String a;
    public final int b;

    public NotifyCompletionRequest(String str, int i) {
        dfwv.n(str);
        this.a = str;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, 1);
        dfxk.m(parcel, 2, this.a, false);
        dfxk.i(parcel, 3, this.b);
        dfxk.c(parcel, a);
    }
}
