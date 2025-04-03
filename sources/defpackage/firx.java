package defpackage;

import java.io.Serializable;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class firx extends firu implements Serializable, firt {
    private static final long serialVersionUID = -6728882245981L;
    public volatile long a;
    public volatile firb b;

    public firx() {
        this(firh.a(), fist.N());
    }

    @Override // defpackage.firt
    public final firb a() {
        return this.b;
    }

    @Override // defpackage.firt
    public final long getMillis() {
        return this.a;
    }

    public firx(long j, firb firbVar) {
        Map map = firh.a;
        this.b = firbVar;
        this.a = j;
        if (this.a == Long.MIN_VALUE || this.a == Long.MAX_VALUE) {
            this.b = this.b.a();
        }
    }
}
