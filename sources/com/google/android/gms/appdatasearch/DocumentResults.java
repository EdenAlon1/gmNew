package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.devo;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class DocumentResults extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DocumentResults> CREATOR = new devo();
    final String a;
    final Bundle b;
    final Bundle c;
    final Bundle d;

    public DocumentResults(String str, Bundle bundle, Bundle bundle2, Bundle bundle3) {
        this.a = str;
        this.b = bundle;
        this.c = bundle2;
        this.d = bundle3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.p(parcel, 2, this.b);
        dfxk.p(parcel, 3, this.c);
        dfxk.p(parcel, 4, this.d);
        dfxk.c(parcel, a);
    }
}
