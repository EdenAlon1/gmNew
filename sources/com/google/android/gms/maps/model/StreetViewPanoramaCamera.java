package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwp;
import defpackage.dfwv;
import defpackage.dfxk;
import defpackage.dhcy;
import defpackage.eobe;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class StreetViewPanoramaCamera extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaCamera> CREATOR = new dhcy();
    public final float a;
    public final float b;
    public final float c;

    public StreetViewPanoramaCamera(float f, float f2, float f3) {
        boolean z = false;
        if (f2 >= -90.0f && f2 <= 90.0f) {
            z = true;
        }
        dfwv.b(z, "Tilt needs to be between -90 and 90 inclusive: " + f2);
        this.a = ((double) f) <= eobe.a ? 0.0f : f;
        this.b = 0.0f + f2;
        this.c = (((double) f3) <= eobe.a ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
        new StreetViewPanoramaOrientation(f2, f3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaCamera)) {
            return false;
        }
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) obj;
        return Float.floatToIntBits(this.a) == Float.floatToIntBits(streetViewPanoramaCamera.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(streetViewPanoramaCamera.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(streetViewPanoramaCamera.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        dfwp.b("zoom", Float.valueOf(this.a), arrayList);
        dfwp.b("tilt", Float.valueOf(this.b), arrayList);
        dfwp.b("bearing", Float.valueOf(this.c), arrayList);
        return dfwp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.h(parcel, 2, this.a);
        dfxk.h(parcel, 3, this.b);
        dfxk.h(parcel, 4, this.c);
        dfxk.c(parcel, a);
    }
}
