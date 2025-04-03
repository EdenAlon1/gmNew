package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eupi {
    public static eunl a(Status status, String str) {
        dfwv.n(status);
        String str2 = status.g;
        if (str2 != null && !str2.isEmpty()) {
            str = str2;
        }
        switch (status.f) {
            case 17510:
                return new eunn(str);
            case 17511:
                return new euno(str);
            case 17512:
            default:
                return new eunl(str);
            case 17513:
                return new eunm(str);
            case 17514:
                return new eunk(str);
        }
    }
}
