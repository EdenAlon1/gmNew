package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class enuj {
    private static final enuj a = new enud();

    public static enuj g(ents entsVar, ents entsVar2) {
        int b = entsVar.b() + entsVar2.b();
        return b == 0 ? a : b <= 28 ? new enuh(entsVar, entsVar2) : new enui(entsVar, entsVar2);
    }

    public abstract int a();

    public abstract Object b(ensn ensnVar);

    public abstract Set c();

    public abstract void d(entz entzVar, Object obj);
}
