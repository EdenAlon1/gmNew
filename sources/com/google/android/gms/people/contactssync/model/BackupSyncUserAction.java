package com.google.android.gms.people.contactssync.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhhr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class BackupSyncUserAction extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BackupSyncUserAction> CREATOR = new dhhr();
    public final String a;
    public final int b;

    public BackupSyncUserAction(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.i(parcel, 2, this.b);
        dfxk.c(parcel, a);
    }
}
