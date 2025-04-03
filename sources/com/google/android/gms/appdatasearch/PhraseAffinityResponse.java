package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dewd;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PhraseAffinityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PhraseAffinityResponse> CREATOR = new dewd();
    final String a;
    final CorpusId[] b;
    final int[] c;

    public PhraseAffinityResponse(String str, CorpusId[] corpusIdArr, int[] iArr) {
        this.a = str;
        this.b = corpusIdArr;
        this.c = iArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.E(parcel, 2, this.b, i);
        dfxk.v(parcel, 3, this.c);
        dfxk.c(parcel, a);
    }
}
