package com.google.android.gms.auth.firstparty.dataservice;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dffo;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PostSignInData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PostSignInData> CREATOR = new dffo();
    final int a;
    public final Intent b;
    public final PendingIntent c;

    public PostSignInData(int i, Intent intent, PendingIntent pendingIntent) {
        this.a = i;
        this.b = intent;
        this.c = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.k(parcel, 2, this.b, i, false);
        dfxk.k(parcel, 3, this.c, i, false);
        dfxk.c(parcel, a);
    }
}
