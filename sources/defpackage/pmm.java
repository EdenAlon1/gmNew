package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public class pmm extends pmk {
    public final WindowLayoutComponent a;
    private final pgp b;
    private final ReentrantLock c = new ReentrantLock();
    private final Map d = new LinkedHashMap();
    private final Map e = new LinkedHashMap();
    private final Map f = new LinkedHashMap();

    public pmm(WindowLayoutComponent windowLayoutComponent, pgp pgpVar) {
        this.a = windowLayoutComponent;
        this.b = pgpVar;
    }

    @Override // defpackage.pmk, defpackage.pmi
    public void a(Context context, Executor executor, ksp kspVar) {
        ffcu ffcuVar;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            MulticastConsumer multicastConsumer = (MulticastConsumer) this.d.get(context);
            if (multicastConsumer != null) {
                multicastConsumer.a(kspVar);
                this.e.put(kspVar, context);
                ffcuVar = ffcu.a;
            } else {
                ffcuVar = null;
            }
            if (ffcuVar == null) {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                this.d.put(context, multicastConsumer2);
                this.e.put(kspVar, context);
                multicastConsumer2.a(kspVar);
                pgp pgpVar = this.b;
                WindowLayoutComponent windowLayoutComponent = this.a;
                int i = fflc.a;
                Object c = pgpVar.c(new ffkb(WindowLayoutInfo.class), new pml(multicastConsumer2));
                windowLayoutComponent.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, pgpVar.b()).invoke(windowLayoutComponent, context, c);
                this.f.put(multicastConsumer2, new pgo(windowLayoutComponent.getClass().getMethod("removeWindowLayoutInfoListener", pgpVar.b()), windowLayoutComponent, c));
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.pmk, defpackage.pmi
    public void b(ksp kspVar) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            Context context = (Context) this.e.get(kspVar);
            if (context == null) {
                return;
            }
            MulticastConsumer multicastConsumer = (MulticastConsumer) this.d.get(context);
            if (multicastConsumer != null) {
                ReentrantLock reentrantLock2 = multicastConsumer.a;
                reentrantLock2.lock();
                try {
                    multicastConsumer.b.remove(kspVar);
                    reentrantLock2.unlock();
                    this.e.remove(kspVar);
                    if (multicastConsumer.b.isEmpty()) {
                        this.d.remove(context);
                        pgo pgoVar = (pgo) this.f.remove(multicastConsumer);
                        if (pgoVar != null) {
                            pgoVar.a.invoke(pgoVar.b, pgoVar.c);
                        }
                    }
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
