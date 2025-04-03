package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dewm;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ResultClickInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ResultClickInfo> CREATOR = new dewm();
    final String a;
    final DocumentId[] b;
    final int c;

    public ResultClickInfo(String str, DocumentId[] documentIdArr, int i) {
        this.a = str;
        this.b = documentIdArr;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.E(parcel, 2, this.b, i);
        dfxk.i(parcel, 3, this.c);
        dfxk.c(parcel, a);
    }
}
