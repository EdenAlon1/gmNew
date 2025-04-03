package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.devu;
import defpackage.dfwq;
import defpackage.dfxk;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GlobalSearchApplication extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GlobalSearchApplication> CREATOR = new devu();
    public final GlobalSearchApplicationInfo a;
    final GlobalSearchAppCorpusFeatures[] b;
    public final boolean c;

    public GlobalSearchApplication(GlobalSearchApplicationInfo globalSearchApplicationInfo, GlobalSearchAppCorpusFeatures[] globalSearchAppCorpusFeaturesArr, boolean z) {
        this.a = globalSearchApplicationInfo;
        this.b = globalSearchAppCorpusFeaturesArr;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GlobalSearchApplication) {
            GlobalSearchApplication globalSearchApplication = (GlobalSearchApplication) obj;
            if (dfwq.a(this.a, globalSearchApplication.a) && dfwq.a(Boolean.valueOf(this.c), Boolean.valueOf(globalSearchApplication.c)) && Arrays.equals(this.b, globalSearchApplication.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.c), Integer.valueOf(Arrays.hashCode(this.b))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, this.a, i, false);
        dfxk.E(parcel, 2, this.b, i);
        dfxk.d(parcel, 3, this.c);
        dfxk.c(parcel, a);
    }
}
