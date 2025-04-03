package com.google.android.gms.mdh.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.mdh.internal.MdhFootprintListSafeParcelable;
import defpackage.dhef;
import defpackage.dhfz;
import defpackage.dhga;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class MdhFootprintListSafeParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MdhFootprintListSafeParcelable> CREATOR = new dhga(new dhef());
    public final List a;

    public MdhFootprintListSafeParcelable(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MdhFootprintListSafeParcelable) {
            return this.a.equals(((MdhFootprintListSafeParcelable) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return "MdhFootprintListSafeParcelable{mdhFootprints=" + String.valueOf(this.a) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dhga.a(this, parcel, new dhfz() { // from class: dhee
            @Override // defpackage.dhfz
            public final void a(SafeParcelable safeParcelable, Parcel parcel2) {
                List list = ((MdhFootprintListSafeParcelable) safeParcelable).a;
                int a = dfxk.a(parcel2);
                dfxk.n(parcel2, 1, list, false);
                dfxk.c(parcel2, a);
            }
        });
    }
}
