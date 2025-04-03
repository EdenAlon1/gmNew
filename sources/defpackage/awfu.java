package defpackage;

import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awfu {
    private final cqoh a;
    private final ffbr b;

    public awfu(cqoh cqohVar, ffbr ffbrVar) {
        cqohVar.getClass();
        ffbrVar.getClass();
        this.a = cqohVar;
        this.b = ffbrVar;
    }

    public final boolean a(awvd awvdVar) {
        awvdVar.getClass();
        awvb awvbVar = awvdVar.c;
        if (awvbVar == null) {
            awvbVar = awvb.a;
        }
        if (awvbVar.equals(awvb.a)) {
            return false;
        }
        Instant f = this.a.f();
        awvb awvbVar2 = awvdVar.c;
        if (awvbVar2 == null) {
            awvbVar2 = awvb.a;
        }
        eyja eyjaVar = awvbVar2.g;
        if (eyjaVar == null) {
            eyjaVar = eyja.a;
        }
        eyjaVar.getClass();
        Duration between = Duration.between(f, eykn.d(eyjaVar));
        Object b = this.b.b();
        b.getClass();
        return eykn.c((eyev) b).compareTo(between) <= 0;
    }
}
