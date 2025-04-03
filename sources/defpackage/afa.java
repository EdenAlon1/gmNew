package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class afa extends afb implements Iterator {
    aey a;
    aey b;

    public afa(aey aeyVar, aey aeyVar2) {
        this.a = aeyVar2;
        this.b = aeyVar;
    }

    private final aey d() {
        aey aeyVar = this.b;
        aey aeyVar2 = this.a;
        if (aeyVar == aeyVar2 || aeyVar2 == null) {
            return null;
        }
        return b(aeyVar);
    }

    public abstract aey a(aey aeyVar);

    public abstract aey b(aey aeyVar);

    @Override // java.util.Iterator
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Map.Entry next() {
        aey aeyVar = this.b;
        this.b = d();
        return aeyVar;
    }

    @Override // defpackage.afb
    public final void dH(aey aeyVar) {
        if (this.a == aeyVar && aeyVar == this.b) {
            this.b = null;
            this.a = null;
        }
        aey aeyVar2 = this.a;
        if (aeyVar2 == aeyVar) {
            this.a = a(aeyVar2);
        }
        if (this.b == aeyVar) {
            this.b = d();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }
}
