package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.dfxk;
import defpackage.dhyy;
import defpackage.dibr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ChannelEventParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ChannelEventParcelable> CREATOR = new dibr();
    final ChannelImpl a;
    final int b;
    final int c;
    final int d;

    public ChannelEventParcelable(ChannelImpl channelImpl, int i, int i2, int i3) {
        this.a = channelImpl;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final void a(dhyy dhyyVar) {
        int i = this.b;
        if (i == 1) {
            dhyyVar.m(this.a);
            return;
        }
        if (i == 2) {
            dhyyVar.p(this.a);
            return;
        }
        if (i == 3) {
            dhyyVar.n(this.a);
        } else if (i != 4) {
            Log.w("ChannelEventParcelable", a.h(i, "Unknown type: "));
        } else {
            dhyyVar.o(this.a);
        }
    }

    public final String toString() {
        int i = this.b;
        String valueOf = String.valueOf(this.a);
        String num = i != 1 ? i != 2 ? i != 3 ? i != 4 ? Integer.toString(i) : "OUTPUT_CLOSED" : "INPUT_CLOSED" : "CHANNEL_CLOSED" : "CHANNEL_OPENED";
        int i2 = this.c;
        return "ChannelEventParcelable[, channel=" + valueOf + ", type=" + num + ", closeReason=" + (i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? Integer.toString(i2) : "CLOSE_REASON_LOCAL_CLOSE" : "CLOSE_REASON_REMOTE_CLOSE" : "CLOSE_REASON_DISCONNECTED" : "CLOSE_REASON_NORMAL") + ", appErrorCode=" + this.d + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 2, this.a, i, false);
        dfxk.i(parcel, 3, this.b);
        dfxk.i(parcel, 4, this.c);
        dfxk.i(parcel, 5, this.d);
        dfxk.c(parcel, a);
    }
}
