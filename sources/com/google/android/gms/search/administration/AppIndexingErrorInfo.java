package com.google.android.gms.search.administration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.appindexing.internal.Thing;
import defpackage.dfxk;
import defpackage.dhmi;
import defpackage.euof;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AppIndexingErrorInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AppIndexingErrorInfo> CREATOR = new dhmi();
    public String a;
    public int b;
    public int c;
    public String d;
    public long e;
    public Thing f;
    public euof g;

    public AppIndexingErrorInfo() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, this.a, false);
        dfxk.i(parcel, 2, this.b);
        dfxk.i(parcel, 3, this.c);
        dfxk.m(parcel, 4, this.d, false);
        dfxk.j(parcel, 5, this.e);
        dfxk.k(parcel, 6, this.f, i, false);
        dfxk.k(parcel, 7, this.g, i, false);
        dfxk.c(parcel, a);
    }

    public AppIndexingErrorInfo(String str, int i, int i2, String str2, long j, Thing thing, euof euofVar) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = j;
        this.f = thing;
        this.g = euofVar;
    }
}
