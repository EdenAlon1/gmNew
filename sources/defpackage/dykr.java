package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dykr implements dyik {
    public static dykr a;
    public final dyqz b;
    public final dyij c;
    public final dyim d;
    public final dyyt e;
    public final dzcm h;
    public final cgjj i;
    private final ConcurrentMap j = new ConcurrentHashMap();
    final ConcurrentMap g = new ConcurrentHashMap();
    public final errl f = dyia.b().a;

    public dykr(dyqz dyqzVar, dzcm dzcmVar, dyij dyijVar, dyim dyimVar, dyyt dyytVar, cgjj cgjjVar) {
        this.b = dyqzVar;
        this.h = dzcmVar;
        this.c = dyijVar;
        this.d = dyimVar;
        this.e = dyytVar;
        this.i = cgjjVar;
    }

    public static String d(dzpg dzpgVar) {
        String str = dzpgVar.d() + "_" + dzpgVar.e() + "_" + dzpgVar.b().name();
        if (!dzpgVar.c().g()) {
            return str;
        }
        return str + "_" + ((String) dzpgVar.c().c());
    }

    private final boolean h(dzja dzjaVar) {
        return ermr.c((byte[]) this.b.d(dzjaVar).a("BOOTSTRAP_CONVERSATIONS_DOWNLOADED_KEY").c()) >= fdpq.a.get().a();
    }

    private static final boolean i(dzja dzjaVar) {
        return "GMB".equals(dzjaVar.f());
    }

    @Override // defpackage.dyik
    public final void a(final dzja dzjaVar) {
        dyhj.a();
        final long currentTimeMillis = System.currentTimeMillis();
        if (!"GMM".equals(dzjaVar.f()) && !"GMB".equals(dzjaVar.f())) {
            dyhr.a("LitBstrpCntrl", " Invalid app name.");
            erqt.i(null);
            return;
        }
        if (!g(dzjaVar)) {
            dyyu.a(dzjaVar, this.e, 10101, 393);
            dyhr.a("LitBstrpCntrl", " Bootstrap already save timestamp in last 24 hours");
            erqt.i(null);
        } else {
            if (!f(dzjaVar)) {
                dyyu.a(dzjaVar, this.e, 10101, 392);
                dyhr.a("LitBstrpCntrl", "bootstrapping already running.");
                erqt.i(null);
                return;
            }
            dyhr.a("LitBstrpCntrl", "triggering bootstrap this should be only one ");
            dyyt dyytVar = this.e;
            dzhl r = dzhm.r();
            r.n(dzjaVar.c().f());
            r.g(10104);
            dyytVar.b(r.a());
            this.f.submit(new Callable() { // from class: dykm
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ListenableFuture g;
                    final dykr dykrVar = dykr.this;
                    dyqz dyqzVar = dykrVar.b;
                    final dzja dzjaVar2 = dzjaVar;
                    final dyrb d = dyqzVar.d(dzjaVar2);
                    final dzwo b = dyqzVar.b(dzjaVar2);
                    emxc a2 = dyqzVar.d(dzjaVar2).a("CURRENT_BOOTSTRAP_LATEST_MESSAGE_TIMESTAMP");
                    if (a2.g()) {
                        dyhr.a("LitBstrpCntrl", "Latest timestamp already saved previously, continue to use the existing timestamp");
                        emxc a3 = dykrVar.b.d(dzjaVar2).a("LAST_SERVER_BOOTSTRAP_CHECK_TIMESTAMP_KEY");
                        long c = a3.g() ? ermr.c((byte[]) a3.c()) : 0L;
                        long c2 = ermr.c((byte[]) a2.c());
                        dyhj.a();
                        long currentTimeMillis2 = System.currentTimeMillis();
                        dyhr.a("LitBstrpCntrl", a.s(c, "Got lastCheckBootstrapTimestamp "));
                        dyhr.a("LitBstrpCntrl", "Got latestMessageTimestamp ".concat(a2.toString()));
                        dyhr.a("LitBstrpCntrl", a.s(currentTimeMillis2, "Got currentTimestampMills "));
                        dyhr.a("LitBstrpCntrl", "Got Bootstrap threshold  ".concat(String.valueOf(String.valueOf(fdql.a()))));
                        if (currentTimeMillis2 - c > fdql.a() && currentTimeMillis2 - TimeUnit.MICROSECONDS.toMillis(c2) > fdql.a()) {
                            emxc a4 = d.a("CURRENT_BOOTSTRAP_LATEST_MESSAGE_TIMESTAMP");
                            if (a4.g()) {
                                dyyu.a(dzjaVar2, dykrVar.e, 10077, 409);
                                long c3 = ermr.c((byte[]) a4.c());
                                dyxa c4 = dyxb.c();
                                ((dyww) c4).a = "Check bootstrap necessary";
                                c4.b(dyxf.g);
                                dyxb a5 = c4.a();
                                dyhr.a("LitBstrpCntrl", "Start verifying if bootstrap needed with server");
                                dzcm dzcmVar = dykrVar.h;
                                ListenableFuture b2 = dzcmVar.a.b(UUID.randomUUID(), new dzey(c3, dzjaVar2), dzcmVar.a.d.a(), dzjaVar2, a5, true);
                                dyyu.a(dzjaVar2, dykrVar.e, 10088, 396);
                                g = erny.g(b2, new eroh() { // from class: dykp
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj) {
                                        dyqn dyqnVar = (dyqn) obj;
                                        dyhj.a();
                                        byte[] f = ermr.f(System.currentTimeMillis());
                                        dyrb dyrbVar = d;
                                        dyrbVar.c("LAST_SERVER_BOOTSTRAP_CHECK_TIMESTAMP_KEY", f);
                                        int a6 = dyqnVar.a();
                                        dykr dykrVar2 = dykr.this;
                                        dzja dzjaVar3 = dzjaVar2;
                                        if (a6 == 1) {
                                            dzwo dzwoVar = b;
                                            dyyu.a(dzjaVar3, dykrVar2.e, 10088, 398);
                                            dyrbVar.c("BOOTSTRAP_DOWNLOAD_CONVERSATION_TOKEN_KEY", "".getBytes(StandardCharsets.UTF_8));
                                            dyrbVar.c("BOOTSTRAP_CONVERSATIONS_DOWNLOADED_KEY", ermr.f(0L));
                                            dyyu.a(dzjaVar3, dykrVar2.e, 10088, 400);
                                            long b3 = dyqnVar.b();
                                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                            dyhj.a();
                                            int a7 = dzwoVar.a(b3, timeUnit.toMicros(System.currentTimeMillis() - fdql.a.get().c()));
                                            dyyt dyytVar2 = dykrVar2.e;
                                            dzhl r2 = dzhm.r();
                                            r2.g(10088);
                                            r2.n(dzjaVar3.c().f());
                                            r2.f(399);
                                            dzhx dzhxVar = new dzhx();
                                            dzhxVar.a = emxc.j(Integer.valueOf(a7));
                                            r2.b(dzhxVar.a());
                                            dyytVar2.b(r2.a());
                                            dyhr.a("LitBstrpCntrl", "Server check Bootstrap necessary, finish checking deleting latest message timestamp from kv store.");
                                        } else {
                                            dyyu.a(dzjaVar3, dykrVar2.e, 10088, 397);
                                        }
                                        dyrbVar.b();
                                        dyhr.a("LitBstrpCntrl", "Start downloading conversations.");
                                        return dykrVar2.b(dzjaVar3);
                                    }
                                }, erpp.a);
                            } else {
                                dyyu.a(dzjaVar2, dykrVar.e, 10102, 394);
                                dyzp dyzpVar = new dyzp();
                                dyzpVar.c(false);
                                dyzpVar.b(0);
                                g = erqt.i(dyzpVar.a());
                            }
                            erqt.r(g, new dykq(dykrVar, dzjaVar2, currentTimeMillis), dykrVar.f);
                            return null;
                        }
                    } else {
                        dyhr.f("LitBstrpCntrl", "No latest message timestamp found in key value store.");
                    }
                    dyyu.a(dzjaVar2, dykrVar.e, 10077, 395);
                    dyhr.a("LitBstrpCntrl", "Local check bootstrap not necessary, finish checking deleting latest message timestamp from kv store.");
                    d.b();
                    g = dykrVar.b(dzjaVar2);
                    erqt.r(g, new dykq(dykrVar, dzjaVar2, currentTimeMillis), dykrVar.f);
                    return null;
                }
            });
        }
    }

    final ListenableFuture b(final dzja dzjaVar) {
        emxc a2 = this.b.d(dzjaVar).a("BOOTSTRAP_DOWNLOAD_CONVERSATION_TOKEN_KEY");
        if (!a2.g() || "BOOTSTRAP_TOKEN_FINISH_VALUE".equals(new String((byte[]) a2.c()))) {
            if (!a2.g()) {
                dyyu.a(dzjaVar, this.e, 10099, 403);
            }
            dyzp dyzpVar = new dyzp();
            dyzpVar.c(true);
            dyzpVar.b(0);
            return erqt.i(dyzpVar.a());
        }
        if (i(dzjaVar) && h(dzjaVar)) {
            dyzp dyzpVar2 = new dyzp();
            dyzpVar2.c(true);
            dyzpVar2.b(0);
            return erqt.i(dyzpVar2.a());
        }
        String str = new String((byte[]) a2.c());
        dyyu.a(dzjaVar, this.e, 10099, true != str.isEmpty() ? 402 : 401);
        dyhr.a("LitBstrpCntrl", "Start downloading conversation with token ".concat(true != str.isEmpty() ? str : "inital token"));
        return erny.f(c(dzjaVar, str, true, 0), new emwl() { // from class: dyko
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                dzam dzamVar = (dzam) obj;
                if (dzamVar.b()) {
                    dzja dzjaVar2 = dzjaVar;
                    dykr dykrVar = dykr.this;
                    dyyu.a(dzjaVar2, dykrVar.e, 10099, 404);
                    dyhr.a("LitBstrpCntrl", "start syncing block list.");
                    dykrVar.c.a(dzjaVar2);
                }
                return dzamVar;
            }
        }, this.f);
    }

    public final ListenableFuture c(final dzja dzjaVar, String str, boolean z, final int i) {
        if ("BOOTSTRAP_TOKEN_FINISH_VALUE".equals(str) || (TextUtils.isEmpty(str) && !z)) {
            dyzp dyzpVar = new dyzp();
            dyzpVar.b(i);
            dyzpVar.c(true);
            return erqt.i(dyzpVar.a());
        }
        if (i(dzjaVar) && h(dzjaVar)) {
            dyzp dyzpVar2 = new dyzp();
            dyzpVar2.b(i);
            dyzpVar2.c(true);
            return erqt.i(dyzpVar2.a());
        }
        dyxa c = dyxb.c();
        ((dyww) c).a = "Bootstrap List Conversations";
        c.b(dyxf.g);
        dyxb a2 = c.a();
        dzcm dzcmVar = this.h;
        int b = (int) fdql.a.get().b();
        Context context = dzcmVar.b;
        Map map = dzcmVar.d;
        dyyt dyytVar = dzcmVar.c;
        return erny.g(dzcmVar.a.b(UUID.randomUUID(), new dzfj(dzjaVar, b, str, context, map, dyytVar), dzcmVar.a.d.a(), dzjaVar, a2, true), new eroh() { // from class: dykn
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                dyqo dyqoVar = (dyqo) obj;
                int size = dyqoVar.a().size() + i;
                dykr dykrVar = dykr.this;
                dyqz dyqzVar = dykrVar.b;
                final dzja dzjaVar2 = dzjaVar;
                dzwo b2 = dyqzVar.b(dzjaVar2);
                dyrb d = dyqzVar.d(dzjaVar2);
                engw a3 = dyqoVar.a();
                int size2 = a3.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    dzow dzowVar = (dzow) a3.get(i2);
                    dzoy[] dzoyVarArr = new dzoy[((enou) ((dzmp) dzowVar.a()).a).c];
                    for (int i3 = 0; i3 < ((enou) ((dzmp) dzowVar.a()).a).c; i3++) {
                        dzoyVarArr[i3] = (dzoy) ((dzmp) dzowVar.a()).a.get(i3);
                    }
                    b2.U(dzowVar.b(), dzoyVarArr);
                    dzpt b3 = dzowVar.b();
                    String b4 = dzpq.GROUP.equals(b3.e()) ? b3.d().b() : dykr.d(b3.c());
                    String str2 = dykr.d(((dzio) b3).a) + "_" + b4 + "_" + b3.e().name() + "_";
                    if (dzpq.GROUP.equals(b3.e())) {
                        str2 = str2 + b3.d().a() + "_" + b3.d().b();
                    }
                    int i4 = eodh.a;
                    d.c("BOOTSTRAP_DOWNLOAD_MESSAGES_TOKEN_KEY_PREFIX_".concat(eodf.a.c(str2, StandardCharsets.UTF_8).toString()), "".getBytes(StandardCharsets.UTF_8));
                    dyim dyimVar = dykrVar.d;
                    final dzpt b5 = dzowVar.b();
                    final SettableFuture create = SettableFuture.create();
                    final dyol dyolVar = (dyol) dyimVar;
                    erqt.m(new Callable() { // from class: dymv
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            final dyol dyolVar2 = dyol.this;
                            final dzja dzjaVar3 = dzjaVar2;
                            dzwo l = dyolVar2.l(dzjaVar3);
                            final dzpt dzptVar = b5;
                            dzwu q = l.q(dzptVar);
                            final SettableFuture settableFuture = create;
                            q.k(new dzwt() { // from class: dymg
                                @Override // defpackage.dzwt
                                public final void a(Object obj2) {
                                    emxc emxcVar = (emxc) obj2;
                                    boolean g = emxcVar.g();
                                    SettableFuture settableFuture2 = settableFuture;
                                    if (g) {
                                        dyhj.a();
                                        if (System.currentTimeMillis() <= ((dzpk) emxcVar.c()).b()) {
                                            settableFuture2.set((dzpk) emxcVar.c());
                                            return;
                                        }
                                    }
                                    dzpt dzptVar2 = dzptVar;
                                    dzja dzjaVar4 = dzjaVar3;
                                    dyol dyolVar3 = dyol.this;
                                    dzpj r = dzpk.r();
                                    r.f(dzptVar2);
                                    r.h(-1L);
                                    r.b(new HashMap());
                                    r.c(dzptVar2.e() == dzpq.ONE_TO_ONE);
                                    settableFuture2.m(dyolVar3.r(dzjaVar4, r.a(), true));
                                }
                            });
                            return null;
                        }
                    }, erpp.a);
                }
                String b6 = dyqoVar.b();
                if (true == TextUtils.isEmpty(b6)) {
                    b6 = "BOOTSTRAP_TOKEN_FINISH_VALUE";
                }
                d.c("BOOTSTRAP_DOWNLOAD_CONVERSATION_TOKEN_KEY", b6.getBytes(StandardCharsets.UTF_8));
                d.c("BOOTSTRAP_CONVERSATIONS_DOWNLOADED_KEY", ermr.f(size));
                return dykrVar.c(dzjaVar2, dyqoVar.b(), false, size);
            }
        }, this.f);
    }

    public final synchronized void e(dzja dzjaVar) {
        dyhr.a("LitBstrpCntrl", " Release bootstrap lock");
        this.j.put(Long.valueOf(dzjaVar.a()), false);
    }

    final synchronized boolean f(dzja dzjaVar) {
        if (this.j.containsKey(Long.valueOf(dzjaVar.a())) && ((Boolean) this.j.get(Long.valueOf(dzjaVar.a()))).booleanValue()) {
            return false;
        }
        this.j.put(Long.valueOf(dzjaVar.a()), true);
        return true;
    }

    final synchronized boolean g(dzja dzjaVar) {
        dyrb d = this.b.d(dzjaVar);
        emxc a2 = d.a("CURRENT_BOOTSTRAP_LATEST_MESSAGE_TIMESTAMP");
        if (this.g.containsKey(Long.valueOf(dzjaVar.a()))) {
            dyhj.a();
            if (System.currentTimeMillis() - ((Long) this.g.get(Long.valueOf(dzjaVar.a()))).longValue() < fdql.a.get().d() && !a2.g()) {
                dyhr.a("LitBstrpCntrl", "Timestamp already saved within 24 hours, skipping");
                return false;
            }
        }
        long e = this.b.b(dzjaVar).e();
        if (!a2.g()) {
            d.c("CURRENT_BOOTSTRAP_LATEST_MESSAGE_TIMESTAMP", ermr.f(e));
            dyhr.a("LitBstrpCntrl", a.s(e, " Saving latest message timestamp to kv store with value "));
        }
        ConcurrentMap concurrentMap = this.g;
        Long valueOf = Long.valueOf(dzjaVar.a());
        dyhj.a();
        concurrentMap.put(valueOf, Long.valueOf(System.currentTimeMillis()));
        return true;
    }
}
