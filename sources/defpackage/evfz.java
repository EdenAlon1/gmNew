package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evfz {
    public final Status a;
    public final int b;

    private evfz(int i, Status status) {
        this.b = i;
        this.a = status;
    }

    static evfz a(int i, Status status) {
        if (i != 4) {
            i = 5;
        }
        emxf.l(true);
        status.getClass();
        return new evfz(i, status);
    }

    static evfz b(int i) {
        emxf.l(true);
        return new evfz(i, null);
    }
}
