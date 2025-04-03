package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dewz;
import defpackage.dfxk;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class UsageInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UsageInfo> CREATOR = new dewz();
    final DocumentId a;
    final long b;
    final int c;
    public final String d;
    final DocumentContents e;
    final boolean f;
    final int g;
    final int h;
    public final String i;

    public UsageInfo(DocumentId documentId, long j, int i, String str, DocumentContents documentContents, boolean z, int i2, int i3, String str2) {
        this.a = documentId;
        this.b = j;
        this.c = i;
        this.d = str;
        this.e = documentContents;
        this.f = z;
        this.g = i2;
        this.h = i3;
        this.i = str2;
    }

    public final String toString() {
        return String.format(Locale.US, "UsageInfo[documentId=%s, timestamp=%d, usageType=%d, status=%d]", this.a, Long.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.h));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, this.a, i, false);
        dfxk.j(parcel, 2, this.b);
        dfxk.i(parcel, 3, this.c);
        dfxk.m(parcel, 4, this.d, false);
        dfxk.k(parcel, 5, this.e, i, false);
        dfxk.d(parcel, 6, this.f);
        dfxk.i(parcel, 7, this.g);
        dfxk.i(parcel, 8, this.h);
        dfxk.m(parcel, 9, this.i, false);
        dfxk.c(parcel, a);
    }
}
