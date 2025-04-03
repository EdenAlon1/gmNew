package defpackage;

import io.grpc.Status;
import io.grpc.StatusException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evey implements fdxp {
    private final ffbr a;
    private final Class b;
    private final Class c;

    public evey(ffbr ffbrVar, Class cls, Class cls2) {
        this.a = ffbrVar;
        this.b = cls;
        this.c = cls2;
    }

    @Override // defpackage.fdxp
    public final fdxo a(febs febsVar, fdxj fdxjVar, fdxk fdxkVar) {
        try {
            Object b = this.a.b();
            evez.b(febsVar, this.b, true);
            evez.b(febsVar, this.c, false);
            return new evga(new evfu(fdxkVar, febsVar, fdxjVar, (engw) b));
        } catch (StatusException e) {
            return new evhl(Status.c(e));
        }
    }
}
