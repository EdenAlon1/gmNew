package defpackage;

import android.text.TextUtils;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avjh implements djrx {
    public static final cskc a = cskc.g("Bugle", "BusinessRcsConfigurationListener");
    private final cvad b;
    private final csmk c;
    private final dkpm d;
    private final aviv e;

    public avjh(cvad cvadVar, csmk csmkVar, dkpm dkpmVar, aviv avivVar) {
        this.b = cvadVar;
        this.c = csmkVar;
        this.d = dkpmVar;
        this.e = avivVar;
    }

    @Override // defpackage.djrx
    public final void gh(String str, Optional optional) {
        if (optional.isEmpty()) {
            a.p("config update received, but no configuration");
            return;
        }
        djtp djtpVar = (djtp) optional.get();
        String b = this.c.b(djtpVar);
        String e = this.d.e();
        String A = djtpVar.A();
        cskc cskcVar = a;
        csjb c = cskcVar.c();
        c.I("Attempting to add vsmsToken");
        c.B("token available", !TextUtils.isEmpty(A));
        c.B("imsi available", !TextUtils.isEmpty(e));
        c.B("msisdn available", !TextUtils.isEmpty(b));
        c.r();
        if (TextUtils.isEmpty(A) || TextUtils.isEmpty(e) || TextUtils.isEmpty(b)) {
            cskcVar.p("Skipping storage of Verified SMS token");
        } else {
            this.b.c(e, b, A).e(Throwable.class, new emwl() { // from class: avjg
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    avjh.a.s("Could not save Verified SMS token", (Throwable) obj);
                    return false;
                }
            }, erpp.a).k(axnw.b(), erpp.a);
        }
        if (((Boolean) avja.b.e()).booleanValue()) {
            String str2 = ((djtp) optional.get()).i().chatbotDirectoryUrl;
            csjb c2 = cskcVar.c();
            c2.I("Attempting to add Chatbot Directory Url");
            c2.B("url available", !TextUtils.isEmpty(str2));
            c2.r();
            csjb c3 = cskcVar.c();
            c3.I("Received ChatbotDirectoryUrl");
            c3.A("url", str2);
            c3.r();
            this.e.b(str2).k(axnw.b(), erpp.a);
        }
    }
}
