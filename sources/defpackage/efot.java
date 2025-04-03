package defpackage;

import android.content.Context;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efot {
    public static ezyl a(faik faikVar) {
        ezyk ezykVar = (ezyk) ezyl.a.createBuilder();
        int i = faikVar.b;
        ezykVar.copyOnWrite();
        ((ezyl) ezykVar.instance).b = i;
        int i2 = faikVar.c;
        ezykVar.copyOnWrite();
        ((ezyl) ezykVar.instance).c = i2;
        String str = faikVar.d;
        ezykVar.copyOnWrite();
        ezyl ezylVar = (ezyl) ezykVar.instance;
        str.getClass();
        ezylVar.d = str;
        return (ezyl) ezykVar.build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void b(fags fagsVar, fagu faguVar, efou efouVar, Context context, String str) {
        int i;
        int i2;
        char c;
        int i3;
        efpb efpbVar = efor.c;
        if (efor.c(fdul.b(efor.b))) {
            faay faayVar = (faay) faaz.a.createBuilder();
            if ((fagsVar.b & 1) != 0) {
                faku fakuVar = fagsVar.c;
                if (fakuVar == null) {
                    fakuVar = faku.a;
                }
                fabg fabgVar = (fabg) fabh.a.createBuilder();
                String str2 = fakuVar.b;
                fabgVar.copyOnWrite();
                fabh fabhVar = (fabh) fabgVar.instance;
                str2.getClass();
                fabhVar.b = str2;
                eygr eygrVar = fakuVar.c;
                fabgVar.copyOnWrite();
                fabh fabhVar2 = (fabh) fabgVar.instance;
                eygr eygrVar2 = fabhVar2.c;
                if (!eygrVar2.c()) {
                    fabhVar2.c = eyfy.mutableCopy(eygrVar2);
                }
                eydl.addAll(eygrVar, fabhVar2.c);
                boolean z = fakuVar.d;
                fabgVar.copyOnWrite();
                ((fabh) fabgVar.instance).d = z;
                fabh fabhVar3 = (fabh) fabgVar.build();
                faayVar.copyOnWrite();
                faaz faazVar = (faaz) faayVar.instance;
                fabhVar3.getClass();
                faazVar.c = fabhVar3;
                faazVar.b |= 1;
            }
            faba fabaVar = (faba) fabb.a.createBuilder();
            String str3 = faguVar.e;
            fabaVar.copyOnWrite();
            fabb fabbVar = (fabb) fabaVar.instance;
            str3.getClass();
            fabbVar.e = str3;
            String str4 = faguVar.g;
            fabaVar.copyOnWrite();
            fabb fabbVar2 = (fabb) fabaVar.instance;
            str4.getClass();
            fabbVar2.g = str4;
            if ((faguVar.b & 1) != 0) {
                fakk fakkVar = faguVar.c;
                if (fakkVar == null) {
                    fakkVar = fakk.a;
                }
                faaq faaqVar = (faaq) faar.a.createBuilder();
                String str5 = fakkVar.b;
                faaqVar.copyOnWrite();
                faar faarVar = (faar) faaqVar.instance;
                str5.getClass();
                faarVar.b = str5;
                eyee eyeeVar = fakkVar.c;
                faaqVar.copyOnWrite();
                faar faarVar2 = (faar) faaqVar.instance;
                eyeeVar.getClass();
                faarVar2.c = eyeeVar;
                fabaVar.copyOnWrite();
                fabb fabbVar3 = (fabb) fabaVar.instance;
                faar faarVar3 = (faar) faaqVar.build();
                faarVar3.getClass();
                fabbVar3.c = faarVar3;
                fabbVar3.b |= 1;
            }
            if ((faguVar.b & 2) != 0) {
                faje fajeVar = faguVar.d;
                if (fajeVar == null) {
                    fajeVar = faje.a;
                }
                ezzs ezzsVar = (ezzs) ezzt.a.createBuilder();
                if ((fajeVar.b & 1) != 0) {
                    faiw faiwVar = fajeVar.c;
                    if (faiwVar == null) {
                        faiwVar = faiw.a;
                    }
                    ezyy ezyyVar = (ezyy) ezyz.a.createBuilder();
                    boolean z2 = faiwVar.b;
                    ezyyVar.copyOnWrite();
                    ((ezyz) ezyyVar.instance).b = z2;
                    String str6 = faiwVar.c;
                    ezyyVar.copyOnWrite();
                    ezyz ezyzVar = (ezyz) ezyyVar.instance;
                    str6.getClass();
                    ezyzVar.c = str6;
                    ezzsVar.copyOnWrite();
                    ezzt ezztVar = (ezzt) ezzsVar.instance;
                    ezyz ezyzVar2 = (ezyz) ezyyVar.build();
                    ezyzVar2.getClass();
                    ezztVar.c = ezyzVar2;
                    ezztVar.b |= 1;
                }
                if ((fajeVar.b & 2) != 0) {
                    fahq fahqVar = fajeVar.d;
                    if (fahqVar == null) {
                        fahqVar = fahq.b;
                    }
                    ezxu ezxuVar = (ezxu) ezxv.a.createBuilder();
                    String str7 = fahqVar.c;
                    ezxuVar.copyOnWrite();
                    ezxv ezxvVar = (ezxv) ezxuVar.instance;
                    str7.getClass();
                    ezxvVar.b = str7;
                    String str8 = fahqVar.d;
                    ezxuVar.copyOnWrite();
                    ezxv ezxvVar2 = (ezxv) ezxuVar.instance;
                    str8.getClass();
                    ezxvVar2.c = str8;
                    String str9 = fahqVar.e;
                    ezxuVar.copyOnWrite();
                    ezxv ezxvVar3 = (ezxv) ezxuVar.instance;
                    str9.getClass();
                    ezxvVar3.d = str9;
                    efpb efpbVar2 = efor.c;
                    if (efor.c(fdvv.b(efor.b)) && fahqVar.f.size() > 0) {
                        eygi eygiVar = fahqVar.f;
                        ezxuVar.copyOnWrite();
                        ezxv ezxvVar4 = (ezxv) ezxuVar.instance;
                        eygi eygiVar2 = ezxvVar4.e;
                        if (!eygiVar2.c()) {
                            ezxvVar4.e = eyfy.mutableCopy(eygiVar2);
                        }
                        Iterator<E> it = eygiVar.iterator();
                        while (it.hasNext()) {
                            ezxvVar4.e.h(((Integer) it.next()).intValue());
                        }
                    }
                    ezzsVar.copyOnWrite();
                    ezzt ezztVar2 = (ezzt) ezzsVar.instance;
                    ezxv ezxvVar5 = (ezxv) ezxuVar.build();
                    ezxvVar5.getClass();
                    ezztVar2.d = ezxvVar5;
                    ezztVar2.b |= 2;
                }
                if ((fajeVar.b & 4) != 0) {
                    fahw fahwVar = fajeVar.e;
                    if (fahwVar == null) {
                        fahwVar = fahw.b;
                    }
                    ezxw ezxwVar = (ezxw) ezxz.a.createBuilder();
                    int i4 = fahwVar.e;
                    ezxwVar.copyOnWrite();
                    ((ezxz) ezxwVar.instance).d = i4;
                    if ((fahwVar.c & 1) != 0) {
                        fahu fahuVar = fahwVar.d;
                        if (fahuVar == null) {
                            fahuVar = fahu.a;
                        }
                        ezxx ezxxVar = (ezxx) ezxy.a.createBuilder();
                        eyev eyevVar = fahuVar.b;
                        if (eyevVar == null) {
                            eyevVar = eyev.a;
                        }
                        ezxxVar.copyOnWrite();
                        i3 = 1;
                        ezxy ezxyVar = (ezxy) ezxxVar.instance;
                        eyevVar.getClass();
                        ezxyVar.c = eyevVar;
                        ezxyVar.b |= 1;
                        eyev eyevVar2 = fahuVar.c;
                        if (eyevVar2 == null) {
                            eyevVar2 = eyev.a;
                        }
                        ezxxVar.copyOnWrite();
                        ezxy ezxyVar2 = (ezxy) ezxxVar.instance;
                        eyevVar2.getClass();
                        ezxyVar2.d = eyevVar2;
                        ezxyVar2.b |= 2;
                        ezxwVar.copyOnWrite();
                        ezxz ezxzVar = (ezxz) ezxwVar.instance;
                        ezxy ezxyVar3 = (ezxy) ezxxVar.build();
                        ezxyVar3.getClass();
                        ezxzVar.c = ezxyVar3;
                        ezxzVar.b |= 1;
                    } else {
                        i3 = 1;
                    }
                    efpb efpbVar3 = efor.c;
                    if (efor.c(fdvv.b(efor.b)) && fahwVar.f.size() > 0) {
                        eygi eygiVar3 = fahwVar.f;
                        ezxwVar.copyOnWrite();
                        ezxz ezxzVar2 = (ezxz) ezxwVar.instance;
                        eygi eygiVar4 = ezxzVar2.e;
                        if (!eygiVar4.c()) {
                            ezxzVar2.e = eyfy.mutableCopy(eygiVar4);
                        }
                        Iterator<E> it2 = eygiVar3.iterator();
                        while (it2.hasNext()) {
                            ezxzVar2.e.h(((Integer) it2.next()).intValue());
                        }
                    }
                    ezzsVar.copyOnWrite();
                    ezzt ezztVar3 = (ezzt) ezzsVar.instance;
                    ezxz ezxzVar3 = (ezxz) ezxwVar.build();
                    ezxzVar3.getClass();
                    ezztVar3.e = ezxzVar3;
                    ezztVar3.b |= 4;
                } else {
                    i3 = 1;
                }
                if ((fajeVar.b & 8) != 0) {
                    fajg fajgVar = fajeVar.f;
                    if (fajgVar == null) {
                        fajgVar = fajg.a;
                    }
                    ezzu ezzuVar = (ezzu) ezzv.a.createBuilder();
                    boolean z3 = fajgVar.b;
                    ezzuVar.copyOnWrite();
                    ((ezzv) ezzuVar.instance).b = z3;
                    boolean z4 = fajgVar.c;
                    ezzuVar.copyOnWrite();
                    ((ezzv) ezzuVar.instance).c = z4;
                    ezzsVar.copyOnWrite();
                    ezzt ezztVar4 = (ezzt) ezzsVar.instance;
                    ezzv ezzvVar = (ezzv) ezzuVar.build();
                    ezzvVar.getClass();
                    ezztVar4.f = ezzvVar;
                    ezztVar4.b |= 8;
                }
                if (fajeVar.g.size() > 0) {
                    for (fajr fajrVar : fajeVar.g) {
                        faaa faaaVar = (faaa) faab.a.createBuilder();
                        int i5 = fajrVar.e;
                        faaaVar.copyOnWrite();
                        ((faab) faaaVar.instance).d = i5;
                        String str10 = fajrVar.f;
                        faaaVar.copyOnWrite();
                        faab faabVar = (faab) faaaVar.instance;
                        str10.getClass();
                        faabVar.e = str10;
                        String str11 = fajrVar.g;
                        faaaVar.copyOnWrite();
                        faab faabVar2 = (faab) faaaVar.instance;
                        str11.getClass();
                        faabVar2.f = str11;
                        int i6 = fajrVar.i;
                        faaaVar.copyOnWrite();
                        ((faab) faaaVar.instance).h = i6;
                        boolean z5 = fajrVar.j;
                        faaaVar.copyOnWrite();
                        ((faab) faaaVar.instance).i = z5;
                        if (fajrVar.h.size() > 0) {
                            for (faks faksVar : fajrVar.h) {
                                fabe fabeVar = (fabe) fabf.a.createBuilder();
                                String str12 = faksVar.d;
                                fabeVar.copyOnWrite();
                                fabf fabfVar = (fabf) fabeVar.instance;
                                str12.getClass();
                                fabfVar.d = str12;
                                if (faksVar.b == 2) {
                                    fabc fabcVar = (fabc) fabd.a.createBuilder();
                                    int i7 = (faksVar.b == 2 ? (fakp) faksVar.c : fakp.a).b;
                                    fabcVar.copyOnWrite();
                                    ((fabd) fabcVar.instance).b = i7;
                                    fabeVar.copyOnWrite();
                                    fabf fabfVar2 = (fabf) fabeVar.instance;
                                    fabd fabdVar = (fabd) fabcVar.build();
                                    fabdVar.getClass();
                                    fabfVar2.c = fabdVar;
                                    fabfVar2.b = 2;
                                }
                                faaaVar.copyOnWrite();
                                faab faabVar3 = (faab) faaaVar.instance;
                                fabf fabfVar3 = (fabf) fabeVar.build();
                                fabfVar3.getClass();
                                eygr eygrVar3 = faabVar3.g;
                                if (!eygrVar3.c()) {
                                    faabVar3.g = eyfy.mutableCopy(eygrVar3);
                                }
                                faabVar3.g.add(fabfVar3);
                            }
                        }
                        int i8 = fajrVar.c;
                        int i9 = i8 != 0 ? i8 != 4 ? i8 != 5 ? i8 != 6 ? i8 != 7 ? 0 : 4 : 3 : 2 : i3 : 5;
                        int i10 = i9 - 1;
                        if (i9 == 0) {
                            throw null;
                        }
                        if (i10 == 0) {
                            fakn faknVar = i8 == 4 ? (fakn) fajrVar.d : fakn.a;
                            faas faasVar = (faas) faat.a.createBuilder();
                            int i11 = faknVar.d;
                            faasVar.copyOnWrite();
                            ((faat) faasVar.instance).d = i11;
                            if ((faknVar.b & 1) != 0) {
                                fagz fagzVar = faknVar.c;
                                if (fagzVar == null) {
                                    fagzVar = fagz.a;
                                }
                                ezxj f = f(fagzVar);
                                faasVar.copyOnWrite();
                                faat faatVar = (faat) faasVar.instance;
                                f.getClass();
                                faatVar.c = f;
                                faatVar.b |= 1;
                            }
                            faaaVar.copyOnWrite();
                            faab faabVar4 = (faab) faaaVar.instance;
                            faat faatVar2 = (faat) faasVar.build();
                            faatVar2.getClass();
                            faabVar4.c = faatVar2;
                            faabVar4.b = 4;
                        } else if (i10 == i3) {
                            faja fajaVar = i8 == 5 ? (faja) fajrVar.d : faja.a;
                            ezzo ezzoVar = (ezzo) ezzp.a.createBuilder();
                            if ((fajaVar.b & 1) != 0) {
                                fagz fagzVar2 = fajaVar.c;
                                if (fagzVar2 == null) {
                                    fagzVar2 = fagz.a;
                                }
                                ezxj f2 = f(fagzVar2);
                                ezzoVar.copyOnWrite();
                                ezzp ezzpVar = (ezzp) ezzoVar.instance;
                                f2.getClass();
                                ezzpVar.c = f2;
                                ezzpVar.b |= 1;
                            }
                            faaaVar.copyOnWrite();
                            faab faabVar5 = (faab) faaaVar.instance;
                            ezzp ezzpVar2 = (ezzp) ezzoVar.build();
                            ezzpVar2.getClass();
                            faabVar5.c = ezzpVar2;
                            faabVar5.b = 5;
                        } else if (i10 == 2) {
                            fajw fajwVar = i8 == 6 ? (fajw) fajrVar.d : fajw.a;
                            faac faacVar = (faac) faad.a.createBuilder();
                            int i12 = fajwVar.b;
                            faacVar.copyOnWrite();
                            ((faad) faacVar.instance).b = i12;
                            int i13 = fajwVar.c;
                            faacVar.copyOnWrite();
                            ((faad) faacVar.instance).c = i13;
                            String str13 = fajwVar.e;
                            faacVar.copyOnWrite();
                            faad faadVar = (faad) faacVar.instance;
                            str13.getClass();
                            faadVar.e = str13;
                            String str14 = fajwVar.f;
                            faacVar.copyOnWrite();
                            faad faadVar2 = (faad) faacVar.instance;
                            str14.getClass();
                            faadVar2.f = str14;
                            if (fajwVar.d.size() > 0) {
                                eygi eygiVar5 = fajwVar.d;
                                faacVar.copyOnWrite();
                                faad faadVar3 = (faad) faacVar.instance;
                                eygi eygiVar6 = faadVar3.d;
                                if (!eygiVar6.c()) {
                                    faadVar3.d = eyfy.mutableCopy(eygiVar6);
                                }
                                eydl.addAll(eygiVar5, faadVar3.d);
                            }
                            faaaVar.copyOnWrite();
                            faab faabVar6 = (faab) faaaVar.instance;
                            faad faadVar4 = (faad) faacVar.build();
                            faadVar4.getClass();
                            faabVar6.c = faadVar4;
                            faabVar6.b = 6;
                        } else if (i10 == 3) {
                            fajc fajcVar = i8 == 7 ? (fajc) fajrVar.d : fajc.a;
                            ezzq ezzqVar = (ezzq) ezzr.a.createBuilder();
                            String str15 = fajcVar.b;
                            ezzqVar.copyOnWrite();
                            ezzr ezzrVar = (ezzr) ezzqVar.instance;
                            str15.getClass();
                            ezzrVar.b = str15;
                            String str16 = fajcVar.c;
                            ezzqVar.copyOnWrite();
                            ezzr ezzrVar2 = (ezzr) ezzqVar.instance;
                            str16.getClass();
                            ezzrVar2.c = str16;
                            faaaVar.copyOnWrite();
                            faab faabVar7 = (faab) faaaVar.instance;
                            ezzr ezzrVar3 = (ezzr) ezzqVar.build();
                            ezzrVar3.getClass();
                            faabVar7.c = ezzrVar3;
                            faabVar7.b = 7;
                        }
                        ezzsVar.copyOnWrite();
                        ezzt ezztVar5 = (ezzt) ezzsVar.instance;
                        faab faabVar8 = (faab) faaaVar.build();
                        faabVar8.getClass();
                        eygr eygrVar4 = ezztVar5.g;
                        if (!eygrVar4.c()) {
                            ezztVar5.g = eyfy.mutableCopy(eygrVar4);
                        }
                        ezztVar5.g.add(faabVar8);
                        i3 = 1;
                    }
                }
                i = 7;
                i2 = 6;
                if (fajeVar.h.size() > 0) {
                    Iterator<E> it3 = fajeVar.h.iterator();
                    while (it3.hasNext()) {
                        int intValue = ((Integer) it3.next()).intValue();
                        ezzsVar.copyOnWrite();
                        ezzt ezztVar6 = (ezzt) ezzsVar.instance;
                        eygi eygiVar7 = ezztVar6.h;
                        if (!eygiVar7.c()) {
                            ezztVar6.h = eyfy.mutableCopy(eygiVar7);
                        }
                        ezztVar6.h.h(intValue);
                    }
                }
                fabaVar.copyOnWrite();
                fabb fabbVar4 = (fabb) fabaVar.instance;
                ezzt ezztVar7 = (ezzt) ezzsVar.build();
                ezztVar7.getClass();
                fabbVar4.d = ezztVar7;
                fabbVar4.b |= 2;
            } else {
                i = 7;
                i2 = 6;
            }
            if (faguVar.f.size() > 0) {
                for (String str17 : faguVar.f) {
                    switch (str17.hashCode()) {
                        case -2076636191:
                            if (str17.equals("FAILED_TO_FETCH_SURVEY")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -2056938406:
                            if (str17.equals("UNSUPPORTED_CRONET_ENGINE")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1938530698:
                            if (str17.equals("BACKEND_TIMEOUT")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1577734254:
                            if (str17.equals("NO_AVAILABLE_SURVEY")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 2076341913:
                            if (str17.equals("TRIGGER_ID_NOT_SET")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    int i14 = c != 0 ? c != 1 ? c != 2 ? c != 3 ? c != 4 ? 2 : i : i2 : 5 : 4 : 3;
                    fabaVar.copyOnWrite();
                    fabb fabbVar5 = (fabb) fabaVar.instance;
                    eygi eygiVar8 = fabbVar5.f;
                    if (!eygiVar8.c()) {
                        fabbVar5.f = eyfy.mutableCopy(eygiVar8);
                    }
                    fabbVar5.f.h(i14 - 2);
                }
            }
            efos a = efos.a();
            ezyw ezywVar = (ezyw) ezyx.a.createBuilder();
            ezywVar.copyOnWrite();
            ezyx ezyxVar = (ezyx) ezywVar.instance;
            faaz faazVar2 = (faaz) faayVar.build();
            faazVar2.getClass();
            ezyxVar.c = faazVar2;
            ezyxVar.b = 2;
            ezywVar.copyOnWrite();
            ezyx ezyxVar2 = (ezyx) ezywVar.instance;
            fabb fabbVar6 = (fabb) fabaVar.build();
            fabbVar6.getClass();
            ezyxVar2.e = fabbVar6;
            ezyxVar2.d = 4;
            a.b((ezyx) ezywVar.build(), efouVar.b(), efouVar.a(), context, str);
        }
    }

    public static void c(efou efouVar, Context context, String str) {
        efpb efpbVar = efor.c;
        if (efor.c(fdul.b(efor.b))) {
            efos a = efos.a();
            fabk fabkVar = (fabk) fabm.a.createBuilder();
            fabkVar.copyOnWrite();
            ((fabm) fabkVar.instance).b = 0;
            fabkVar.copyOnWrite();
            ((fabm) fabkVar.instance).c = fabl.a(6);
            a.d((fabm) fabkVar.build(), efouVar.b(), efouVar.a(), context, str);
        }
    }

    public static void d(efou efouVar, Context context, String str) {
        efpb efpbVar = efor.c;
        if (efor.c(fdul.b(efor.b))) {
            efos a = efos.a();
            fabk fabkVar = (fabk) fabm.a.createBuilder();
            fabkVar.copyOnWrite();
            ((fabm) fabkVar.instance).b = 0;
            fabkVar.copyOnWrite();
            ((fabm) fabkVar.instance).c = fabl.a(8);
            a.d((fabm) fabkVar.build(), efouVar.b(), efouVar.a(), context, str);
        }
    }

    public static void e(efou efouVar, Context context, String str) {
        efpb efpbVar = efor.c;
        if (efor.c(fdul.b(efor.b))) {
            efos a = efos.a();
            fabk fabkVar = (fabk) fabm.a.createBuilder();
            fabkVar.copyOnWrite();
            ((fabm) fabkVar.instance).b = 0;
            fabkVar.copyOnWrite();
            ((fabm) fabkVar.instance).c = fabl.a(7);
            a.d((fabm) fabkVar.build(), efouVar.b(), efouVar.a(), context, str);
        }
    }

    private static ezxj f(fagz fagzVar) {
        ezxi ezxiVar = (ezxi) ezxj.a.createBuilder();
        for (fagx fagxVar : fagzVar.b) {
            ezxg ezxgVar = (ezxg) ezxh.a.createBuilder();
            int i = fagxVar.c;
            ezxgVar.copyOnWrite();
            ((ezxh) ezxgVar.instance).b = i;
            int i2 = fagxVar.d;
            ezxgVar.copyOnWrite();
            ((ezxh) ezxgVar.instance).c = i2;
            String str = fagxVar.e;
            ezxgVar.copyOnWrite();
            ezxh ezxhVar = (ezxh) ezxgVar.instance;
            str.getClass();
            ezxhVar.d = str;
            boolean z = fagxVar.f;
            ezxgVar.copyOnWrite();
            ((ezxh) ezxgVar.instance).e = z;
            ezxiVar.copyOnWrite();
            ezxj ezxjVar = (ezxj) ezxiVar.instance;
            ezxh ezxhVar2 = (ezxh) ezxgVar.build();
            ezxhVar2.getClass();
            eygr eygrVar = ezxjVar.b;
            if (!eygrVar.c()) {
                ezxjVar.b = eyfy.mutableCopy(eygrVar);
            }
            ezxjVar.b.add(ezxhVar2);
        }
        return (ezxj) ezxiVar.build();
    }
}
