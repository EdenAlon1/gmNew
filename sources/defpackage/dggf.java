package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dggf {
    final /* synthetic */ dggn a;

    public dggf(dggn dggnVar) {
        this.a = dggnVar;
    }

    public final void a(dggo dggoVar) {
        dggn dggnVar = this.a;
        dggnVar.a = dggoVar;
        Iterator it = dggnVar.c.iterator();
        while (it.hasNext()) {
            ((dggm) it.next()).b();
        }
        this.a.c.clear();
        this.a.b = null;
    }
}
