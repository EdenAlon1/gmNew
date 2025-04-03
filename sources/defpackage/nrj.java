package defpackage;

import j$.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nrj {
    public final lug a;
    public final nsl b;
    public final AtomicInteger c = new AtomicInteger();
    private final lua d;
    private nsl e;

    public nrj(lug lugVar, lua luaVar, nsl nslVar) {
        this.a = lugVar;
        this.d = luaVar;
        this.b = nslVar;
        this.e = nslVar;
    }

    public final synchronized void a(nsl nslVar) {
        lti.c(this.c.getAndDecrement() > 0);
        nsk nskVar = new nsk(this.e);
        String str = nslVar.b;
        nsl nslVar2 = this.b;
        int i = lvf.a;
        if (!Objects.equals(str, nslVar2.b)) {
            nskVar.b(nslVar.b);
        }
        if (!Objects.equals(nslVar.c, this.b.c)) {
            nskVar.c(nslVar.c);
        }
        int i2 = nslVar.a;
        nsl nslVar3 = this.b;
        if (i2 != nslVar3.a) {
            nskVar.a = i2;
        }
        int i3 = nslVar.d;
        if (i3 != nslVar3.d) {
            nskVar.b = i3;
        }
        this.e = nskVar.a();
        if (this.c.get() != 0 || this.b.equals(this.e)) {
            return;
        }
        this.d.b(new Runnable() { // from class: nri
            @Override // java.lang.Runnable
            public final void run() {
                nrj.this.a.f(-1, new lud() { // from class: nrh
                    @Override // defpackage.lud
                    public final void a(Object obj) {
                    }
                });
            }
        });
    }
}
