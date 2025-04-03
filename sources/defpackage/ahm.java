package defpackage;

import java.util.Objects;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahm {
    public final ScheduledFuture a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    final /* synthetic */ ahn c;

    public ahm(ahn ahnVar) {
        this.c = ahnVar;
        this.a = ahnVar.b.d.schedule(new Runnable() { // from class: ahk
            @Override // java.lang.Runnable
            public final void run() {
                final ahm ahmVar = ahm.this;
                if (ahmVar.b.getAndSet(true)) {
                    return;
                }
                ahn ahnVar2 = ahmVar.c;
                ahnVar2.b.c.execute(new Runnable() { // from class: ahl
                    @Override // java.lang.Runnable
                    public final void run() {
                        ahm ahmVar2 = ahm.this;
                        if (ahmVar2.c.b.A == 9) {
                            ahmVar2.c.b.q("Camera onError timeout, reopen it.");
                            ahmVar2.c.b.K(8);
                            ahmVar2.c.b.f.b();
                        } else {
                            ahn ahnVar3 = ahmVar2.c;
                            int i = ahmVar2.c.b.A;
                            Objects.toString(aho.a(i));
                            ahnVar3.b.q("Camera skip reopen at state: ".concat(aho.a(i)));
                        }
                    }
                });
            }
        }, 2000L, TimeUnit.MILLISECONDS);
    }
}
