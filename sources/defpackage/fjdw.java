package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fjdw {
    public fhfd a;
    private final fjdp b;
    private fhgk c;
    private final List d;
    private final List e;

    public fjdw() {
        fjdp fjdpVar = fjdp.a;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.b = fjdpVar;
    }

    public final fjdx a() {
        if (this.c == null) {
            throw new IllegalStateException("Base URL required.");
        }
        fhfd fhfdVar = this.a;
        if (fhfdVar == null) {
            fhfdVar = new fhgs(new fhgr());
        }
        fjdp fjdpVar = this.b;
        List list = this.e;
        Executor a = fjdpVar.a();
        ArrayList arrayList = new ArrayList(list);
        arrayList.addAll(Arrays.asList(fjbs.a, new fjca(a)));
        ArrayList arrayList2 = new ArrayList(this.d.size() + 2);
        arrayList2.add(new fjbi());
        arrayList2.addAll(this.d);
        arrayList2.addAll(Collections.singletonList(fjcu.a));
        return new fjdx(fhfdVar, this.c, DesugarCollections.unmodifiableList(arrayList2), DesugarCollections.unmodifiableList(arrayList));
    }

    public final void b(fjbk fjbkVar) {
        this.e.add(fjbkVar);
    }

    public final void c(fjbt fjbtVar) {
        this.d.add(fjbtVar);
    }

    public final void d(String str) {
        char[] cArr = fhgk.a;
        fhgk b = fhgj.b(str);
        if (!"".equals(b.e.get(r0.size() - 1))) {
            throw new IllegalArgumentException("baseUrl must end in /: ".concat(b.g));
        }
        this.c = b;
    }
}
