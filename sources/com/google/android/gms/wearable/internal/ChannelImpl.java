package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.ChannelClient;
import defpackage.dfwq;
import defpackage.dfwv;
import defpackage.dfxk;
import defpackage.dibu;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ChannelImpl extends AbstractSafeParcelable implements Channel, ChannelClient.Channel {
    public static final Parcelable.Creator<ChannelImpl> CREATOR = new dibu();
    public final String a;
    public final String b;
    public final String c;

    public ChannelImpl(String str, String str2, String str3) {
        dfwv.n(str);
        this.a = str;
        dfwv.n(str2);
        this.b = str2;
        dfwv.n(str3);
        this.c = str3;
    }

    @Override // com.google.android.gms.wearable.ChannelClient.Channel
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChannelImpl)) {
            return false;
        }
        ChannelImpl channelImpl = (ChannelImpl) obj;
        return this.a.equals(channelImpl.a) && dfwq.a(channelImpl.b, this.b) && dfwq.a(channelImpl.c, this.c);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        int i = 0;
        for (char c : this.a.toCharArray()) {
            i += c;
        }
        String trim = this.a.trim();
        int length = trim.length();
        if (length > 25) {
            trim = trim.substring(0, 10) + "..." + trim.substring(length - 10, length) + "::" + i;
        }
        return "Channel{token=" + trim + ", nodeId=" + this.b + ", path=" + this.c + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 2, str, false);
        dfxk.m(parcel, 3, this.b, false);
        dfxk.m(parcel, 4, this.c, false);
        dfxk.c(parcel, a);
    }
}
