package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dffu;
import defpackage.dfwv;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class WebSetupConfigRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WebSetupConfigRequest> CREATOR = new dffu();
    final int a;
    public final AppDescription b;

    public WebSetupConfigRequest(int i, AppDescription appDescription) {
        this.a = i;
        dfwv.n(appDescription);
        this.b = appDescription;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.k(parcel, 2, this.b, i, false);
        dfxk.c(parcel, a);
    }
}
