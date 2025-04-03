package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayInputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dije implements ditw {
    final /* synthetic */ dijk a;

    public dije(dijk dijkVar) {
        this.a = dijkVar;
    }

    @Override // defpackage.ditw
    public final void a(dkjt dkjtVar, long j, String str) {
        ConcurrentHashMap concurrentHashMap = this.a.e;
        Long valueOf = Long.valueOf(j);
        dkkj dkkjVar = (dkkj) concurrentHashMap.get(valueOf);
        if (dkkjVar == null) {
            dkty.q("Session %d not found: %s", valueOf, dkjtVar.c());
            return;
        }
        byte[] bArr = dkjtVar.f;
        dijk dijkVar = this.a;
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                dkku a = new dkld().a(byteArrayInputStream);
                dkty.c("Received composing event for %s: %s", dktx.USER_ID.c(str), a);
                boolean z = a.a;
                dkkw dkkwVar = dijkVar.k;
                if (z) {
                    dkkx dkkxVar = dkkwVar.b;
                    dkkxVar.getClass();
                    dkkxVar.a(dkkjVar, str, true);
                    long j2 = a.b;
                    if (j2 != 0) {
                        dkkwVar.a(dkkjVar, j2, str);
                    } else {
                        dkkwVar.a(dkkjVar, 30L, str);
                    }
                } else {
                    dkkwVar.b(dkkjVar, str);
                }
                byteArrayInputStream.close();
            } finally {
            }
        } catch (Exception e) {
            dkty.i(e, "Can't parse is-composing event", new Object[0]);
        }
    }
}
