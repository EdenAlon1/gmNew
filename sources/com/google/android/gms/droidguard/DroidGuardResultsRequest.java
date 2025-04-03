package com.google.android.gms.droidguard;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfpi;
import defpackage.dfxk;
import defpackage.dgav;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class DroidGuardResultsRequest extends AbstractSafeParcelable {
    public final Bundle a;
    private static final int b = (int) TimeUnit.SECONDS.toMillis(60);
    public static final Parcelable.Creator<DroidGuardResultsRequest> CREATOR = new dgav();

    public DroidGuardResultsRequest() {
        String str;
        Bundle bundle = new Bundle();
        this.a = bundle;
        bundle.putInt("clientVersion", dfpi.b);
        try {
            str = System.getProperty("os.arch");
        } catch (Exception unused) {
            str = "?";
        }
        this.a.putString("appArchitecture", str);
    }

    public final int a() {
        return this.a.getInt("timeoutMs", b);
    }

    public final void b(int i) {
        this.a.putInt("openHandles", i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.p(parcel, 2, this.a);
        dfxk.c(parcel, a);
    }

    public DroidGuardResultsRequest(Bundle bundle) {
        new Bundle();
        this.a = bundle;
    }
}
