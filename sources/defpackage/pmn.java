package defpackage;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public class pmn extends pmm {
    private final ReentrantLock b;
    private final Map c;
    private final Map d;

    public pmn(WindowLayoutComponent windowLayoutComponent, pgp pgpVar) {
        super(windowLayoutComponent, pgpVar);
        this.b = new ReentrantLock();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
    }

    @Override // defpackage.pmm, defpackage.pmk, defpackage.pmi
    public final void a(Context context, Executor executor, ksp kspVar) {
        ffcu ffcuVar;
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            pmr pmrVar = (pmr) this.c.get(context);
            if (pmrVar != null) {
                pmrVar.addListener(kspVar);
                this.d.put(kspVar, context);
                ffcuVar = ffcu.a;
            } else {
                ffcuVar = null;
            }
            if (ffcuVar == null) {
                pmr pmrVar2 = new pmr(context);
                this.c.put(context, pmrVar2);
                this.d.put(kspVar, context);
                pmrVar2.addListener(kspVar);
                this.a.addWindowLayoutInfoListener(context, pmrVar2);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.pmm, defpackage.pmk, defpackage.pmi
    public final void b(ksp kspVar) {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            Context context = (Context) this.d.get(kspVar);
            if (context == null) {
                return;
            }
            pmr pmrVar = (pmr) this.c.get(context);
            if (pmrVar == null) {
                return;
            }
            pmrVar.removeListener(kspVar);
            this.d.remove(kspVar);
            if (pmrVar.isEmpty()) {
                this.c.remove(context);
                this.a.removeWindowLayoutInfoListener(pmrVar);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
