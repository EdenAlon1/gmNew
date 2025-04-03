package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekgi implements fbba {
    public static ekbo a(ekcb ekcbVar, ekbp ekbpVar, final ekql ekqlVar, Map map, Executor executor, final ekav ekavVar, final ekcs ekcsVar) {
        ekcbVar.getClass();
        ekbpVar.getClass();
        ekqlVar.getClass();
        executor.getClass();
        ekavVar.getClass();
        return ekbpVar.a(ejzu.c, new ffji() { // from class: ekgc
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                String str = (String) obj;
                str.getClass();
                ekqk ekqkVar = ekcs.this.a(str) ? new ekqk(1, 1) : new ekqk(1, 2);
                Uri c = ekqlVar.c(ekqkVar, File.separator + "phenotype" + File.separator + str);
                c.getClass();
                return c;
            }
        }, executor, map, ekgf.a, new ekgg(ekcbVar), new eroh() { // from class: ekgd
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ekav.this.a((String) obj);
            }
        }, new ffix() { // from class: ekge
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
