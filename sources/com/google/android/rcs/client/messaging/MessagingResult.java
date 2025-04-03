package com.google.android.rcs.client.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfxk;
import defpackage.ehze;
import defpackage.eibv;
import defpackage.eibw;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class MessagingResult implements Parcelable {
    public static final Parcelable.Creator<MessagingResult> CREATOR = new eibv();
    public static final MessagingResult d;
    public static final MessagingResult e;

    @Deprecated
    public static final MessagingResult f;

    @Deprecated
    public static final MessagingResult g;

    @Deprecated
    public static final MessagingResult h;

    @Deprecated
    public static final MessagingResult i;

    @Deprecated
    public static final MessagingResult j;

    @Deprecated
    public static final MessagingResult k;

    static {
        eibw d2 = d();
        d2.c(0);
        d = d2.e();
        eibw d3 = d();
        d3.c(1);
        e = d3.e();
        eibw d4 = d();
        d4.c(2);
        f = d4.e();
        eibw d5 = d();
        d5.c(3);
        g = d5.e();
        eibw d6 = d();
        d6.c(10);
        h = d6.e();
        eibw d7 = d();
        d7.c(11);
        i = d7.e();
        eibw d8 = d();
        d8.c(12);
        j = d8.e();
        eibw d9 = d();
        d9.c(13);
        k = d9.e();
    }

    public static eibw d() {
        ehze ehzeVar = new ehze();
        ehzeVar.b(0);
        ehzeVar.d(Duration.ZERO);
        return ehzeVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract Duration c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        String str;
        int b = b();
        String str2 = "UNKNOWN";
        if (b == 0) {
            str = "OK";
        } else if (b == 1) {
            str = "PENDING";
        } else if (b == 2) {
            str = "FAILED";
        } else if (b != 3) {
            switch (b) {
                case 10:
                    str = "FAILED_CLIENT_ERROR";
                    break;
                case 11:
                    str = "FAILED_CLIENT_RESOURCE_NOT_FOUND";
                    break;
                case 12:
                    str = "FAILED_CLIENT_FORBIDDEN";
                    break;
                case 13:
                    str = "FAILED_CLIENT_NOT_ACCEPTABLE";
                    break;
                case 14:
                    str = "FAILED_MAY_LATCH_TO_XMS";
                    break;
                case 15:
                    str = "FAILED_NO_RETRY";
                    break;
                case 16:
                    str = "FAILED_RETRY";
                    break;
                default:
                    str = "UNKNOWN";
                    break;
            }
        } else {
            str = "FAILED_SERVER_ERROR";
        }
        String format = String.format("ErrorCode: %s (%s)", str, Integer.valueOf(b()));
        switch (a()) {
            case 0:
                break;
            case 1:
                str2 = "GROUP_TOO_FEW_PARTICIPANTS";
                break;
            case 2:
                str2 = "GROUP_TOO_MANY_PARTICIPANTS";
                break;
            case 3:
                str2 = "USER_NOT_A_GROUP_PARTICIPANT";
                break;
            case 4:
                str2 = "GROUP_SESSION_NOT_FOUND";
                break;
            case 5:
                str2 = "NOT_AUTHORIZED_TO_RESTART_GROUP";
                break;
            case 6:
                str2 = "LOW_PRIORITY_MESSAGE_REJECTED";
                break;
            case 7:
                str2 = "TRANSPORT_INTERNAL_ERROR";
                break;
            default:
                str2 = "INVALID_CAUSE";
                break;
        }
        return String.format("%s with %s", format, String.format("ErrorCause: %s (%s)", str2, Integer.valueOf(a())));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, b());
        dfxk.i(parcel, 2, a());
        dfxk.j(parcel, 3, c().getSeconds());
        dfxk.c(parcel, a);
    }
}
