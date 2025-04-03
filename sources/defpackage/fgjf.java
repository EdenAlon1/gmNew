package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgjf extends fgjl implements fgjb {
    public final ffqn a;

    public fgjf() {
        super(1);
        this.a = new ffqn(fgjg.a, ffqo.a);
    }

    @Override // defpackage.fgjb
    public final Object a(Object obj, ffgu ffguVar) {
        if (d(obj)) {
            return ffcu.a;
        }
        ffrh a = ffrj.a(ffhi.c(ffguVar));
        try {
            e(new fgje(this, a, obj));
            Object m = a.m();
            ffhh ffhhVar = ffhh.a;
            if (m == ffhhVar) {
                ffguVar.getClass();
            }
            if (m != ffhhVar) {
                m = ffcu.a;
            }
            return m != ffhhVar ? ffcu.a : m;
        } catch (Throwable th) {
            a.E();
            throw th;
        }
    }

    @Override // defpackage.fgjb
    public final void b(Object obj) {
        while (c()) {
            Object obj2 = this.a.a;
            fgho fghoVar = fgjg.a;
            if (obj2 != fghoVar) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(a.k(obj, obj2, "This mutex is locked by ", ", but ", " is expected"));
                }
                if (this.a.d(obj2, fghoVar)) {
                    h();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    @Override // defpackage.fgjb
    public final boolean c() {
        return Math.max(this.c.c, 0) == 0;
    }

    @Override // defpackage.fgjb
    public final boolean d(Object obj) {
        char c;
        while (true) {
            ffql ffqlVar = this.c;
            int i = this.b;
            int i2 = ffqlVar.c;
            if (i2 > i) {
                super.f();
            } else if (i2 <= 0) {
                if (obj == null) {
                    break;
                }
                while (true) {
                    if (!c()) {
                        c = 0;
                        break;
                    }
                    Object obj2 = this.a.a;
                    if (obj2 != fgjg.a) {
                        c = obj2 == obj ? (char) 1 : (char) 2;
                    }
                }
                if (c == 1) {
                    Objects.toString(obj);
                    throw new IllegalStateException("This mutex is already locked by the specified owner: ".concat(obj.toString()));
                }
                if (c == 2) {
                    break;
                }
            } else if (this.c.c(i2, i2 - 1)) {
                boolean z = ffso.a;
                this.a.c(obj);
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "Mutex@" + ffsp.b(this) + "[isLocked=" + c() + ",owner=" + this.a.a + "]";
    }
}
