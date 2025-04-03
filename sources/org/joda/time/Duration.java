package org.joda.time;

import defpackage.firs;
import defpackage.firy;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class Duration extends firy implements Serializable, firs {
    public static final Duration a = new Duration(0);
    private static final long serialVersionUID = 2471658376918L;

    public Duration(long j) {
        super(j);
    }

    public static Duration millis(long j) {
        return j == 0 ? a : new Duration(j);
    }
}
