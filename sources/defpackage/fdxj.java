package defpackage;

import j$.util.DesugarCollections;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdxj {
    public static final fdxj a;
    public final fdys b;
    public final Executor c;
    public final String d = null;
    public final fdxg e;
    public final String f;
    public final List g;
    public final Integer h;
    public final Integer i;
    private final Object[][] j;
    private final Boolean k;

    static {
        fdxh fdxhVar = new fdxh();
        fdxhVar.e = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        fdxhVar.f = Collections.EMPTY_LIST;
        a = new fdxj(fdxhVar);
    }

    public fdxj(fdxh fdxhVar) {
        this.b = fdxhVar.a;
        this.c = fdxhVar.b;
        this.e = fdxhVar.c;
        this.f = fdxhVar.d;
        this.j = fdxhVar.e;
        this.g = fdxhVar.f;
        this.k = fdxhVar.g;
        this.h = fdxhVar.h;
        this.i = fdxhVar.i;
    }

    public static fdxh a(fdxj fdxjVar) {
        fdxh fdxhVar = new fdxh();
        fdxhVar.a = fdxjVar.b;
        fdxhVar.b = fdxjVar.c;
        fdxhVar.c = fdxjVar.e;
        fdxhVar.d = fdxjVar.f;
        fdxhVar.e = fdxjVar.j;
        fdxhVar.f = fdxjVar.g;
        fdxhVar.g = fdxjVar.k;
        fdxhVar.h = fdxjVar.h;
        fdxhVar.i = fdxjVar.i;
        return fdxhVar;
    }

    public final fdxj b(fdys fdysVar) {
        fdxh a2 = a(this);
        a2.a = fdysVar;
        return new fdxj(a2);
    }

    public final fdxj c(Executor executor) {
        fdxh a2 = a(this);
        a2.b = executor;
        return new fdxj(a2);
    }

    public final fdxj d(int i) {
        emxf.d(i >= 0, "invalid maxsize %s", i);
        fdxh a2 = a(this);
        a2.h = Integer.valueOf(i);
        return new fdxj(a2);
    }

    public final fdxj e(int i) {
        emxf.d(i >= 0, "invalid maxsize %s", i);
        fdxh a2 = a(this);
        a2.i = Integer.valueOf(i);
        return new fdxj(a2);
    }

    public final fdxj f(fdxi fdxiVar, Object obj) {
        fdxiVar.getClass();
        obj.getClass();
        fdxh a2 = a(this);
        int i = 0;
        while (true) {
            Object[][] objArr = this.j;
            if (i >= objArr.length) {
                i = -1;
                break;
            }
            if (fdxiVar.equals(objArr[i][0])) {
                break;
            }
            i++;
        }
        a2.e = (Object[][]) Array.newInstance((Class<?>) Object.class, this.j.length + (i == -1 ? 1 : 0), 2);
        Object[][] objArr2 = this.j;
        System.arraycopy(objArr2, 0, a2.e, 0, objArr2.length);
        if (i == -1) {
            a2.e[this.j.length] = new Object[]{fdxiVar, obj};
        } else {
            a2.e[i] = new Object[]{fdxiVar, obj};
        }
        return new fdxj(a2);
    }

    public final fdxj g(fdxs fdxsVar) {
        ArrayList arrayList = new ArrayList(this.g.size() + 1);
        arrayList.addAll(this.g);
        arrayList.add(fdxsVar);
        fdxh a2 = a(this);
        a2.f = DesugarCollections.unmodifiableList(arrayList);
        return new fdxj(a2);
    }

    public final Object h(fdxi fdxiVar) {
        fdxiVar.getClass();
        int i = 0;
        while (true) {
            Object[][] objArr = this.j;
            if (i >= objArr.length) {
                return fdxiVar.a;
            }
            if (fdxiVar.equals(objArr[i][0])) {
                return this.j[i][1];
            }
            i++;
        }
    }

    public final boolean i() {
        return Boolean.TRUE.equals(this.k);
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.b("deadline", this.b);
        b.b("authority", null);
        b.b("callCredentials", this.e);
        Executor executor = this.c;
        b.b("executor", executor != null ? executor.getClass() : null);
        b.b("compressorName", this.f);
        b.b("customOptions", Arrays.deepToString(this.j));
        b.h("waitForReady", i());
        b.b("maxInboundMessageSize", this.h);
        b.b("maxOutboundMessageSize", this.i);
        b.b("onReadyThreshold", null);
        b.b("streamTracerFactories", this.g);
        return b.toString();
    }
}
