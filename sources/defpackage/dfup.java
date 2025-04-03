package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfup {
    public static void a(Status status, dhri dhriVar) {
        b(status, null, dhriVar);
    }

    public static void b(Status status, Object obj, dhri dhriVar) {
        if (status.d()) {
            dhriVar.b(obj);
        } else {
            dhriVar.a(dfve.a(status));
        }
    }

    public static void c(Status status, Object obj, dhri dhriVar) {
        if (status.d()) {
            dhriVar.d(obj);
        } else {
            dhriVar.c(dfve.a(status));
        }
    }
}
