package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekzb {
    public final String a;
    public final long b;
    public long c;
    public final int d;
    public final String e;
    public final List f = new ArrayList();

    public ekzb(String str, long j, long j2, int i, String str2) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = i;
        this.e = str2;
    }

    public final void a(long j) {
        this.f.add(Long.valueOf(j));
    }
}
