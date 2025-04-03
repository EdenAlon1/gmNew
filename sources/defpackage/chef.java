package defpackage;

import android.content.ContentValues;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chef {
    public static final cskc a = cskc.g("BugleNetwork", "RemoteInstanceDatabaseOperations");
    public final dtuu b;
    public final cqoh c;
    public final fazb d;
    public final atuc e;
    private final fazb f;

    public chef(dtuu dtuuVar, cqoh cqohVar, fazb fazbVar, atuc atucVar, fazb fazbVar2) {
        this.b = dtuuVar;
        this.c = cqohVar;
        this.f = fazbVar2;
        this.d = fazbVar;
        this.e = atucVar;
    }

    public static bxgk a(final String str) {
        String[] strArr = bxgl.a;
        bxgk bxgkVar = new bxgk();
        String[] strArr2 = bxiv.a;
        bxis bxisVar = new bxis(bxiv.a);
        bxisVar.z("RemoteRegistrationsTable#whereUserId");
        bxisVar.d(new Function() { // from class: chdx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bxiu bxiuVar = (bxiu) obj;
                bxiuVar.b(str);
                return bxiuVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bxisVar.c(bxiv.c.b);
        bxgkVar.aq(new dtru("remote_registrations_table.tachyon_registration_id", 3, bxisVar.b()));
        return bxgkVar;
    }

    public static boolean i(fcfm fcfmVar) {
        return fcfmVar.d.size() > 0 && fcfmVar.d.contains(Integer.valueOf(cgye.ETOUFFEE.h));
    }

    public static boolean j(fcfm fcfmVar) {
        return fcfmVar.d.size() > 0 && fcfmVar.d.contains(Integer.valueOf(cgye.ETOUFFEE_GROUPS.h));
    }

    public final engw b(final engw engwVar) {
        ekzz f = eleg.f("RemoteInstanceDatabaseOperations#getExistingRegistrations#forMany");
        try {
            bore a2 = borh.a();
            a2.z("getExistingRegistrations2");
            a2.c(new Function() { // from class: chdr
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    borg borgVar = (borg) obj;
                    borgVar.b(engw.this);
                    return borgVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            engw cW = ((borc) a2.b().o()).cW();
            f.close();
            return cW;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final engw c(final String str) {
        ekzz f = eleg.f("RemoteInstanceDatabaseOperations#getExistingRegistrations$forOne");
        try {
            bore a2 = borh.a();
            a2.z("getExistingRegistrations1");
            a2.c(new Function() { // from class: chdy
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    borg borgVar = (borg) obj;
                    borgVar.aq(new dtrt("remote_user_id_to_registration_id.remote_user_id", 1, String.valueOf(str)));
                    return borgVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            engw cW = ((borc) a2.b().o()).cW();
            f.close();
            return cW;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final engw d(final engw engwVar) {
        Object apply;
        ekzz f = eleg.f("RemoteInstanceDatabaseOperations#getFreshRemoteInstances");
        try {
            final Instant minus = this.c.f().minus(Duration.ofMillis(((Long) cful.Y.e()).longValue()));
            String[] strArr = bxhr.a;
            bxhm bxhmVar = new bxhm(bxhr.a);
            bxhmVar.z("+getFreshRemoteInstances");
            apply = new Function() { // from class: chdq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bxhq bxhqVar = (bxhq) obj;
                    bxhqVar.aq(new dtrw("remote_user_id_info_table.remote_user_id", 3, bxhq.at(engw.this), false));
                    bxhqVar.aq(new dtrt("remote_user_id_info_table.guaranteed_fresh_as_of_timestamp", 7, Long.valueOf(bdgw.a(minus))));
                    return bxhqVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }.apply(new bxhq());
            bxhmVar.k(new bxhp((bxhq) apply));
            engw y = bxhmVar.b().y();
            f.close();
            return y;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void e(String str, String str2, bdhd bdhdVar, Optional optional, Long l, Instant instant) {
        String[] strArr = bxgl.a;
        bxex bxexVar = new bxex();
        bxexVar.i(str2);
        bxexVar.c(bdhdVar.a(cgye.ETOUFFEE));
        bxexVar.d(bdhdVar.a(cgye.ETOUFFEE_GROUPS));
        bxexVar.h(bdhdVar);
        bxexVar.g(this.c.f());
        bxexVar.b(instant);
        if (l == null) {
            bxexVar.f(false);
        } else {
            bxexVar.f(true);
            bxexVar.j(l.longValue());
        }
        if (optional.isPresent()) {
            bxexVar.e(((eyee) optional.get()).I());
        }
        bxeu a2 = bxexVar.a();
        final dtve b = bxgl.b();
        dtub.b(bxgl.b(), "remote_registrations_table", a2, new Function() { // from class: bxes
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dtve.this.T("remote_registrations_table", (ContentValues) obj, 5));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: bxet
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        String[] strArr2 = bxiv.a;
        bxib bxibVar = new bxib();
        bxibVar.b(str);
        bxibVar.c(str2);
        bxhy a3 = bxibVar.a();
        final dtve a4 = bxiv.a();
        dtub.b(bxiv.a(), "remote_user_id_to_registration_id", a3, new Function() { // from class: bxhw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dtve.this.T("remote_user_id_to_registration_id", (ContentValues) obj, 5));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: bxhx
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void f(String str, boolean z) {
        Iterator it = ((Set) this.f.b()).iterator();
        while (it.hasNext()) {
            ((bzqh) it.next()).a(str, z);
        }
    }

    public final void g(bxeu bxeuVar) {
        h(bxeuVar, false);
    }

    public final void h(final bxeu bxeuVar, boolean z) {
        ekzz f = eleg.f("RemoteInstanceDatabaseOperations#setHasEncryption");
        try {
            String[] strArr = bxgl.a;
            bxgi bxgiVar = new bxgi();
            bxgiVar.ap("setHasEncryption#update");
            bxgiVar.d(true);
            if (z) {
                bxgiVar.e(true);
            }
            bxgiVar.h(new Function() { // from class: chdu
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bxgk bxgkVar = (bxgk) obj;
                    bxgkVar.b(bxeu.this.m());
                    return bxgkVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bxgiVar.b().e();
            String[] strArr2 = bxiv.a;
            bxis bxisVar = new bxis(bxiv.a);
            bxisVar.z("setHasEncryption");
            bxisVar.d(new Function() { // from class: chdv
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bxiu bxiuVar = (bxiu) obj;
                    bxiuVar.c(bxeu.this.m());
                    return bxiuVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bxij bxijVar = (bxij) bxisVar.b().o();
            while (bxijVar.moveToNext()) {
                try {
                    f(bxijVar.c(), true);
                } finally {
                }
            }
            bxijVar.close();
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
