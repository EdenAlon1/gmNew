package defpackage;

import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uof {
    public final Map a;
    public final Optional b;
    public final ffbr c;
    public final akmj d;
    private final ffbz e;

    public uof(Map map, Optional optional, ffbr ffbrVar, akmj akmjVar) {
        map.getClass();
        optional.getClass();
        ffbrVar.getClass();
        akmjVar.getClass();
        this.a = map;
        this.b = optional;
        this.c = ffbrVar;
        this.d = akmjVar;
        this.e = ffca.a(new ffix() { // from class: uoe
            @Override // defpackage.ffix
            public final Object invoke() {
                uof uofVar = uof.this;
                return Boolean.valueOf(((aurs) uofVar.c.b()).a() ? uofVar.d.a() : uofVar.a.containsKey(cwmn.b));
            }
        });
    }

    public final dszq a(int i) {
        return b() ? new dszn() : new dszo(i);
    }

    public final boolean b() {
        return ((Boolean) this.e.a()).booleanValue();
    }
}
