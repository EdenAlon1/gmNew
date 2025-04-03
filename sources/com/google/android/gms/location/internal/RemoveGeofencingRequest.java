package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhaq;
import defpackage.engw;
import defpackage.enou;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RemoveGeofencingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoveGeofencingRequest> CREATOR = new dhaq();
    public final List a;
    public final PendingIntent b;
    public final String c;

    public RemoveGeofencingRequest(List list, PendingIntent pendingIntent, String str) {
        engw n;
        if (list == null) {
            int i = engw.d;
            n = enou.a;
        } else {
            n = engw.n(list);
        }
        this.a = n;
        this.b = pendingIntent;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = dfxk.a(parcel);
        dfxk.D(parcel, 1, list);
        dfxk.k(parcel, 2, this.b, i, false);
        dfxk.m(parcel, 3, this.c, false);
        dfxk.c(parcel, a);
    }
}
