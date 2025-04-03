package defpackage;

import java.util.Vector;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ln {
    public final Vector a = new Vector();
    private final cpn b = new cpn();
    private final cpn c = new cpn();
    private final cpn d = new cpn();
    private final cpn e = new cpn();

    private final void e(lt ltVar) {
        byte[] l = ltVar.l();
        if (l != null) {
            this.b.put(new String(l), ltVar);
        }
        byte[] m = ltVar.m();
        if (m != null) {
            this.c.put(new String(m), ltVar);
        }
        byte[] p = ltVar.p();
        if (p != null) {
            this.d.put(new String(p), ltVar);
        }
        byte[] o = ltVar.o();
        if (o != null) {
            this.e.put(new String(o), ltVar);
        }
    }

    public final int a() {
        return this.a.size();
    }

    public final lt b(int i) {
        return (lt) this.a.get(i);
    }

    public final void c(lt ltVar) {
        ltVar.getClass();
        e(ltVar);
        this.a.add(0, ltVar);
    }

    public final void d(lt ltVar) {
        ltVar.getClass();
        e(ltVar);
        this.a.add(ltVar);
    }
}
