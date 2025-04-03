package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgva implements cfzm {
    public final ffbr a;
    public final ffbr b;
    private final errl c;

    public cgva(errl errlVar, ffbr ffbrVar, ffbr ffbrVar2) {
        this.c = errlVar;
        this.a = ffbrVar;
        this.b = ffbrVar2;
    }

    @Override // defpackage.cfzm
    public final elfl b() {
        return elfo.g(new Callable() { // from class: cguy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Set<cosz> q = ((cort) cgva.this.b.b()).q();
                enhd enhdVar = new enhd();
                for (cosz coszVar : q) {
                    enhdVar.k(coszVar.c, coszVar.p);
                }
                return enhdVar.c();
            }
        }, this.c).i(new eroh() { // from class: cguz
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                StringBuilder sb = new StringBuilder("Section: mobile_configuration_retriever_flags_psd\n");
                enqu listIterator = ((enhk) obj).entrySet().listIterator();
                while (listIterator.hasNext()) {
                    cgva cgvaVar = cgva.this;
                    Map.Entry entry = (Map.Entry) listIterator.next();
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    sb.append("sim_loggable_guid: ");
                    sb.append(str2);
                    sb.append("\nRcsOnboardingFlags:\n");
                    enhk a = ((cguo) cgvaVar.a.b()).a(str);
                    StringBuilder sb2 = new StringBuilder();
                    enqu listIterator2 = a.entrySet().listIterator();
                    while (listIterator2.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) listIterator2.next();
                        sb2.append(String.format("       %s: %s\n", entry2.getKey(), entry2.getValue()));
                    }
                    sb.append(sb2.toString());
                    sb.append("RcsUpiPolicyFlags:\n");
                    enhk b = ((cguo) cgvaVar.a.b()).b(str);
                    StringBuilder sb3 = new StringBuilder();
                    enqu listIterator3 = b.entrySet().listIterator();
                    while (listIterator3.hasNext()) {
                        Map.Entry entry3 = (Map.Entry) listIterator3.next();
                        sb3.append(String.format("       %s: %s\n", entry3.getKey(), entry3.getValue()));
                    }
                    sb.append(sb3.toString());
                }
                return elfo.e(sb.toString());
            }
        }, this.c);
    }

    @Override // defpackage.cfzm
    public final /* synthetic */ elfl c() {
        return cfzj.c();
    }

    @Override // defpackage.cfzm
    public final /* synthetic */ elfl d() {
        return cfzj.d();
    }
}
