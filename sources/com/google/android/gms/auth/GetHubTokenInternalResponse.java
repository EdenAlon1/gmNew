package com.google.android.gms.auth;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dezs;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetHubTokenInternalResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetHubTokenInternalResponse> CREATOR = new dezs();
    public final TokenData a;
    public final String b;
    public final Intent c;
    public final PendingIntent d;

    public GetHubTokenInternalResponse(TokenData tokenData, String str, Intent intent, PendingIntent pendingIntent) {
        this.a = tokenData;
        this.b = str;
        this.c = intent;
        this.d = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, this.a, i, false);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.k(parcel, 3, this.c, i, false);
        dfxk.k(parcel, 4, this.d, i, false);
        dfxk.c(parcel, a);
    }
}
