package com.google.android.gms.wallet.firstparty.saveinstrument;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhxx;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class Card extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Card> CREATOR = new dhxx();
    String a;
    String b;
    int c;
    int d;

    private Card() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, this.a, false);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.i(parcel, 3, this.c);
        dfxk.i(parcel, 4, this.d);
        dfxk.c(parcel, a);
    }

    public Card(String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }
}
