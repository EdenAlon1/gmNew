package defpackage;

import j$.util.Map;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hoh extends ffdg implements Map, hnp {
    public static final hoh a = new hoh(hoy.a, 0);
    public final hoy b;
    public final int c;

    public hoh(hoy hoyVar, int i) {
        this.b = hoyVar;
        this.c = i;
    }

    @Override // defpackage.ffdg
    public final int c() {
        return this.c;
    }

    @Override // defpackage.ffdg, java.util.Map
    public boolean containsKey(Object obj) {
        return this.b.l(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    public final hoh d(Object obj, Object obj2) {
        hox d = this.b.d(obj != null ? obj.hashCode() : 0, obj, obj2, 0);
        return d == null ? this : new hoh(d.a, c() + d.b);
    }

    @Override // defpackage.hnp
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public hoj b() {
        return new hoj(this);
    }

    @Override // defpackage.ffdg
    public final /* synthetic */ Collection f() {
        return new hov(this);
    }

    @Override // defpackage.ffdg
    public final Set g() {
        return new hor(this);
    }

    @Override // defpackage.ffdg, java.util.Map
    public Object get(Object obj) {
        return this.b.k(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // defpackage.ffdg
    public final /* synthetic */ Set h() {
        return new hot(this);
    }
}
