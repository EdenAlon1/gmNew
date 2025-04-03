package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekcp implements fbba {
    public static ekbo a(ekbp ekbpVar, ekcb ekcbVar, final ekql ekqlVar, errl errlVar, final ekav ekavVar, Map map, final ekcs ekcsVar) {
        ekbpVar.getClass();
        ekcbVar.getClass();
        ekqlVar.getClass();
        errlVar.getClass();
        ekavVar.getClass();
        return ekbpVar.a(ejzu.a, new ffji() { // from class: ekch
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                String str = (String) obj;
                str.getClass();
                ekqk ekqkVar = ekcs.this.a(str) ? new ekqk(1, 1) : new ekqk(1, 2);
                Uri c = ekqlVar.c(ekqkVar, File.separator + "phenotype" + File.separator + str);
                c.getClass();
                return c;
            }
        }, errlVar, map, ekcl.a, new ekcm(ekcbVar), new eroh() { // from class: ekci
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ekav.this.a((String) obj);
            }
        }, new ffix() { // from class: ekcj
            @Override // defpackage.ffix
            public final Object invoke() {
                return "";
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
