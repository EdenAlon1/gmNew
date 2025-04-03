package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cenp {
    public final cqoh a;
    public final long b;
    public long c;
    public String d;
    public int e;
    public int f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public final List k;
    private long l;

    public cenp(cqoh cqohVar) {
        this.a = cqohVar;
        long a = cqohVar.a();
        this.b = a;
        this.c = -1L;
        this.l = a;
        this.d = "";
        this.e = -1;
        this.f = -1;
        this.k = new ArrayList();
    }

    public final void a(String str) {
        long a = this.a.a();
        this.k.add(".. " + str + " - " + (a - this.l) + " (ms)");
        this.l = a;
    }

    public final String toString() {
        long j = this.c - this.b;
        List list = this.k;
        return "\n. Restore page. typeName: " + this.d + ", pageLength: " + this.e + ", totalSize: " + this.f + ", hasNextPage: " + this.g + ", filteredLength: " + this.h + ", failedItemsCount: " + this.i + " - " + j + " (ms), useForegroundService: " + this.j + "\n" + ffdx.aA(list, "\n", null, null, null, 62) + "\n\n";
    }
}
