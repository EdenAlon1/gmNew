package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekgo implements fbba {
    public static ekbo a(ekgu ekguVar, ekbp ekbpVar, final eisx eisxVar, Map map, final ejer ejerVar, final ekav ekavVar, Executor executor, final eixo eixoVar, final ekem ekemVar) {
        ekguVar.getClass();
        ekbpVar.getClass();
        eisxVar.getClass();
        ekavVar.getClass();
        executor.getClass();
        eixoVar.getClass();
        return ekbpVar.a(ejzu.d, new ffji() { // from class: ekgj
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                String str = (String) obj;
                str.getClass();
                Uri a = ejer.this.a(ejer.a, "phenotype/".concat(str)).a();
                a.getClass();
                return a;
            }
        }, executor, map, ekgm.a, new ekgn(ekguVar), new eroh() { // from class: ekgk
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                String str = (String) obj;
                str.getClass();
                return ekav.this.b(str, eisxVar);
            }
        }, new ffix() { // from class: ekgl
            @Override // defpackage.ffix
            public final Object invoke() {
                return ekemVar.a(((eizi) eixo.this.i(eisxVar)).a);
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
