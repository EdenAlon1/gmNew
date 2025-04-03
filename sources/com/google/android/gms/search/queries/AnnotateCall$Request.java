package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhoh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AnnotateCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AnnotateCall$Request> CREATOR = new dhoh();
    public final String a;
    public final String b;
    public final int[] c;
    public final Bundle d;

    public AnnotateCall$Request(String str, String str2, int[] iArr, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = iArr;
        this.d = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.v(parcel, 3, this.c);
        dfxk.p(parcel, 4, this.d);
        dfxk.c(parcel, a);
    }
}
