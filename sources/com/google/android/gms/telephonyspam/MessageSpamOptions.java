package com.google.android.gms.telephonyspam;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhry;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class MessageSpamOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MessageSpamOptions> CREATOR = new dhry();
    public final int a;
    public final String b;
    public final long c;
    public final List d;

    public MessageSpamOptions(int i, String str, long j, List list) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.j(parcel, 3, this.c);
        dfxk.n(parcel, 4, this.d, false);
        dfxk.c(parcel, a);
    }
}
