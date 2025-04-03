package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avsz implements avtc {
    private final enhk a;
    private final ffbr b;

    public avsz(ffbr ffbrVar, Map map) {
        this.a = enhk.j(map);
        this.b = ffbrVar;
    }

    @Override // defpackage.avtc
    public final elfl c(awui awuiVar) {
        eqna d = ((crgh) this.b.b()).d();
        ffbr ffbrVar = (ffbr) this.a.get(d);
        d.name();
        ffbrVar.getClass();
        return ((avtc) ffbrVar.b()).c(awuiVar);
    }
}
