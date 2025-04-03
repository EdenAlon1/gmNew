package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dupw extends eyfq implements eyht {
    public dupw() {
        super(dupy.a);
    }

    public final void a(Map map) {
        copyOnWrite();
        dupy dupyVar = (dupy) this.instance;
        dupy dupyVar2 = dupy.a;
        eyhm eyhmVar = dupyVar.d;
        if (!eyhmVar.b) {
            dupyVar.d = eyhmVar.a();
        }
        dupyVar.d.putAll(map);
    }
}
