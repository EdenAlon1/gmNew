package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.ICertData;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.dfpr;
import defpackage.dfps;
import defpackage.dfpy;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GoogleCertificatesQuery extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleCertificatesQuery> CREATOR = new dfpy();
    public final String a;
    public final boolean b;
    public final boolean c;
    private final dfpr d;

    public GoogleCertificatesQuery(String str, dfpr dfprVar, boolean z, boolean z2) {
        this.a = str;
        this.d = dfprVar;
        this.b = z;
        this.c = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfpr dfprVar = this.d;
        if (dfprVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            dfprVar = null;
        }
        dfxk.u(parcel, 2, dfprVar);
        dfxk.d(parcel, 3, this.b);
        dfxk.d(parcel, 4, this.c);
        dfxk.c(parcel, a);
    }

    public GoogleCertificatesQuery(String str, IBinder iBinder, boolean z, boolean z2) {
        this.a = str;
        dfps dfpsVar = null;
        if (iBinder != null) {
            try {
                IObjectWrapper bytesWrapped = ICertData.Stub.asInterface(iBinder).getBytesWrapped();
                byte[] bArr = bytesWrapped == null ? null : (byte[]) ObjectWrapper.unwrap(bytesWrapped);
                if (bArr != null) {
                    dfpsVar = new dfps(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.d = dfpsVar;
        this.b = z;
        this.c = z2;
    }
}
