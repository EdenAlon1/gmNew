package defpackage;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class ffhp implements Serializable, ffgu, ffhs {
    public final ffgu A;

    public ffhp(ffgu ffguVar) {
        this.A = ffguVar;
    }

    protected abstract Object b(Object obj);

    public ffgu c(Object obj, ffgu ffguVar) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // defpackage.ffhs
    public ffhs dI() {
        ffgu ffguVar = this.A;
        if (ffguVar instanceof ffhs) {
            return (ffhs) ffguVar;
        }
        return null;
    }

    public String toString() {
        String name = getClass().getName();
        Objects.toString(name);
        return "Continuation at ".concat(String.valueOf(name));
    }

    @Override // defpackage.ffgu
    public final void w(Object obj) {
        ffgu ffguVar = this;
        while (true) {
            ffguVar.getClass();
            ffhp ffhpVar = (ffhp) ffguVar;
            ffgu ffguVar2 = ffhpVar.A;
            ffguVar2.getClass();
            try {
                obj = ffhpVar.b(obj);
                if (obj == ffhh.a) {
                    return;
                }
            } catch (Throwable th) {
                obj = ffci.a(th);
            }
            ffhpVar.g();
            if (!(ffguVar2 instanceof ffhp)) {
                ffguVar2.w(obj);
                return;
            }
            ffguVar = ffguVar2;
        }
    }

    @Override // defpackage.ffhs
    public void dJ() {
    }

    protected void g() {
    }
}
