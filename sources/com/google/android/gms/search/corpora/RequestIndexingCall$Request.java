package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhnj;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RequestIndexingCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RequestIndexingCall$Request> CREATOR = new dhnj();
    public String a;
    public String b;
    public long c;

    public RequestIndexingCall$Request() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, this.a, false);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.j(parcel, 3, this.c);
        dfxk.c(parcel, a);
    }

    public RequestIndexingCall$Request(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }
}
