package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.deww;
import defpackage.dewx;
import defpackage.dewy;
import defpackage.dfxk;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SuggestionResults extends AbstractSafeParcelable implements Iterable<deww> {
    public static final Parcelable.Creator<SuggestionResults> CREATOR = new dewy();
    final String a;
    public final String[] b;
    final String[] c;

    public SuggestionResults(String str, String[] strArr, String[] strArr2) {
        this.a = str;
        this.b = strArr;
        this.c = strArr2;
    }

    @Override // java.lang.Iterable
    public final Iterator<deww> iterator() {
        if (this.a != null) {
            return null;
        }
        return new dewx(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.C(parcel, 2, this.b);
        dfxk.C(parcel, 3, this.c);
        dfxk.c(parcel, a);
    }
}
