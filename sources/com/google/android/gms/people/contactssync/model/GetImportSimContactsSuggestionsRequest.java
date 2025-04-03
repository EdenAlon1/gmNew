package com.google.android.gms.people.contactssync.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhhw;
import defpackage.ermn;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GetImportSimContactsSuggestionsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetImportSimContactsSuggestionsRequest> CREATOR = new dhhw();
    public final AccountWithDataSet a;
    public final boolean b;
    private final Set c;

    public GetImportSimContactsSuggestionsRequest(AccountWithDataSet accountWithDataSet, Set set, boolean z) {
        this.a = accountWithDataSet;
        this.c = set;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AccountWithDataSet accountWithDataSet = this.a;
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, accountWithDataSet, i, false);
        dfxk.v(parcel, 2, ermn.l(this.c));
        dfxk.d(parcel, 3, this.b);
        dfxk.c(parcel, a);
    }
}
