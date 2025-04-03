package com.google.android.gms.people.cpg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhid;
import defpackage.emxb;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class PreferenceDocumentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PreferenceDocumentRequest> CREATOR = new dhid();
    public final String a;
    public final int b;
    public final int c;

    public PreferenceDocumentRequest(String str, int i, int i2) {
        this.b = i;
        this.a = str;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            PreferenceDocumentRequest preferenceDocumentRequest = (PreferenceDocumentRequest) obj;
            if (this.b == preferenceDocumentRequest.b && this.c == preferenceDocumentRequest.c && emxb.a(this.a, preferenceDocumentRequest.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.i(parcel, 2, this.b);
        dfxk.i(parcel, 3, this.c);
        dfxk.c(parcel, a);
    }
}
