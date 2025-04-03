package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dijb implements ditw {
    final /* synthetic */ dijk a;

    public dijb(dijk dijkVar) {
        this.a = dijkVar;
    }

    @Override // defpackage.ditw
    public final void a(dkjt dkjtVar, long j, String str) {
        ConcurrentHashMap concurrentHashMap = this.a.e;
        Long valueOf = Long.valueOf(j);
        dkkj dkkjVar = (dkkj) concurrentHashMap.get(valueOf);
        if (dkkjVar == null) {
            dkty.q("Session %d not found: %s", valueOf, dkjtVar.c());
        } else {
            this.a.k.b(dkkjVar, str);
            this.a.s(dkjtVar, j, str, dkkjVar);
        }
    }
}
