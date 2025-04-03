package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.dfxk;
import defpackage.dicc;
import j$.util.Objects;
import org.chromium.net.NetError;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ConnectionStateEventParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionStateEventParcelable> CREATOR = new dicc();
    public final int a;
    public final String b;

    public ConnectionStateEventParcelable(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConnectionStateEventParcelable)) {
            return false;
        }
        ConnectionStateEventParcelable connectionStateEventParcelable = (ConnectionStateEventParcelable) obj;
        return this.a == connectionStateEventParcelable.a && Objects.equals(this.b, connectionStateEventParcelable.b);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b);
    }

    public final String toString() {
        String str;
        int i = this.a;
        switch (i) {
            case NetError.ERR_UNEXPECTED /* -9 */:
                str = "Migration was cancelled";
                break;
            case NetError.ERR_FILE_TOO_BIG /* -8 */:
                str = "Another migration is already in progress";
                break;
            case NetError.ERR_TIMED_OUT /* -7 */:
                str = "Connect message malformed";
                break;
            case -6:
                str = "Migration status mismatch between watch and phone";
                break;
            case -5:
                str = "Phone switching feature disabled";
                break;
            case -4:
                str = "Did not receive connect msg";
                break;
            case -3:
                str = "No bluetooth connection";
                break;
            case -2:
                str = "Accounts mismatch";
                break;
            case -1:
                str = "Unknown failure";
                break;
            case 0:
                str = "Connected";
                break;
            case 1:
                str = "Connection handshake in progress";
                break;
            case 2:
                str = "Connection handshake complete";
                break;
            case 3:
                str = "Sync with old node suspended";
                break;
            case 4:
                str = "Control plane transport connected";
                break;
            case 5:
                str = "Accounts Matched";
                break;
            case 6:
                str = "Association to watch terminated";
                break;
            default:
                str = a.h(i, "Unrecognized state value: ");
                break;
        }
        return String.format("ConnectionStateEvent: address: %s, state: %s", this.b, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, i2);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.c(parcel, a);
    }
}
