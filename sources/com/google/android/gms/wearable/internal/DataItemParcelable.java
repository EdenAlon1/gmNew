package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwv;
import defpackage.dfxk;
import defpackage.dhzm;
import defpackage.dhzn;
import defpackage.dida;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class DataItemParcelable extends AbstractSafeParcelable implements dhzm {
    public static final Parcelable.Creator<DataItemParcelable> CREATOR = new dida();
    public final Uri a;
    public byte[] b;
    private final Map c;

    public DataItemParcelable(Uri uri, Bundle bundle, byte[] bArr) {
        this.a = uri;
        HashMap hashMap = new HashMap();
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        dfwv.n(classLoader);
        bundle.setClassLoader(classLoader);
        for (String str : bundle.keySet()) {
            Parcelable parcelable = bundle.getParcelable(str);
            dfwv.n(parcelable);
            hashMap.put(str, (DataItemAssetParcelable) parcelable);
        }
        this.c = hashMap;
        this.b = bArr;
    }

    @Override // defpackage.dhzm
    public final Uri a() {
        return this.a;
    }

    @Override // defpackage.dhzm
    public final Map b() {
        return this.c;
    }

    @Override // defpackage.dhzm
    public final byte[] c() {
        return this.b;
    }

    public final String toString() {
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder sb = new StringBuilder("DataItemParcelable[@");
        sb.append(Integer.toHexString(hashCode()));
        byte[] bArr = this.b;
        sb.append(",dataSz=".concat((bArr == null ? "null" : Integer.valueOf(bArr.length)).toString()));
        sb.append(", numAssets=" + this.c.size());
        sb.append(", uri=".concat(String.valueOf(String.valueOf(this.a))));
        if (!isLoggable) {
            sb.append("]");
            return sb.toString();
        }
        sb.append("]\n  assets: ");
        for (String str : this.c.keySet()) {
            sb.append("\n    " + str + ": " + String.valueOf(this.c.get(str)));
        }
        sb.append("\n  ]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Uri uri = this.a;
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 2, uri, i, false);
        Bundle bundle = new Bundle();
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        dfwv.n(classLoader);
        bundle.setClassLoader(classLoader);
        for (Map.Entry entry : this.c.entrySet()) {
            bundle.putParcelable((String) entry.getKey(), new DataItemAssetParcelable((dhzn) entry.getValue()));
        }
        dfxk.p(parcel, 4, bundle);
        dfxk.f(parcel, 5, this.b, false);
        dfxk.c(parcel, a);
    }

    @Override // defpackage.dfvc
    public final /* bridge */ /* synthetic */ Object d() {
        return this;
    }
}
