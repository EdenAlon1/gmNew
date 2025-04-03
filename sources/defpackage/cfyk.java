package defpackage;

import j$.util.function.Consumer$CC;
import java.util.Map;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfyk implements cfvv {
    public static final cskc a = cskc.g("BugleNetwork", "TachyonClientPingHandler");
    private final ffbr b;

    public cfyk(ffbr ffbrVar) {
        this.b = ffbrVar;
    }

    @Override // defpackage.cfvv
    public final int a(euxg euxgVar) {
        return 0;
    }

    @Override // defpackage.cfvv
    public final void b(euxg euxgVar) {
        cskc cskcVar = a;
        cskcVar.p("Received Client Ping from Tachyon");
        final String str = (String) euxgVar.c().get("app");
        ffbr ffbrVar = (ffbr) ((Map) this.b.b()).get(str);
        if (ffbrVar != null) {
            elfr.l(((cfvx) ffbrVar.b()).a().e(fedn.class, new emwl() { // from class: cfyi
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    cfyk.a.s("Got StatusRuntimeException during refresh", (fedn) obj);
                    return null;
                }
            }, erpp.a), axnw.c(new Consumer() { // from class: cfyj
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    cfyk.a.p("Successfully handled Tachyon ping for ".concat(String.valueOf(str)));
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }), erpp.a);
            return;
        }
        String str2 = (String) euxgVar.c().get("tickle");
        csjb e = cskcVar.e();
        e.I("PingRefreshHandler not registered for app");
        e.A("appName", str);
        e.A("tickleId", str2);
        e.r();
    }

    @Override // defpackage.cfvv
    public final void c() {
    }
}
