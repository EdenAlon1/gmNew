package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffbw implements Serializable, ffbz {
    private final Object a;

    public ffbw(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.ffbz
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.ffbz
    public final boolean b() {
        return true;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
