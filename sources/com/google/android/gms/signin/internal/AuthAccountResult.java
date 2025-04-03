package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfrl;
import defpackage.dfxk;
import defpackage.dhpg;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AuthAccountResult extends AbstractSafeParcelable implements dfrl {
    public static final Parcelable.Creator<AuthAccountResult> CREATOR = new dhpg();
    final int a;
    public int b;
    public Intent c;

    public AuthAccountResult(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    @Override // defpackage.dfrl
    public final Status a() {
        return this.b == 0 ? Status.a : Status.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.i(parcel, 2, this.b);
        dfxk.k(parcel, 3, this.c, i, false);
        dfxk.c(parcel, a);
    }

    public AuthAccountResult() {
        this(2, 0, null);
    }
}
