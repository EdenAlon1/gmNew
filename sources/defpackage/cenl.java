package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cenl {
    public final cqoh a;
    public long b = -1;
    public String c = "";
    public final List d;
    public final List e;
    public String f;
    private final int g;
    private final long h;
    private final long i;

    public cenl(cqoh cqohVar, int i, long j) {
        this.a = cqohVar;
        this.g = i;
        this.h = j;
        this.i = cqohVar.a();
        ArrayList arrayList = new ArrayList(11);
        for (int i2 = 0; i2 < 11; i2++) {
            arrayList.add(null);
        }
        this.d = arrayList;
        this.e = new ArrayList();
    }

    public final cenk a(int i) {
        Integer b = b(i);
        if (b != null) {
            return (cenk) this.d.get(b.intValue());
        }
        return null;
    }

    public final Integer b(int i) {
        int i2 = i - 1;
        if (i2 < 0 || i2 >= this.d.size()) {
            return null;
        }
        return Integer.valueOf(i2);
    }

    public final String toString() {
        Object next;
        Iterator it = this.d.iterator();
        Object obj = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                cenk cenkVar = (cenk) next;
                long j = cenkVar != null ? cenkVar.a : Long.MAX_VALUE;
                do {
                    Object next2 = it.next();
                    cenk cenkVar2 = (cenk) next2;
                    long j2 = cenkVar2 != null ? cenkVar2.a : Long.MAX_VALUE;
                    if (j > j2) {
                        j = j2;
                    }
                    if (j > j2) {
                        next = next2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        cenk cenkVar3 = (cenk) next;
        Iterator it2 = this.d.iterator();
        if (it2.hasNext()) {
            obj = it2.next();
            if (it2.hasNext()) {
                cenk cenkVar4 = (cenk) obj;
                long j3 = cenkVar4 != null ? cenkVar4.f : Long.MIN_VALUE;
                do {
                    Object next3 = it2.next();
                    cenk cenkVar5 = (cenk) next3;
                    long j4 = cenkVar5 != null ? cenkVar5.f : Long.MIN_VALUE;
                    if (j3 < j4) {
                        j3 = j4;
                    }
                    if (j3 < j4) {
                        obj = next3;
                    }
                } while (it2.hasNext());
            }
        }
        long j5 = this.h;
        cenk cenkVar6 = (cenk) obj;
        Object valueOf = j5 == -1 ? "Unknown" : Long.valueOf(this.i - j5);
        long j6 = this.b;
        long j7 = this.i;
        long j8 = j6 - j7;
        long j9 = (cenkVar3 != null ? cenkVar3.a : j7) - j7;
        ceni ceniVar = (ceni) ffdx.M(this.e);
        long j10 = (ceniVar != null ? ceniVar.a : this.b) - (cenkVar6 != null ? cenkVar6.f : this.i);
        long j11 = this.b;
        ceni ceniVar2 = (ceni) ffdx.Q(this.e);
        long j12 = j11 - (ceniVar2 != null ? ceniVar2.d : this.b);
        String str = this.c;
        int i = this.g;
        String h = i == 0 ? "" : a.h(i, ". Max prior attempts: ");
        String aA = ffdx.aA(ffdx.aa(this.d), "\n", null, null, null, 62);
        String aA2 = ffdx.aA(this.e, "\n", null, null, null, 62);
        String str2 = this.f;
        return ffpc.c("\n\n      #. OS/PWQ scheduling overhead (wait time). typeName: " + str + " - " + valueOf + " (ms)\n      #" + h + "\n      #. Batch duration (work time) - " + j8 + " (ms)\n      #.. Setup - " + j9 + " (ms)\n      #" + aA + "\n      #.. Batch result transformations - " + j10 + " (ms)\n      #" + aA2 + "\n      #.. Result propagation - " + j12 + " (ms)\n      #" + (str2 != null ? ". Exception: ".concat(str2) : "") + "\n\n      ", "#");
    }
}
