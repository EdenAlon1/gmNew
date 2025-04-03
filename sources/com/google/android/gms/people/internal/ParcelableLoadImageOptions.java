package com.google.android.gms.people.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwp;
import defpackage.dfxk;
import defpackage.dhit;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ParcelableLoadImageOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ParcelableLoadImageOptions> CREATOR = new dhit();
    public final int a;
    public final int b;
    public final boolean c;

    public ParcelableLoadImageOptions(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        dfwp.b("imageSize", Integer.valueOf(this.a), arrayList);
        dfwp.b("avatarOptions", Integer.valueOf(this.b), arrayList);
        dfwp.b("useLargePictureForCp2Images", Boolean.valueOf(this.c), arrayList);
        return dfwp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, i2);
        dfxk.i(parcel, 2, this.b);
        dfxk.d(parcel, 3, this.c);
        dfxk.c(parcel, a);
    }
}
