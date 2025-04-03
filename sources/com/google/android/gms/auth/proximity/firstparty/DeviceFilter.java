package com.google.android.gms.auth.proximity.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfir;
import defpackage.dfxk;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class DeviceFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceFilter> CREATOR = new dfir();
    final Boolean a;
    final Boolean b;
    final Boolean c;
    final List d;
    final Boolean e;
    final Boolean f;
    final List g;
    final List h;

    public DeviceFilter(Boolean bool, Boolean bool2, Boolean bool3, List list, Boolean bool4, Boolean bool5, List list2, List list3) {
        this.a = bool;
        this.b = bool2;
        this.c = bool3;
        this.d = list;
        this.e = bool4;
        this.f = bool5;
        this.g = list2;
        this.h = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DeviceFilter deviceFilter = (DeviceFilter) obj;
            Boolean bool = this.a;
            if (bool == null ? deviceFilter.a != null : !bool.equals(deviceFilter.a)) {
                return false;
            }
            Boolean bool2 = this.b;
            if (bool2 == null ? deviceFilter.b != null : !bool2.equals(deviceFilter.b)) {
                return false;
            }
            Boolean bool3 = this.c;
            if (bool3 == null ? deviceFilter.c != null : !bool3.equals(deviceFilter.c)) {
                return false;
            }
            Boolean bool4 = this.e;
            if (bool4 == null ? deviceFilter.e != null : !bool4.equals(deviceFilter.e)) {
                return false;
            }
            Boolean bool5 = this.f;
            if (bool5 == null ? deviceFilter.f != null : !bool5.equals(deviceFilter.f)) {
                return false;
            }
            if (!this.d.equals(deviceFilter.d)) {
                return false;
            }
            if (this.h.size() == deviceFilter.h.size() && this.h.containsAll(deviceFilter.h)) {
                if (this.g.size() == deviceFilter.g.size() && this.g.containsAll(deviceFilter.g)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.o(parcel, 1, this.a);
        dfxk.o(parcel, 2, this.b);
        dfxk.o(parcel, 3, this.c);
        dfxk.D(parcel, 4, this.d);
        dfxk.o(parcel, 5, this.e);
        dfxk.o(parcel, 6, this.f);
        dfxk.D(parcel, 7, this.g);
        dfxk.D(parcel, 8, this.h);
        dfxk.c(parcel, a);
    }
}
