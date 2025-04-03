package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dija implements ditw {
    final /* synthetic */ dijk a;

    public dija(dijk dijkVar) {
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
        this.a.k.b(dkkjVar, str);
        String a = dkjtVar.a();
        if (a != null && (a.contains("message/imdn+xml") || a.contains("?xml"))) {
            dkty.q("Suspicious chat message: %s", dkjtVar.c());
        }
        this.a.s(dkjtVar, j, str, dkkjVar);
        dkty.c("Timestamp for MESSAGE_PROCESSED: %d", dkvj.a());
    }
}
