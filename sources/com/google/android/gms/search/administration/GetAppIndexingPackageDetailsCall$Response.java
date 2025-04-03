package com.google.android.gms.search.administration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfrl;
import defpackage.dfxk;
import defpackage.dhmp;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetAppIndexingPackageDetailsCall$Response extends AbstractSafeParcelable implements dfrl {
    public static final Parcelable.Creator<GetAppIndexingPackageDetailsCall$Response> CREATOR = new dhmp();
    public final Status a;
    public final CorpusConfigParcelable[] b;
    public final long c;
    public final AppIndexingErrorInfo[] d;
    public final AppIndexingUserActionInfo[] e;
    public final boolean f;
    public final boolean g;

    public GetAppIndexingPackageDetailsCall$Response(Status status, CorpusConfigParcelable[] corpusConfigParcelableArr, long j, AppIndexingErrorInfo[] appIndexingErrorInfoArr, AppIndexingUserActionInfo[] appIndexingUserActionInfoArr, boolean z, boolean z2) {
        this.a = status;
        this.b = corpusConfigParcelableArr;
        this.c = j;
        this.d = appIndexingErrorInfoArr;
        this.e = appIndexingUserActionInfoArr;
        this.f = z;
        this.g = z2;
    }

    @Override // defpackage.dfrl
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Status status = this.a;
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, status, i, false);
        dfxk.E(parcel, 2, this.b, i);
        dfxk.j(parcel, 3, this.c);
        dfxk.E(parcel, 4, this.d, i);
        dfxk.E(parcel, 5, this.e, i);
        dfxk.d(parcel, 6, this.f);
        dfxk.d(parcel, 7, this.g);
        dfxk.c(parcel, a);
    }
}
