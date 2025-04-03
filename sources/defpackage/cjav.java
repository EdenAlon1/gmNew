package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjav extends eyfq implements eyht {
    public cjav() {
        super(cjax.a);
    }

    public final void a(Map map) {
        copyOnWrite();
        cjax cjaxVar = (cjax) this.instance;
        cjax cjaxVar2 = cjax.a;
        cjaxVar.a().putAll(map);
    }

    public final void b(String str, cjap cjapVar) {
        str.getClass();
        cjapVar.getClass();
        copyOnWrite();
        cjax cjaxVar = (cjax) this.instance;
        cjax cjaxVar2 = cjax.a;
        cjaxVar.a().put(str, cjapVar);
    }
}
