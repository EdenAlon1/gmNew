package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.mdh.MdhFootprintsReadResult;
import defpackage.dfwq;
import defpackage.dhdt;
import defpackage.dhfz;
import defpackage.dhga;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class MdhFootprintsReadResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MdhFootprintsReadResult> CREATOR = new dhga(new dhdt());
    public final List a;
    public final SyncStatus b;

    public MdhFootprintsReadResult(List list, SyncStatus syncStatus) {
        this.a = list;
        this.b = syncStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MdhFootprintsReadResult mdhFootprintsReadResult = (MdhFootprintsReadResult) obj;
            if (dfwq.a(this.a, mdhFootprintsReadResult.a) && dfwq.a(this.b, mdhFootprintsReadResult.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return String.format(Locale.ENGLISH, "MdhFootprintsReadResult{mdhFootprints=%s, syncStatus=%s}", this.a, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, final int i) {
        dhga.a(this, parcel, new dhfz() { // from class: dhds
            @Override // defpackage.dhfz
            public final void a(SafeParcelable safeParcelable, Parcel parcel2) {
                MdhFootprintsReadResult mdhFootprintsReadResult = (MdhFootprintsReadResult) safeParcelable;
                List list = mdhFootprintsReadResult.a;
                int a = dfxk.a(parcel2);
                dfxk.n(parcel2, 1, list, false);
                dfxk.k(parcel2, 2, mdhFootprintsReadResult.b, i, false);
                dfxk.c(parcel2, a);
            }
        });
    }
}
