package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axcg implements axcf {
    private final enhk a;
    private final ffbr b;

    public axcg(Map map, ffbr ffbrVar) {
        this.a = enhk.j(map);
        this.b = ffbrVar;
    }

    @Override // defpackage.axcf
    public final boolean a() {
        eqna d = ((crgh) this.b.b()).d();
        ffbr ffbrVar = (ffbr) this.a.get(d);
        d.name();
        ffbrVar.getClass();
        return ((axcf) ffbrVar.b()).a();
    }
}
