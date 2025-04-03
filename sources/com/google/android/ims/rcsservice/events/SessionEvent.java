package com.google.android.ims.rcsservice.events;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class SessionEvent extends Event {
    public SessionEvent(int i, long j, long j2) {
        super(i, j, j2);
    }

    @Override // com.google.android.ims.rcsservice.events.Event
    protected String d() {
        switch ((int) this.i) {
            case 1:
                return "REMOTE PARTY UNKNOWN";
            case 2:
                return "REMOTE PARTY OFFLINE";
            case 3:
                return "SESSION TIMEOUT";
            case 4:
                return "SESSION REJECTED";
            case 5:
                return "SESSION CANCELLED";
            case 6:
                return "RESOURCE UNAVAILABLE";
            case 7:
                return "SESSION TERMINATED BY REMOTE";
            case 8:
                return "SESSION ERROR";
            case 9:
                return "FORBIDDEN UNKNOWN";
            case 10:
                return "LIMIT EXCEEDED";
            case 11:
                return "SESSION ERROR NO RETRY";
            default:
                return super.d();
        }
    }

    public SessionEvent(Parcel parcel) {
        super(parcel);
    }
}
