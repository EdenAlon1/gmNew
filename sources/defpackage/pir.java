package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import androidx.window.reflection.Consumer2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pir implements phv {
    public static volatile pir a;
    public static final ReentrantLock b = new ReentrantLock();
    public final Context c;
    public final CopyOnWriteArrayList d;
    public final pij e;
    private final pio f;

    public pir(Context context, final pij pijVar) {
        this.c = context;
        this.e = pijVar;
        final pio pioVar = new pio(this);
        this.f = pioVar;
        this.d = new CopyOnWriteArrayList();
        if (pijVar != null) {
            int i = pijVar.d.a;
            if (i == 1) {
                pgp pgpVar = pijVar.c;
                ActivityEmbeddingComponent activityEmbeddingComponent = pijVar.a;
                int i2 = fflc.a;
                activityEmbeddingComponent.getClass().getMethod("setSplitInfoCallback", pgpVar.b()).invoke(activityEmbeddingComponent, pgpVar.c(new ffkb(List.class), new pii(pioVar, pijVar)));
            } else if (i >= 2 && i < 5) {
                pijVar.a(pioVar);
            } else if (i >= 5) {
                pijVar.a(pioVar);
                pijVar.a.registerActivityStackCallback(new Executor() { // from class: pie
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        runnable.run();
                    }
                }, new Consumer2() { // from class: pid
                    @Override // androidx.window.reflection.Consumer2, androidx.window.extensions.core.util.function.Consumer
                    public final void accept(Object obj) {
                        List list = (List) obj;
                        list.getClass();
                        phm phmVar = pijVar.b;
                        ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(phm.b(pgq$$ExternalSyntheticApiModelOutline0.m606m(it.next())));
                        }
                        pim.this.a();
                    }
                });
            }
        }
        new cmj((byte[]) null);
        new HashMap();
        ffca.a(new piq(this));
    }

    @Override // defpackage.phv
    public final boolean a(Activity activity) {
        boolean isActivityEmbedded;
        pij pijVar = this.e;
        if (pijVar == null) {
            return false;
        }
        isActivityEmbedded = pijVar.a.isActivityEmbedded(activity);
        return isActivityEmbedded;
    }
}
