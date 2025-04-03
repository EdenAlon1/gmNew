package com.google.android.gms.spatula.settings;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwq;
import defpackage.dfxk;
import defpackage.dhpp;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SpatulaSettingPreference extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SpatulaSettingPreference> CREATOR = new dhpp();
    public int a;
    public boolean b;

    public SpatulaSettingPreference() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SpatulaSettingPreference) {
            SpatulaSettingPreference spatulaSettingPreference = (SpatulaSettingPreference) obj;
            if (dfwq.a(Integer.valueOf(this.a), Integer.valueOf(spatulaSettingPreference.a)) && dfwq.a(Boolean.valueOf(this.b), Boolean.valueOf(spatulaSettingPreference.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Boolean.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.d(parcel, 2, this.b);
        dfxk.c(parcel, a);
    }

    public SpatulaSettingPreference(int i, boolean z) {
        this.a = i;
        this.b = z;
    }
}
