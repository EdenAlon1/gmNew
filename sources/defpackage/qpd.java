package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qpd {
    long a;
    final String b;
    final String c;
    final long d;
    final long e;
    final long f;
    final long g;
    final List h;

    public qpd(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.b = str;
        this.c = true == "".equals(str2) ? null : str2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = list;
    }

    static qpd a(qpe qpeVar) {
        if (qpf.e(qpeVar) != 538247942) {
            throw new IOException();
        }
        String h = qpf.h(qpeVar);
        String h2 = qpf.h(qpeVar);
        long f = qpf.f(qpeVar);
        long f2 = qpf.f(qpeVar);
        long f3 = qpf.f(qpeVar);
        long f4 = qpf.f(qpeVar);
        int e = qpf.e(qpeVar);
        if (e < 0) {
            throw new IOException(a.h(e, "readHeaderList size="));
        }
        List arrayList = e == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i = 0; i < e; i++) {
            arrayList.add(new qoe(qpf.h(qpeVar).intern(), qpf.h(qpeVar).intern()));
        }
        return new qpd(h, h2, f, f2, f3, f4, arrayList);
    }
}
