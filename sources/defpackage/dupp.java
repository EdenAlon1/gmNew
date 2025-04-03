package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dupp extends eyfq implements eyht {
    public dupp() {
        super(dupq.a);
    }

    public final void a(Map map) {
        copyOnWrite();
        dupq dupqVar = (dupq) this.instance;
        dupq dupqVar2 = dupq.a;
        eyhm eyhmVar = dupqVar.b;
        if (!eyhmVar.b) {
            dupqVar.b = eyhmVar.a();
        }
        dupqVar.b.putAll(map);
    }
}
