package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dgkx;
import defpackage.dgky;
import defpackage.dgkz;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public class ChannelIdValue extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ChannelIdValue> CREATOR = new dgkz();
    public final String a;
    public final String b;
    private final ChannelIdValueType c;

    /* compiled from: PG */
    public enum ChannelIdValueType implements Parcelable {
        ABSENT(0),
        STRING(1),
        OBJECT(2);

        public static final Parcelable.Creator<ChannelIdValueType> CREATOR = new dgkx();
        public final int d;

        ChannelIdValueType(int i) {
            this.d = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.d);
        }
    }

    static {
        new ChannelIdValue();
        new ChannelIdValue("unavailable");
        new ChannelIdValue("unused");
    }

    private ChannelIdValue() {
        this.c = ChannelIdValueType.ABSENT;
        this.b = null;
        this.a = null;
    }

    public static ChannelIdValueType a(int i) {
        for (ChannelIdValueType channelIdValueType : ChannelIdValueType.values()) {
            if (i == channelIdValueType.d) {
                return channelIdValueType;
            }
        }
        throw new dgky(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelIdValue)) {
            return false;
        }
        ChannelIdValue channelIdValue = (ChannelIdValue) obj;
        if (!this.c.equals(channelIdValue.c)) {
            return false;
        }
        int ordinal = this.c.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 1) {
            return this.a.equals(channelIdValue.a);
        }
        if (ordinal != 2) {
            return false;
        }
        return this.b.equals(channelIdValue.b);
    }

    public final int hashCode() {
        int i;
        int hashCode;
        int hashCode2 = this.c.hashCode() + 31;
        int ordinal = this.c.ordinal();
        if (ordinal == 1) {
            i = hashCode2 * 31;
            hashCode = this.a.hashCode();
        } else {
            if (ordinal != 2) {
                return hashCode2;
            }
            i = hashCode2 * 31;
            hashCode = this.b.hashCode();
        }
        return i + hashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        ChannelIdValueType channelIdValueType = ChannelIdValueType.ABSENT;
        dfxk.i(parcel, 2, this.c.d);
        dfxk.m(parcel, 3, this.a, false);
        dfxk.m(parcel, 4, this.b, false);
        dfxk.c(parcel, a);
    }

    public ChannelIdValue(int i, String str, String str2) {
        try {
            this.c = a(i);
            this.a = str;
            this.b = str2;
        } catch (dgky e) {
            throw new IllegalArgumentException(e);
        }
    }

    private ChannelIdValue(String str) {
        this.a = str;
        this.c = ChannelIdValueType.STRING;
        this.b = null;
    }
}
