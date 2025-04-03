package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhyl;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LabelValueRow extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LabelValueRow> CREATOR = new dhyl();

    @Deprecated
    String a;

    @Deprecated
    String b;
    final ArrayList c;

    public LabelValueRow(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 2, this.a, false);
        dfxk.m(parcel, 3, this.b, false);
        dfxk.n(parcel, 4, this.c, false);
        dfxk.c(parcel, a);
    }

    LabelValueRow() {
        this.c = new ArrayList();
    }
}
