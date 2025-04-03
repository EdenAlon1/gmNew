package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dibi;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AppRecommendationsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AppRecommendationsResponse> CREATOR = new dibi();
    public final int a;
    public final List b;
    public final WebIconParcelable c;

    public AppRecommendationsResponse(int i, List list, WebIconParcelable webIconParcelable) {
        this.a = i;
        this.b = list;
        this.c = webIconParcelable;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.n(parcel, 2, this.b, false);
        dfxk.k(parcel, 3, this.c, i, false);
        dfxk.c(parcel, a);
    }
}
