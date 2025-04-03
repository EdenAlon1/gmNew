package defpackage;

import android.content.Context;
import android.os.LocaleList;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class easn implements easc {
    private static final entd b = entd.c("GnpSdk");
    public final eapa a;
    private final Context c;
    private final eagn d;
    private final emxc e;
    private final emxc f;
    private final errl g;
    private final ffbr h;

    public easn(Context context, eagn eagnVar, emxc emxcVar, emxc emxcVar2, eapa eapaVar, errl errlVar, ffbr ffbrVar) {
        this.c = context;
        this.d = eagnVar;
        this.e = emxcVar2;
        this.f = emxcVar;
        this.a = eapaVar;
        this.g = errlVar;
        this.h = ffbrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x032c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.exvm c() {
        /*
            Method dump skipped, instructions count: 937
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.easn.c():exvm");
    }

    private final String d() {
        LocaleList locales;
        Locale locale;
        locales = this.c.getResources().getConfiguration().getLocales();
        locale = locales.get(0);
        return locale.toLanguageTag();
    }

    @Override // defpackage.easc
    public final ListenableFuture a(easy easyVar, final enip enipVar, eagp eagpVar) {
        emxc emxcVar;
        ListenableFuture i;
        ListenableFuture i2;
        final exux exuxVar = (exux) exvn.a.createBuilder();
        String d = d();
        exuxVar.copyOnWrite();
        exvn exvnVar = (exvn) exuxVar.instance;
        d.getClass();
        exvnVar.b |= 1;
        exvnVar.c = d;
        String id = TimeZone.getDefault().getID();
        exuxVar.copyOnWrite();
        exvn exvnVar2 = (exvn) exuxVar.instance;
        id.getClass();
        exvnVar2.b |= 8;
        exvnVar2.e = id;
        exvm c = c();
        exuxVar.copyOnWrite();
        exvn exvnVar3 = (exvn) exuxVar.instance;
        c.getClass();
        exvnVar3.f = c;
        exvnVar3.b |= 32;
        if (eagpVar.a()) {
            if (!((Boolean) this.h.b()).booleanValue()) {
                throw new IllegalStateException("Registration data provider must be provided for GNP FCM registrations");
            }
            emxcVar = this.f;
        } else {
            if (!eagpVar.b()) {
                throw new IllegalStateException("Unsupported targetType for RequestUtilImpl");
            }
            emxcVar = this.e;
        }
        emxc emxcVar2 = emxcVar;
        try {
            eatp eatpVar = (eatp) ((emxn) emxcVar2).a;
            i = fgfz.b(eatpVar.a, ffhe.a, ffsm.a, new eato(eatpVar, easyVar, null));
        } catch (Exception e) {
            ((ensz) ((ensz) ((ensz) b.i()).g(e)).h("com/google/android/libraries/notifications/platform/internal/util/request/impl/RequestUtilImpl", "getAccountLanguageCode", 'v', "RequestUtilImpl.java")).q("Failed getting language code");
            i = erqt.i(null);
        }
        final ListenableFuture listenableFuture = i;
        if (easyVar.b()) {
            i2 = erqt.i(null);
        } else {
            try {
                eatp eatpVar2 = (eatp) ((emxn) emxcVar2).a;
                i2 = fgfz.b(eatpVar2.a, ffhe.a, ffsm.a, new eatn(eatpVar2, easyVar, null));
            } catch (Exception e2) {
                ((ensz) ((ensz) ((ensz) b.i()).g(e2)).h("com/google/android/libraries/notifications/platform/internal/util/request/impl/RequestUtilImpl", "getDevicePayload", (char) 322, "RequestUtilImpl.java")).q("Failed getting device payload");
                i2 = erqt.i(null);
            }
        }
        final ListenableFuture listenableFuture2 = i2;
        return erqt.d(listenableFuture, i2).a(new Callable() { // from class: easi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                exxq exxqVar;
                String str = (String) erqt.q(listenableFuture);
                eydq eydqVar = (eydq) erqt.q(listenableFuture2);
                boolean isEmpty = TextUtils.isEmpty(str);
                exux exuxVar2 = exuxVar;
                if (!isEmpty) {
                    exuxVar2.copyOnWrite();
                    exvn exvnVar4 = (exvn) exuxVar2.instance;
                    exvn exvnVar5 = exvn.a;
                    str.getClass();
                    exvnVar4.b |= 4;
                    exvnVar4.d = str;
                }
                if (eydqVar != null) {
                    exuxVar2.copyOnWrite();
                    exvn exvnVar6 = (exvn) exuxVar2.instance;
                    exvn exvnVar7 = exvn.a;
                    exvnVar6.g = eydqVar;
                    exvnVar6.b |= 64;
                }
                enip enipVar2 = enipVar;
                boolean contains = enipVar2.contains(eatw.b);
                exvm exvmVar = ((exvn) exuxVar2.instance).f;
                if (exvmVar == null) {
                    exvmVar = exvm.a;
                }
                exxq exxqVar2 = exvmVar.q;
                if (exxqVar2 == null) {
                    exxqVar2 = exxq.a;
                }
                exxp exxpVar = (exxp) exxqVar2.toBuilder();
                eash.a(exxpVar, 2, contains);
                exvm exvmVar2 = ((exvn) exuxVar2.instance).f;
                if (exvmVar2 == null) {
                    exvmVar2 = exvm.a;
                }
                exvc exvcVar = (exvc) exvmVar2.toBuilder();
                exvcVar.copyOnWrite();
                exvm exvmVar3 = (exvm) exvcVar.instance;
                exxq exxqVar3 = (exxq) exxpVar.build();
                exxqVar3.getClass();
                exvmVar3.q = exxqVar3;
                exvmVar3.b |= 4096;
                exuxVar2.copyOnWrite();
                exvn exvnVar8 = (exvn) exuxVar2.instance;
                exvm exvmVar4 = (exvm) exvcVar.build();
                exvmVar4.getClass();
                exvnVar8.f = exvmVar4;
                exvnVar8.b |= 32;
                boolean contains2 = enipVar2.contains(eatw.a);
                exvm exvmVar5 = ((exvn) exuxVar2.instance).f;
                if (exvmVar5 == null) {
                    exvmVar5 = exvm.a;
                }
                exxq exxqVar4 = exvmVar5.q;
                if (exxqVar4 == null) {
                    exxqVar4 = exxq.a;
                }
                exxp exxpVar2 = (exxp) exxqVar4.toBuilder();
                eash.a(exxpVar2, 3, !contains2);
                exvm exvmVar6 = ((exvn) exuxVar2.instance).f;
                if (exvmVar6 == null) {
                    exvmVar6 = exvm.a;
                }
                exvc exvcVar2 = (exvc) exvmVar6.toBuilder();
                exvcVar2.copyOnWrite();
                exvm exvmVar7 = (exvm) exvcVar2.instance;
                exxq exxqVar5 = (exxq) exxpVar2.build();
                exxqVar5.getClass();
                exvmVar7.q = exxqVar5;
                exvmVar7.b |= 4096;
                exuxVar2.copyOnWrite();
                exvn exvnVar9 = (exvn) exuxVar2.instance;
                exvm exvmVar8 = (exvm) exvcVar2.build();
                exvmVar8.getClass();
                exvnVar9.f = exvmVar8;
                exvnVar9.b |= 32;
                exvm exvmVar9 = ((exvn) exuxVar2.instance).f;
                if (exvmVar9 == null) {
                    exvmVar9 = exvm.a;
                }
                easn easnVar = easn.this;
                exvc exvcVar3 = (exvc) exvmVar9.toBuilder();
                Set set = (Set) ((fbbb) easnVar.a.b).a;
                if (set.isEmpty()) {
                    exxqVar = exxq.a;
                } else {
                    ArrayList arrayList = new ArrayList(set.size());
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((exqh) it.next()).g));
                    }
                    exxp exxpVar3 = (exxp) exxq.a.createBuilder();
                    Iterator it2 = arrayList.iterator();
                    int i3 = 1;
                    while (it2.hasNext()) {
                        i3 = Math.max((((Integer) it2.next()).intValue() / 64) + 1, i3);
                    }
                    ArrayList arrayList2 = new ArrayList(i3);
                    arrayList2.addAll(Collections.nCopies(i3, 0L));
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        int intValue = ((Integer) it3.next()).intValue();
                        int i4 = intValue / 64;
                        arrayList2.set(i4, Long.valueOf(((Long) arrayList2.get(i4)).longValue() | (1 << (intValue % 64))));
                    }
                    exxpVar3.a(arrayList2);
                    exxqVar = (exxq) exxpVar3.build();
                }
                exxq exxqVar6 = ((exvm) exvcVar3.instance).q;
                if (exxqVar6 == null) {
                    exxqVar6 = exxq.a;
                }
                ArrayList arrayList3 = new ArrayList();
                int max = Math.max(exxqVar.b.size(), exxqVar6.b.size());
                int i5 = 0;
                while (i5 < max) {
                    arrayList3.add(Long.valueOf((i5 < exxqVar.b.size() ? exxqVar.b.a(i5) : 0L) | (i5 < exxqVar6.b.size() ? exxqVar6.b.a(i5) : 0L)));
                    i5++;
                }
                exxp exxpVar4 = (exxp) exxq.a.createBuilder();
                exxpVar4.a(arrayList3);
                exxq exxqVar7 = (exxq) exxpVar4.build();
                exvcVar3.copyOnWrite();
                exvm exvmVar10 = (exvm) exvcVar3.instance;
                exxqVar7.getClass();
                exvmVar10.q = exxqVar7;
                exvmVar10.b |= 4096;
                eapa eapaVar = easnVar.a;
                exyf exyfVar = (exyf) exyg.a.createBuilder();
                Iterator it4 = ((Set) eapaVar.c.b()).iterator();
                while (it4.hasNext()) {
                    exyfVar.mergeFrom((exyf) it4.next());
                }
                if (!((Set) ((fbbb) eapaVar.d).a).isEmpty()) {
                    Stream map = Collection.EL.stream((Set) ((fbbb) eapaVar.d).a).map(eapa.a);
                    int i6 = engw.d;
                    Iterable iterable = (Iterable) map.collect(endq.a);
                    exyfVar.copyOnWrite();
                    exyg exygVar = (exyg) exyfVar.instance;
                    eygi eygiVar = exygVar.e;
                    if (!eygiVar.c()) {
                        exygVar.e = eyfy.mutableCopy(eygiVar);
                    }
                    Iterator it5 = iterable.iterator();
                    while (it5.hasNext()) {
                        exygVar.e.h(((exxe) it5.next()).e);
                    }
                }
                exyg exygVar2 = (exyg) exyfVar.build();
                exvcVar3.copyOnWrite();
                exvm exvmVar11 = (exvm) exvcVar3.instance;
                exygVar2.getClass();
                exvmVar11.r = exygVar2;
                exvmVar11.b |= 8192;
                exuxVar2.copyOnWrite();
                exvn exvnVar10 = (exvn) exuxVar2.instance;
                exvm exvmVar12 = (exvm) exvcVar3.build();
                exvmVar12.getClass();
                exvnVar10.f = exvmVar12;
                exvnVar10.b |= 32;
                return (exvn) exuxVar2.build();
            }
        }, this.g);
    }

    @Override // defpackage.easc
    public final exsm b() {
        exvm c = c();
        exsj exsjVar = (exsj) exsl.a.createBuilder();
        float f = c.c;
        exsjVar.copyOnWrite();
        exsl exslVar = (exsl) exsjVar.instance;
        exslVar.b |= 1;
        exslVar.c = f;
        String str = c.f;
        exsjVar.copyOnWrite();
        exsl exslVar2 = (exsl) exsjVar.instance;
        str.getClass();
        exslVar2.b |= 8;
        exslVar2.f = str;
        int i = c.j;
        exsjVar.copyOnWrite();
        exsl exslVar3 = (exsl) exsjVar.instance;
        exslVar3.b |= 128;
        exslVar3.j = i;
        exsjVar.copyOnWrite();
        exsl exslVar4 = (exsl) exsjVar.instance;
        exslVar4.d = 3;
        exslVar4.b |= 2;
        String str2 = c.e;
        exsjVar.copyOnWrite();
        exsl exslVar5 = (exsl) exsjVar.instance;
        str2.getClass();
        exslVar5.b |= 4;
        exslVar5.e = str2;
        easj easjVar = easj.a;
        exvb b2 = exvb.b(c.o);
        if (b2 == null) {
            b2 = exvb.APP_BLOCK_STATE_UNKNOWN;
        }
        exsi exsiVar = (exsi) easjVar.fP(b2);
        exsjVar.copyOnWrite();
        exsl exslVar6 = (exsl) exsjVar.instance;
        exslVar6.n = exsiVar.d;
        exslVar6.b |= 1024;
        Context context = this.c;
        context.getClass();
        int i2 = (context.getResources().getConfiguration().uiMode & 48) != 32 ? 2 : 3;
        exsjVar.copyOnWrite();
        exsl exslVar7 = (exsl) exsjVar.instance;
        exslVar7.p = i2 - 1;
        exslVar7.b |= 16384;
        if (!c.g.isEmpty()) {
            String str3 = c.g;
            exsjVar.copyOnWrite();
            exsl exslVar8 = (exsl) exsjVar.instance;
            str3.getClass();
            exslVar8.b |= 16;
            exslVar8.g = str3;
        }
        if (!c.h.isEmpty()) {
            String str4 = c.h;
            exsjVar.copyOnWrite();
            exsl exslVar9 = (exsl) exsjVar.instance;
            str4.getClass();
            exslVar9.b = 32 | exslVar9.b;
            exslVar9.h = str4;
        }
        if (!c.i.isEmpty()) {
            String str5 = c.i;
            exsjVar.copyOnWrite();
            exsl exslVar10 = (exsl) exsjVar.instance;
            str5.getClass();
            exslVar10.b |= 64;
            exslVar10.i = str5;
        }
        if (!c.k.isEmpty()) {
            String str6 = c.k;
            exsjVar.copyOnWrite();
            exsl exslVar11 = (exsl) exsjVar.instance;
            str6.getClass();
            exslVar11.b |= 256;
            exslVar11.k = str6;
        }
        if (!c.p.isEmpty()) {
            String str7 = c.p;
            exsjVar.copyOnWrite();
            exsl exslVar12 = (exsl) exsjVar.instance;
            str7.getClass();
            exslVar12.b |= 2048;
            exslVar12.o = str7;
        }
        for (exvg exvgVar : c.m) {
            exqp exqpVar = (exqp) exqs.a.createBuilder();
            String str8 = exvgVar.c;
            exqpVar.copyOnWrite();
            exqs exqsVar = (exqs) exqpVar.instance;
            str8.getClass();
            exqsVar.b |= 1;
            exqsVar.c = str8;
            easl easlVar = easl.a;
            exvf b3 = exvf.b(exvgVar.e);
            if (b3 == null) {
                b3 = exvf.IMPORTANCE_UNSPECIFIED;
            }
            exqr exqrVar = (exqr) easlVar.fP(b3);
            exqpVar.copyOnWrite();
            exqs exqsVar2 = (exqs) exqpVar.instance;
            exqsVar2.e = exqrVar.h;
            exqsVar2.b |= 4;
            if (!exvgVar.d.isEmpty()) {
                String str9 = exvgVar.d;
                exqpVar.copyOnWrite();
                exqs exqsVar3 = (exqs) exqpVar.instance;
                str9.getClass();
                exqsVar3.b |= 2;
                exqsVar3.d = str9;
            }
            exsjVar.copyOnWrite();
            exsl exslVar13 = (exsl) exsjVar.instance;
            exqs exqsVar4 = (exqs) exqpVar.build();
            exqsVar4.getClass();
            eygr eygrVar = exslVar13.l;
            if (!eygrVar.c()) {
                exslVar13.l = eyfy.mutableCopy(eygrVar);
            }
            exslVar13.l.add(exqsVar4);
        }
        for (exvk exvkVar : c.n) {
            exql exqlVar = (exql) exqo.a.createBuilder();
            String str10 = exvkVar.c;
            exqlVar.copyOnWrite();
            exqo exqoVar = (exqo) exqlVar.instance;
            str10.getClass();
            exqoVar.b |= 1;
            exqoVar.c = str10;
            eask easkVar = eask.a;
            exvj b4 = exvj.b(exvkVar.d);
            if (b4 == null) {
                b4 = exvj.CHANNEL_GROUP_UNKNOWN;
            }
            exqn exqnVar = (exqn) easkVar.fP(b4);
            exqlVar.copyOnWrite();
            exqo exqoVar2 = (exqo) exqlVar.instance;
            exqoVar2.d = exqnVar.d;
            exqoVar2.b |= 2;
            exqo exqoVar3 = (exqo) exqlVar.build();
            exsjVar.copyOnWrite();
            exsl exslVar14 = (exsl) exsjVar.instance;
            exqoVar3.getClass();
            eygr eygrVar2 = exslVar14.m;
            if (!eygrVar2.c()) {
                exslVar14.m = eyfy.mutableCopy(eygrVar2);
            }
            exslVar14.m.add(exqoVar3);
        }
        exsg exsgVar = (exsg) exsm.a.createBuilder();
        String d = d();
        exsgVar.copyOnWrite();
        exsm exsmVar = (exsm) exsgVar.instance;
        d.getClass();
        exsmVar.b |= 1;
        exsmVar.e = d;
        String id = TimeZone.getDefault().getID();
        exsgVar.copyOnWrite();
        exsm exsmVar2 = (exsm) exsgVar.instance;
        id.getClass();
        exsmVar2.c = 4;
        exsmVar2.d = id;
        exsgVar.copyOnWrite();
        exsm exsmVar3 = (exsm) exsgVar.instance;
        exsl exslVar15 = (exsl) exsjVar.build();
        exslVar15.getClass();
        exsmVar3.f = exslVar15;
        exsmVar3.b |= 2;
        return (exsm) exsgVar.build();
    }
}
