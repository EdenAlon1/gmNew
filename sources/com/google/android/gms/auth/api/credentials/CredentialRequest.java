package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfbs;
import defpackage.dfwv;
import defpackage.dfxk;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class CredentialRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CredentialRequest> CREATOR = new dfbs();
    final int a;
    public final boolean b;
    public final String[] c;
    public final CredentialPickerConfig d;
    public final CredentialPickerConfig e;
    public final boolean f;
    public final String g;
    public final String h;
    public final boolean i;

    public CredentialRequest(int i, boolean z, String[] strArr, CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2, boolean z2, String str, String str2, boolean z3) {
        this.a = i;
        this.b = z;
        dfwv.n(strArr);
        this.c = strArr;
        this.d = credentialPickerConfig == null ? new CredentialPickerConfig() : credentialPickerConfig;
        this.e = credentialPickerConfig2 == null ? new CredentialPickerConfig() : credentialPickerConfig2;
        if (i < 3) {
            this.f = true;
            this.g = null;
            this.h = null;
        } else {
            this.f = z2;
            this.g = str;
            this.h = str2;
        }
        this.i = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.b;
        int a = dfxk.a(parcel);
        dfxk.d(parcel, 1, z);
        dfxk.C(parcel, 2, this.c);
        dfxk.k(parcel, 3, this.d, i, false);
        dfxk.k(parcel, 4, this.e, i, false);
        dfxk.d(parcel, 5, this.f);
        dfxk.m(parcel, 6, this.g, false);
        dfxk.m(parcel, 7, this.h, false);
        dfxk.d(parcel, 8, this.i);
        dfxk.i(parcel, 1000, this.a);
        dfxk.c(parcel, a);
    }
}
