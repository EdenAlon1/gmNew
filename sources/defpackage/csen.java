package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.DesugarCollections;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class csen implements csdr {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/util/cloudstore/completeness/messagereactions/MessageReactionsCmsDataProvider");
    private final cmrq b;
    private final csdv c;
    private final ashw d;
    private final axkm e;
    private final cctp f;
    private final ashh g;

    public csen(ffbr ffbrVar, ffbr ffbrVar2, cmrq cmrqVar, csdv csdvVar, ashw ashwVar, axkm axkmVar, cctp cctpVar, ashh ashhVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        cmrqVar.getClass();
        axkmVar.getClass();
        cctpVar.getClass();
        ashhVar.getClass();
        this.b = cmrqVar;
        this.c = csdvVar;
        this.d = ashwVar;
        this.e = axkmVar;
        this.f = cctpVar;
        this.g = ashhVar;
    }

    private final cmrl f(String str) {
        cmrl b = this.b.b(str);
        b.getClass();
        return b;
    }

    @Override // defpackage.csdr
    public final eshn a() {
        return eshn.MESSAGE_REACTIONS;
    }

    @Override // defpackage.csdr
    public final List b() {
        if (this.e.al()) {
            bech a2 = this.f.b(10, becg.INSERT).a(1, "message_id");
            a2.f = 5;
            a2.g = ccrk.a(6);
            String a3 = a2.a();
            bech a4 = this.f.b(10, becg.UPDATE).a(1, "message_id");
            a4.f = 5;
            a4.g = ccrk.a(6);
            String a5 = a4.a();
            bech a6 = this.f.b(10, becg.DELETE).a(1, "message_id");
            a6.f = 5;
            a6.g = ccrk.a(6);
            return ffdx.g(a3, a5, a6.a());
        }
        bech bechVar = new bech();
        bechVar.c = becg.INSERT;
        bechVar.e = 32;
        bechVar.b = 10;
        bechVar.i = "message_id";
        bechVar.f = 5;
        bechVar.c();
        bechVar.g = ccrk.a(6);
        bechVar.h = this.g.a();
        String a7 = bechVar.a();
        bech bechVar2 = new bech();
        bechVar2.c = becg.UPDATE;
        bechVar2.e = 32;
        bechVar2.b = 10;
        bechVar2.i = "message_id";
        bechVar2.f = 5;
        bechVar2.c();
        bechVar2.g = ccrk.a(6);
        bechVar2.h = this.g.a();
        String a8 = bechVar2.a();
        bech bechVar3 = new bech();
        bechVar3.c = becg.DELETE;
        bechVar3.e = 32;
        bechVar3.b = 10;
        bechVar3.i = "message_id";
        bechVar3.f = 5;
        bechVar3.c();
        bechVar3.g = ccrk.a(6);
        bechVar3.h = this.g.a();
        return ffdx.g(a7, a8, bechVar3.a());
    }

    @Override // defpackage.csdr
    public final List c() {
        return ffdx.g(this.f.c(10, becg.INSERT), this.f.c(10, becg.UPDATE), this.f.c(10, becg.DELETE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.csdr
    public final Map d(final List list) {
        int i;
        int i2;
        Object obj;
        int i3;
        ArrayList arrayList;
        if (!this.d.a() || !csgj.a()) {
            return ffem.a;
        }
        bueb a2 = bueg.a();
        a2.z("bugleReactionBindData");
        a2.f(new Function() { // from class: csej
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                List list2 = list;
                buef buefVar = (buef) obj2;
                ArrayList arrayList2 = new ArrayList(ffdx.n(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(bdhb.b((String) it.next()));
                }
                buefVar.c(arrayList2);
                return buefVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        buxo d = MessagesTable.d();
        int i4 = 1;
        int i5 = 0;
        d.c(MessagesTable.c.M);
        dtvy i6 = dtvz.i(d.b(), MessagesTable.c.a, bueg.c.d);
        ((dtrd) i6).e = "joined_messages";
        a2.G(i6.g());
        a2.z("MessageReactionsCmsDataProvider#getData#batched");
        engw y = a2.b().y();
        y.getClass();
        ArrayList arrayList2 = new ArrayList();
        enqv it = y.iterator();
        while (true) {
            i = 10;
            if (!it.hasNext()) {
                break;
            }
            buco bucoVar = (buco) it.next();
            if (bucoVar.m() != null) {
                cmrf m = bucoVar.m();
                m.getClass();
                eygr eygrVar = m.b;
                eygrVar.getClass();
                ArrayList arrayList3 = new ArrayList();
                Iterator<E> it2 = eygrVar.iterator();
                while (it2.hasNext()) {
                    eygr eygrVar2 = ((cmro) it2.next()).d;
                    eygrVar2.getClass();
                    ffdx.w(arrayList3, eygrVar2);
                }
                ArrayList arrayList4 = new ArrayList(ffdx.n(arrayList3, 10));
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    cmri cmriVar = ((cmrs) it3.next()).c;
                    if (cmriVar == null) {
                        cmriVar = cmri.a;
                    }
                    arrayList4.add(cmriVar.b);
                }
                arrayList = arrayList4;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                arrayList2.add(arrayList);
            }
        }
        final List ak = ffdx.ak(ffdx.o(arrayList2));
        ParticipantsTable.BindData a3 = ((bdrr) this.c.a.b()).a();
        bvvn e = ParticipantsTable.e();
        e.z("CmsDataProviderDatabaseOperations#getCmsIdsForParticipants");
        e.h(new Function() { // from class: csdt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                bvvw bvvwVar = (bvvw) obj2;
                bvvwVar.m(ak);
                return bvvwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        e.e(new Function() { // from class: csdu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                bvtg bvtgVar = (bvtg) obj2;
                return new bvth[]{bvtgVar.a, bvtgVar.E, bvtgVar.d};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        engw y2 = e.b().y();
        y2.getClass();
        ArrayList arrayList5 = new ArrayList(ffdx.n(y2, 10));
        enqv it4 = y2.iterator();
        while (it4.hasNext()) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it4.next();
            arrayList5.add(new ffcf(bindData.S(), bindData));
        }
        Map k = ffew.k(arrayList5);
        LinkedHashMap linkedHashMap = new LinkedHashMap(ffew.a(k.size()));
        for (Map.Entry entry : k.entrySet()) {
            linkedHashMap.put(entry.getKey(), bdtd.m((ParticipantsTable.BindData) entry.getValue()) ? a3 : (ParticipantsTable.BindData) entry.getValue());
        }
        ArrayList arrayList6 = new ArrayList();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str = (String) entry2.getKey();
            ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) entry2.getValue();
            arrayList6.add(new ffcf(str, bindData2 != null ? bindData2.L() : null));
        }
        Map k2 = ffew.k(arrayList6);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(y, 10)), 16));
        enqv it5 = y.iterator();
        while (it5.hasNext()) {
            buco bucoVar2 = (buco) it5.next();
            String b = bucoVar2.k().b();
            b.getClass();
            if (bucoVar2.m() != null) {
                try {
                    cmrf m2 = bucoVar2.m();
                    m2.getClass();
                    eskn esknVar = (eskn) esko.a.createBuilder();
                    esknVar.getClass();
                    for (cmro cmroVar : m2.b) {
                        cmroVar.getClass();
                        eskh eskhVar = (eskh) eski.a.createBuilder();
                        eskhVar.getClass();
                        cmrl cmrlVar = cmroVar.c;
                        if (cmrlVar == null) {
                            cmrlVar = cmrl.a;
                        }
                        String str2 = cmrlVar.d;
                        str2.getClass();
                        eskhVar.copyOnWrite();
                        ((eski) eskhVar.instance).b = str2;
                        eyfy build = eskhVar.build();
                        build.getClass();
                        eski eskiVar = (eski) build;
                        ArrayList arrayList7 = new ArrayList();
                        eygr eygrVar3 = cmroVar.d;
                        eygrVar3.getClass();
                        i2 = i5;
                        try {
                            ArrayList arrayList8 = new ArrayList(ffdx.n(eygrVar3, i));
                            Iterator<E> it6 = eygrVar3.iterator();
                            while (it6.hasNext()) {
                                cmri cmriVar2 = ((cmrs) it6.next()).c;
                                if (cmriVar2 == null) {
                                    cmriVar2 = cmri.a;
                                }
                                arrayList8.add(cmriVar2.b);
                            }
                            for (cmrs cmrsVar : cmroVar.d) {
                                cmri cmriVar3 = cmrsVar.c;
                                if (cmriVar3 == null) {
                                    cmriVar3 = cmri.a;
                                }
                                String str3 = cmriVar3.b;
                                str3.getClass();
                                String str4 = (String) k2.get(str3);
                                if (str4 == null) {
                                    throw new csgv("Cannot create reaction for missing participant", engw.r(new csgn(str3, i4)));
                                }
                                try {
                                    cmri cmriVar4 = cmrsVar.c;
                                    if (cmriVar4 == null) {
                                        cmriVar4 = cmri.a;
                                    }
                                    boolean z = cmriVar4.c;
                                    boolean z2 = cmrsVar.d;
                                    eskf eskfVar = (eskf) eskg.a.createBuilder();
                                    eskfVar.getClass();
                                    eskfVar.copyOnWrite();
                                    int i7 = i4;
                                    ((eskg) eskfVar.instance).b = str4;
                                    eskfVar.copyOnWrite();
                                    ((eskg) eskfVar.instance).c = z;
                                    eyfy build2 = eskfVar.build();
                                    build2.getClass();
                                    eskl esklVar = (eskl) eskm.a.createBuilder();
                                    esklVar.getClass();
                                    esklVar.copyOnWrite();
                                    eskm eskmVar = (eskm) esklVar.instance;
                                    eskmVar.c = (eskg) build2;
                                    eskmVar.b |= 1;
                                    esklVar.copyOnWrite();
                                    ((eskm) esklVar.instance).d = z2;
                                    eyfy build3 = esklVar.build();
                                    build3.getClass();
                                    arrayList7.add((eskm) build3);
                                    i4 = i7;
                                } catch (csgv e2) {
                                    e = e2;
                                    csgx csgxVar = csgx.NO_RETRY;
                                    Object[] objArr = new Object[1];
                                    objArr[i2] = e.a;
                                    String format = String.format("Could not find cmsId for participantId %s.", Arrays.copyOf(objArr, 1));
                                    format.getClass();
                                    obj = ffci.a(new csem(csgxVar, format));
                                    i5 = i2;
                                    i3 = 1;
                                    linkedHashMap2.put(b, new ffch(obj));
                                    i4 = i3;
                                    i = 10;
                                }
                            }
                            eskj eskjVar = (eskj) eskk.a.createBuilder();
                            eskjVar.copyOnWrite();
                            eskk eskkVar = (eskk) eskjVar.instance;
                            eskkVar.c = eskiVar;
                            eskkVar.b |= 1;
                            eskjVar.copyOnWrite();
                            eskk eskkVar2 = (eskk) eskjVar.instance;
                            eygr eygrVar4 = eskkVar2.d;
                            if (!eygrVar4.c()) {
                                eskkVar2.d = eyfy.mutableCopy(eygrVar4);
                            }
                            eydl.addAll(arrayList7, eskkVar2.d);
                            eyfy build4 = eskjVar.build();
                            build4.getClass();
                            eskk eskkVar3 = (eskk) build4;
                            esknVar.copyOnWrite();
                            esko eskoVar = (esko) esknVar.instance;
                            eygr eygrVar5 = eskoVar.c;
                            if (!eygrVar5.c()) {
                                eskoVar.c = eyfy.mutableCopy(eygrVar5);
                            }
                            eskoVar.c.add(eskkVar3);
                            i5 = i2;
                            i4 = 1;
                            i = 10;
                        } catch (csgv e3) {
                            e = e3;
                        }
                    }
                    i2 = i5;
                    eyfy build5 = esknVar.build();
                    build5.getClass();
                    obj = ((esko) build5).toByteString();
                } catch (csgv e4) {
                    e = e4;
                    i2 = i5;
                }
                i5 = i2;
                i3 = 1;
            } else {
                int i8 = i5;
                bucoVar2.getClass();
                cmrl n = bucoVar2.n();
                String str5 = n != null ? n.d : null;
                if (str5 == null) {
                    str5 = cmrq.a(bucoVar2.o()).d;
                    str5.getClass();
                }
                i5 = i8;
                dtro[] aG = bucoVar2.aG("joined_messages", new MessagesTable.BindData[i5]);
                aG.getClass();
                MessagesTable.BindData bindData3 = (MessagesTable.BindData) ffdo.H(aG);
                String R = bindData3 != null ? bindData3.R() : null;
                if (R != null) {
                    eskn esknVar2 = (eskn) esko.a.createBuilder();
                    esknVar2.getClass();
                    eskd eskdVar = (eskd) eske.a.createBuilder();
                    eskdVar.getClass();
                    eskdVar.copyOnWrite();
                    ((eske) eskdVar.instance).b = str5;
                    eskdVar.copyOnWrite();
                    ((eske) eskdVar.instance).c = R;
                    eyfy build6 = eskdVar.build();
                    build6.getClass();
                    esknVar2.copyOnWrite();
                    esko eskoVar2 = (esko) esknVar2.instance;
                    eskoVar2.d = (eske) build6;
                    i3 = 1;
                    eskoVar2.b |= 1;
                    eyfy build7 = esknVar2.build();
                    build7.getClass();
                    obj = ((esko) build7).toByteString();
                } else {
                    i3 = 1;
                    MessageIdType l = bucoVar2.l();
                    l.getClass();
                    obj = ffci.a(csdv.a(l));
                }
            }
            linkedHashMap2.put(b, new ffch(obj));
            i4 = i3;
            i = 10;
        }
        return linkedHashMap2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.csdr
    public final Map e(Map map) {
        buco a2;
        map.getClass();
        if (!this.d.a() || !csgj.a()) {
            return ffem.a;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            try {
                esko eskoVar = (esko) eyfy.parseFrom(esko.a, (eyee) entry.getValue());
                eskoVar.getClass();
                linkedHashMap.put(str, eskoVar);
            } catch (eygu e) {
                linkedHashMap2.put(str, e);
            }
        }
        buxo d = MessagesTable.d();
        d.z("reactedMessageCmsIdsToBugleIds");
        d.h(new Function() { // from class: csek
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                Collection values = linkedHashMap.values();
                ArrayList arrayList = new ArrayList(ffdx.n(values, 10));
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    eske eskeVar = ((esko) it.next()).d;
                    if (eskeVar == null) {
                        eskeVar = eske.a;
                    }
                    arrayList.add(eskeVar.c);
                }
                buxzVar.g(arrayList);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        buum buumVar = MessagesTable.c;
        d.c(buumVar.M, buumVar.a);
        engw y = d.b().y();
        y.getClass();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(y, 10)), 16));
        enqv it = y.iterator();
        while (it.hasNext()) {
            MessagesTable.BindData bindData = (MessagesTable.BindData) it.next();
            ffcf ffcfVar = new ffcf(bindData.R(), bindData.D().b());
            linkedHashMap3.put(ffcfVar.a, ffcfVar.b);
        }
        bvvn e2 = ParticipantsTable.e();
        e2.z("participantsCmsIdsToBugleIds");
        e2.h(new Function() { // from class: csel
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvvw bvvwVar = (bvvw) obj;
                Collection values = linkedHashMap.values();
                ArrayList arrayList = new ArrayList();
                Iterator it2 = values.iterator();
                while (it2.hasNext()) {
                    eygr eygrVar = ((esko) it2.next()).c;
                    eygrVar.getClass();
                    ffdx.w(arrayList, eygrVar);
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    eygr eygrVar2 = ((eskk) it3.next()).d;
                    eygrVar2.getClass();
                    ffdx.w(arrayList2, eygrVar2);
                }
                ArrayList arrayList3 = new ArrayList(ffdx.n(arrayList2, 10));
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    eskg eskgVar = ((eskm) it4.next()).c;
                    if (eskgVar == null) {
                        eskgVar = eskg.a;
                    }
                    arrayList3.add(eskgVar.b);
                }
                bvvwVar.e(arrayList3);
                return bvvwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bvtg bvtgVar = ParticipantsTable.c;
        e2.c(bvtgVar.E, bvtgVar.a);
        engw y2 = e2.b().y();
        y2.getClass();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(y2, 10)), 16));
        enqv it2 = y2.iterator();
        while (it2.hasNext()) {
            ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) it2.next();
            ffcf ffcfVar2 = new ffcf(bindData2.L(), bindData2.S());
            linkedHashMap4.put(ffcfVar2.a, ffcfVar2.b);
        }
        Set<Map.Entry> entrySet = linkedHashMap.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry2 : entrySet) {
            String str2 = (String) entry2.getKey();
            esko eskoVar2 = (esko) entry2.getValue();
            if (eskoVar2.c.size() != 0) {
                cmre cmreVar = (cmre) cmrf.a.createBuilder();
                cmreVar.getClass();
                for (eskk eskkVar : eskoVar2.c) {
                    DesugarCollections.unmodifiableList(((cmrf) cmreVar.instance).b).getClass();
                    eskkVar.getClass();
                    cmrn cmrnVar = (cmrn) cmro.a.createBuilder();
                    cmrnVar.getClass();
                    eski eskiVar = eskkVar.c;
                    if (eskiVar == null) {
                        eskiVar = eski.a;
                    }
                    String str3 = eskiVar.b;
                    str3.getClass();
                    cmrp.b(f(str3), cmrnVar);
                    for (eskm eskmVar : eskkVar.d) {
                        eskg eskgVar = eskmVar.c;
                        if (eskgVar == null) {
                            eskgVar = eskg.a;
                        }
                        String str4 = (String) linkedHashMap4.get(eskgVar.b);
                        if (str4 != null) {
                            DesugarCollections.unmodifiableList(((cmro) cmrnVar.instance).d).getClass();
                            cmrr cmrrVar = (cmrr) cmrs.a.createBuilder();
                            cmrrVar.getClass();
                            cmrh cmrhVar = (cmrh) cmri.a.createBuilder();
                            cmrhVar.getClass();
                            cmrj.c(str4, cmrhVar);
                            eskg eskgVar2 = eskmVar.c;
                            if (eskgVar2 == null) {
                                eskgVar2 = eskg.a;
                            }
                            cmrj.b(eskgVar2.c, cmrhVar);
                            cmrt.b(cmrj.a(cmrhVar), cmrrVar);
                            cmrnVar.a(cmrt.a(cmrrVar));
                        }
                    }
                    cmreVar.b(cmrp.a(cmrnVar));
                }
                eyfy build = cmreVar.build();
                build.getClass();
                String[] strArr = bueg.a;
                buct buctVar = new buct();
                buctVar.e(bdhb.b(str2));
                buctVar.h((cmrf) build);
                a2 = buctVar.a();
            } else {
                eske eskeVar = eskoVar2.d;
                if (eskeVar == null) {
                    eskeVar = eske.a;
                }
                String str5 = (String) linkedHashMap3.get(eskeVar.c);
                if (str5 == null) {
                    eske eskeVar2 = eskoVar2.d;
                    if (eskeVar2 == null) {
                        eskeVar2 = eske.a;
                    }
                    engw r = engw.r(new csgn(eskeVar2.c, 3));
                    r.getClass();
                    linkedHashMap2.put(str2, new csgo("Cannot create message reaction. BugleId does not exist for reacted message.", r));
                    a2 = null;
                } else {
                    eske eskeVar3 = eskoVar2.d;
                    if (eskeVar3 == null) {
                        eskeVar3 = eske.a;
                    }
                    String str6 = eskeVar3.b;
                    str6.getClass();
                    cmrl f = f(str6);
                    String[] strArr2 = bueg.a;
                    buct buctVar2 = new buct();
                    buctVar2.e(bdhb.b(str2));
                    cmrv b = cmrv.b(f.e);
                    if (b == null) {
                        b = cmrv.UNRECOGNIZED;
                    }
                    buctVar2.g(b);
                    buctVar2.d(f);
                    buctVar2.f(bdhb.b(str5));
                    a2 = buctVar2.a();
                }
            }
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        buco[] bucoVarArr = (buco[]) arrayList.toArray(new buco[0]);
        try {
            dtub.A(bueg.b(), 5, false, new BiConsumer() { // from class: bucf
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    buco bucoVar = (buco) obj;
                    Long l = (Long) obj2;
                    String[] strArr3 = bueg.a;
                    if (l.longValue() >= 0) {
                        bucoVar.a = new buce(l).a.longValue();
                        bucoVar.fY(0);
                    }
                }

                public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return BiConsumer$CC.$default$andThen(this, biConsumer);
                }
            }, (buco[]) Arrays.copyOf(bucoVarArr, bucoVarArr.length));
        } catch (Exception e3) {
            ensk j = a.j();
            j.Y(ente.a, "BugleCmsAddFields");
            ((enrr) ((enrr) j).g(e3).h("com/google/android/apps/messaging/shared/util/cloudstore/completeness/messagereactions/MessageReactionsCmsDataProvider", "restoreDataInTransaction", 502, "MessageReactionsCmsDataProvider.kt")).q("Bulk insert of message reaction data failed.");
            LinkedHashMap linkedHashMap5 = new LinkedHashMap(ffew.a(map.size()));
            Iterator it3 = map.entrySet().iterator();
            while (it3.hasNext()) {
                linkedHashMap5.put(((Map.Entry) it3.next()).getKey(), e3);
            }
            linkedHashMap2.putAll(linkedHashMap5);
        }
        return linkedHashMap2;
    }
}
