package org.joda.time;

import defpackage.firb;
import defpackage.firh;
import defpackage.firt;
import defpackage.firw;
import defpackage.fist;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class Instant extends firw implements Serializable, firt {
    private static final long serialVersionUID = 3299096530934209741L;
    private final long a;

    public Instant(long j) {
        this.a = j;
    }

    @Override // defpackage.firt
    public final firb a() {
        return fist.o;
    }

    @Override // defpackage.firt
    public long getMillis() {
        return this.a;
    }

    public Instant() {
        this.a = firh.a();
    }
}
