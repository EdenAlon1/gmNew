package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
@Deprecated
/* loaded from: classes6.dex */
public final class aqsm implements aqux {
    public static final entd a = entd.c("BugleSelfIdentity");
    final Optional b;
    public final ffbr c;
    final ffbr d;
    public final csjk e;
    public final ffbr f;
    public final ffbr g;
    private final ParticipantsTable.BindData h;
    private final ffbr i;
    private final ffbr j;
    private final ffbr k;
    private final errl l;
    private final ffbr m;
    private final ffbr n;
    private final SelfIdentityId o;
    private final emyl p;
    private final emyl q;
    private final emyl r;
    private final Optional s;
    private final errl t;
    private final errl u;
    private final ffbr v;
    private final aqge w;
    private final ffbr x;
    private final ffbr y;
    private final ffbr z;

    public aqsm(final ffbr ffbrVar, final ffbr ffbrVar2, final ffbr ffbrVar3, final ffbr ffbrVar4, ffbr ffbrVar5, final ffbr ffbrVar6, ffbr ffbrVar7, csjk csjkVar, errl errlVar, errl errlVar2, errl errlVar3, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, ffbr ffbrVar14, ffbr ffbrVar15, ffbr ffbrVar16, final ParticipantsTable.BindData bindData, Optional optional, ffbr ffbrVar17, ffbr ffbrVar18, ffbr ffbrVar19) {
        this.i = ffbrVar;
        this.j = ffbrVar5;
        this.k = ffbrVar7;
        this.l = errlVar2;
        this.m = ffbrVar14;
        this.n = ffbrVar15;
        this.c = ffbrVar16;
        emxf.a(bindData.r() != -2);
        this.h = bindData;
        this.b = optional;
        this.o = aqvf.b(bindData.S());
        this.p = emys.a(new emyl() { // from class: aqsb
            @Override // defpackage.emyl
            public final Object get() {
                entd entdVar = aqsm.a;
                return ((aqzb) ffbr.this.b()).a(((ctwb) ffbrVar.b()).h(bindData.r()));
            }
        });
        this.q = emys.a(new emyl() { // from class: aqsd
            @Override // defpackage.emyl
            public final Object get() {
                entd entdVar = aqsm.a;
                aqwd aqwdVar = (aqwd) ffbr.this.b();
                aolr aolrVar = (aolr) ffbrVar6.b();
                ParticipantsTable.BindData bindData2 = bindData;
                return aqwdVar.a(aolrVar.A(bindData2), ((ctwb) ffbrVar.b()).h(bindData2.r()));
            }
        });
        this.r = emys.a(new emyl() { // from class: aqse
            @Override // defpackage.emyl
            public final Object get() {
                entd entdVar = aqsm.a;
                return ((aqwa) ffbr.this.b()).a();
            }
        });
        this.s = Optional.of(((aolr) ffbrVar6.b()).o(bindData));
        this.e = csjkVar;
        this.t = errlVar;
        this.u = errlVar3;
        this.d = ffbrVar8;
        this.f = ffbrVar9;
        this.g = ffbrVar10;
        this.v = ffbrVar11;
        this.w = ((atti) ffbrVar12.b()).a() ? ((aqvt) ffbrVar13.b()).a() : new aqgf(aqvj.a);
        this.x = ffbrVar18;
        this.y = ffbrVar17;
        this.z = ffbrVar19;
    }

    @Override // defpackage.aqux
    public final int a() {
        return this.h.s();
    }

    @Override // defpackage.aqux
    public final int b() {
        int r = this.h.r();
        if (r != -1) {
            return r;
        }
        ((ensz) ((ensz) a.j()).h("com/google/android/apps/messaging/shared/api/messaging/selfidentity/DefaultSelfIdentity", "getSubId", 250, "DefaultSelfIdentity.java")).t("SelfIdentity %s wraps a subId = -1", g());
        return -1;
    }

    @Override // defpackage.aqux
    public final Uri c() {
        Uri uri = null;
        if (!this.b.isEmpty()) {
            Optional m = m();
            if (!m.isEmpty()) {
                uri = ((crji) this.m.b()).f(((ProfilesTable.BindData) this.b.get()).q(), ((ProfilesTable.BindData) this.b.get()).v(), (aoku) m.get(), null);
            }
        }
        return uri != null ? uri : ((azze) this.j.b()).a(this.h);
    }

    @Override // defpackage.aqux
    public final aqge d() {
        return this.w;
    }

    @Override // defpackage.aqux
    public final aqge e() {
        return (aqge) this.p.get();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aqsm) {
            return w(((aqsm) obj).g());
        }
        return false;
    }

    @Override // defpackage.aqux
    public final aqge f() {
        return ((aqwc) this.q.get()).a();
    }

    @Override // defpackage.aqux
    public final SelfIdentityId g() {
        return aqvf.b(this.h.S());
    }

    @Override // defpackage.aqux
    public final aqvx h() {
        return (aqvx) this.r.get();
    }

    public final int hashCode() {
        return g().hashCode();
    }

    @Override // defpackage.aqux
    public final aqyt i() {
        return (aqyt) m().filter(new Predicate() { // from class: aqsi
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
                entd entdVar = aqsm.a;
                return ((aoku) obj).e().isPresent();
            }
        }).filter(new Predicate() { // from class: aqsj
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
                return ((ctvb) aqsm.this.g.b()).I(((awui) ((aoku) obj).e().get()).d);
            }
        }).map(new Function() { // from class: aqsk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((aqyu) aqsm.this.f.b()).a((aoku) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElseGet(new Supplier() { // from class: aqsl
            @Override // java.util.function.Supplier
            public final Object get() {
                ((ensz) ((ensz) aqsm.a.j()).h("com/google/android/apps/messaging/shared/api/messaging/selfidentity/DefaultSelfIdentity", "getRcsConfig", 336, "DefaultSelfIdentity.java")).q("messaging identity is not available, returning default config.");
                return aqxz.a;
            }
        });
    }

    @Override // defpackage.aqux
    public final elfl j() {
        return elfo.g(new Callable() { // from class: aqsg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aqsm.this.i();
            }
        }, this.u);
    }

    @Override // defpackage.aqux
    public final elfl k(final boolean z, final boolean z2) {
        return ((arag) this.n.b()).a(this).h(new emwl() { // from class: aqsc
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((aqzv) aqsm.this.c.b()).a(z ? alxi.GROUP : alxi.ONE_ON_ONE, z2, (araf) obj);
            }
        }, this.l);
    }

    @Override // defpackage.aqux
    public final elfl l(final alyx alyxVar) {
        return elfl.g(this.t.submit(eldl.m(new Callable() { // from class: aqsh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i = true != alyxVar.g ? 0 : 3;
                aqsm aqsmVar = aqsm.this;
                return Boolean.valueOf(((csmz) aqsmVar.e.a()).d(i, aqsmVar.b()) == csod.AVAILABLE);
            }
        })));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [aoku, java.lang.Object] */
    @Override // defpackage.aqux
    public final Optional m() {
        this.s.isPresent();
        return this.s.get().F() ? this.s : ((aqyr) this.k.b()).a(b());
    }

    @Override // defpackage.aqux
    public final String n() {
        return this.h.P();
    }

    @Override // defpackage.aqux
    public final String o() {
        return emxe.b(this.h.X());
    }

    @Override // defpackage.aqux
    public final String p() {
        String o = o();
        String n = n();
        return n != null ? a.w(n, o, " ") : o;
    }

    @Override // defpackage.aqux
    public final String q() {
        return this.h.R();
    }

    @Override // defpackage.aqux
    public final String r() {
        return this.h.U();
    }

    @Override // defpackage.aqux
    public final boolean s() {
        if (((attd) this.z.b()).a()) {
            return true;
        }
        if (!((atte) this.y.b()).a()) {
            return false;
        }
        return ((ezgu) this.x.b()).b.contains(Integer.valueOf(((ctwb) this.i.b()).h(b()).c()));
    }

    @Override // defpackage.aqux
    public final boolean t() {
        return ((ctwb) this.i.b()).h(this.h.r()).D();
    }

    public final String toString() {
        return String.format("SelfIdentity{id:%s, subId: %s} has rows {%s}", g(), Integer.valueOf(b()), this.o);
    }

    @Override // defpackage.aqux
    public final boolean u() {
        int c = ((ctwb) this.i.b()).c();
        return c >= 0 && b() == c;
    }

    @Override // defpackage.aqux
    public final boolean v() {
        return ((ctwb) this.i.b()).h(this.h.r()).C();
    }

    @Override // defpackage.aqux
    public final boolean w(SelfIdentityId selfIdentityId) {
        return ((SelfIdentityIdImpl) this.o).a.equals(selfIdentityId.b());
    }

    @Override // defpackage.aqux
    public final elfl x(final int i, final Optional optional) {
        return (elfl) ((Optional) this.d.b()).map(new Function() { // from class: aqsf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i2 = i;
                aqwr aqwrVar = (aqwr) obj;
                aqsm aqsmVar = aqsm.this;
                return (i2 == 2 || i2 == 3) ? aqwrVar.a(aqsmVar, optional) : elfo.e(aqwrVar.c(aqsmVar, aqsmVar.b));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(elfo.e(Optional.empty()));
    }
}
