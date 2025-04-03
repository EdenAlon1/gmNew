package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awun extends eyfq implements eyht {
    public awun() {
        super(awup.a);
    }

    public final void a(Map map) {
        copyOnWrite();
        awup awupVar = (awup) this.instance;
        awup awupVar2 = awup.a;
        eyhm eyhmVar = awupVar.e;
        if (!eyhmVar.b) {
            awupVar.e = eyhmVar.a();
        }
        awupVar.e.putAll(map);
    }
}
