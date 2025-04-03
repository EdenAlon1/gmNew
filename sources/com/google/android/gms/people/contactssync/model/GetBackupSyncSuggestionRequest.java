package com.google.android.gms.people.contactssync.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhhu;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetBackupSyncSuggestionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetBackupSyncSuggestionRequest> CREATOR = new dhhu();
    public final int a;
    public final int b;

    public GetBackupSyncSuggestionRequest(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.i(parcel, 2, this.b);
        dfxk.c(parcel, a);
    }
}
