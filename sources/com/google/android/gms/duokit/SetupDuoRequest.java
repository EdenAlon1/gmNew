package com.google.android.gms.duokit;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dgfv;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SetupDuoRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SetupDuoRequest> CREATOR = new dgfv();
    public DuoId[] a;

    public SetupDuoRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SetupDuoRequest) {
            return Arrays.equals(this.a, ((SetupDuoRequest) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.E(parcel, 1, this.a, i);
        dfxk.c(parcel, a);
    }

    public SetupDuoRequest(DuoId[] duoIdArr) {
        this.a = duoIdArr;
    }
}
