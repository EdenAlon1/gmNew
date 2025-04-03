package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dien;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class NodeParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<NodeParcelable> CREATOR = new dien();
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;

    public NodeParcelable(String str, String str2, int i, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof NodeParcelable) {
            return ((NodeParcelable) obj).a.equals(this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Node{" + this.b + ", id=" + this.a + ", hops=" + this.c + ", isNearby=" + this.d + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 2, str, false);
        dfxk.m(parcel, 3, this.b, false);
        dfxk.i(parcel, 4, this.c);
        dfxk.d(parcel, 5, this.d);
        dfxk.c(parcel, a);
    }
}
