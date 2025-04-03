package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfnm;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CloudMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CloudMessage> CREATOR = new dfnm();
    public final Intent a;

    public CloudMessage(Intent intent) {
        this.a = intent;
    }

    public final Integer a() {
        if (this.a.hasExtra("google.product_id")) {
            return Integer.valueOf(this.a.getIntExtra("google.product_id", 0));
        }
        return null;
    }

    public final String b() {
        String stringExtra = this.a.getStringExtra("google.message_id");
        return stringExtra == null ? this.a.getStringExtra("message_id") : stringExtra;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, this.a, i, false);
        dfxk.c(parcel, a);
    }
}
