package com.google.android.gms.auth.firstparty.delegate;

import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.ManagedAuthOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dffy;
import defpackage.dfwv;
import defpackage.dfxk;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SetupAccountWorkflowRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SetupAccountWorkflowRequest> CREATOR = new dffy();
    public final int a;
    public final boolean b;
    public final boolean c;
    public final List d;
    public final Bundle e;
    public final AppDescription f;
    public final boolean g;
    public final String h;
    public final AccountAuthenticatorResponse i;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final ManagedAuthOptions t;
    public final String u;

    @Deprecated
    public final boolean v;
    public final int w;
    public final boolean x;

    public SetupAccountWorkflowRequest(int i, boolean z, boolean z2, List list, Bundle bundle, AppDescription appDescription, boolean z3, String str, AccountAuthenticatorResponse accountAuthenticatorResponse, boolean z4, boolean z5, String str2, String str3, String str4, String str5, boolean z6, boolean z7, boolean z8, boolean z9, ManagedAuthOptions managedAuthOptions, String str6, boolean z10, int i2, boolean z11) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = list;
        this.e = bundle;
        dfwv.n(appDescription);
        this.f = appDescription;
        this.g = z3;
        this.h = str;
        this.i = accountAuthenticatorResponse;
        this.j = z4;
        this.k = z5;
        this.l = str2;
        this.m = str3;
        this.n = str4;
        this.o = str5;
        this.p = z6;
        this.q = z7;
        this.r = z8;
        this.s = z9;
        this.t = managedAuthOptions;
        this.u = str6;
        this.v = z10;
        this.w = i2;
        this.x = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.d(parcel, 2, this.b);
        dfxk.d(parcel, 3, this.c);
        dfxk.D(parcel, 4, this.d);
        dfxk.p(parcel, 5, this.e);
        dfxk.k(parcel, 6, this.f, i, false);
        dfxk.d(parcel, 7, this.g);
        dfxk.m(parcel, 8, this.h, false);
        dfxk.k(parcel, 9, this.i, i, false);
        dfxk.d(parcel, 10, this.j);
        dfxk.d(parcel, 11, this.k);
        dfxk.m(parcel, 12, this.l, false);
        dfxk.m(parcel, 13, this.m, false);
        dfxk.m(parcel, 14, this.n, false);
        dfxk.m(parcel, 15, this.o, false);
        dfxk.d(parcel, 16, this.p);
        dfxk.d(parcel, 17, this.q);
        dfxk.d(parcel, 18, this.r);
        dfxk.d(parcel, 19, this.s);
        dfxk.k(parcel, 20, this.t, i, false);
        dfxk.m(parcel, 21, this.u, false);
        dfxk.d(parcel, 22, this.v);
        dfxk.i(parcel, 23, this.w);
        dfxk.d(parcel, 24, this.x);
        dfxk.c(parcel, a);
    }
}
