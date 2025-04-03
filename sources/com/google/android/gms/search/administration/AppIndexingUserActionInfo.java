package com.google.android.gms.search.administration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhmj;
import defpackage.euof;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AppIndexingUserActionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AppIndexingUserActionInfo> CREATOR = new dhmj();
    public String a;
    public long b;
    public euof c;

    public AppIndexingUserActionInfo() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, this.a, false);
        dfxk.j(parcel, 2, this.b);
        dfxk.k(parcel, 3, this.c, i, false);
        dfxk.c(parcel, a);
    }

    public AppIndexingUserActionInfo(String str, long j, euof euofVar) {
        this.a = str;
        this.b = j;
        this.c = euofVar;
    }
}
