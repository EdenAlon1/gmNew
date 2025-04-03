package defpackage;

import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
class eoch extends eobn {
    final eoce a;

    public eoch(eobl eoblVar) {
        Map h;
        eobq eobqVar = eoblVar.a;
        Integer num = 10;
        num.getClass();
        int ordinal = eobqVar.a.ordinal();
        if (ordinal == 0) {
            h = ennc.h(10);
        } else {
            if (ordinal != 1 && ordinal != 2) {
                if (ordinal == 3) {
                    throw new UnsupportedOperationException("This ordering does not define a comparator.");
                }
                throw new AssertionError();
            }
            h = ennc.j(10);
        }
        this.a = new eoce(h);
        emxf.e(true, "Not true that %s is non-negative.", 0L);
    }

    @Override // defpackage.eobj
    protected final long a() {
        return 0L;
    }

    @Override // defpackage.eobn, defpackage.eobj, defpackage.eoci
    public final /* bridge */ /* synthetic */ Iterable b(Object obj) {
        throw null;
    }

    @Override // defpackage.eobo, defpackage.eobw
    public final Set d() {
        return new eocd(this.a);
    }

    @Override // defpackage.eobo, defpackage.eobw
    public final Set e(final Object obj) {
        eoby eobyVar = (eoby) this.a.a(obj);
        if (eobyVar == null) {
            obj.getClass();
            throw new IllegalArgumentException(a.b(obj, "Node ", " is not an element of this graph."));
        }
        Set a = eobyVar.a();
        emyl emylVar = new emyl() { // from class: eobg
            @Override // defpackage.emyl
            public final Object get() {
                return Boolean.valueOf(eobj.this.d().contains(obj));
            }
        };
        emyl emylVar2 = new emyl() { // from class: eobh
            @Override // defpackage.emyl
            public final Object get() {
                return String.format("Node %s that was used to generate this set is no longer in the graph.", obj);
            }
        };
        a.getClass();
        return new eocb(a, emylVar, emylVar2);
    }

    @Override // defpackage.eocp
    public final Object g(Object obj) {
        eoby eobyVar = (eoby) this.a.a(obj);
        Object b = eobyVar == null ? null : eobyVar.b();
        if (b == null) {
            return null;
        }
        return b;
    }

    @Override // defpackage.eocp
    public final void f() {
    }
}
