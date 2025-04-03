package defpackage;

import j$.time.Instant;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddnx implements cfzm {
    private final errl a;
    private final coke b;
    private final avem c;

    public ddnx(errl errlVar, coke cokeVar, avem avemVar) {
        this.a = errlVar;
        this.b = cokeVar;
        this.c = avemVar;
    }

    @Override // defpackage.cfzm
    public final elfl b() {
        return !this.c.a() ? elfo.e("") : d().h(new emwl() { // from class: ddnw
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                StringBuilder sb = new StringBuilder("Section: ZeroStateSearch/Icing\n");
                for (cfzl cfzlVar : (List) obj) {
                    sb.append(cfzlVar.a());
                    sb.append(": ");
                    sb.append(cfzlVar.b());
                    sb.append("\n");
                }
                return sb.toString();
            }
        }, this.a);
    }

    @Override // defpackage.cfzm
    public final /* synthetic */ elfl c() {
        return cfzj.c();
    }

    @Override // defpackage.cfzm
    public final elfl d() {
        if (this.c.a()) {
            return elfo.b(this.b.b().h(new emwl() { // from class: ddnu
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    Instant ofEpochMilli = Instant.ofEpochMilli(((Long) obj).longValue());
                    cfzc cfzcVar = new cfzc();
                    cfzcVar.b("last_search_time");
                    cfzcVar.c(String.valueOf(ofEpochMilli));
                    return cfzcVar.a();
                }
            }, this.a), this.b.a().h(new emwl() { // from class: ddnv
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    cfzc cfzcVar = new cfzc();
                    cfzcVar.b("last_index_refresh_request_time");
                    cfzcVar.c(String.valueOf((Instant) obj));
                    return cfzcVar.a();
                }
            }, this.a));
        }
        int i = engw.d;
        return elfo.e(enou.a);
    }
}
