package defpackage;

import android.content.Intent;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekas implements ekoq, ekoh {
    private final ekay a;
    private final Set b;

    public ekas(Map map, ekay ekayVar, errm errmVar) {
        map.getClass();
        ekayVar.getClass();
        errmVar.getClass();
        this.a = ekayVar;
        this.b = map.keySet();
    }

    @Override // defpackage.ekoq
    public final ListenableFuture a(Intent intent) {
        intent.getClass();
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        ekzz g = eleg.g("Updating experiments", elad.a);
        try {
            ListenableFuture g2 = stringExtra == null ? this.a.g() : this.b.contains(stringExtra) ? this.a.f(stringExtra) : erqt.i(null);
            ejjz.c(g2, "Failed updating experiments for package %s", stringExtra);
            final ffji ffjiVar = new ffji() { // from class: ekaq
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    ((Exception) obj).getClass();
                    return null;
                }
            };
            ListenableFuture e = elfr.e(g2, Exception.class, new emwl() { // from class: ekar
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    ffji.this.invoke(obj);
                    return null;
                }
            }, erpp.a);
            ffig.a(g, null);
            return e;
        } finally {
        }
    }

    @Override // defpackage.ekoh
    public final long b() {
        return 25000L;
    }

    @Override // defpackage.ekoh
    public final long c() {
        return 25000L;
    }
}
