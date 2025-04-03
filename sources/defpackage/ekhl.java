package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekhl implements fbba {
    public static ekbo a(ekbp ekbpVar, errl errlVar, final eisx eisxVar, ekgu ekguVar, final ejer ejerVar, final ekav ekavVar, Map map, final eixo eixoVar, final ekem ekemVar) {
        ekbpVar.getClass();
        errlVar.getClass();
        eisxVar.getClass();
        ekguVar.getClass();
        ekavVar.getClass();
        eixoVar.getClass();
        return ekbpVar.a(ejzu.b, new ffji() { // from class: ekhf
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                String str = (String) obj;
                str.getClass();
                Uri a = ejer.this.a(ejer.a, "phenotype/".concat(str)).a();
                a.getClass();
                return a;
            }
        }, errlVar, map, ekhi.a, new ekhj(ekguVar), new eroh() { // from class: ekhg
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                String str = (String) obj;
                str.getClass();
                return ekav.this.b(str, eisxVar);
            }
        }, new ffix() { // from class: ekhh
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
