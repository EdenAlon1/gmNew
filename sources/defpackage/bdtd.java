package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
@Deprecated
/* loaded from: classes7.dex */
public final class bdtd {
    private final ffbr a;
    private final ffbr b;

    public bdtd(ffbr ffbrVar, ffbr ffbrVar2) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
    }

    @Deprecated
    public static boolean m(ParticipantsTable.BindData bindData) {
        return bindData.r() != -2;
    }

    @Deprecated
    public static boolean n(bvpo bvpoVar) {
        return bvpoVar.d != -2;
    }

    public final int a() {
        azvu azvuVar = (azvu) this.a.b();
        azvuVar.j.lock();
        try {
            int i = 0;
            for (int i2 = azvuVar.i.d - 1; i2 >= 0; i2--) {
                aztg aztgVar = (aztg) azvuVar.i.g(i2);
                if (!aztgVar.j() && aztgVar.i()) {
                    i++;
                }
            }
            return i;
        } finally {
            azvuVar.j.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x018d A[Catch: Exception -> 0x0191, TRY_LEAVE, TryCatch #2 {Exception -> 0x0191, blocks: (B:20:0x012e, B:23:0x018d, B:43:0x018a, B:42:0x0187, B:26:0x0140, B:28:0x0146, B:31:0x0173, B:34:0x016f, B:38:0x0182), top: B:19:0x012e, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0140 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0106  */
    /* JADX WARN: Type inference failed for: r5v16, types: [aoku, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11, types: [aoku, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13, types: [aoku, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [aoku, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(defpackage.bvpo r14) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdtd.b(bvpo):int");
    }

    @Deprecated
    public final aztg c() {
        azvu azvuVar = (azvu) this.a.b();
        ekzz f = eleg.f("getDefaultSubscription");
        try {
            aztg b = azvuVar.b(((ctwb) azvuVar.c.b()).c());
            f.close();
            return b;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final aztg d(SelfIdentityId selfIdentityId) {
        return ((azvu) this.a.b()).a(selfIdentityId);
    }

    @Deprecated
    public final aztg e() {
        return ((azvu) this.a.b()).c();
    }

    public final aztg f(SelfIdentityId selfIdentityId) {
        return ((azvu) this.a.b()).d(selfIdentityId);
    }

    public final aztg g(int i) {
        return ((azvu) this.a.b()).e(i);
    }

    public final engw h() {
        return engw.n(i());
    }

    public final List i() {
        return ((azvu) this.a.b()).f();
    }

    public final void j(List list) {
        ((azvu) this.a.b()).k(list);
    }

    public final void k() {
        ((azvu) this.a.b()).l();
    }

    public final boolean l(final aoku aokuVar) {
        return Collection.EL.stream(h()).map(new Function() { // from class: bdta
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((aztg) obj).b();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new Predicate() { // from class: bdtb
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
                return ((Optional) obj).isPresent();
            }
        }).anyMatch(new Predicate() { // from class: bdtc
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
                return ((aoku) ((Optional) obj).get()).equals(aoku.this);
            }
        });
    }
}
