package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfcn;
import defpackage.dfwv;
import defpackage.dfxk;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class BeginSignInResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInResult> CREATOR = new dfcn();
    public final PendingIntent a;

    public BeginSignInResult(PendingIntent pendingIntent) {
        dfwv.n(pendingIntent);
        this.a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PendingIntent pendingIntent = this.a;
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, pendingIntent, i, false);
        dfxk.c(parcel, a);
    }
}
