package com.google.android.gms.people.contactssync.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhhn;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class BackupAndSyncOptInOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BackupAndSyncOptInOptions> CREATOR = new dhhn();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public BackupAndSyncOptInOptions(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = dfxk.a(parcel);
        dfxk.d(parcel, 1, z);
        dfxk.d(parcel, 2, this.b);
        dfxk.d(parcel, 3, this.c);
        dfxk.c(parcel, a);
    }
}
