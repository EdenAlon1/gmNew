package defpackage;

import java.security.MessageDigest;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qwl implements qtp {
    private final Object b;
    private final int c;
    private final int d;
    private final Class e;
    private final Class f;
    private final qtp g;
    private final Map h;
    private final qtu i;
    private int j;

    public qwl(Object obj, qtp qtpVar, int i, int i2, Map map, Class cls, Class cls2, qtu qtuVar) {
        rkf.f(obj);
        this.b = obj;
        rkf.e(qtpVar, "Signature must not be null");
        this.g = qtpVar;
        this.c = i;
        this.d = i2;
        rkf.f(map);
        this.h = map;
        rkf.e(cls, "Resource class must not be null");
        this.e = cls;
        this.f = cls2;
        rkf.f(qtuVar);
        this.i = qtuVar;
    }

    @Override // defpackage.qtp
    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.qtp
    public final boolean equals(Object obj) {
        if (obj instanceof qwl) {
            qwl qwlVar = (qwl) obj;
            if (this.b.equals(qwlVar.b) && this.g.equals(qwlVar.g) && this.d == qwlVar.d && this.c == qwlVar.c && this.h.equals(qwlVar.h) && this.e.equals(qwlVar.e) && this.f.equals(qwlVar.f) && this.i.equals(qwlVar.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.qtp
    public final int hashCode() {
        int i = this.j;
        if (i != 0) {
            return i;
        }
        int hashCode = this.b.hashCode();
        this.j = hashCode;
        int hashCode2 = (((((hashCode * 31) + this.g.hashCode()) * 31) + this.c) * 31) + this.d;
        this.j = hashCode2;
        int hashCode3 = (hashCode2 * 31) + this.h.hashCode();
        this.j = hashCode3;
        int hashCode4 = (hashCode3 * 31) + this.e.hashCode();
        this.j = hashCode4;
        int hashCode5 = (hashCode4 * 31) + this.f.hashCode();
        this.j = hashCode5;
        int hashCode6 = (hashCode5 * 31) + this.i.hashCode();
        this.j = hashCode6;
        return hashCode6;
    }

    public final String toString() {
        qtu qtuVar = this.i;
        Map map = this.h;
        qtp qtpVar = this.g;
        Class cls = this.f;
        Class cls2 = this.e;
        return "EngineKey{model=" + this.b.toString() + ", width=" + this.c + ", height=" + this.d + ", resourceClass=" + cls2.toString() + ", transcodeClass=" + cls.toString() + ", signature=" + qtpVar.toString() + ", hashCode=" + this.j + ", transformations=" + map.toString() + ", options=" + qtuVar.toString() + "}";
    }
}
