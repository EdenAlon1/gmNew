package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyaj implements ducp {
    public static final /* synthetic */ int d = 0;
    private static final enip e = enip.s("next-pending", "current-active", "inline-payload");
    public final Executor a;
    public final emyl b;
    public final dyai c;

    public dyaj(dyag dyagVar) {
        this.a = dyagVar.a;
        this.b = dyagVar.b;
        this.c = dyagVar.c;
    }

    public static dwrg b(ezie ezieVar) {
        eydq eydqVar = ezieVar.e;
        if (eydqVar == null) {
            eydqVar = eydq.a;
        }
        eyee eyeeVar = eydqVar.c;
        eyfc eyfcVar = eyfc.a;
        eyib eyibVar = eyib.a;
        return (dwrg) eyfy.parseFrom(dwrg.a, eyeeVar, eyfc.a);
    }

    public static engw c(List list) {
        int i = engw.d;
        engr engrVar = new engr();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dwph dwphVar = (dwph) it.next();
            if (dwphVar.d.startsWith("inlinefile")) {
                engrVar.h(dwphVar);
            }
        }
        return engrVar.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static engw d(enhk enhkVar, List list) {
        if (list.isEmpty()) {
            int i = engw.d;
            return enou.a;
        }
        int i2 = engw.d;
        engr engrVar = new engr();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            emxc emxcVar = (emxc) it.next();
            if (emxcVar.g()) {
                dwpj dwpjVar = (dwpj) emxcVar.c();
                engw c = c(dwpjVar.g);
                enhd enhdVar = new enhd();
                int i3 = ((enou) c).c;
                for (int i4 = 0; i4 < i3; i4++) {
                    dwph dwphVar = (dwph) c.get(i4);
                    dwpg b = dwpg.b(dwphVar.f);
                    if (b == null) {
                        b = dwpg.DEFAULT;
                    }
                    if (b.equals(dwpg.NONE)) {
                        String str = dwphVar.c;
                        String str2 = dwpjVar.c;
                        dwpg b2 = dwpg.b(dwphVar.f);
                        if (b2 == null) {
                            b2 = dwpg.DEFAULT;
                        }
                        dxth.d("%s: Skip adding inlinefile to file map for file : %s , groupName : %s since checksumType is %s.", "GddDownloadedElementsListener", str, str2, b2);
                    } else {
                        emxf.i(enhkVar.containsKey(dwphVar.g), "Can't find the inlinefile %s of group %s in the inlinePayload", dwphVar.c, dwpjVar.c);
                        String str3 = dwphVar.c;
                        dwqw dwqwVar = (dwqw) enhkVar.get(dwphVar.g);
                        dwqwVar.getClass();
                        enhdVar.k(str3, dwqwVar);
                    }
                }
                engrVar.h(new dxzq((dwpj) emxcVar.c(), enhdVar.c()));
            }
        }
        return engrVar.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List e(List list) {
        ListenableFuture h;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                dwrg b = b((ezie) ((emxn) emxc.j((ezie) it.next())).a);
                boolean z = true;
                emxf.b(b.b == 3, "MddElement with current-active or next-pending key must contain a ManifestConfig");
                dwre dwreVar = b.b == 3 ? (dwre) b.c : dwre.a;
                emxf.b(1 == (dwreVar.b & 1), "ManifestConfigResponse should contain ManifestConfig to process, but none was found.");
                dwqb dwqbVar = dwreVar.c;
                if (dwqbVar == null) {
                    dwqbVar = dwqb.a;
                }
                dwqb a = dxxy.a(dwqbVar);
                if (a.c.size() <= 0) {
                    z = false;
                }
                emxf.b(z, "ManifestConfig should contain at least one entry, but none was found");
                dwpj dwpjVar = ((dwpy) a.c.get(0)).d;
                if (dwpjVar == null) {
                    dwpjVar = dwpj.a;
                }
                h = erqt.i(emxc.j(dwpjVar));
            } catch (eygu | IllegalArgumentException e2) {
                h = erqt.h(e2);
            }
            arrayList.add(h);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ducp
    public final ListenableFuture a(final emxc emxcVar, final ezhv ezhvVar, engw engwVar) {
        ListenableFuture i;
        dxth.c("%s: Processing Sync Response, expected response type = %s", "GddDownloadedElementsListener", this.c);
        if (engwVar.isEmpty()) {
            dxth.b("%s: No elements were synced, returning early.", "GddDownloadedElementsListener");
            return erre.a;
        }
        HashMap hashMap = new HashMap();
        int size = engwVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            ezie ezieVar = (ezie) engwVar.get(i2);
            try {
                String str = ezieVar.d;
                int indexOf = str.indexOf(":");
                String substring = indexOf != -1 ? str.substring(0, indexOf) : str;
                if (!e.contains(substring)) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Element key (%s) had an unexpected key type", str));
                }
                if (!hashMap.containsKey(substring)) {
                    hashMap.put(substring, new ArrayList());
                }
                ((List) hashMap.get(substring)).add(ezieVar);
            } catch (IllegalArgumentException e2) {
                i = erqt.h(e2);
            }
        }
        i = (hashMap.size() != 1 || hashMap.containsKey("next-pending")) ? (!hashMap.containsKey("inline-payload") || ((List) hashMap.get("inline-payload")).size() == 1) ? erqt.i(enhk.j(hashMap)) : erqt.h(new IllegalArgumentException(String.format(Locale.US, "Only 1 inline payload element should be in the response, but multiple (%d) elements were received", Integer.valueOf(((List) hashMap.get("inline-payload")).size())))) : erqt.h(new IllegalArgumentException(String.format("1 element synced and was expected to be next-pending element, but was: %s", hashMap.keySet())));
        return dycd.e(dwqn.b(i, dwqm.GDD_INVALID_ELEMENT_COMBINATION_RECEIVED, "Unexpected element combination received")).g(new eroh() { // from class: dyae
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                ListenableFuture i3;
                ListenableFuture h;
                enhk enhkVar = (enhk) obj;
                ezit ezitVar = ezhvVar.e;
                if (ezitVar == null) {
                    ezitVar = ezit.a;
                }
                int a = ezix.a(ezitVar.d);
                if (a != 0 && a == 4) {
                    emxc emxcVar2 = emxcVar;
                    i3 = !emxcVar2.g() ? erqt.h(new IllegalArgumentException()) : erqt.i(emxcVar2);
                } else {
                    i3 = erqt.i(emux.a);
                }
                final dyaj dyajVar = dyaj.this;
                final ListenableFuture b = dwqn.b(i3, dwqm.GDD_MISSING_ACCOUNT_FOR_PRIVATE_SYNC, "Received gaia-scoped elements but account is unavailable");
                final ListenableFuture b2 = dwqn.b(erqt.e(dyaj.e((List) enhkVar.getOrDefault("current-active", new ArrayList()))), dwqm.GDD_INVALID_CURRENT_ACTIVE_ELEMENT_DATA, "Received invalid data in current-active element");
                final ListenableFuture b3 = dwqn.b(erqt.e(dyaj.e((List) enhkVar.getOrDefault("next-pending", new ArrayList()))), dwqm.GDD_INVALID_NEXT_PENDING_ELEMENT_DATA, "Received invalid data in next-pending element");
                emxc j = enhkVar.containsKey("inline-payload") ? emxc.j((ezie) ((List) enhkVar.get("inline-payload")).get(0)) : emux.a;
                if (j.g()) {
                    try {
                        dwrg b4 = dyaj.b((ezie) j.c());
                        emxf.b(b4.b == 2, "MddElement with inline-payload key must contain an InlinePayload");
                        eygr<dwra> eygrVar = (b4.b == 2 ? (dwrc) b4.c : dwrc.a).b;
                        enhd h2 = enhk.h(eygrVar.size());
                        for (dwra dwraVar : eygrVar) {
                            int i4 = dwraVar.b;
                            int i5 = i4 & 1;
                            emxf.f((i5 == 0 || (i4 & 2) == 0) ? false : true, "Invalid format for InlineFile, key: %s", i5 != 0 ? dwraVar.c : "UNKNOWN");
                            String str2 = dwraVar.c;
                            eyee eyeeVar = dwraVar.d;
                            if (eyeeVar == null) {
                                throw null;
                            }
                            h2.k(str2, new dwqu(eyeeVar));
                        }
                        h = erqt.i(h2.c());
                    } catch (eygu | IllegalArgumentException e3) {
                        h = erqt.h(e3);
                    }
                } else {
                    h = erqt.i(enoz.a);
                }
                final ListenableFuture b5 = dwqn.b(h, dwqm.GDD_INVALID_INLINE_PAYLOAD_ELEMENT_DATA, "Received invalid data in inline-payload element");
                return dycg.d(b, b2, b3, b5).b(new erog() { // from class: dxzz
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r11v4, types: [dwub, java.lang.Object] */
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        final emxc emxcVar3 = (emxc) erqt.q(b);
                        enhk enhkVar2 = (enhk) erqt.q(b5);
                        List list = (List) erqt.q(b2);
                        List list2 = (List) erqt.q(b3);
                        try {
                            final engw d2 = dyaj.d(enhkVar2, list);
                            engw d3 = dyaj.d(enhkVar2, list2);
                            final dyaj dyajVar2 = dyaj.this;
                            ListenableFuture listenableFuture = erre.a;
                            if (!d3.isEmpty()) {
                                final ArrayList arrayList = new ArrayList();
                                int i6 = ((enou) d3).c;
                                for (int i7 = 0; i7 < i6; i7++) {
                                    dyah dyahVar = (dyah) d3.get(i7);
                                    final dwpj a2 = dyahVar.a();
                                    final enhk b6 = dyahVar.b();
                                    dxth.c("%s: Adding next-pending instance of group: %s", "GddDownloadedElementsListener", a2.c);
                                    dwob dwobVar = new dwob();
                                    dwobVar.c(a2);
                                    dwobVar.b(emxcVar3);
                                    if (dyajVar2.c.equals(dyai.MULTI_VARIANT_USING_GROUP_KEY)) {
                                        dwobVar.a = emxc.j(a2.i);
                                    }
                                    arrayList.add(elfr.k(dyajVar2.b.get().a(dwobVar.a()), new eroh() { // from class: dxzy
                                        /* JADX WARN: Type inference failed for: r6v10, types: [dwub, java.lang.Object] */
                                        @Override // defpackage.eroh
                                        public final ListenableFuture a(Object obj2) {
                                            boolean booleanValue = ((Boolean) obj2).booleanValue();
                                            dwpj dwpjVar = a2;
                                            if (!booleanValue) {
                                                dxth.h("%s: Failed to add next pending group %s, skipping import", "GddDownloadedElementsListener", dwpjVar.c);
                                                dwql a3 = dwqn.a();
                                                a3.a = dwqm.GDD_FAIL_TO_ADD_NEXT_PENDING_GROUP;
                                                return erqt.h(a3.a());
                                            }
                                            enhk enhkVar3 = b6;
                                            if (enhkVar3.isEmpty()) {
                                                dxth.c("%s: No inline files in next pending group %s, skipping import", "GddDownloadedElementsListener", dwpjVar.c);
                                                return erre.a;
                                            }
                                            emxc emxcVar4 = emxcVar3;
                                            dwrt h3 = dwru.h();
                                            h3.d(dwpjVar.c);
                                            h3.c(dwpjVar.h);
                                            h3.f(dwpjVar.i);
                                            dwoj dwojVar = (dwoj) h3;
                                            dwojVar.b = enhkVar3;
                                            h3.e(dyaj.c(dwpjVar.g));
                                            h3.b(emxcVar4);
                                            if ((dwpjVar.b & 8) != 0) {
                                                eydq eydqVar = dwpjVar.f;
                                                if (eydqVar == null) {
                                                    eydqVar = eydq.a;
                                                }
                                                dwojVar.a = emxc.j(eydqVar);
                                            }
                                            return dyaj.this.b.get().h(h3.a());
                                        }
                                    }, dyajVar2.a));
                                }
                                listenableFuture = dycg.a(arrayList).b(new erog() { // from class: dyab
                                    @Override // defpackage.erog
                                    public final ListenableFuture a() {
                                        int i8 = dyaj.d;
                                        return dwoa.b(arrayList, "Failed to add next pending variants to MDD", new Object[0]);
                                    }
                                }, dyajVar2.a);
                            }
                            if (d2.isEmpty()) {
                                return listenableFuture;
                            }
                            final engw s = engw.s(listenableFuture, dycg.b(listenableFuture).b(new erog() { // from class: dyac
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v10, types: [dwub, java.lang.Object] */
                                @Override // defpackage.erog
                                public final ListenableFuture a() {
                                    ListenableFuture f;
                                    final ArrayList arrayList2 = new ArrayList();
                                    int i8 = 0;
                                    while (true) {
                                        engw engwVar2 = d2;
                                        dyaj dyajVar3 = dyaj.this;
                                        if (i8 >= ((enou) engwVar2).c) {
                                            return dycg.a(arrayList2).b(new erog() { // from class: dyaa
                                                @Override // defpackage.erog
                                                public final ListenableFuture a() {
                                                    int i9 = dyaj.d;
                                                    return dwoa.b(arrayList2, "Failed to import current-active variants to MDD", new Object[0]);
                                                }
                                            }, dyajVar3.a);
                                        }
                                        dyah dyahVar2 = (dyah) engwVar2.get(i8);
                                        final dwpj a3 = dyahVar2.a();
                                        enhk b7 = dyahVar2.b();
                                        dxth.c("%s: Updating current active instance of group: %s", "GddDownloadedElementsListener", a3.c);
                                        if (b7.isEmpty()) {
                                            dxth.h("%s: No inline files in received current active group %s, skipping import", "GddDownloadedElementsListener", a3.c);
                                            dwql a4 = dwqn.a();
                                            a4.a = dwqm.GDD_CURRENT_ACTIVE_GROUP_HAS_NO_INLINE_FILE;
                                            f = erqt.h(a4.a());
                                        } else {
                                            emxc emxcVar4 = emxcVar3;
                                            dwrt h3 = dwru.h();
                                            h3.d(a3.c);
                                            h3.c(a3.h);
                                            h3.f(a3.i);
                                            dwoj dwojVar = (dwoj) h3;
                                            dwojVar.b = b7;
                                            h3.e(dyaj.c(a3.g));
                                            h3.b(emxcVar4);
                                            if ((a3.b & 8) != 0) {
                                                eydq eydqVar = a3.f;
                                                if (eydqVar == null) {
                                                    eydqVar = eydq.a;
                                                }
                                                dwojVar.a = emxc.j(eydqVar);
                                            }
                                            f = elfr.f(dyajVar3.b.get().h(h3.a()), dwqn.class, new eroh() { // from class: dyaf
                                                @Override // defpackage.eroh
                                                public final ListenableFuture a(Object obj2) {
                                                    dwqn dwqnVar = (dwqn) obj2;
                                                    dwqm dwqmVar = dwqnVar.a;
                                                    int i9 = dyaj.d;
                                                    if (!dwqmVar.equals(dwqm.GROUP_NOT_FOUND_ERROR)) {
                                                        return erqt.h(dwqnVar);
                                                    }
                                                    dxth.c("%s: Received current active group %s, but could not be imported (either not found or outdated).", "GddDownloadedElementsListener", dwpj.this.c);
                                                    return erre.a;
                                                }
                                            }, dyajVar3.a);
                                        }
                                        arrayList2.add(f);
                                        i8++;
                                    }
                                }
                            }, dyajVar2.a));
                            return dycg.a(s).b(new erog() { // from class: dyad
                                @Override // defpackage.erog
                                public final ListenableFuture a() {
                                    int i8 = dyaj.d;
                                    return dwoa.b(engw.this, "Error processing downloaded elements from Geller", new Object[0]);
                                }
                            }, dyajVar2.a);
                        } catch (IllegalArgumentException e4) {
                            dwql a3 = dwqn.a();
                            a3.c = e4;
                            a3.a = dwqm.GDD_INVALID_INLINE_PAYLOAD_ELEMENT_DATA;
                            return erqt.h(a3.a());
                        }
                    }
                }, dyajVar.a);
            }
        }, this.a);
    }
}
