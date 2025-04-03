package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.devj;
import defpackage.dfwq;
import defpackage.dfxk;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CorpusId extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CorpusId> CREATOR = new devj();
    public final String a;
    public final String b;
    final Bundle c;

    public CorpusId(String str, String str2, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CorpusId) {
            CorpusId corpusId = (CorpusId) obj;
            if (dfwq.a(this.a, corpusId.a) && dfwq.a(this.b, corpusId.b) && dfwq.a(this.c, corpusId.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        Bundle bundle = this.c;
        String bundle2 = bundle != null ? bundle.toString() : "null";
        String str = this.b;
        return "CorpusId[package=" + this.a + ", corpus=" + str + ", userHandle=" + bundle2 + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.p(parcel, 3, this.c);
        dfxk.c(parcel, a);
    }
}
