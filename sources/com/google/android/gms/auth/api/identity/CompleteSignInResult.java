package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfcq;
import defpackage.dfwv;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CompleteSignInResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CompleteSignInResult> CREATOR = new dfcq();
    public final SignInCredential a;

    public CompleteSignInResult(SignInCredential signInCredential) {
        dfwv.n(signInCredential);
        this.a = signInCredential;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SignInCredential signInCredential = this.a;
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, signInCredential, i, false);
        dfxk.c(parcel, a);
    }
}
