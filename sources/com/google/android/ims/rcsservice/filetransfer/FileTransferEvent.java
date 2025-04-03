package com.google.android.ims.rcsservice.filetransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.ims.rcsservice.events.SessionEvent;
import j$.time.Duration;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class FileTransferEvent extends SessionEvent implements Parcelable {
    public String a;
    public Duration b;

    public FileTransferEvent(int i, long j, long j2) {
        this(i, j, j2, null);
    }

    public static int h(long j) {
        return (int) (j >>> 32);
    }

    public static long j(int i, int i2) {
        return i2 | (i << 32);
    }

    @Override // com.google.android.ims.rcsservice.events.Event
    public final void a(Parcel parcel) {
        super.a(parcel);
        this.a = parcel.readString();
        if (parcel.dataAvail() > 0) {
            this.b = Duration.ofSeconds(parcel.readLong());
        } else {
            this.b = Duration.ZERO;
        }
    }

    @Override // com.google.android.ims.rcsservice.events.Event
    protected final void b(Parcel parcel) {
        parcel.writeString(getClass().getName());
    }

    @Override // com.google.android.ims.rcsservice.events.Event
    protected final String c() {
        int i = this.h;
        if (i == 20001) {
            return "FILE TRANSFER SESSION STARTING";
        }
        if (i == 20002) {
            return "FILE TRANSFER SESSION STARTED";
        }
        switch (i) {
            case 20010:
                return "FILE TRANSFER STARTED";
            case 20011:
                return "FILE TRANSFER FINISHED";
            case 20012:
                return "FILE TRANSFER PROGRESS";
            case 20013:
                return "FILE TRANSFER INTERRUPTED";
            default:
                return "UNDEFINED";
        }
    }

    @Override // com.google.android.ims.rcsservice.events.SessionEvent, com.google.android.ims.rcsservice.events.Event
    protected final String d() {
        if (this.h != 20012) {
            return super.d();
        }
        return "TRANSFERRED " + g() + " of " + i();
    }

    @Override // com.google.android.ims.rcsservice.events.Event
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && super.equals(obj)) {
            return Objects.equals(this.a, ((FileTransferEvent) obj).a);
        }
        return false;
    }

    public final int g() {
        return h(this.i);
    }

    @Override // com.google.android.ims.rcsservice.events.Event
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.a;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final int i() {
        return (int) this.i;
    }

    @Override // com.google.android.ims.rcsservice.events.Event, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
        parcel.writeLong(this.b.getSeconds());
    }

    public FileTransferEvent(int i, long j, long j2, String str) {
        this(i, j, j2, str, Duration.ZERO);
    }

    public FileTransferEvent(int i, long j, long j2, String str, Duration duration) {
        super(i, j, j2);
        this.a = str;
        this.b = duration;
    }

    public FileTransferEvent(Parcel parcel) {
        super(parcel);
    }
}
