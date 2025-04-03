package defpackage;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fito extends fird implements Serializable {
    private static HashMap a = null;
    private static final long serialVersionUID = -1934618396111902255L;
    private final firf b;
    private final firl c;

    private fito(firf firfVar, firl firlVar) {
        if (firlVar == null) {
            throw new IllegalArgumentException();
        }
        this.b = firfVar;
        this.c = firlVar;
    }

    private Object readResolve() {
        return w(this.b, this.c);
    }

    public static synchronized fito w(firf firfVar, firl firlVar) {
        synchronized (fito.class) {
            HashMap hashMap = a;
            fito fitoVar = null;
            if (hashMap == null) {
                a = new HashMap(7);
            } else {
                fito fitoVar2 = (fito) hashMap.get(firfVar);
                if (fitoVar2 == null || fitoVar2.c == firlVar) {
                    fitoVar = fitoVar2;
                }
            }
            if (fitoVar != null) {
                return fitoVar;
            }
            fito fitoVar3 = new fito(firfVar, firlVar);
            a.put(firfVar, fitoVar3);
            return fitoVar3;
        }
    }

    private final UnsupportedOperationException x() {
        return new UnsupportedOperationException(this.b.y.concat(" field is unsupported"));
    }

    @Override // defpackage.fird
    public final int a(long j) {
        throw x();
    }

    @Override // defpackage.fird
    public final int b(Locale locale) {
        throw x();
    }

    @Override // defpackage.fird
    public final int c() {
        throw x();
    }

    @Override // defpackage.fird
    public final int d() {
        throw x();
    }

    @Override // defpackage.fird
    public final long e(long j, int i) {
        return this.c.a(j, i);
    }

    @Override // defpackage.fird
    public final long f(long j) {
        throw x();
    }

    @Override // defpackage.fird
    public final long g(long j) {
        throw x();
    }

    @Override // defpackage.fird
    public final long h(long j, int i) {
        throw x();
    }

    @Override // defpackage.fird
    public final long i(long j, String str, Locale locale) {
        throw x();
    }

    @Override // defpackage.fird
    public final String k(int i, Locale locale) {
        throw x();
    }

    @Override // defpackage.fird
    public final String l(long j, Locale locale) {
        throw x();
    }

    @Override // defpackage.fird
    public final String m(int i, Locale locale) {
        throw x();
    }

    @Override // defpackage.fird
    public final String n(long j, Locale locale) {
        throw x();
    }

    @Override // defpackage.fird
    public final String o() {
        return this.b.y;
    }

    @Override // defpackage.fird
    public final firf p() {
        return this.b;
    }

    @Override // defpackage.fird
    public final firl q() {
        return this.c;
    }

    @Override // defpackage.fird
    public final firl r() {
        return null;
    }

    @Override // defpackage.fird
    public final firl s() {
        return null;
    }

    @Override // defpackage.fird
    public final boolean t(long j) {
        throw x();
    }

    public final String toString() {
        return "UnsupportedDateTimeField";
    }

    @Override // defpackage.fird
    public final boolean u() {
        return false;
    }

    @Override // defpackage.fird
    public final void v() {
    }
}
