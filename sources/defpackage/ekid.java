package defpackage;

import android.database.Cursor;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekid implements edyz {
    private final Optional a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;

    public ekid(Optional optional, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        ffbrVar3.getClass();
        this.a = optional;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
    }

    @Override // defpackage.edyz
    public final void a() {
        this.a.isPresent();
        if (edyn.b()) {
            if (!((Boolean) fflm.a((Optional) ((fbbb) this.d).a, false)).booleanValue()) {
                ekic ekicVar = (ekic) this.b.b();
                if (ekicVar.b.a()) {
                    ekicVar.a(true);
                    return;
                } else {
                    boolean z = ekicVar.h;
                    return;
                }
            }
            final ekjg ekjgVar = (ekjg) this.c.b();
            if (edyn.a(ekjgVar.b) == null) {
                ((enrr) ekjgVar.h.j().h("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner", "runListeners", 92, "StartupAfterPackageReplacedWithRetryRunner.kt")).q("Couldn't determine current process name. Skipping startup after package replaced listeners.");
                return;
            }
            if (!ekjgVar.c.a()) {
                boolean z2 = ekjgVar.i;
                return;
            }
            int i = ekjgVar.f;
            efiv a = ekjgVar.a();
            efko efkoVar = new efko();
            efkoVar.b("SELECT * FROM AllListenersSucceededVersionTable WHERE version_code = (?)");
            efkoVar.c(Long.valueOf(i));
            elfj elfjVar = new elfj(a.a(efkoVar.a()));
            final ffjm ffjmVar = new ffjm() { // from class: ekip
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    efkj efkjVar = ekjg.a;
                    ((erpc) obj).getClass();
                    return Boolean.valueOf(((Cursor) obj2).getCount() > 0);
                }
            };
            elfl h = elfjVar.f(new erow() { // from class: ekix
                @Override // defpackage.erow
                public final Object a(erpc erpcVar, Object obj) {
                    efkj efkjVar = ekjg.a;
                    erpcVar.getClass();
                    return ffjm.this.a(erpcVar, obj);
                }
            }, ekjgVar.d).h();
            final ffji ffjiVar = new ffji() { // from class: ekiy
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    Exception exc = (Exception) obj;
                    exc.getClass();
                    ((enrr) ((enrr) ekjg.this.h.j()).g(exc).h("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner", "didAllListenersAlreadySucceed$lambda$31", 346, "StartupAfterPackageReplacedWithRetryRunner.kt")).q("Failed to get all listeners succeeded at this version");
                    return false;
                }
            };
            elfl e = h.e(Exception.class, new emwl() { // from class: ekiz
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    efkj efkjVar = ekjg.a;
                    return ffji.this.invoke(obj);
                }
            }, erpp.a);
            final ffji ffjiVar2 = new ffji() { // from class: ekio
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    Boolean bool = (Boolean) obj;
                    bool.getClass();
                    if (bool.booleanValue()) {
                        return erre.a;
                    }
                    final ekjg ekjgVar2 = ekjg.this;
                    efiv a2 = ekjgVar2.a();
                    final int i2 = ekjgVar2.f;
                    ListenableFuture e2 = a2.e(new efkr() { // from class: ekja
                        @Override // defpackage.efkr
                        public final void a(efks efksVar) {
                            efkj efkjVar = ekjg.a;
                            efko efkoVar2 = new efko();
                            efkoVar2.b("DELETE FROM ListenerSuccessfulRuns WHERE version_code != ?");
                            Long valueOf = Long.valueOf(i2);
                            efkoVar2.c(valueOf);
                            efksVar.g(efkoVar2.a());
                            efko efkoVar3 = new efko();
                            efkoVar3.b("DELETE FROM AllListenersSucceededVersionTable WHERE version_code != ?");
                            efkoVar3.c(valueOf);
                            efksVar.g(efkoVar3.a());
                        }
                    });
                    final ffji ffjiVar3 = new ffji() { // from class: ekjb
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj2) {
                            Exception exc = (Exception) obj2;
                            exc.getClass();
                            ((enrr) ((enrr) ekjg.this.h.j()).g(exc).h("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner", "tryPurgeOldVersions$lambda$22", 258, "StartupAfterPackageReplacedWithRetryRunner.kt")).q("Failed to purge old versions");
                            return erre.a;
                        }
                    };
                    ListenableFuture f = elfr.f(e2, Exception.class, new eroh() { // from class: ekjc
                        /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            efkj efkjVar = ekjg.a;
                            return ffji.this.invoke(obj2);
                        }
                    }, erpp.a);
                    final ffji ffjiVar4 = new ffji() { // from class: ekir
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj2) {
                            efko efkoVar2 = new efko();
                            efkoVar2.b("SELECT * FROM ListenerSuccessfulRuns WHERE version_code = ?");
                            final ekjg ekjgVar3 = ekjg.this;
                            efkoVar2.c(Long.valueOf(ekjgVar3.f));
                            elfj elfjVar2 = new elfj(ekjgVar3.a().a(efkoVar2.a()));
                            final ffjm ffjmVar2 = new ffjm() { // from class: ekik
                                @Override // defpackage.ffjm
                                public final Object a(Object obj3, Object obj4) {
                                    Cursor cursor = (Cursor) obj4;
                                    efkj efkjVar = ekjg.a;
                                    ((erpc) obj3).getClass();
                                    fffs fffsVar = new fffs((byte[]) null);
                                    while (cursor.moveToNext()) {
                                        String string = cursor.getString(cursor.getColumnIndexOrThrow("listener_key"));
                                        string.getClass();
                                        fffsVar.add(string);
                                    }
                                    return ffdx.a(fffsVar);
                                }
                            };
                            elfl h2 = elfjVar2.f(new erow() { // from class: ekil
                                @Override // defpackage.erow
                                public final Object a(erpc erpcVar, Object obj3) {
                                    efkj efkjVar = ekjg.a;
                                    erpcVar.getClass();
                                    return ffjm.this.a(erpcVar, obj3);
                                }
                            }, ekjgVar3.e).h();
                            final ffji ffjiVar5 = new ffji() { // from class: ekim
                                @Override // defpackage.ffji
                                public final Object invoke(Object obj3) {
                                    Exception exc = (Exception) obj3;
                                    exc.getClass();
                                    ((enrr) ((enrr) ekjg.this.h.j()).g(exc).h("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner", "getListenersPreviouslySucceededAtThisVersion$lambda$27", 299, "StartupAfterPackageReplacedWithRetryRunner.kt")).q("Failed to get listeners previously succeeded at this version");
                                    return ffel.a;
                                }
                            };
                            return h2.e(Exception.class, new emwl() { // from class: ekin
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    efkj efkjVar = ekjg.a;
                                    return ffji.this.invoke(obj3);
                                }
                            }, erpp.a);
                        }
                    };
                    ListenableFuture k = elfr.k(f, new eroh() { // from class: ekis
                        /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            efkj efkjVar = ekjg.a;
                            return ffji.this.invoke(obj2);
                        }
                    }, ekjgVar2.d);
                    final Map map = ekjgVar2.j;
                    final ffji ffjiVar5 = new ffji() { // from class: ekit
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj2) {
                            List list = (List) obj2;
                            list.getClass();
                            Set entrySet = map.entrySet();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj3 : entrySet) {
                                if (!list.contains(((Map.Entry) obj3).getKey())) {
                                    arrayList.add(obj3);
                                }
                            }
                            fffs fffsVar = new fffs((byte[]) null);
                            Iterator it = arrayList.iterator();
                            while (true) {
                                final ekjg ekjgVar3 = ekjg.this;
                                if (!it.hasNext()) {
                                    final List a3 = ffdx.a(fffsVar);
                                    return elfr.a(a3).a(new Callable() { // from class: ekie
                                        @Override // java.util.concurrent.Callable
                                        public final Object call() {
                                            efkj efkjVar = ekjg.a;
                                            List list2 = a3;
                                            boolean z3 = true;
                                            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                                Iterator it2 = list2.iterator();
                                                while (true) {
                                                    if (!it2.hasNext()) {
                                                        break;
                                                    }
                                                    Object q = erqt.q((ListenableFuture) it2.next());
                                                    q.getClass();
                                                    if (!((Boolean) q).booleanValue()) {
                                                        z3 = false;
                                                        break;
                                                    }
                                                }
                                            }
                                            return Boolean.valueOf(z3);
                                        }
                                    }, ekjgVar3.d);
                                }
                                final Map.Entry entry = (Map.Entry) it.next();
                                ListenableFuture p = erqt.p(elfr.i(new ekjf(entry), ekjgVar3.e), 180L, TimeUnit.SECONDS, ekjgVar3.e);
                                ejjz.c(p, "Client StartupAfterPackageReplacedListener failed for key: %s", new evhq(evhp.NO_USER_DATA, entry.getKey()));
                                p.getClass();
                                ListenableFuture a4 = elfr.d(p).a(new Callable() { // from class: ekih
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        efkj efkjVar = ekjg.a;
                                        return true;
                                    }
                                }, erpp.a);
                                final ffji ffjiVar6 = new ffji() { // from class: ekii
                                    @Override // defpackage.ffji
                                    public final Object invoke(Object obj4) {
                                        efkj efkjVar = ekjg.a;
                                        ((Exception) obj4).getClass();
                                        return false;
                                    }
                                };
                                ListenableFuture e3 = elfr.e(a4, Exception.class, new emwl() { // from class: ekij
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj4) {
                                        efkj efkjVar = ekjg.a;
                                        return ffji.this.invoke(obj4);
                                    }
                                }, erpp.a);
                                final ffji ffjiVar7 = new ffji() { // from class: ekif
                                    @Override // defpackage.ffji
                                    public final Object invoke(Object obj4) {
                                        Boolean bool2 = (Boolean) obj4;
                                        bool2.getClass();
                                        if (!bool2.booleanValue()) {
                                            return erqt.i(false);
                                        }
                                        Map.Entry entry2 = entry;
                                        ekjg ekjgVar4 = ekjg.this;
                                        String str = (String) entry2.getKey();
                                        str.getClass();
                                        efiv a5 = ekjgVar4.a();
                                        efko efkoVar2 = new efko();
                                        efkoVar2.b("INSERT INTO ListenerSuccessfulRuns (listener_key, version_code) VALUES (?, ?)");
                                        efkoVar2.d(str);
                                        efkoVar2.c(Long.valueOf(ekjgVar4.f));
                                        ListenableFuture c = a5.c(efkoVar2.a());
                                        c.getClass();
                                        final ffji ffjiVar8 = new ffji() { // from class: ekjd
                                            @Override // defpackage.ffji
                                            public final Object invoke(Object obj5) {
                                                efkj efkjVar = ekjg.a;
                                                return erqt.i(true);
                                            }
                                        };
                                        return elfr.k(c, new eroh() { // from class: ekje
                                            /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
                                            @Override // defpackage.eroh
                                            public final ListenableFuture a(Object obj5) {
                                                efkj efkjVar = ekjg.a;
                                                return ffji.this.invoke(obj5);
                                            }
                                        }, ekjgVar4.d);
                                    }
                                };
                                fffsVar.add(elfr.k(e3, new eroh() { // from class: ekig
                                    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj4) {
                                        efkj efkjVar = ekjg.a;
                                        return ffji.this.invoke(obj4);
                                    }
                                }, ekjgVar3.d));
                            }
                        }
                    };
                    ListenableFuture k2 = elfr.k(k, new eroh() { // from class: ekiu
                        /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            efkj efkjVar = ekjg.a;
                            return ffji.this.invoke(obj2);
                        }
                    }, ekjgVar2.d);
                    final ffji ffjiVar6 = new ffji() { // from class: ekiv
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj2) {
                            Boolean bool2 = (Boolean) obj2;
                            bool2.getClass();
                            if (!bool2.booleanValue()) {
                                return erre.a;
                            }
                            efiv a3 = ekjg.this.a();
                            efko efkoVar2 = new efko();
                            efkoVar2.b("INSERT INTO AllListenersSucceededVersionTable (version_code) VALUES (?)");
                            efkoVar2.c(Long.valueOf(r5.f));
                            ListenableFuture c = a3.c(efkoVar2.a());
                            c.getClass();
                            return c;
                        }
                    };
                    return elfr.k(k2, new eroh() { // from class: ekiw
                        /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            efkj efkjVar = ekjg.a;
                            return ffji.this.invoke(obj2);
                        }
                    }, ekjgVar2.d);
                }
            };
            ejjz.c(elfr.k(e, new eroh() { // from class: ekiq
                /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    efkj efkjVar = ekjg.a;
                    return ffji.this.invoke(obj);
                }
            }, ekjgVar.d), "StartupAfterPackageReplacedListenerImpl infrastructure failure.", new Object[0]);
        }
    }
}
