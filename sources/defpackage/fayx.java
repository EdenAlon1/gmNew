package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fayx extends eyfq implements eyht {
    public fayx() {
        super(fayz.a);
    }

    public final void a(Map map) {
        copyOnWrite();
        fayz fayzVar = (fayz) this.instance;
        fayz fayzVar2 = fayz.a;
        fayzVar.a().putAll(map);
    }

    public final void b(String str, String str2) {
        str.getClass();
        str2.getClass();
        copyOnWrite();
        fayz fayzVar = (fayz) this.instance;
        fayz fayzVar2 = fayz.a;
        fayzVar.a().put(str, str2);
    }
}
