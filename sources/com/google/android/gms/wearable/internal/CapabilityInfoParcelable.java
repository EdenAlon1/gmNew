package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwv;
import defpackage.dfxk;
import defpackage.dibm;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CapabilityInfoParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CapabilityInfoParcelable> CREATOR = new dibm();
    public final String a;
    public final List b;

    public CapabilityInfoParcelable(String str, List list) {
        this.a = str;
        this.b = list;
        dfwv.n(str);
        dfwv.n(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CapabilityInfoParcelable capabilityInfoParcelable = (CapabilityInfoParcelable) obj;
        String str = this.a;
        if (str == null ? capabilityInfoParcelable.a != null : !str.equals(capabilityInfoParcelable.a)) {
            return false;
        }
        List list = this.b;
        return list == null ? capabilityInfoParcelable.b == null : list.equals(capabilityInfoParcelable.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str != null ? str.hashCode() : 0;
        List list = this.b;
        return ((hashCode + 31) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "CapabilityInfo{" + this.a + ", " + String.valueOf(this.b) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 2, str, false);
        dfxk.n(parcel, 3, this.b, false);
        dfxk.c(parcel, a);
    }
}
