package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.devq;
import defpackage.dfwq;
import defpackage.dfxk;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new devq();
    public final int a;
    final Bundle b;

    public Feature(int i, Bundle bundle) {
        this.a = i;
        this.b = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Feature)) {
            return false;
        }
        Feature feature = (Feature) obj;
        if (this.a != feature.a) {
            return false;
        }
        Bundle bundle = this.b;
        if (bundle == null) {
            return feature.b == null;
        }
        if (feature.b == null || bundle.size() != feature.b.size()) {
            return false;
        }
        for (String str : this.b.keySet()) {
            if (!feature.b.containsKey(str) || !dfwq.a(this.b.getString(str), feature.b.getString(str))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(this.a));
        Bundle bundle = this.b;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                arrayList.add(str);
                String string = this.b.getString(str);
                if (string != null) {
                    arrayList.add(string);
                }
            }
        }
        return Arrays.hashCode(arrayList.toArray(new Object[0]));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.p(parcel, 2, this.b);
        dfxk.c(parcel, a);
    }
}
