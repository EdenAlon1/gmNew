package com.google.android.gms.wallet.firstparty.saveinstrument;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhya;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SaveInstrumentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SaveInstrumentRequest> CREATOR = new dhya();
    Card a;
    ArrayList b;
    byte[] c;

    private SaveInstrumentRequest() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, this.a, i, false);
        dfxk.n(parcel, 2, this.b, false);
        dfxk.f(parcel, 3, this.c, false);
        dfxk.c(parcel, a);
    }

    public SaveInstrumentRequest(Card card, ArrayList arrayList, byte[] bArr) {
        this.a = card;
        this.b = arrayList;
        this.c = bArr;
    }
}
