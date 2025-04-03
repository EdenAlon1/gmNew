package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dffh;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GoogleAccountSetupRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleAccountSetupRequest> CREATOR = new dffh();
    final int a;
    final Bundle b;
    boolean c;
    boolean d;
    boolean e;
    String f;
    String g;
    String h;
    String i;
    boolean j;
    boolean k;
    boolean l;
    String m;
    AppDescription n;
    AccountCredentials o;
    CaptchaSolution p;
    String q;
    String r;

    public GoogleAccountSetupRequest(int i, Bundle bundle, boolean z, boolean z2, boolean z3, String str, String str2, String str3, String str4, boolean z4, boolean z5, boolean z6, String str5, AppDescription appDescription, AccountCredentials accountCredentials, CaptchaSolution captchaSolution, String str6, String str7) {
        this.a = i;
        this.b = bundle;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = z4;
        this.k = z5;
        this.l = z6;
        this.m = str5;
        this.n = appDescription;
        this.o = accountCredentials;
        this.p = captchaSolution;
        this.q = str6;
        this.r = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.p(parcel, 2, this.b);
        dfxk.d(parcel, 3, this.c);
        dfxk.d(parcel, 4, this.d);
        dfxk.d(parcel, 5, this.e);
        dfxk.m(parcel, 6, this.f, false);
        dfxk.m(parcel, 7, this.g, false);
        dfxk.m(parcel, 8, this.h, false);
        dfxk.m(parcel, 9, this.i, false);
        dfxk.d(parcel, 10, this.j);
        dfxk.d(parcel, 11, this.k);
        dfxk.d(parcel, 12, this.l);
        dfxk.m(parcel, 13, this.m, false);
        dfxk.k(parcel, 14, this.n, i, false);
        dfxk.k(parcel, 15, this.o, i, false);
        dfxk.k(parcel, 16, this.p, i, false);
        dfxk.m(parcel, 17, this.q, false);
        dfxk.m(parcel, 18, this.r, false);
        dfxk.c(parcel, a);
    }

    public GoogleAccountSetupRequest() {
        this.a = 1;
        this.b = new Bundle();
    }
}
