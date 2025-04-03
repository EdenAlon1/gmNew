package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbyj implements cbyl {
    public static final entd a = entd.c("BugleNotifications");
    public static final cskc b = cskc.g("BugleAnnotation", "AnnotationWorker");
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final errl i;

    public cbyj(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, errl errlVar, ffbr ffbrVar5, ffbr ffbrVar6) {
        this.g = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.h = ffbrVar4;
        this.i = errlVar;
        this.e = ffbrVar5;
        this.f = ffbrVar6;
    }

    @Override // defpackage.cbyl
    public final elfl a(btih btihVar) {
        elfl e;
        elfl h;
        elfl i;
        emxf.a(d(btihVar));
        final String s = btihVar.s();
        s.getClass();
        cskc cskcVar = b;
        csjb d = cskcVar.d();
        d.I("Processing workitem: ");
        d.I(btihVar.r());
        d.r();
        final MessageCoreData v = ((bdmq) this.h.b()).v(bdhb.b(s));
        if (v == null) {
            cskcVar.q("Message deleted, no action needed.");
            return elfo.e(true);
        }
        if (csgg.x.contains(v.V())) {
            cskcVar.q("Message is restored from CMS, no action needed.");
            return elfo.e(true);
        }
        final crnc crncVar = (crnc) this.g.b();
        final ArrayList arrayList = new ArrayList();
        final String ar = v.ar();
        if (cbvv.h(v.k())) {
            csjb d2 = crnc.a.d();
            d2.d(v.B());
            d2.I("is a tombstone, skipping.");
            d2.r();
            i = elfo.e(arrayList);
        } else {
            if (crncVar.h()) {
                csjb d3 = crnc.a.d();
                d3.I("Running otp annotator on");
                d3.d(v.B());
                d3.r();
                fbuk a2 = ((crnf) crncVar.c.b()).a(v);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            csjb d4 = crnc.a.d();
            d4.I("Running url annotator on");
            d4.d(v.B());
            d4.r();
            crnj crnjVar = crncVar.g;
            ArrayList arrayList2 = new ArrayList();
            String az = v.az();
            if (!TextUtils.isEmpty(az)) {
                List<cgls> d5 = cglt.d(az);
                csix.l(d5);
                for (cgls cglsVar : d5) {
                    fbuj fbujVar = (fbuj) fbuk.a.createBuilder();
                    int i2 = cglsVar.b;
                    fbujVar.copyOnWrite();
                    ((fbuk) fbujVar.instance).h = i2;
                    int i3 = cglsVar.c;
                    fbujVar.copyOnWrite();
                    ((fbuk) fbujVar.instance).i = i3;
                    fbqt fbqtVar = fbqt.LINK_ANNOTATION;
                    fbujVar.copyOnWrite();
                    ((fbuk) fbujVar.instance).e = fbqtVar.a();
                    fbud fbudVar = (fbud) fbue.a.createBuilder();
                    String str = cglsVar.a;
                    fbudVar.copyOnWrite();
                    fbue fbueVar = (fbue) fbudVar.instance;
                    str.getClass();
                    fbueVar.c = str;
                    fbujVar.copyOnWrite();
                    fbuk fbukVar = (fbuk) fbujVar.instance;
                    fbue fbueVar2 = (fbue) fbudVar.build();
                    fbueVar2.getClass();
                    fbukVar.d = fbueVar2;
                    fbukVar.c = 8;
                    arrayList2.add((fbuk) fbujVar.build());
                }
            }
            arrayList.addAll(arrayList2);
            final ArrayList arrayList3 = new ArrayList();
            if (crnc.i() || crnc.j()) {
                final String az2 = v.az();
                if (!TextUtils.isEmpty(az2)) {
                    if (crnc.j()) {
                        csjb d6 = crnc.a.d();
                        d6.I("Running TextClassifierLib annotator on");
                        d6.d(v.B());
                        d6.r();
                        e = crncVar.d.a(az2);
                    } else {
                        int i4 = engw.d;
                        e = elfo.e(enou.a);
                    }
                    h = e.h(new emwl() { // from class: crmx
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            return Boolean.valueOf(arrayList3.addAll((List) obj));
                        }
                    }, crncVar.i).i(new eroh() { // from class: crmy
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            if (!crnc.i()) {
                                int i5 = engw.d;
                                return elfo.e(enou.a);
                            }
                            String str2 = az2;
                            MessageCoreData messageCoreData = v;
                            crnc crncVar2 = crnc.this;
                            csjb d7 = crnc.a.d();
                            d7.I("Running regex message annotator on");
                            d7.d(messageCoreData.B());
                            d7.r();
                            return crncVar2.h.a(str2);
                        }
                    }, crncVar.i).h(new emwl() { // from class: crmx
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            return Boolean.valueOf(arrayList3.addAll((List) obj));
                        }
                    }, crncVar.i).h(new emwl() { // from class: crmz
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            cskc cskcVar2 = crnc.a;
                            return arrayList3;
                        }
                    }, crncVar.i);
                    i = h.i(new eroh() { // from class: crmu
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            engw g;
                            engw g2;
                            engw g3;
                            engw g4;
                            final ArrayList arrayList4 = arrayList;
                            arrayList4.addAll((ArrayList) obj);
                            ArrayList arrayList5 = new ArrayList();
                            boolean booleanValue = ((Boolean) ctgx.a.e()).booleanValue();
                            String str2 = ar;
                            crnc crncVar2 = crnc.this;
                            MessageCoreData messageCoreData = v;
                            int i5 = 1;
                            if (booleanValue && !TextUtils.isEmpty(str2)) {
                                csjb d7 = crnc.a.d();
                                d7.I("Running money annotator on");
                                d7.d(messageCoreData.B());
                                d7.r();
                                ekzz f = eleg.f("MessageAnnotationUtils#MoneyAnnotator");
                                try {
                                    Pattern pattern = emmx.a;
                                    if (emxe.c(str2)) {
                                        int i6 = engw.d;
                                        g4 = enou.a;
                                    } else {
                                        int i7 = engw.d;
                                        engr engrVar = new engr();
                                        HashMap hashMap = new HashMap();
                                        StringBuilder sb = new StringBuilder(str2);
                                        Matcher matcher = emmx.a.matcher(str2);
                                        int i8 = 0;
                                        while (matcher.find()) {
                                            Locale locale = Locale.US;
                                            Object[] objArr = new Object[i5];
                                            objArr[0] = Integer.valueOf(hashMap.size());
                                            String format = String.format(locale, "<MONEY_%d>", objArr);
                                            sb.replace(matcher.start() + i8, matcher.end() + i8, format);
                                            int length = (format.length() - matcher.end()) + matcher.start();
                                            hashMap.put(format, new emmw(i8, length, matcher.group()));
                                            i8 += length;
                                            i5 = 1;
                                        }
                                        if (hashMap.isEmpty()) {
                                            g4 = engrVar.g();
                                        } else {
                                            String sb2 = sb.toString();
                                            emmx.a(engrVar, emmx.b.matcher(sb2), hashMap, 2, 1);
                                            emmx.a(engrVar, emmx.c.matcher(sb2), hashMap, 1, 2);
                                            g4 = engrVar.g();
                                        }
                                    }
                                    f.close();
                                    if (!g4.isEmpty()) {
                                        arrayList5.addAll(g4);
                                        ((altk) crncVar2.k.b()).E(messageCoreData, crncVar2.d(messageCoreData, "MONEY", fbqt.MONEY_ANNOTATION));
                                    }
                                } finally {
                                }
                            }
                            if (((Boolean) ctgx.a.e()).booleanValue() && !TextUtils.isEmpty(str2)) {
                                csjb d8 = crnc.a.d();
                                d8.I("Running account number annotator on");
                                d8.d(messageCoreData.B());
                                d8.r();
                                Pattern pattern2 = emmu.a;
                                if (emxe.c(str2)) {
                                    int i9 = engw.d;
                                    g3 = enou.a;
                                } else {
                                    int i10 = engw.d;
                                    engr engrVar2 = new engr();
                                    List a3 = emmu.a(emmu.a, str2, 4);
                                    engrVar2.j(a3);
                                    if (a3.isEmpty()) {
                                        engrVar2.j(emmu.a(emmu.b, str2, 1));
                                    }
                                    g3 = engrVar2.g();
                                }
                                if (!g3.isEmpty()) {
                                    arrayList5.addAll(g3);
                                    ((altk) crncVar2.k.b()).E(messageCoreData, crncVar2.d(messageCoreData, "ACCOUNT_NUMBER", fbqt.SIMPLE_ANNOTATION));
                                }
                            }
                            if (((Boolean) ctgx.a.e()).booleanValue() && !TextUtils.isEmpty(str2)) {
                                csjb d9 = crnc.a.d();
                                d9.I("Running coupon annotator on");
                                d9.d(messageCoreData.B());
                                d9.r();
                                Pattern pattern3 = emmv.a;
                                if (emxe.c(str2)) {
                                    int i11 = engw.d;
                                    g2 = enou.a;
                                } else {
                                    Matcher matcher2 = emmv.a.matcher(str2);
                                    int i12 = engw.d;
                                    engr engrVar3 = new engr();
                                    while (matcher2.find()) {
                                        if (matcher2.groupCount() >= 2) {
                                            fbuj fbujVar2 = (fbuj) fbuk.a.createBuilder();
                                            int start = matcher2.start(2);
                                            fbujVar2.copyOnWrite();
                                            ((fbuk) fbujVar2.instance).h = start;
                                            int end = matcher2.end(2);
                                            fbujVar2.copyOnWrite();
                                            ((fbuk) fbujVar2.instance).i = end;
                                            fbqt fbqtVar2 = fbqt.SIMPLE_ANNOTATION;
                                            fbujVar2.copyOnWrite();
                                            ((fbuk) fbujVar2.instance).e = fbqtVar2.a();
                                            fbujVar2.copyOnWrite();
                                            ((fbuk) fbujVar2.instance).f = "COUPON";
                                            fbws fbwsVar = (fbws) fbwt.a.createBuilder();
                                            String group = matcher2.group(2);
                                            fbwsVar.copyOnWrite();
                                            fbwt fbwtVar = (fbwt) fbwsVar.instance;
                                            group.getClass();
                                            fbwtVar.b = group;
                                            fbwt fbwtVar2 = (fbwt) fbwsVar.build();
                                            fbujVar2.copyOnWrite();
                                            fbuk fbukVar2 = (fbuk) fbujVar2.instance;
                                            fbwtVar2.getClass();
                                            fbukVar2.d = fbwtVar2;
                                            fbukVar2.c = 13;
                                            engrVar3.h((fbuk) fbujVar2.build());
                                        }
                                    }
                                    g2 = engrVar3.g();
                                }
                                if (!g2.isEmpty()) {
                                    arrayList5.addAll(g2);
                                    ((altk) crncVar2.k.b()).E(messageCoreData, crncVar2.d(messageCoreData, "COUPON", fbqt.SIMPLE_ANNOTATION));
                                }
                            }
                            if (((Boolean) ctgx.a.e()).booleanValue() && !TextUtils.isEmpty(str2)) {
                                csjb d10 = crnc.a.d();
                                d10.I("Running percentage annotator on");
                                d10.d(messageCoreData.B());
                                d10.r();
                                Pattern pattern4 = emmz.a;
                                if (emxe.c(str2)) {
                                    int i13 = engw.d;
                                    g = enou.a;
                                } else {
                                    Matcher matcher3 = emmz.a.matcher(str2);
                                    int i14 = engw.d;
                                    engr engrVar4 = new engr();
                                    while (matcher3.find()) {
                                        fbuj fbujVar3 = (fbuj) fbuk.a.createBuilder();
                                        int start2 = matcher3.start();
                                        fbujVar3.copyOnWrite();
                                        ((fbuk) fbujVar3.instance).h = start2;
                                        int end2 = matcher3.end();
                                        fbujVar3.copyOnWrite();
                                        ((fbuk) fbujVar3.instance).i = end2;
                                        fbqt fbqtVar3 = fbqt.SIMPLE_ANNOTATION;
                                        fbujVar3.copyOnWrite();
                                        ((fbuk) fbujVar3.instance).e = fbqtVar3.a();
                                        fbujVar3.copyOnWrite();
                                        ((fbuk) fbujVar3.instance).f = "PERCENTAGE";
                                        fbws fbwsVar2 = (fbws) fbwt.a.createBuilder();
                                        String group2 = matcher3.group();
                                        fbwsVar2.copyOnWrite();
                                        fbwt fbwtVar3 = (fbwt) fbwsVar2.instance;
                                        group2.getClass();
                                        fbwtVar3.b = group2;
                                        fbwt fbwtVar4 = (fbwt) fbwsVar2.build();
                                        fbujVar3.copyOnWrite();
                                        fbuk fbukVar3 = (fbuk) fbujVar3.instance;
                                        fbwtVar4.getClass();
                                        fbukVar3.d = fbwtVar4;
                                        fbukVar3.c = 13;
                                        engrVar4.h((fbuk) fbujVar3.build());
                                    }
                                    g = engrVar4.g();
                                }
                                if (!g.isEmpty()) {
                                    arrayList5.addAll(g);
                                    ((altk) crncVar2.k.b()).E(messageCoreData, crncVar2.d(messageCoreData, "PERCENTAGE", fbqt.SIMPLE_ANNOTATION));
                                }
                            }
                            arrayList4.addAll(arrayList5);
                            if (!crnc.g(arrayList4)) {
                                return elfo.e(arrayList4);
                            }
                            String ar2 = messageCoreData.ar();
                            final List arrayList6 = ar2 == null ? new ArrayList() : emye.b('\n').i(ar2);
                            int size = arrayList6.size();
                            if (size != 3 && size != 4 && size != 5) {
                                return elfo.e(arrayList4);
                            }
                            final String str3 = (String) enjk.j(arrayList6);
                            final boolean b2 = cuxu.b(str3);
                            if (!b2) {
                                if (!TextUtils.isEmpty(str3)) {
                                    Iterator it = cuxt.e((String) ctjd.I.e()).iterator();
                                    while (it.hasNext()) {
                                        if (str3.contains((String) it.next())) {
                                        }
                                    }
                                }
                                return elfo.e(arrayList4);
                            }
                            return (!b2 || ((String) arrayList6.get(arrayList6.size() + (-2))).trim().isEmpty()) ? crncVar2.b((String) arrayList6.get(1)).h(new emwl() { // from class: crms
                                @Override // defpackage.emwl
                                public final Object apply(Object obj2) {
                                    fbuk fbukVar4 = (fbuk) obj2;
                                    cskc cskcVar2 = crnc.a;
                                    ArrayList arrayList7 = arrayList4;
                                    boolean z = b2;
                                    if (!z) {
                                        Iterator it2 = arrayList7.iterator();
                                        while (true) {
                                            if (!it2.hasNext()) {
                                                fbukVar4 = null;
                                                break;
                                            }
                                            fbuk fbukVar5 = (fbuk) it2.next();
                                            fbqt b3 = fbqt.b(fbukVar5.e);
                                            if (b3 == null) {
                                                b3 = fbqt.UNRECOGNIZED;
                                            }
                                            if (b3 == fbqt.ADDRESS_ANNOTATION && fbukVar5.c == 7) {
                                                fbukVar4 = fbukVar5;
                                                break;
                                            }
                                        }
                                    }
                                    if (fbukVar4 == null) {
                                        return arrayList7;
                                    }
                                    List list = arrayList6;
                                    emww emwwVar = new emww(",");
                                    emwt emwtVar = new emwt(emwwVar, emwwVar);
                                    String g5 = emwtVar.g(emxe.a((String) list.get(0)), emxe.a((String) list.get(1)), new Object[0]);
                                    fbuj fbujVar4 = (fbuj) fbukVar4.toBuilder();
                                    fbrx fbrxVar = fbukVar4.c == 7 ? (fbrx) fbukVar4.d : fbrx.a;
                                    String str4 = str3;
                                    fbrw fbrwVar = (fbrw) fbrxVar.toBuilder();
                                    fbvk fbvkVar = (fbvk) fbvl.a.createBuilder();
                                    fbvkVar.copyOnWrite();
                                    ((fbvl) fbvkVar.instance).c = g5;
                                    if (true != z) {
                                        str4 = "";
                                    }
                                    fbvkVar.copyOnWrite();
                                    fbvl fbvlVar = (fbvl) fbvkVar.instance;
                                    str4.getClass();
                                    fbvlVar.f = str4;
                                    fbrwVar.copyOnWrite();
                                    fbrx fbrxVar2 = (fbrx) fbrwVar.instance;
                                    fbvl fbvlVar2 = (fbvl) fbvkVar.build();
                                    fbvlVar2.getClass();
                                    fbrxVar2.e = fbvlVar2;
                                    fbrxVar2.b |= 4;
                                    fbujVar4.copyOnWrite();
                                    fbuk fbukVar6 = (fbuk) fbujVar4.instance;
                                    fbrx fbrxVar3 = (fbrx) fbrwVar.build();
                                    fbrxVar3.getClass();
                                    fbukVar6.d = fbrxVar3;
                                    fbukVar6.c = 7;
                                    fbuk fbukVar7 = (fbuk) fbujVar4.build();
                                    ArrayList arrayList8 = new ArrayList();
                                    arrayList8.add(fbukVar7);
                                    int size2 = arrayList7.size();
                                    for (int i15 = 0; i15 < size2; i15++) {
                                        fbuk fbukVar8 = (fbuk) arrayList7.get(i15);
                                        fbqt b4 = fbqt.b(fbukVar8.e);
                                        if (b4 == null) {
                                            b4 = fbqt.UNRECOGNIZED;
                                        }
                                        if (b4 != fbqt.ADDRESS_ANNOTATION) {
                                            arrayList8.add(fbukVar8);
                                        }
                                    }
                                    return arrayList8;
                                }
                            }, crncVar2.j) : elfo.e(arrayList4);
                        }
                    }, crncVar.i);
                }
            }
            h = elfo.e(arrayList3);
            i = h.i(new eroh() { // from class: crmu
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    engw g;
                    engw g2;
                    engw g3;
                    engw g4;
                    final ArrayList arrayList4 = arrayList;
                    arrayList4.addAll((ArrayList) obj);
                    ArrayList arrayList5 = new ArrayList();
                    boolean booleanValue = ((Boolean) ctgx.a.e()).booleanValue();
                    String str2 = ar;
                    crnc crncVar2 = crnc.this;
                    MessageCoreData messageCoreData = v;
                    int i5 = 1;
                    if (booleanValue && !TextUtils.isEmpty(str2)) {
                        csjb d7 = crnc.a.d();
                        d7.I("Running money annotator on");
                        d7.d(messageCoreData.B());
                        d7.r();
                        ekzz f = eleg.f("MessageAnnotationUtils#MoneyAnnotator");
                        try {
                            Pattern pattern = emmx.a;
                            if (emxe.c(str2)) {
                                int i6 = engw.d;
                                g4 = enou.a;
                            } else {
                                int i7 = engw.d;
                                engr engrVar = new engr();
                                HashMap hashMap = new HashMap();
                                StringBuilder sb = new StringBuilder(str2);
                                Matcher matcher = emmx.a.matcher(str2);
                                int i8 = 0;
                                while (matcher.find()) {
                                    Locale locale = Locale.US;
                                    Object[] objArr = new Object[i5];
                                    objArr[0] = Integer.valueOf(hashMap.size());
                                    String format = String.format(locale, "<MONEY_%d>", objArr);
                                    sb.replace(matcher.start() + i8, matcher.end() + i8, format);
                                    int length = (format.length() - matcher.end()) + matcher.start();
                                    hashMap.put(format, new emmw(i8, length, matcher.group()));
                                    i8 += length;
                                    i5 = 1;
                                }
                                if (hashMap.isEmpty()) {
                                    g4 = engrVar.g();
                                } else {
                                    String sb2 = sb.toString();
                                    emmx.a(engrVar, emmx.b.matcher(sb2), hashMap, 2, 1);
                                    emmx.a(engrVar, emmx.c.matcher(sb2), hashMap, 1, 2);
                                    g4 = engrVar.g();
                                }
                            }
                            f.close();
                            if (!g4.isEmpty()) {
                                arrayList5.addAll(g4);
                                ((altk) crncVar2.k.b()).E(messageCoreData, crncVar2.d(messageCoreData, "MONEY", fbqt.MONEY_ANNOTATION));
                            }
                        } finally {
                        }
                    }
                    if (((Boolean) ctgx.a.e()).booleanValue() && !TextUtils.isEmpty(str2)) {
                        csjb d8 = crnc.a.d();
                        d8.I("Running account number annotator on");
                        d8.d(messageCoreData.B());
                        d8.r();
                        Pattern pattern2 = emmu.a;
                        if (emxe.c(str2)) {
                            int i9 = engw.d;
                            g3 = enou.a;
                        } else {
                            int i10 = engw.d;
                            engr engrVar2 = new engr();
                            List a3 = emmu.a(emmu.a, str2, 4);
                            engrVar2.j(a3);
                            if (a3.isEmpty()) {
                                engrVar2.j(emmu.a(emmu.b, str2, 1));
                            }
                            g3 = engrVar2.g();
                        }
                        if (!g3.isEmpty()) {
                            arrayList5.addAll(g3);
                            ((altk) crncVar2.k.b()).E(messageCoreData, crncVar2.d(messageCoreData, "ACCOUNT_NUMBER", fbqt.SIMPLE_ANNOTATION));
                        }
                    }
                    if (((Boolean) ctgx.a.e()).booleanValue() && !TextUtils.isEmpty(str2)) {
                        csjb d9 = crnc.a.d();
                        d9.I("Running coupon annotator on");
                        d9.d(messageCoreData.B());
                        d9.r();
                        Pattern pattern3 = emmv.a;
                        if (emxe.c(str2)) {
                            int i11 = engw.d;
                            g2 = enou.a;
                        } else {
                            Matcher matcher2 = emmv.a.matcher(str2);
                            int i12 = engw.d;
                            engr engrVar3 = new engr();
                            while (matcher2.find()) {
                                if (matcher2.groupCount() >= 2) {
                                    fbuj fbujVar2 = (fbuj) fbuk.a.createBuilder();
                                    int start = matcher2.start(2);
                                    fbujVar2.copyOnWrite();
                                    ((fbuk) fbujVar2.instance).h = start;
                                    int end = matcher2.end(2);
                                    fbujVar2.copyOnWrite();
                                    ((fbuk) fbujVar2.instance).i = end;
                                    fbqt fbqtVar2 = fbqt.SIMPLE_ANNOTATION;
                                    fbujVar2.copyOnWrite();
                                    ((fbuk) fbujVar2.instance).e = fbqtVar2.a();
                                    fbujVar2.copyOnWrite();
                                    ((fbuk) fbujVar2.instance).f = "COUPON";
                                    fbws fbwsVar = (fbws) fbwt.a.createBuilder();
                                    String group = matcher2.group(2);
                                    fbwsVar.copyOnWrite();
                                    fbwt fbwtVar = (fbwt) fbwsVar.instance;
                                    group.getClass();
                                    fbwtVar.b = group;
                                    fbwt fbwtVar2 = (fbwt) fbwsVar.build();
                                    fbujVar2.copyOnWrite();
                                    fbuk fbukVar2 = (fbuk) fbujVar2.instance;
                                    fbwtVar2.getClass();
                                    fbukVar2.d = fbwtVar2;
                                    fbukVar2.c = 13;
                                    engrVar3.h((fbuk) fbujVar2.build());
                                }
                            }
                            g2 = engrVar3.g();
                        }
                        if (!g2.isEmpty()) {
                            arrayList5.addAll(g2);
                            ((altk) crncVar2.k.b()).E(messageCoreData, crncVar2.d(messageCoreData, "COUPON", fbqt.SIMPLE_ANNOTATION));
                        }
                    }
                    if (((Boolean) ctgx.a.e()).booleanValue() && !TextUtils.isEmpty(str2)) {
                        csjb d10 = crnc.a.d();
                        d10.I("Running percentage annotator on");
                        d10.d(messageCoreData.B());
                        d10.r();
                        Pattern pattern4 = emmz.a;
                        if (emxe.c(str2)) {
                            int i13 = engw.d;
                            g = enou.a;
                        } else {
                            Matcher matcher3 = emmz.a.matcher(str2);
                            int i14 = engw.d;
                            engr engrVar4 = new engr();
                            while (matcher3.find()) {
                                fbuj fbujVar3 = (fbuj) fbuk.a.createBuilder();
                                int start2 = matcher3.start();
                                fbujVar3.copyOnWrite();
                                ((fbuk) fbujVar3.instance).h = start2;
                                int end2 = matcher3.end();
                                fbujVar3.copyOnWrite();
                                ((fbuk) fbujVar3.instance).i = end2;
                                fbqt fbqtVar3 = fbqt.SIMPLE_ANNOTATION;
                                fbujVar3.copyOnWrite();
                                ((fbuk) fbujVar3.instance).e = fbqtVar3.a();
                                fbujVar3.copyOnWrite();
                                ((fbuk) fbujVar3.instance).f = "PERCENTAGE";
                                fbws fbwsVar2 = (fbws) fbwt.a.createBuilder();
                                String group2 = matcher3.group();
                                fbwsVar2.copyOnWrite();
                                fbwt fbwtVar3 = (fbwt) fbwsVar2.instance;
                                group2.getClass();
                                fbwtVar3.b = group2;
                                fbwt fbwtVar4 = (fbwt) fbwsVar2.build();
                                fbujVar3.copyOnWrite();
                                fbuk fbukVar3 = (fbuk) fbujVar3.instance;
                                fbwtVar4.getClass();
                                fbukVar3.d = fbwtVar4;
                                fbukVar3.c = 13;
                                engrVar4.h((fbuk) fbujVar3.build());
                            }
                            g = engrVar4.g();
                        }
                        if (!g.isEmpty()) {
                            arrayList5.addAll(g);
                            ((altk) crncVar2.k.b()).E(messageCoreData, crncVar2.d(messageCoreData, "PERCENTAGE", fbqt.SIMPLE_ANNOTATION));
                        }
                    }
                    arrayList4.addAll(arrayList5);
                    if (!crnc.g(arrayList4)) {
                        return elfo.e(arrayList4);
                    }
                    String ar2 = messageCoreData.ar();
                    final List arrayList6 = ar2 == null ? new ArrayList() : emye.b('\n').i(ar2);
                    int size = arrayList6.size();
                    if (size != 3 && size != 4 && size != 5) {
                        return elfo.e(arrayList4);
                    }
                    final String str3 = (String) enjk.j(arrayList6);
                    final boolean b2 = cuxu.b(str3);
                    if (!b2) {
                        if (!TextUtils.isEmpty(str3)) {
                            Iterator it = cuxt.e((String) ctjd.I.e()).iterator();
                            while (it.hasNext()) {
                                if (str3.contains((String) it.next())) {
                                }
                            }
                        }
                        return elfo.e(arrayList4);
                    }
                    return (!b2 || ((String) arrayList6.get(arrayList6.size() + (-2))).trim().isEmpty()) ? crncVar2.b((String) arrayList6.get(1)).h(new emwl() { // from class: crms
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            fbuk fbukVar4 = (fbuk) obj2;
                            cskc cskcVar2 = crnc.a;
                            ArrayList arrayList7 = arrayList4;
                            boolean z = b2;
                            if (!z) {
                                Iterator it2 = arrayList7.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        fbukVar4 = null;
                                        break;
                                    }
                                    fbuk fbukVar5 = (fbuk) it2.next();
                                    fbqt b3 = fbqt.b(fbukVar5.e);
                                    if (b3 == null) {
                                        b3 = fbqt.UNRECOGNIZED;
                                    }
                                    if (b3 == fbqt.ADDRESS_ANNOTATION && fbukVar5.c == 7) {
                                        fbukVar4 = fbukVar5;
                                        break;
                                    }
                                }
                            }
                            if (fbukVar4 == null) {
                                return arrayList7;
                            }
                            List list = arrayList6;
                            emww emwwVar = new emww(",");
                            emwt emwtVar = new emwt(emwwVar, emwwVar);
                            String g5 = emwtVar.g(emxe.a((String) list.get(0)), emxe.a((String) list.get(1)), new Object[0]);
                            fbuj fbujVar4 = (fbuj) fbukVar4.toBuilder();
                            fbrx fbrxVar = fbukVar4.c == 7 ? (fbrx) fbukVar4.d : fbrx.a;
                            String str4 = str3;
                            fbrw fbrwVar = (fbrw) fbrxVar.toBuilder();
                            fbvk fbvkVar = (fbvk) fbvl.a.createBuilder();
                            fbvkVar.copyOnWrite();
                            ((fbvl) fbvkVar.instance).c = g5;
                            if (true != z) {
                                str4 = "";
                            }
                            fbvkVar.copyOnWrite();
                            fbvl fbvlVar = (fbvl) fbvkVar.instance;
                            str4.getClass();
                            fbvlVar.f = str4;
                            fbrwVar.copyOnWrite();
                            fbrx fbrxVar2 = (fbrx) fbrwVar.instance;
                            fbvl fbvlVar2 = (fbvl) fbvkVar.build();
                            fbvlVar2.getClass();
                            fbrxVar2.e = fbvlVar2;
                            fbrxVar2.b |= 4;
                            fbujVar4.copyOnWrite();
                            fbuk fbukVar6 = (fbuk) fbujVar4.instance;
                            fbrx fbrxVar3 = (fbrx) fbrwVar.build();
                            fbrxVar3.getClass();
                            fbukVar6.d = fbrxVar3;
                            fbukVar6.c = 7;
                            fbuk fbukVar7 = (fbuk) fbujVar4.build();
                            ArrayList arrayList8 = new ArrayList();
                            arrayList8.add(fbukVar7);
                            int size2 = arrayList7.size();
                            for (int i15 = 0; i15 < size2; i15++) {
                                fbuk fbukVar8 = (fbuk) arrayList7.get(i15);
                                fbqt b4 = fbqt.b(fbukVar8.e);
                                if (b4 == null) {
                                    b4 = fbqt.UNRECOGNIZED;
                                }
                                if (b4 != fbqt.ADDRESS_ANNOTATION) {
                                    arrayList8.add(fbukVar8);
                                }
                            }
                            return arrayList8;
                        }
                    }, crncVar2.j) : elfo.e(arrayList4);
                }
            }, crncVar.i);
        }
        return i.i(new eroh() { // from class: cbyh
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                String str2 = s;
                ArrayList arrayList4 = (ArrayList) obj;
                if (arrayList4 == null || arrayList4.isEmpty()) {
                    csjb d7 = cbyj.b.d();
                    d7.I("No annotation generated for message: ");
                    d7.I(str2);
                    d7.r();
                    return elfo.e(true);
                }
                MessageCoreData messageCoreData = v;
                cbyj cbyjVar = cbyj.this;
                csjb d8 = cbyj.b.d();
                d8.I(arrayList4.size() + " annotations generated for message: ");
                d8.I(str2);
                d8.r();
                if (((auiv) cbyjVar.e.b()).a() && ctgv.a(messageCoreData.B()).b().isEmpty() && Collection.EL.stream(arrayList4).anyMatch(new Predicate() { // from class: cbyi
                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public final /* synthetic */ Predicate mo439negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    public final /* synthetic */ Predicate or(Predicate predicate) {
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj2) {
                        return ((fbuk) obj2).c == 2;
                    }
                })) {
                    ((ensz) ((ensz) cbyj.a.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/AnnotationWorker", "processInternal", 133, "AnnotationWorker.java")).q("Refreshing notifications for OTP");
                    ((cjbc) cbyjVar.f.b()).c();
                }
                int i5 = 0;
                if (!(((Boolean) ((cfup) ctjd.aC.get()).e()).booleanValue() ? ((ctgv) cbyjVar.c.b()).b(messageCoreData.z(), messageCoreData.B(), arrayList4) : ((ctgv) cbyjVar.c.b()).c(messageCoreData.z(), messageCoreData.B(), arrayList4))) {
                    csjb c = cbyj.b.c();
                    c.I("Setting message annotations failed: ");
                    c.I(str2);
                    c.r();
                    return elfo.e(false);
                }
                dtve dtveVar = (dtve) cbyjVar.d.b();
                if (crnc.g(arrayList4)) {
                    dtveVar.y(bece.g(4, messageCoreData.B().b()));
                }
                int size = arrayList4.size();
                while (true) {
                    if (i5 >= size) {
                        break;
                    }
                    fbuk fbukVar2 = (fbuk) arrayList4.get(i5);
                    fbqt b2 = fbqt.b(fbukVar2.e);
                    if (b2 == null) {
                        b2 = fbqt.UNRECOGNIZED;
                    }
                    if (b2 == fbqt.LINK_ANNOTATION && fbukVar2.c == 8) {
                        dtveVar.y(bece.g(8, messageCoreData.B().b()));
                        break;
                    }
                    i5++;
                }
                return elfo.e(true);
            }
        }, this.i);
    }

    @Override // defpackage.cbyl
    public final boolean d(btih btihVar) {
        return (btihVar.o() & 2) != 0 && btihVar.m() == 1;
    }
}
