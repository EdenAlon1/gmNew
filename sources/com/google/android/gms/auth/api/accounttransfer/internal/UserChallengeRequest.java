package com.google.android.gms.auth.api.accounttransfer.internal;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfbp;
import defpackage.dfwv;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class UserChallengeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UserChallengeRequest> CREATOR = new dfbp();
    public final String a;
    public final PendingIntent b;

    public UserChallengeRequest(String str, PendingIntent pendingIntent) {
        dfwv.n(str);
        this.a = str;
        dfwv.n(pendingIntent);
        this.b = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, 1);
        dfxk.m(parcel, 2, this.a, false);
        dfxk.k(parcel, 3, this.b, i, false);
        dfxk.c(parcel, a);
    }
}
