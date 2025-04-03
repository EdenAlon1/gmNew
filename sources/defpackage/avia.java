package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avia implements cfzm {
    public final fazb a;
    private final errl b;

    public avia(errl errlVar, fazb fazbVar) {
        this.b = errlVar;
        this.a = fazbVar;
    }

    @Override // defpackage.cfzm
    public final /* synthetic */ elfl b() {
        return cfzj.b();
    }

    @Override // defpackage.cfzm
    public final /* synthetic */ elfl c() {
        return cfzj.c();
    }

    @Override // defpackage.cfzm
    public final elfl d() {
        return elfo.g(new Callable() { // from class: avhz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ArrayList arrayList = new ArrayList();
                eoux i = ((altk) avia.this.a.b()).i("last_rbm_active_event_time_millis");
                boolean z = i == eoux.EVENT_AGE_WITHIN_1_DAY;
                boolean z2 = z || i == eoux.EVENT_AGE_1_TO_7_DAYS;
                cfzc cfzcVar = new cfzc();
                cfzcVar.b("IsRbm1DA");
                cfzcVar.c(String.valueOf(z));
                arrayList.add(cfzcVar.a());
                cfzc cfzcVar2 = new cfzc();
                cfzcVar2.b("IsRbm7DA");
                cfzcVar2.c(String.valueOf(z2));
                arrayList.add(cfzcVar2.a());
                return arrayList;
            }
        }, this.b);
    }
}
