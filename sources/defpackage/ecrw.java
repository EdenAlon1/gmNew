package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecrw {
    public final ecrv a;
    private long b = 1;

    public ecrw(ecrv ecrvVar) {
        this.a = ecrvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ecrv ecrvVar, long j, ArrayList arrayList) {
        List list;
        if (ecrvVar.f == null) {
            list = ecrvVar.f == null ? Collections.EMPTY_LIST : ecrvVar.f;
        } else {
            list = ecrvVar.f;
            ecrvVar.f = null;
        }
        if (ecrvVar.c() && list.isEmpty()) {
            return;
        }
        fgnq fgnqVar = (fgnq) fgns.a.createBuilder();
        int i = ecrvVar.g;
        String str = ecrvVar.b;
        fgnqVar.copyOnWrite();
        fgns fgnsVar = (fgns) fgnqVar.instance;
        str.getClass();
        fgnsVar.b |= 1;
        fgnsVar.c = str;
        long j2 = ecrvVar.c;
        fgnqVar.copyOnWrite();
        fgns fgnsVar2 = (fgns) fgnqVar.instance;
        fgnsVar2.b |= 512;
        fgnsVar2.h = j2;
        long a = ecrvVar.a();
        fgnqVar.copyOnWrite();
        fgns fgnsVar3 = (fgns) fgnqVar.instance;
        fgnsVar3.b |= 1024;
        fgnsVar3.i = a;
        long j3 = ecrvVar.e;
        fgnqVar.copyOnWrite();
        fgns fgnsVar4 = (fgns) fgnqVar.instance;
        fgnsVar4.b |= 4096;
        fgnsVar4.j = j3;
        long j4 = this.b;
        this.b = 1 + j4;
        fgnqVar.copyOnWrite();
        fgns fgnsVar5 = (fgns) fgnqVar.instance;
        fgnsVar5.b |= 8;
        fgnsVar5.f = j4;
        fgnqVar.copyOnWrite();
        fgns fgnsVar6 = (fgns) fgnqVar.instance;
        fgnsVar6.b |= 16;
        fgnsVar6.g = j;
        int i2 = ecrvVar.h - 1;
        if (i2 == 1) {
            fgnqVar.copyOnWrite();
            fgns fgnsVar7 = (fgns) fgnqVar.instance;
            fgnsVar7.k = 1;
            fgnsVar7.b |= 8192;
        } else if (i2 != 3) {
            fgnqVar.copyOnWrite();
            fgns fgnsVar8 = (fgns) fgnqVar.instance;
            fgnsVar8.k = 0;
            fgnsVar8.b |= 8192;
        } else {
            fgnqVar.copyOnWrite();
            fgns fgnsVar9 = (fgns) fgnqVar.instance;
            fgnsVar9.k = 4;
            fgnsVar9.b |= 8192;
        }
        if (ecrvVar.c()) {
            long j5 = ((ecrv) list.get(list.size() - 1)).d - ecrvVar.c;
            fgnqVar.copyOnWrite();
            fgns fgnsVar10 = (fgns) fgnqVar.instance;
            fgnsVar10.b |= 1024;
            fgnsVar10.i = j5;
        }
        arrayList.add((fgns) fgnqVar.build());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a((ecrv) it.next(), ((fgns) fgnqVar.instance).f, arrayList);
        }
    }
}
