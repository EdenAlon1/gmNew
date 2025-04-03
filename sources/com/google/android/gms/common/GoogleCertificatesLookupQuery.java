package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.dfpc;
import defpackage.dfpw;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GoogleCertificatesLookupQuery extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleCertificatesLookupQuery> CREATOR = new dfpw();
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final ClientSourceStampRequest f;
    private final Context g;

    /* compiled from: PG */
    public static class ClientSourceStampRequest extends AbstractSafeParcelable {
        public static final Parcelable.Creator<ClientSourceStampRequest> CREATOR = new dfpc();
        public final boolean a;
        public final boolean b;

        public ClientSourceStampRequest(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            boolean z = this.a;
            int a = dfxk.a(parcel);
            dfxk.d(parcel, 1, z);
            dfxk.d(parcel, 2, this.b);
            dfxk.c(parcel, a);
        }
    }

    public GoogleCertificatesLookupQuery(String str, boolean z, boolean z2, IBinder iBinder, boolean z3, boolean z4, ClientSourceStampRequest clientSourceStampRequest) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.g = (Context) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder));
        this.d = z3;
        this.e = z4;
        this.f = clientSourceStampRequest;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.IBinder, com.google.android.gms.dynamic.IObjectWrapper] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.d(parcel, 2, this.b);
        dfxk.d(parcel, 3, this.c);
        dfxk.u(parcel, 4, ObjectWrapper.wrap(this.g));
        dfxk.d(parcel, 5, this.d);
        dfxk.d(parcel, 6, this.e);
        dfxk.k(parcel, 7, this.f, i, false);
        dfxk.c(parcel, a);
    }
}
