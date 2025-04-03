package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.dfwq;
import defpackage.dfwv;
import defpackage.dfxk;
import defpackage.dhcc;
import defpackage.dhcg;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class Cap extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Cap> CREATOR = new dhcg();
    private static final String c = "Cap";
    public final int a;
    public final Float b;
    private final dhcc d;

    protected Cap(int i) {
        this(i, null, null);
    }

    final Cap a() {
        int i = this.a;
        if (i == 0) {
            return new ButtCap();
        }
        if (i == 1) {
            return new SquareCap();
        }
        if (i == 2) {
            return new RoundCap();
        }
        if (i != 3) {
            Log.w(c, a.h(i, "Unknown Cap type: "));
            return this;
        }
        dfwv.j(this.d != null, "bitmapDescriptor must not be null");
        dfwv.j(this.b != null, "bitmapRefWidth must not be null");
        return new CustomCap(this.d, this.b.floatValue());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cap)) {
            return false;
        }
        Cap cap = (Cap) obj;
        return this.a == cap.a && dfwq.a(this.d, cap.d) && dfwq.a(this.b, cap.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.d, this.b});
    }

    public String toString() {
        return "[Cap: type=" + this.a + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 2, i2);
        dhcc dhccVar = this.d;
        dfxk.u(parcel, 3, dhccVar == null ? null : dhccVar.a.asBinder());
        dfxk.t(parcel, 4, this.b);
        dfxk.c(parcel, a);
    }

    public Cap(int i, dhcc dhccVar, Float f) {
        boolean z;
        boolean z2 = f != null && f.floatValue() > 0.0f;
        if (i == 3) {
            z = dhccVar != null && z2;
            i = 3;
        } else {
            z = true;
        }
        dfwv.b(z, String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", Integer.valueOf(i), dhccVar, f));
        this.a = i;
        this.d = dhccVar;
        this.b = f;
    }
}
