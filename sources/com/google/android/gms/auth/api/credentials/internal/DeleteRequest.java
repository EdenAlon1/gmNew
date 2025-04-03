package com.google.android.gms.auth.api.credentials.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfbw;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DeleteRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeleteRequest> CREATOR = new dfbw();
    public final Credential a;

    public DeleteRequest(Credential credential) {
        this.a = credential;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Credential credential = this.a;
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, credential, i, false);
        dfxk.c(parcel, a);
    }
}
