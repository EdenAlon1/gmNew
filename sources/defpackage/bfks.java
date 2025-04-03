package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class bfks {
    public static bfkr n() {
        becl beclVar = new becl();
        beclVar.f = bdgq.a;
        beclVar.c(false);
        int i = engw.d;
        beclVar.b(enou.a);
        return beclVar;
    }

    private static boolean o(Boolean bool) {
        return bool != null && bool.booleanValue();
    }

    public abstract ConversationIdType a();

    public abstract engw b();

    public abstract Boolean c();

    public abstract Boolean d();

    public abstract Boolean e();

    public abstract Boolean f();

    public abstract Boolean g();

    public abstract Integer h();

    public abstract Function i();

    public abstract boolean j();

    public abstract void k();

    public final bfki l() {
        return m().b();
    }

    public final bfkk m() {
        Object apply;
        bfkk c = bejc.c();
        String[] strArr = bfkq.a;
        bfkp bfkpVar = new bfkp();
        int intValue = bfkq.d().intValue();
        if (intValue < 29020) {
            dtub.w("delete_timestamp", intValue);
        }
        bfkpVar.aq(new dtwe("conversations.delete_timestamp", 1, 0L));
        if (o(d())) {
            bfkpVar.aq(new dtrw("conversations.archive_status", 3, bfkp.at((Iterable) DesugarArrays.stream(new byyt[]{byyt.ARCHIVED, byyt.KEEP_ARCHIVED}).map(new Function() { // from class: bfko
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Integer.valueOf(((byyt) obj).h);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toCollection(new Supplier() { // from class: bfkn
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new ArrayList();
                }
            }))), true));
        }
        if (o(e())) {
            byyt byytVar = byyt.UNARCHIVED;
            bfkpVar.aq(new dtwe("conversations.archive_status", 1, Integer.valueOf(byytVar == null ? 0 : byytVar.h)));
        }
        if (o(g())) {
            bfkpVar.aq(new dtrw("conversations.archive_status", 3, bfkp.at((Iterable) enqc.a(byyt.g).map(new Function() { // from class: bfkm
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Integer.valueOf(((byyt) obj).h);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toCollection(new Supplier() { // from class: bfkn
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new ArrayList();
                }
            }))), true));
        }
        if (o(null)) {
            int intValue2 = bfkq.d().intValue();
            if (intValue2 < 8500) {
                dtub.w("source_type", intValue2);
            }
            bfkpVar.aq(new dtwe("conversations.source_type", 1, 1));
        }
        if (o(f())) {
            int intValue3 = bfkq.d().intValue();
            if (intValue3 < 8500) {
                dtub.w("source_type", intValue3);
            }
            bfkpVar.aq(new dtwe("conversations.source_type", 2, 1));
        }
        if (o(c())) {
            int[] iArr = {0, 1};
            int intValue4 = bfkq.d().intValue();
            if (intValue4 < 10006) {
                dtub.w("join_state", intValue4);
            }
            bfkpVar.aq(new dtrw("conversations.join_state", 3, bfkp.au(iArr), true));
        }
        ConversationIdType a = a();
        if (!a.b()) {
            bfkpVar.d(a);
        }
        engw b = b();
        if (!b.isEmpty()) {
            engr engrVar = new engr();
            Iterator<E> it = b.iterator();
            while (it.hasNext()) {
                engrVar.h(String.valueOf(bdgq.a((ConversationIdType) it.next())));
            }
            bfkpVar.aq(new dtrw("conversations._id", 3, bfkp.at(engrVar.g()), true));
        }
        if (o(Boolean.valueOf(j()))) {
            bfkpVar.c();
        }
        Function i = i();
        if (i != null) {
            apply = i.apply(bfkpVar);
            bfkpVar = (bfkp) apply;
        }
        bfkk c2 = bejc.c();
        c2.d(bfkpVar);
        Integer h = h();
        if (h != null) {
            c2.x(h.intValue());
        }
        if (((Boolean) ((cfup) bzaq.p.get()).e()).booleanValue()) {
            bfkd bfkdVar = bfkq.b;
            c2.c(new bfkh(bfkdVar.b, false), new bfkh(bfkdVar.a, true));
        } else {
            c2.c(new bfkh(bfkq.b.b, false));
        }
        c.d(bfkpVar);
        Integer h2 = h();
        if (h2 != null) {
            c.x(h2.intValue());
        }
        c.c(new bfkh(bfkq.b.b, false));
        return c;
    }
}
