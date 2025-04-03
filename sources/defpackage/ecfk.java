package defpackage;

import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecfk implements ecfm {
    private final fgom a;
    private final boolean b;
    private final Instant c;

    private ecfk(fgom fgomVar, boolean z, Instant instant) {
        this.a = fgomVar;
        this.b = z;
        this.c = instant;
    }

    public static ecfk c(fgom fgomVar) {
        Instant instant = Instant.EPOCH;
        eyja eyjaVar = fgomVar.g;
        if (eyjaVar == null) {
            eyjaVar = eyja.a;
        }
        Instant d = eykj.d(eyjaVar);
        HashSet hashSet = new HashSet();
        for (fgox fgoxVar : fgomVar.k) {
            eyev eyevVar = fgoxVar.f;
            if (eyevVar == null) {
                eyevVar = eyev.a;
            }
            Instant plus = d.plus(eykj.c(eyevVar));
            if (true == plus.isAfter(instant)) {
                instant = plus;
            }
            int i = fgoxVar.c;
            int i2 = i != 0 ? i != 3 ? i != 4 ? i != 5 ? 0 : 3 : 2 : 1 : 4;
            if (i2 == 0) {
                throw null;
            }
            int i3 = i2 - 1;
            if (i3 == 0) {
                hashSet.add(Long.valueOf(fgoxVar.e));
            } else if (i3 == 1) {
                hashSet.remove(Long.valueOf(fgoxVar.e));
            }
        }
        return new ecfk(fgomVar, !hashSet.isEmpty(), instant);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ecfk ecfkVar) {
        boolean z = this.b;
        return z != ecfkVar.b ? z ? -1 : 1 : ecfkVar.c.compareTo(this.c);
    }

    @Override // defpackage.ecfm
    public final long b() {
        return this.a.getSerializedSize();
    }

    @Override // defpackage.ecfm
    public final /* synthetic */ Object d() {
        return this.a;
    }
}
