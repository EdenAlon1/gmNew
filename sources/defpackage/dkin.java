package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkin implements dklu {
    final /* synthetic */ dkip a;

    public dkin(dkip dkipVar) {
        this.a = dkipVar;
    }

    @Override // defpackage.dklu
    public final void a(int i, String str) {
        dkty.c("Presence information was not published: status: %d error: %s", Integer.valueOf(i), str);
        if (i == 423) {
            dkip dkipVar = this.a;
            this.a.w(Math.max(dkipVar.u(), dkipVar.i.j != null ? r4.f : 0));
            return;
        }
        if (i == 412) {
            this.a.o.a();
            dkip dkipVar2 = this.a;
            dkipVar2.w(dkipVar2.u());
        }
    }

    @Override // defpackage.dklu
    public final void b(String str, dkwz dkwzVar) {
        int i;
        dkty.c("Presence information was successfully published: Presence %s", dkwzVar == null ? dkwzVar : dkwzVar.toString());
        this.a.v();
        dkip dkipVar = this.a;
        dkls dklsVar = dkipVar.i;
        dkgf dkgfVar = dklsVar.j;
        if (dkgfVar == null) {
            i = (int) TimeUnit.MILLISECONDS.toSeconds(dklsVar.m.a);
            if (i <= 0) {
                i = 3600;
            }
        } else {
            i = dkgfVar.e;
        }
        dkipVar.w(Math.max((int) (i * 0.9d), 300));
        if (str == null || dkwzVar == null) {
            return;
        }
        diul diulVar = this.a.o;
        synchronized (diulVar.c) {
            String e = diulVar.a.e();
            diulVar.a.n(str);
            try {
                OutputStream c = diulVar.b.c("capabilities-pidf.xml");
                try {
                    dkxc.b(dkwzVar, c);
                    if (c != null) {
                        c.close();
                    }
                } catch (Throwable th) {
                    if (c != null) {
                        try {
                            c.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (IOException e2) {
                if (Objects.isNull(e)) {
                    diulVar.a.m();
                } else {
                    diulVar.a.n(e);
                }
                dkty.i(e2, "Failed to store capabilities PIDF on disk", new Object[0]);
            }
        }
    }

    @Override // defpackage.dklu
    public final void c() {
        dkty.c("Presence service has started", new Object[0]);
    }

    @Override // defpackage.dklu
    public final void d() {
        dkty.c("Publication of presence information has terminated ", new Object[0]);
        this.a.o.a();
    }

    @Override // defpackage.dklu
    public final void e(String str, dkwz dkwzVar) {
        dkip dkipVar = this.a;
        dkht a = dkipVar.n.a(dkwzVar, dkipVar.l.a);
        a.d = true;
        dkip dkipVar2 = this.a;
        ctvb ctvbVar = dkipVar2.k;
        Map map = dkipVar2.j;
        String o = dkut.o(str, ctvbVar);
        dkio dkioVar = (dkio) map.get(o);
        if (dkioVar == null) {
            dkty.q("Unexpected Presence update from %s", dktx.USER_ID.c(str));
            return;
        }
        dkip dkipVar3 = this.a;
        long longValue = dkioVar.a.longValue();
        Iterator it = dkipVar3.g.iterator();
        while (it.hasNext()) {
            ((dkic) it.next()).k(longValue, o, a);
        }
        dkipVar3.j.remove(o);
    }

    @Override // defpackage.dklu
    public final void f(dkys dkysVar) {
        dkty.c("Presence subscription state has changed to %s", dkysVar.d);
    }
}
