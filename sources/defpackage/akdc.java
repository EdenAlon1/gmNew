package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akdc {
    public static final entd a = entd.c("BugleBackup");
    private final cevh b;

    public akdc(cevh cevhVar) {
        cevhVar.getClass();
        this.b = cevhVar;
    }

    public final void a(akcv akcvVar) {
        this.b.a(ceyr.g("MessagesRestoreWorkItemHandler", akcvVar));
    }

    public final void b(UUID uuid, int i) {
        uuid.getClass();
        ((ensz) a.h()).w("Queueing work to restore attachment workflowVersion:[%s] sessionId:[%s]", i, uuid);
        akcj akcjVar = (akcj) akcv.a.createBuilder();
        akcjVar.getClass();
        akcw.c(cqjf.a(uuid), akcjVar);
        akcw.b(i, akcjVar);
        akct akctVar = (akct) akcu.a.createBuilder();
        akctVar.getClass();
        eyfy build = akctVar.build();
        build.getClass();
        akcjVar.copyOnWrite();
        akcv akcvVar = (akcv) akcjVar.instance;
        akcvVar.d = (akcu) build;
        akcvVar.c = 3;
        a(akcw.a(akcjVar));
    }

    public final void c(UUID uuid, int i) {
        uuid.getClass();
        ((ensz) a.h()).w("Queueing work to restore the database workflowVersion:[%s] sessionId:[%s]", i, uuid);
        akcj akcjVar = (akcj) akcv.a.createBuilder();
        akcjVar.getClass();
        akcw.c(cqjf.a(uuid), akcjVar);
        akcw.b(i, akcjVar);
        akck akckVar = (akck) akcl.a.createBuilder();
        akckVar.getClass();
        eyfy build = akckVar.build();
        build.getClass();
        akcjVar.copyOnWrite();
        akcv akcvVar = (akcv) akcjVar.instance;
        akcvVar.d = (akcl) build;
        akcvVar.c = 2;
        a(akcw.a(akcjVar));
    }

    public final void d(UUID uuid, akci akciVar) {
        uuid.getClass();
        akciVar.getClass();
        ((ensz) a.h()).t("Queueing work to finalize restore [%s]", uuid);
        akcj akcjVar = (akcj) akcv.a.createBuilder();
        akcjVar.getClass();
        akcw.c(cqjf.a(uuid), akcjVar);
        akcm akcmVar = (akcm) akcn.a.createBuilder();
        akcmVar.getClass();
        akcmVar.copyOnWrite();
        akcn akcnVar = (akcn) akcmVar.instance;
        akcnVar.b |= 1;
        akcnVar.c = akciVar.q;
        eyfy build = akcmVar.build();
        build.getClass();
        akcjVar.copyOnWrite();
        akcv akcvVar = (akcv) akcjVar.instance;
        akcvVar.d = (akcn) build;
        akcvVar.c = 5;
        a(akcw.a(akcjVar));
    }

    public final void e(UUID uuid) {
        uuid.getClass();
        ((ensz) a.h()).t("Queueing work to notify listeners [%s]", uuid);
        akcj akcjVar = (akcj) akcv.a.createBuilder();
        akcjVar.getClass();
        akcw.c(cqjf.a(uuid), akcjVar);
        akcp akcpVar = (akcp) akcq.a.createBuilder();
        akcpVar.getClass();
        eyfy build = akcpVar.build();
        build.getClass();
        akcjVar.copyOnWrite();
        akcv akcvVar = (akcv) akcjVar.instance;
        akcvVar.d = (akcq) build;
        akcvVar.c = 4;
        a(akcw.a(akcjVar));
    }
}
