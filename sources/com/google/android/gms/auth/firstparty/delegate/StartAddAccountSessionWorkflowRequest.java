package com.google.android.gms.auth.firstparty.delegate;

import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dffz;
import defpackage.dfwv;
import defpackage.dfxk;
import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class StartAddAccountSessionWorkflowRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StartAddAccountSessionWorkflowRequest> CREATOR = new dffz();
    public final int a;
    public final AppDescription b;
    public final String c;
    public final AccountAuthenticatorResponse d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final String h;
    public final boolean i;
    public final boolean j;
    private final List k;
    private final Bundle l;

    public StartAddAccountSessionWorkflowRequest(int i, List list, Bundle bundle, AppDescription appDescription, String str, AccountAuthenticatorResponse accountAuthenticatorResponse, boolean z, boolean z2, String str2, String str3, boolean z3, boolean z4) {
        this.a = i;
        this.k = list;
        this.l = bundle;
        dfwv.n(appDescription);
        this.b = appDescription;
        this.c = str;
        this.d = accountAuthenticatorResponse;
        this.e = z;
        this.f = z2;
        this.g = str2;
        this.h = str3;
        this.i = z3;
        this.j = z4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        List list = this.k;
        dfxk.D(parcel, 2, list == null ? null : DesugarCollections.unmodifiableList(list));
        dfxk.p(parcel, 3, new Bundle(this.l));
        dfxk.k(parcel, 4, this.b, i, false);
        dfxk.m(parcel, 5, this.c, false);
        dfxk.k(parcel, 6, this.d, i, false);
        dfxk.d(parcel, 7, this.e);
        dfxk.d(parcel, 8, this.f);
        dfxk.m(parcel, 9, this.g, false);
        dfxk.m(parcel, 10, this.h, false);
        dfxk.d(parcel, 11, this.i);
        dfxk.d(parcel, 12, this.j);
        dfxk.c(parcel, a);
    }
}
