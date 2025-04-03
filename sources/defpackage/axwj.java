package defpackage;

import android.net.Uri;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axwj {
    public static final ayeb a(axwi axwiVar) {
        axwiVar.getClass();
        aydy aydyVar = (aydy) ayeb.a.createBuilder();
        aydyVar.copyOnWrite();
        ((ayeb) aydyVar.instance).c = axwiVar.a;
        aydyVar.copyOnWrite();
        ((ayeb) aydyVar.instance).d = axwiVar.b;
        aydyVar.copyOnWrite();
        ((ayeb) aydyVar.instance).e = axwiVar.c;
        aydyVar.copyOnWrite();
        ((ayeb) aydyVar.instance).f = axwiVar.d;
        aydyVar.copyOnWrite();
        ((ayeb) aydyVar.instance).g = axwiVar.e;
        aydyVar.copyOnWrite();
        ((ayeb) aydyVar.instance).h = axwiVar.f;
        aydyVar.copyOnWrite();
        ((ayeb) aydyVar.instance).i = axwiVar.g;
        aydyVar.copyOnWrite();
        ((ayeb) aydyVar.instance).n = axwiVar.m;
        eyja d = eykm.d(axwiVar.t.toEpochMilli());
        aydyVar.copyOnWrite();
        ayeb ayebVar = (ayeb) aydyVar.instance;
        d.getClass();
        ayebVar.s = d;
        ayebVar.b |= 256;
        Collection<axzb> collection = axwiVar.u;
        ArrayList arrayList = new ArrayList(ffdx.n(collection, 10));
        for (axzb axzbVar : collection) {
            aydz aydzVar = (aydz) ayea.a.createBuilder();
            aydzVar.getClass();
            long j = axzbVar.a;
            aydzVar.copyOnWrite();
            ayea ayeaVar = (ayea) aydzVar.instance;
            ayeaVar.b |= 1;
            ayeaVar.c = j;
            String str = axzbVar.b;
            aydzVar.copyOnWrite();
            ayea ayeaVar2 = (ayea) aydzVar.instance;
            ayeaVar2.b |= 2;
            ayeaVar2.d = str;
            eyfy build = aydzVar.build();
            build.getClass();
            arrayList.add((ayea) build);
        }
        aydyVar.copyOnWrite();
        ayeb ayebVar2 = (ayeb) aydyVar.instance;
        eygr eygrVar = ayebVar2.t;
        if (!eygrVar.c()) {
            ayebVar2.t = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(arrayList, ayebVar2.t);
        String str2 = axwiVar.j;
        if (str2 != null) {
            aydyVar.copyOnWrite();
            ayeb ayebVar3 = (ayeb) aydyVar.instance;
            ayebVar3.b |= 4;
            ayebVar3.l = str2;
        }
        String str3 = axwiVar.l;
        if (str3 != null) {
            aydyVar.copyOnWrite();
            ayeb ayebVar4 = (ayeb) aydyVar.instance;
            ayebVar4.b |= 512;
            ayebVar4.u = str3;
        }
        String str4 = axwiVar.h;
        if (str4 != null) {
            aydyVar.copyOnWrite();
            ayeb ayebVar5 = (ayeb) aydyVar.instance;
            ayebVar5.b |= 1;
            ayebVar5.j = str4;
        }
        String str5 = axwiVar.i;
        if (str5 != null) {
            aydyVar.copyOnWrite();
            ayeb ayebVar6 = (ayeb) aydyVar.instance;
            ayebVar6.b |= 2;
            ayebVar6.k = str5;
        }
        String str6 = axwiVar.k;
        if (str6 != null) {
            aydyVar.copyOnWrite();
            ayeb ayebVar7 = (ayeb) aydyVar.instance;
            ayebVar7.b |= 8;
            ayebVar7.m = str6;
        }
        String str7 = axwiVar.r;
        if (str7 != null) {
            aydyVar.copyOnWrite();
            ayeb ayebVar8 = (ayeb) aydyVar.instance;
            ayebVar8.b |= 64;
            ayebVar8.q = str7;
        }
        String str8 = axwiVar.s;
        if (str8 != null) {
            aydyVar.copyOnWrite();
            ayeb ayebVar9 = (ayeb) aydyVar.instance;
            ayebVar9.b |= 128;
            ayebVar9.r = str8;
        }
        Uri uri = axwiVar.o;
        if (uri != null) {
            String uri2 = uri.toString();
            aydyVar.copyOnWrite();
            ayeb ayebVar10 = (ayeb) aydyVar.instance;
            uri2.getClass();
            ayebVar10.b |= 16;
            ayebVar10.o = uri2;
        }
        Uri uri3 = axwiVar.p;
        if (uri3 != null) {
            String uri4 = uri3.toString();
            aydyVar.copyOnWrite();
            ayeb ayebVar11 = (ayeb) aydyVar.instance;
            uri4.getClass();
            ayebVar11.b |= 32;
            ayebVar11.p = uri4;
        }
        Integer num = axwiVar.q;
        if (num != null) {
            int intValue = num.intValue();
            aydyVar.copyOnWrite();
            ayeb ayebVar12 = (ayeb) aydyVar.instance;
            ayebVar12.b |= 1024;
            ayebVar12.v = intValue;
        }
        eyfy build2 = aydyVar.build();
        build2.getClass();
        return (ayeb) build2;
    }

    public static final Instant b(List list) {
        list.getClass();
        if (list.isEmpty()) {
            throw new IllegalStateException("Check failed.");
        }
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Instant instant = ((axwi) it.next()).t;
        while (it.hasNext()) {
            Instant instant2 = ((axwi) it.next()).t;
            if (instant.compareTo(instant2) > 0) {
                instant = instant2;
            }
        }
        return instant;
    }

    public static final boolean c(axwi axwiVar) {
        axwiVar.getClass();
        return axwiVar.j != null;
    }
}
