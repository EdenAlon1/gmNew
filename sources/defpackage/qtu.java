package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qtu implements qtp {
    public final cmh b = new rjs();

    @Override // defpackage.qtp
    public final void a(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            cmh cmhVar = this.b;
            if (i >= cmhVar.d) {
                return;
            }
            qtt qttVar = (qtt) cmhVar.d(i);
            cmh cmhVar2 = this.b;
            qts qtsVar = qttVar.c;
            Object g = cmhVar2.g(i);
            if (qttVar.e == null) {
                qttVar.e = qttVar.d.getBytes(qtp.a);
            }
            qtsVar.a(qttVar.e, g, messageDigest);
            i++;
        }
    }

    public final Object b(qtt qttVar) {
        return this.b.containsKey(qttVar) ? this.b.get(qttVar) : qttVar.b;
    }

    public final void c(qtu qtuVar) {
        this.b.i(qtuVar.b);
    }

    public final void d(qtt qttVar, Object obj) {
        this.b.put(qttVar, obj);
    }

    @Override // defpackage.qtp
    public final boolean equals(Object obj) {
        if (obj instanceof qtu) {
            return this.b.equals(((qtu) obj).b);
        }
        return false;
    }

    @Override // defpackage.qtp
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.b.toString() + "}";
    }
}
