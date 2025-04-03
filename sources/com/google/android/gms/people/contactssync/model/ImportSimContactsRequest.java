package com.google.android.gms.people.contactssync.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhhx;
import defpackage.emwz;
import defpackage.emxa;
import defpackage.emxb;
import defpackage.enip;
import defpackage.ermn;
import java.util.Arrays;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ImportSimContactsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ImportSimContactsRequest> CREATOR = new dhhx();
    public final AccountWithDataSet a;
    private final Set b;

    public ImportSimContactsRequest(Set set, AccountWithDataSet accountWithDataSet) {
        this.b = enip.o(set);
        this.a = accountWithDataSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImportSimContactsRequest)) {
            return false;
        }
        ImportSimContactsRequest importSimContactsRequest = (ImportSimContactsRequest) obj;
        return emxb.a(this.b, importSimContactsRequest.b) && emxb.a(this.a, importSimContactsRequest.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.b("subscriptionIds", this.b);
        b.b("destinationAccount", this.a);
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.b;
        int a = dfxk.a(parcel);
        dfxk.v(parcel, 1, ermn.l(set));
        dfxk.k(parcel, 2, this.a, i, false);
        dfxk.c(parcel, a);
    }
}
