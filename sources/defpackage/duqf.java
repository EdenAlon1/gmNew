package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Predicate$CC;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duqf implements duqj {
    public static final enru a = enru.c("com/google/android/libraries/inputmethod/emoji/data/GlobalVariantsPreferences");
    public static volatile duqf b;
    public final duqk e;
    public final dupm f;
    public ListenableFuture h;
    public ListenableFuture i;
    public final AtomicReference c = new AtomicReference(duqo.a);
    public final Map d = new ConcurrentHashMap();
    public final Executor g = dunl.a().f;

    public duqf(Context context) {
        this.f = dupm.e(context);
        this.e = new duow(context);
    }

    public static duqm f(duqo duqoVar) {
        return (duqm) Collection.EL.stream(duqoVar.b).filter(new Predicate() { // from class: duqb
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((duqm) obj).b == 2;
            }
        }).findFirst().get();
    }

    public static duqm i(duqo duqoVar) {
        return (duqm) Collection.EL.stream(duqoVar.b).filter(new Predicate() { // from class: duqd
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((duqm) obj).b == 1;
            }
        }).findFirst().get();
    }

    public static duqo j(duqm duqmVar, duqm duqmVar2, duqm duqmVar3) {
        duqn duqnVar = (duqn) duqo.a.createBuilder();
        if (duqmVar != null) {
            duqnVar.b(duqmVar);
        }
        if (duqmVar2 != null) {
            duqnVar.b(duqmVar2);
        }
        if (duqmVar3 != null) {
            duqnVar.b(duqmVar3);
        }
        return (duqo) duqnVar.build();
    }

    public final duqm a(String str) {
        if (this.f.a(str) != duqg.SKINTONE_AND_GENDER_DIRECTIONAL) {
            return null;
        }
        int a2 = dupc.a(((this.f.c(this.f.d(str)).indexOf(str) / 6) % 2) + 1);
        if (a2 == 0) {
            return null;
        }
        duql duqlVar = (duql) duqm.a.createBuilder();
        duqlVar.copyOnWrite();
        duqm duqmVar = (duqm) duqlVar.instance;
        duqmVar.c = Integer.valueOf(a2 - 1);
        duqmVar.b = 3;
        return (duqm) duqlVar.build();
    }

    @Override // defpackage.duqj
    public final ListenableFuture b() {
        return this.i;
    }

    @Override // defpackage.duqj
    public final String c(String str) {
        dupm dupmVar = this.f;
        duqg a2 = dupmVar.a(str);
        String d = dupmVar.d(str);
        if (a2 == null || ((duqo) this.c.get()).equals(dupm.b)) {
            return null;
        }
        duqm h = h();
        duqm g = g();
        int ordinal = a2.ordinal();
        if (ordinal == 0) {
            if (h == null) {
                return null;
            }
            duqn duqnVar = (duqn) duqo.a.createBuilder();
            duqnVar.b(h);
            return k(d, (duqo) duqnVar.build());
        }
        if (ordinal == 1) {
            if (g == null) {
                return null;
            }
            duqn duqnVar2 = (duqn) duqo.a.createBuilder();
            duqnVar2.b(g);
            return k(d, (duqo) duqnVar2.build());
        }
        if (ordinal == 2) {
            if (g == null || h == null) {
                return null;
            }
            duqn duqnVar3 = (duqn) duqo.a.createBuilder();
            duqnVar3.b(h);
            duqnVar3.b(g);
            return k(d, (duqo) duqnVar3.build());
        }
        if (ordinal != 3) {
            if (ordinal != 4) {
                return null;
            }
            return (String) this.d.get(this.f.d(str));
        }
        if (g == null || h == null) {
            return null;
        }
        return k(d, j(h, g, a(str)));
    }

    @Override // defpackage.duqj
    public final boolean d(String str) {
        duqg a2;
        duqo b2;
        if (str.equals(c(str)) || (a2 = this.f.a(str)) == null || (b2 = this.f.b(str)) == null) {
            return false;
        }
        int ordinal = a2.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            this.d.put(this.f.d(str), str);
                        }
                    } else if (b2.b.size() == 3 && enjk.q(b2.b, new dupz()) && enjk.q(b2.b, new duqa())) {
                        this.c.set(j(i(b2), f(b2), null));
                    }
                } else if (b2.b.size() == 2 && enjk.q(b2.b, new dupz()) && enjk.q(b2.b, new duqa())) {
                    this.c.set(b2);
                }
            } else if (b2.b.size() == 1 && enjk.q(b2.b, new dupz())) {
                this.c.set(j(h(), f(b2), null));
            }
        } else if (b2.b.size() == 1 && enjk.q(b2.b, new duqa())) {
            this.c.set(j(i(b2), g(), null));
        }
        duqk duqkVar = this.e;
        dupw dupwVar = (dupw) dupy.a.createBuilder();
        duqo duqoVar = (duqo) this.c.get();
        dupwVar.copyOnWrite();
        dupy dupyVar = (dupy) dupwVar.instance;
        duqoVar.getClass();
        dupyVar.c = duqoVar;
        dupyVar.b |= 1;
        dupwVar.a(this.d);
        ((duow) duqkVar).a((dupy) dupwVar.build());
        return true;
    }

    @Override // defpackage.duqj
    public final int e() {
        return 3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final duqm g() {
        engw n = engw.n(((duqo) this.c.get()).b);
        int a2 = enjk.a(n, new dupz());
        if (a2 < 0) {
            return null;
        }
        return (duqm) n.get(a2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final duqm h() {
        engw n = engw.n(((duqo) this.c.get()).b);
        int a2 = enjk.a(n, new duqa());
        if (a2 < 0) {
            return null;
        }
        return (duqm) n.get(a2);
    }

    public final String k(String str, duqo duqoVar) {
        dupm dupmVar = this.f;
        dupi dupiVar = (dupi) ((enhk) dupmVar.g.get()).get(dupmVar.d(str));
        return dupiVar == null ? str : (String) dupiVar.a.getOrDefault(duqoVar, str);
    }
}
