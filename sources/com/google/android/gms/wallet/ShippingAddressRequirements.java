package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhxf;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShippingAddressRequirements extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ShippingAddressRequirements> CREATOR = new dhxf();
    ArrayList a;

    private ShippingAddressRequirements() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.D(parcel, 1, this.a);
        dfxk.c(parcel, a);
    }

    public ShippingAddressRequirements(ArrayList arrayList) {
        this.a = arrayList;
    }
}
