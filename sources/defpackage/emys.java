package defpackage;

import j$.time.Duration;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emys {
    public static emyl a(emyl emylVar) {
        return ((emylVar instanceof emyp) || (emylVar instanceof emyn)) ? emylVar : emylVar instanceof Serializable ? new emyn(emylVar) : new emyp(emylVar);
    }

    public static emyl b(emyl emylVar, Duration duration) {
        boolean z = false;
        if (!duration.isNegative() && !duration.isZero()) {
            z = true;
        }
        emxf.f(z, "duration (%s) must be > 0", duration);
        return new emym(emylVar, emwp.a(duration));
    }
}
