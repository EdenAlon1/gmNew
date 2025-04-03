package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eecg {
    public final enhk a;

    public eecg(Map map) {
        this.a = enhk.j(map);
    }

    public final eece a() {
        ffbr ffbrVar = (ffbr) this.a.get(eecf.MSRP_CLIENT);
        ffbrVar.getClass();
        return (eece) ffbrVar.b();
    }

    public final eece b() {
        ffbr ffbrVar = (ffbr) this.a.get(eecf.MSRP_SERVER);
        ffbrVar.getClass();
        return (eece) ffbrVar.b();
    }
}
