package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aez extends afb implements Iterator {
    final /* synthetic */ afc a;
    private aey b;
    private boolean c = true;

    public aez(afc afcVar) {
        this.a = afcVar;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map.Entry next() {
        aey aeyVar;
        if (this.c) {
            this.c = false;
            aeyVar = this.a.b;
        } else {
            aey aeyVar2 = this.b;
            aeyVar = aeyVar2 != null ? aeyVar2.c : null;
        }
        this.b = aeyVar;
        return this.b;
    }

    @Override // defpackage.afb
    public final void dH(aey aeyVar) {
        aey aeyVar2 = this.b;
        if (aeyVar == aeyVar2) {
            aey aeyVar3 = aeyVar2.d;
            this.b = aeyVar3;
            this.c = aeyVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c) {
            return this.a.b != null;
        }
        aey aeyVar = this.b;
        return (aeyVar == null || aeyVar.c == null) ? false : true;
    }
}
