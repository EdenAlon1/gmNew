package com.google.android.gms.telephonyspam;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhrx;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class MessageContent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MessageContent> CREATOR = new dhrx();
    public final int a;
    public final String b;
    public final int c;
    public final long d;

    public MessageContent(int i, String str, int i2, long j) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.i(parcel, 3, this.c);
        dfxk.j(parcel, 4, this.d);
        dfxk.c(parcel, a);
    }
}
