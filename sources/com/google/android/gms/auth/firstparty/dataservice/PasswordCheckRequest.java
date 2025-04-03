package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dffm;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PasswordCheckRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PasswordCheckRequest> CREATOR = new dffm();
    final int a;
    final String b;
    final String c;
    final String d;
    final String e;
    final AppDescription f;

    public PasswordCheckRequest(int i, String str, String str2, String str3, String str4, AppDescription appDescription) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = appDescription;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.m(parcel, 3, this.c, false);
        dfxk.m(parcel, 4, this.d, false);
        dfxk.m(parcel, 5, this.e, false);
        dfxk.k(parcel, 6, this.f, i, false);
        dfxk.c(parcel, a);
    }
}
