package com.google.android.gms.kids;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwq;
import defpackage.dfxk;
import defpackage.dgsn;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class IndividualContactRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<IndividualContactRequest> CREATOR = new dgsn();
    public String a;
    public UriWithType[] b;

    public IndividualContactRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IndividualContactRequest) {
            IndividualContactRequest individualContactRequest = (IndividualContactRequest) obj;
            if (dfwq.a(this.a, individualContactRequest.a) && Arrays.equals(this.b, individualContactRequest.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(Arrays.hashCode(this.b))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, this.a, false);
        dfxk.E(parcel, 2, this.b, i);
        dfxk.c(parcel, a);
    }

    public IndividualContactRequest(String str, UriWithType[] uriWithTypeArr) {
        this.a = str;
        this.b = uriWithTypeArr;
    }
}
