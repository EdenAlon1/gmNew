package defpackage;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.apps.messaging.R;
import j$.time.Instant;
import j$.util.Map;
import j$.util.function.Function$CC;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejwn extends lml {
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    public final ejll c = new ejll("SubscriptionMixinVM");
    public final Set d = new HashSet();
    public final ejlj e;
    public final dlpw f;
    public final ejvr g;
    public final Executor h;

    public ejwn(dlpw dlpwVar, ejvr ejvrVar, Executor executor) {
        this.f = dlpwVar;
        this.g = ejvrVar;
        this.h = executor;
        ejlj ejljVar = new ejlj(executor, true, false);
        this.e = ejljVar;
        ejljVar.c();
    }

    final void a(ejuh ejuhVar, ejxa ejxaVar, ejwd ejwdVar) {
        efbd.c();
        b(ejuhVar, 3, ejwdVar, ejxaVar);
    }

    public final void b(final ejuh ejuhVar, int i, ejwd ejwdVar, ejxa ejxaVar) {
        int andIncrement;
        ejuhVar.getClass();
        ejwz ejwzVar = (ejwz) Map.EL.computeIfAbsent(this.a, ejwdVar.getClass(), new Function() { // from class: ejwm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ejuh ejuhVar2 = ejuhVar;
                ejwn ejwnVar = ejwn.this;
                return new ejwz(ejuhVar2, ejwnVar.f, ejwnVar.g, ejwnVar.e, ejwnVar.h);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        efbd.c();
        ejll ejllVar = this.c;
        cmh cmhVar = ejllVar.c;
        Class<?> cls = ejwdVar.getClass();
        if (cmhVar.containsKey(cls)) {
            andIncrement = ((Integer) ejllVar.c.get(cls)).intValue();
        } else {
            andIncrement = ejll.a.getAndIncrement();
            ejllVar.c.put(cls, Integer.valueOf(andIncrement));
        }
        Object put = ejllVar.b.put(Integer.valueOf(andIncrement), ejwdVar);
        ejuhVar.c().getClass();
        boolean z = ejwdVar instanceof elib;
        emxf.a((z && (ejwdVar instanceof ejud)) ? false : true);
        ejua ejuaVar = (ejua) ejwzVar.i;
        Object obj = ejuaVar.b;
        Instant f = ejwzVar.a.f();
        emxf.m(ejuaVar.d != Long.MAX_VALUE, "You've just overflowed a long. Consider upgrading to a BigDecimal, if this happens more than once.");
        ejwdVar.getClass();
        ejwzVar.i = new ejua(ejuhVar, ejuhVar.c(), ejxaVar, ejuaVar.d + 1, i, ejuaVar.e.g(ejuhVar, f));
        ejuc ejucVar = (ejuc) ejwzVar.j;
        ejwzVar.j = new ejuc(ejucVar.a + 1, ejwdVar, ejucVar.c, ejucVar.d, emux.a);
        if (ejwzVar.f == null) {
            ejwzVar.f = new ejwy(ejwzVar);
            ejwzVar.b.d(((ejua) ejwzVar.i).b, ejwzVar.f);
        } else if (!((ejua) ejwzVar.i).b.equals(obj)) {
            ejwzVar.b.e(obj, ejwzVar.f);
            ejwzVar.b.d(((ejua) ejwzVar.i).b, ejwzVar.f);
        }
        if (i == 2) {
            if (z) {
                elib elibVar = (elib) ejwdVar;
                ekzz f2 = eleg.f("RefreshCallbacks.onRefresh");
                try {
                    ((SwipeRefreshLayout) elibVar.a.a.N().findViewById(R.id.pull_to_refresh)).d(true);
                    f2.close();
                    ejwzVar.e = true;
                } finally {
                }
            }
            ejwzVar.e(((ejua) ejwzVar.i).e);
            return;
        }
        if (put == null) {
            if (((ejuc) ejwzVar.j).d.g()) {
                emxf.m(!r0.e.g(), "Cannot be the case that subscription has data.");
                ejwe ejweVar = ejwzVar.j;
                ejwzVar.j = ejwz.a(ejweVar, false, (ejvg) ((ejuc) ejweVar).d.c());
                emxf.m(((ejuc) ejwzVar.j).e.g(), "Callbacks did not accept pinned data after rotation.");
                if (!(((ejuc) ejwzVar.j).b instanceof ejud) || ejwzVar.k.b()) {
                    return;
                }
                ejwzVar.j = ejwzVar.j.g(true);
                ejwz.g((ejud) ((ejuc) ejwzVar.j).b);
                return;
            }
        }
        ejwzVar.f(((ejua) ejwzVar.i).e);
    }

    @Override // defpackage.lml
    protected final void fD() {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((ejwz) it.next()).b();
        }
        Iterator it2 = this.b.values().iterator();
        while (it2.hasNext()) {
            ((ejwz) it2.next()).b();
        }
        this.e.a().clear();
    }
}
