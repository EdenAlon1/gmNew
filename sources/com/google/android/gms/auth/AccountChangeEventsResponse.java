package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dezj;
import defpackage.dfwv;
import defpackage.dfxk;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AccountChangeEventsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEventsResponse> CREATOR = new dezj();
    final int a;
    final List b;

    public AccountChangeEventsResponse(int i, List list) {
        this.a = i;
        dfwv.n(list);
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.n(parcel, 2, this.b, false);
        dfxk.c(parcel, a);
    }
}
