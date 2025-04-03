package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfbt;
import defpackage.dfwv;
import defpackage.dfxk;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class HintRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<HintRequest> CREATOR = new dfbt();
    final int a;
    public final CredentialPickerConfig b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final boolean f;
    public final String g;
    public final String h;

    public HintRequest(int i, CredentialPickerConfig credentialPickerConfig, boolean z, boolean z2, String[] strArr, boolean z3, String str, String str2) {
        this.a = i;
        dfwv.n(credentialPickerConfig);
        this.b = credentialPickerConfig;
        this.c = z;
        this.d = z2;
        dfwv.n(strArr);
        this.e = strArr;
        if (i < 2) {
            this.f = true;
            this.g = null;
            this.h = null;
        } else {
            this.f = z3;
            this.g = str;
            this.h = str2;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        CredentialPickerConfig credentialPickerConfig = this.b;
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, credentialPickerConfig, i, false);
        dfxk.d(parcel, 2, this.c);
        dfxk.d(parcel, 3, this.d);
        dfxk.C(parcel, 4, this.e);
        dfxk.d(parcel, 5, this.f);
        dfxk.m(parcel, 6, this.g, false);
        dfxk.m(parcel, 7, this.h, false);
        dfxk.i(parcel, 1000, this.a);
        dfxk.c(parcel, a);
    }
}
