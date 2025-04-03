package com.google.android.ims.rcsservice.ims;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.ims.rcsservice.events.Event;
import defpackage.dkna;
import defpackage.dkol;
import defpackage.dktx;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ImsEvent extends Event {
    public static final Parcelable.Creator<ImsEvent> CREATOR = new dkol();
    public String a;
    public String b;
    public int c;
    public String d;
    public String e;
    public String f;

    public ImsEvent(int i, int i2, int i3) {
        super(i, 0L, 0L);
        this.i = (i2 << 32) | i3;
    }

    @Override // com.google.android.ims.rcsservice.events.Event
    public final void a(Parcel parcel) {
        super.a(parcel);
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readInt();
        this.e = parcel.readString();
        this.d = parcel.readString();
        this.f = parcel.readString();
    }

    @Override // com.google.android.ims.rcsservice.events.Event
    protected final void b(Parcel parcel) {
        parcel.writeString(getClass().getName());
    }

    @Override // com.google.android.ims.rcsservice.events.Event
    protected final String c() {
        int i = this.h;
        if (i == 30013) {
            return "CAPABILITIES UPDATED";
        }
        if (i == 30050) {
            return "CONFIGURATION UPDATED SUCCESSFULLY";
        }
        switch (i) {
            case 30100:
                return "SIP REGISTRATION SUCCESSFUL";
            case 30101:
                return "SIP REGISTRATION FAILED";
            case 30102:
                return "SIP REGISTRATION TERMINATED";
            default:
                switch (i) {
                    case 30104:
                        return "RCS PROVISIONING RESCHEDULED";
                    case 30105:
                        return "IMS MODULE INITIALIZED";
                    case 30106:
                        return "SIP REGISTRATION STATE CHANGED";
                    default:
                        return "UNDEFINED";
                }
        }
    }

    @Override // com.google.android.ims.rcsservice.events.Event
    protected final String d() {
        int i = (int) this.i;
        return i != 100 ? i != 101 ? super.d() : "SIP CONNECTION LOST" : "SIP CONNECTION ESTABLISHED";
    }

    @Override // com.google.android.ims.rcsservice.events.Event
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImsEvent) || !super.equals(obj)) {
            return false;
        }
        ImsEvent imsEvent = (ImsEvent) obj;
        if (TextUtils.equals(this.b, imsEvent.b) && imsEvent.c == this.c && TextUtils.equals(this.a, imsEvent.a) && TextUtils.equals(this.e, imsEvent.e) && TextUtils.equals(this.f, imsEvent.f)) {
            return TextUtils.equals(this.d, imsEvent.d);
        }
        return false;
    }

    @Override // com.google.android.ims.rcsservice.events.Event
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.a, this.b, Integer.valueOf(this.c), this.e, this.d, this.f);
    }

    @Override // com.google.android.ims.rcsservice.events.Event
    public final String toString() {
        String[] strArr = dkna.a;
        int i = this.g;
        return "ImsEvent [Category " + strArr[i] + " (" + i + "), Code " + c() + " (" + this.h + "), Source (" + this.j + ", Info (" + d() + " (" + this.i + "), TachyonAuthToken (" + dktx.GENERIC.c(this.a) + "), VerifiedSmsToken (" + dktx.GENERIC.c(this.e) + "), Msisdn (" + dktx.PHONE_NUMBER.c(this.b) + "), SubId (" + this.c + "), IMSI (" + dktx.IMSI.c(this.d) + "), ChatbotDirectoryUrl (" + this.f + ")";
    }

    @Override // com.google.android.ims.rcsservice.events.Event, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.e);
        parcel.writeString(this.d);
        parcel.writeString(this.f);
    }

    public ImsEvent(int i, long j) {
        super(i, 0L, j);
    }

    public ImsEvent(Parcel parcel) {
        a(parcel);
    }
}
