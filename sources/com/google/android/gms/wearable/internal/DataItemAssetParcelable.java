package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwv;
import defpackage.dfxk;
import defpackage.dhzn;
import defpackage.dicx;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class DataItemAssetParcelable extends AbstractSafeParcelable implements ReflectedParcelable, dhzn {
    public static final Parcelable.Creator<DataItemAssetParcelable> CREATOR = new dicx();
    public final String a;
    public final String b;

    public DataItemAssetParcelable(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.dhzn
    public final String a() {
        return this.b;
    }

    @Override // defpackage.dhzn
    public final String b() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataItemAssetParcelable[@");
        sb.append(Integer.toHexString(hashCode()));
        if (this.a == null) {
            sb.append(",noid");
        } else {
            sb.append(",");
            sb.append(this.a);
        }
        sb.append(", key=");
        sb.append(this.b);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 2, str, false);
        dfxk.m(parcel, 3, this.b, false);
        dfxk.c(parcel, a);
    }

    public DataItemAssetParcelable(dhzn dhznVar) {
        String b = dhznVar.b();
        dfwv.n(b);
        this.a = b;
        String a = dhznVar.a();
        dfwv.n(a);
        this.b = a;
    }

    @Override // defpackage.dfvc
    public final /* bridge */ /* synthetic */ Object d() {
        return this;
    }
}
