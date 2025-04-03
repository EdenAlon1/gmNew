package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.diel;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class MessageEventParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MessageEventParcelable> CREATOR = new diel();
    public final int a;
    public final String b;
    public final byte[] c;
    public final String d;

    public MessageEventParcelable(int i, String str, byte[] bArr, String str2) {
        this.a = i;
        this.b = str;
        this.c = bArr;
        this.d = str2;
    }

    public final String toString() {
        byte[] bArr = this.c;
        Object valueOf = bArr == null ? "null" : Integer.valueOf(bArr.length);
        String str = this.b;
        return "MessageEventParcelable[" + this.a + "," + str + ", size=" + valueOf.toString() + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 2, i2);
        dfxk.m(parcel, 3, this.b, false);
        dfxk.f(parcel, 4, this.c, false);
        dfxk.m(parcel, 5, this.d, false);
        dfxk.c(parcel, a);
    }
}
