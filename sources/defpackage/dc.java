package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dc extends ffkk implements ffix {
    final /* synthetic */ de a;
    final /* synthetic */ Object b;
    final /* synthetic */ ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc(de deVar, Object obj, ViewGroup viewGroup) {
        super(0);
        this.a = deVar;
        this.b = obj;
        this.c = viewGroup;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        List list = this.a.a;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((df) it.next()).a.d) {
                    if (fr.af(2)) {
                        Log.v("FragmentManager", "Completing animating immediately");
                    }
                    kqs kqsVar = new kqs();
                    de deVar = this.a;
                    hi hiVar = ((df) deVar.a.get(0)).a;
                    Object obj = this.b;
                    final de deVar2 = this.a;
                    deVar.d.q(obj, kqsVar, new Runnable() { // from class: db
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (fr.af(2)) {
                                Log.v("FragmentManager", "Transition for all operations has completed");
                            }
                            de deVar3 = de.this;
                            Iterator it2 = deVar3.a.iterator();
                            while (it2.hasNext()) {
                                ((df) it2.next()).a.f(deVar3);
                            }
                        }
                    });
                    kqsVar.a();
                    return ffcu.a;
                }
            }
        }
        if (fr.af(2)) {
            Log.v("FragmentManager", "Animating to start");
        }
        final de deVar3 = this.a;
        Object obj2 = deVar3.f;
        obj2.getClass();
        final ViewGroup viewGroup = this.c;
        deVar3.d.u(obj2, new Runnable() { // from class: da
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it2 = de.this.a.iterator();
                while (it2.hasNext()) {
                    hi hiVar2 = ((df) it2.next()).a;
                    View view = hiVar2.a.Q;
                    if (view != null) {
                        hh.b(hiVar2.h, view, viewGroup);
                    }
                }
            }
        });
        return ffcu.a;
    }
}
