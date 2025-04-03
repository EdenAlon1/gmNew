package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctle implements ctkr {
    public static final cfva a = cfvl.r(158701494, "filter_suggestion_logging");
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final cjdi e;

    public ctle(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, cjdi cjdiVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        cjdiVar.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = cjdiVar;
    }

    static /* synthetic */ epjn j(epjp epjpVar, fbqp fbqpVar, int i, List list, List list2, String str, int i2, List list3, int i3, fbqx fbqxVar, int i4) {
        if ((i4 & 128) != 0) {
            list3 = ffel.a;
        }
        if ((i4 & 256) != 0) {
            i3 = -1;
        }
        if ((i4 & 512) != 0) {
            fbqxVar = fbqx.UNKNOWN_REJECTION_REASON;
        }
        epjn epjnVar = (epjn) epjq.a.createBuilder();
        epjnVar.getClass();
        epjnVar.copyOnWrite();
        epjq epjqVar = (epjq) epjnVar.instance;
        epjqVar.c = epjpVar.d;
        epjqVar.b |= 1;
        epjnVar.copyOnWrite();
        epjq epjqVar2 = (epjq) epjnVar.instance;
        epjqVar2.f = fbqpVar.a();
        epjqVar2.b |= 4;
        epjnVar.copyOnWrite();
        epjq epjqVar3 = (epjq) epjnVar.instance;
        epjqVar3.b |= 2;
        epjqVar3.d = i;
        epjnVar.copyOnWrite();
        epjq epjqVar4 = (epjq) epjnVar.instance;
        eygi eygiVar = epjqVar4.e;
        if (!eygiVar.c()) {
            epjqVar4.e = eyfy.mutableCopy(eygiVar);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            epjqVar4.e.h(((fbri) it.next()).a());
        }
        epjnVar.copyOnWrite();
        epjq epjqVar5 = (epjq) epjnVar.instance;
        eygr eygrVar = epjqVar5.g;
        if (!eygrVar.c()) {
            epjqVar5.g = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(list2, epjqVar5.g);
        epjnVar.copyOnWrite();
        epjq epjqVar6 = (epjq) epjnVar.instance;
        epjqVar6.b |= 32;
        epjqVar6.k = str;
        epjnVar.copyOnWrite();
        epjq epjqVar7 = (epjq) epjnVar.instance;
        epjqVar7.l = fbqz.a(i2);
        epjqVar7.b |= 64;
        if (i3 >= 0) {
            epjnVar.copyOnWrite();
            epjq epjqVar8 = (epjq) epjnVar.instance;
            epjqVar8.b |= 8;
            epjqVar8.h = i3;
        }
        if (fbqxVar != fbqx.UNKNOWN_REJECTION_REASON) {
            epjnVar.copyOnWrite();
            epjq epjqVar9 = (epjq) epjnVar.instance;
            epjqVar9.j = fbqxVar.a();
            epjqVar9.b |= 16;
        }
        if (((Boolean) ((cfup) ctjd.ae.get()).e()).booleanValue()) {
            epjnVar.a(list3);
        }
        return epjnVar;
    }

    private final long k(MessageCoreData messageCoreData) {
        if (messageCoreData.t() == 0) {
            messageCoreData.bX(((akvz) this.b.b()).d(messageCoreData));
        }
        return messageCoreData.t();
    }

    private final List l(List list, long j) {
        int i;
        ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fbwv fbwvVar = (fbwv) it.next();
            epjf epjfVar = (epjf) epjg.a.createBuilder();
            fbrc b = fbrc.b(fbwvVar.d);
            if (b == null) {
                b = fbrc.UNRECOGNIZED;
            }
            epjfVar.copyOnWrite();
            epjg epjgVar = (epjg) epjfVar.instance;
            epjgVar.e = b.a();
            epjgVar.b |= 1;
            fbrc b2 = fbrc.b(fbwvVar.d);
            if (b2 == null) {
                b2 = fbrc.UNRECOGNIZED;
            }
            if (b2 == fbrc.NUDGE_CLASSIFICATION) {
                epgj epgjVar = (epgj) epgk.a.createBuilder();
                cjdi cjdiVar = this.e;
                if (cjdiVar.a(j)) {
                    i = 4;
                } else {
                    long epochMilli = cjdiVar.a.f().toEpochMilli();
                    Object e = ctjd.Z.e();
                    e.getClass();
                    long longValue = ((Number) e).longValue() + j;
                    Object e2 = ctjd.aa.e();
                    e2.getClass();
                    i = epochMilli > longValue + ((Number) e2).longValue() ? 5 : 3;
                }
                epgjVar.copyOnWrite();
                epgk epgkVar = (epgk) epgjVar.instance;
                epgkVar.c = fbqv.a(i);
                epgkVar.b |= 1;
                epjfVar.copyOnWrite();
                epjg epjgVar2 = (epjg) epjfVar.instance;
                epgk epgkVar2 = (epgk) epgjVar.build();
                epgkVar2.getClass();
                epjgVar2.d = epgkVar2;
                epjgVar2.c = 2;
            }
            arrayList.add((epjg) epjfVar.build());
        }
        return ffdx.ak(arrayList);
    }

    private static final List m(List list) {
        ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fbwv fbwvVar = (fbwv) it.next();
            epjf epjfVar = (epjf) epjg.a.createBuilder();
            fbrc b = fbrc.b(fbwvVar.d);
            if (b == null) {
                b = fbrc.UNRECOGNIZED;
            }
            epjfVar.copyOnWrite();
            epjg epjgVar = (epjg) epjfVar.instance;
            epjgVar.e = b.a();
            epjgVar.b |= 1;
            arrayList.add((epjg) epjfVar.build());
        }
        return ffdx.ak(arrayList);
    }

    private static final List n(List list) {
        Optional empty;
        epjy epjyVar;
        ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SuggestionData suggestionData = (SuggestionData) it.next();
            if (suggestionData instanceof SmartSuggestionItemSuggestionData) {
                SmartSuggestionData smartSuggestionData = (SmartSuggestionData) suggestionData;
                fbrg k = smartSuggestionData.k();
                final epjx epjxVar = (epjx) epjy.a.createBuilder();
                epjxVar.copyOnWrite();
                epjy epjyVar2 = (epjy) epjxVar.instance;
                epjyVar2.f = k.a();
                epjyVar2.b |= 32;
                SmartSuggestionItemSuggestionData smartSuggestionItemSuggestionData = (SmartSuggestionItemSuggestionData) smartSuggestionData;
                fbri l = smartSuggestionItemSuggestionData.l();
                epjxVar.copyOnWrite();
                epjy epjyVar3 = (epjy) epjxVar.instance;
                epjyVar3.c = l.a();
                epjyVar3.b |= 2;
                fbwy fbwyVar = smartSuggestionItemSuggestionData.c.e;
                if (fbwyVar == null) {
                    fbwyVar = fbwy.b;
                }
                String str = fbwyVar.k;
                str.getClass();
                if (str.length() > 0) {
                    epjxVar.copyOnWrite();
                    epjy epjyVar4 = (epjy) epjxVar.instance;
                    epjyVar4.b |= 256;
                    epjyVar4.g = str;
                }
                fbwy fbwyVar2 = smartSuggestionItemSuggestionData.c.e;
                if (fbwyVar2 == null) {
                    fbwyVar2 = fbwy.b;
                }
                fbxk fbxkVar = fbwyVar2.j;
                if (fbxkVar == null) {
                    fbxkVar = fbxk.a;
                }
                String str2 = fbxkVar.d;
                str2.getClass();
                if (str2.length() > 0) {
                    epjxVar.copyOnWrite();
                    epjy epjyVar5 = (epjy) epjxVar.instance;
                    epjyVar5.b |= 16;
                    epjyVar5.e = str2;
                }
                ArrayList arrayList2 = new ArrayList();
                fbwy fbwyVar3 = smartSuggestionItemSuggestionData.c.e;
                if (fbwyVar3 == null) {
                    fbwyVar3 = fbwy.b;
                }
                fbuc fbucVar = fbwyVar3.i;
                if (fbucVar == null) {
                    fbucVar = fbuc.a;
                }
                for (Object obj : fbucVar.c) {
                    obj.getClass();
                    fbtn fbtnVar = (fbtn) obj;
                    String str3 = fbtnVar.b;
                    str3.getClass();
                    if (str3.length() > 0) {
                        String str4 = fbtnVar.b;
                        str4.getClass();
                        arrayList2.add(str4);
                    }
                    String str5 = fbtnVar.c;
                    str5.getClass();
                    if (str5.length() > 0) {
                        String str6 = fbtnVar.c;
                        str6.getClass();
                        arrayList2.add(str6);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    epjxVar.copyOnWrite();
                    epjy epjyVar6 = (epjy) epjxVar.instance;
                    epjyVar6.a();
                    epjyVar6.d.add("ENTITY_PRESENT");
                }
                if (((Boolean) ctjd.J.e()).booleanValue()) {
                    epjxVar.copyOnWrite();
                    epjy epjyVar7 = (epjy) epjxVar.instance;
                    epjyVar7.a();
                    eydl.addAll(arrayList2, epjyVar7.d);
                }
                fbwy fbwyVar4 = smartSuggestionItemSuggestionData.c.e;
                if (((fbwyVar4 == null ? fbwy.b : fbwyVar4).c & 4) != 0) {
                    if (fbwyVar4 == null) {
                        fbwyVar4 = fbwy.b;
                    }
                    fbvz fbvzVar = fbwyVar4.r;
                    if (fbvzVar == null) {
                        fbvzVar = fbvz.a;
                    }
                    if ((fbvzVar.b & 1) != 0) {
                        fbwy fbwyVar5 = smartSuggestionItemSuggestionData.c.e;
                        if (fbwyVar5 == null) {
                            fbwyVar5 = fbwy.b;
                        }
                        fbvz fbvzVar2 = fbwyVar5.r;
                        if (fbvzVar2 == null) {
                            fbvzVar2 = fbvz.a;
                        }
                        fbwb fbwbVar = fbvzVar2.d;
                        if (fbwbVar == null) {
                            fbwbVar = fbwb.a;
                        }
                        empty = Optional.of(Double.valueOf(fbwbVar.b));
                        final ffji ffjiVar = new ffji() { // from class: ctks
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj2) {
                                Double d = (Double) obj2;
                                cfva cfvaVar = ctle.a;
                                d.getClass();
                                double doubleValue = d.doubleValue();
                                epjx epjxVar2 = epjx.this;
                                epjxVar2.copyOnWrite();
                                epjy epjyVar8 = (epjy) epjxVar2.instance;
                                epjy epjyVar9 = epjy.a;
                                epjyVar8.b |= 512;
                                epjyVar8.h = doubleValue;
                                return ffcu.a;
                            }
                        };
                        empty.ifPresent(new Consumer() { // from class: ctkv
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj2) {
                                cfva cfvaVar = ctle.a;
                                ffji.this.invoke(obj2);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        eyfy build = epjxVar.build();
                        build.getClass();
                        epjyVar = (epjy) build;
                    }
                }
                empty = Optional.empty();
                final ffji ffjiVar2 = new ffji() { // from class: ctks
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj2) {
                        Double d = (Double) obj2;
                        cfva cfvaVar = ctle.a;
                        d.getClass();
                        double doubleValue = d.doubleValue();
                        epjx epjxVar2 = epjx.this;
                        epjxVar2.copyOnWrite();
                        epjy epjyVar8 = (epjy) epjxVar2.instance;
                        epjy epjyVar9 = epjy.a;
                        epjyVar8.b |= 512;
                        epjyVar8.h = doubleValue;
                        return ffcu.a;
                    }
                };
                empty.ifPresent(new Consumer() { // from class: ctkv
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj2) {
                        cfva cfvaVar = ctle.a;
                        ffji.this.invoke(obj2);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                eyfy build2 = epjxVar.build();
                build2.getClass();
                epjyVar = (epjy) build2;
            } else {
                epjyVar = epjy.a;
                epjyVar.getClass();
            }
            arrayList.add(epjyVar);
        }
        return ffdx.ak(arrayList);
    }

    private static final fbqp o(eooi eooiVar) {
        int ordinal = eooiVar.ordinal();
        if (ordinal != 2) {
            if (ordinal == 4 || ordinal == 6 || ordinal == 8) {
                return fbqp.NOTIFICATION_VIEW;
            }
            if (ordinal != 15) {
                return fbqp.UNKNOWN_SOURCE;
            }
        }
        return fbqp.CONVERSATION_VIEW;
    }

    private static final List p(List list) {
        ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(bduu.b((SuggestionData) it.next()));
        }
        return ffdx.ak(arrayList);
    }

    private static final boolean q(SuggestionData suggestionData) {
        return ((SmartSuggestionItemSuggestionData) suggestionData).l() == fbri.SILENT;
    }

    private static final int r(List list) {
        if (list.isEmpty()) {
            return 2;
        }
        SuggestionData suggestionData = (SuggestionData) list.get(0);
        Set set = bduu.a;
        SmartSuggestionItemSuggestionData smartSuggestionItemSuggestionData = suggestionData instanceof SmartSuggestionItemSuggestionData ? (SmartSuggestionItemSuggestionData) suggestionData : null;
        if (smartSuggestionItemSuggestionData != null) {
            fbwy fbwyVar = smartSuggestionItemSuggestionData.c.e;
            if (fbwyVar == null) {
                fbwyVar = fbwy.b;
            }
            if ((fbwyVar.c & 4) != 0) {
                fbwy fbwyVar2 = smartSuggestionItemSuggestionData.c.e;
                if (fbwyVar2 == null) {
                    fbwyVar2 = fbwy.b;
                }
                fbvz fbvzVar = fbwyVar2.r;
                if (fbvzVar == null) {
                    fbvzVar = fbvz.a;
                }
                int b = fbqz.b(fbvzVar.c);
                if (b == 0) {
                    return 1;
                }
                return b;
            }
        }
        return 2;
    }

    private static final List s(List list, boolean z) {
        cfva cfvaVar = a;
        if (!((Boolean) cfvaVar.e()).booleanValue()) {
            return list;
        }
        if (!z && ((Boolean) cfvaVar.e()).booleanValue()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                SuggestionData suggestionData = (SuggestionData) list.get(i);
                if (suggestionData != null && q(suggestionData)) {
                    throw new IllegalStateException("Check failed.");
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            SuggestionData suggestionData2 = (SuggestionData) obj;
            if (suggestionData2 == null || !q(suggestionData2)) {
                arrayList.add(obj);
            }
        }
        return ffdx.ak(arrayList);
    }

    @Override // defpackage.ctkr
    public final void a(epjp epjpVar, fbqp fbqpVar, String str, ConversationIdType conversationIdType, fbrc fbrcVar, eopx eopxVar) {
        epjpVar.getClass();
        fbqpVar.getClass();
        eopxVar.getClass();
        if (((Boolean) ((cfup) ctkq.b.get()).e()).booleanValue()) {
            return;
        }
        epjn epjnVar = (epjn) epjq.a.createBuilder();
        epjnVar.copyOnWrite();
        epjq epjqVar = (epjq) epjnVar.instance;
        epjqVar.c = epjpVar.d;
        epjqVar.b |= 1;
        epjnVar.copyOnWrite();
        epjq epjqVar2 = (epjq) epjnVar.instance;
        epjqVar2.f = fbqpVar.a();
        epjqVar2.b |= 4;
        epjf epjfVar = (epjf) epjg.a.createBuilder();
        epjfVar.getClass();
        epjfVar.copyOnWrite();
        epjg epjgVar = (epjg) epjfVar.instance;
        epjgVar.e = fbrcVar.a();
        epjgVar.b |= 1;
        eyfy build = epjfVar.build();
        build.getClass();
        epjnVar.a(ffdx.b((epjg) build));
        long b = ((akvz) this.b.b()).b(conversationIdType);
        epjnVar.copyOnWrite();
        epjq epjqVar3 = (epjq) epjnVar.instance;
        epjqVar3.b |= 128;
        epjqVar3.m = b;
        epjnVar.copyOnWrite();
        epjq epjqVar4 = (epjq) epjnVar.instance;
        epjqVar4.b |= 32;
        epjqVar4.k = str;
        eyfy build2 = epjnVar.build();
        build2.getClass();
        eopy eopyVar = (eopy) eopz.a.createBuilder();
        eopyVar.copyOnWrite();
        eopz eopzVar = (eopz) eopyVar.instance;
        eopzVar.c = eopxVar.d;
        eopzVar.b |= 1;
        eopyVar.copyOnWrite();
        eopz eopzVar2 = (eopz) eopyVar.instance;
        eopzVar2.d = (epjq) build2;
        eopzVar2.b |= 2;
        eyfy build3 = eopyVar.build();
        build3.getClass();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_MESSAGE_CLASSIFICATION;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eolvVar2.bd = (eopz) build3;
        eolvVar2.e |= 536870912;
        ((akxl) this.c.b()).j(eoluVar);
    }

    @Override // defpackage.ctkr
    public final void b(epjp epjpVar, fbqp fbqpVar, String str, ConversationIdType conversationIdType, fbwv fbwvVar, eopx eopxVar) {
        epjpVar.getClass();
        fbqpVar.getClass();
        str.getClass();
        conversationIdType.getClass();
        fbwvVar.getClass();
        eopxVar.getClass();
        fbrc b = fbrc.b(fbwvVar.d);
        if (b == null) {
            b = fbrc.UNRECOGNIZED;
        }
        fbrc fbrcVar = b;
        fbrcVar.getClass();
        a(epjpVar, fbqpVar, str, conversationIdType, fbrcVar, eopxVar);
    }

    @Override // defpackage.ctkr
    public final void c(final epjp epjpVar, final int i, int i2, final List list, List list2, List list3, final fbqx fbqxVar, final MessageCoreData messageCoreData) {
        epjpVar.getClass();
        fbqxVar.getClass();
        messageCoreData.getClass();
        if (((Boolean) ((cfup) ctkq.c.get()).e()).booleanValue()) {
            return;
        }
        Optional optional = (Optional) this.d.b();
        final ffji ffjiVar = new ffji() { // from class: ctky
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                cfyp cfypVar = (cfyp) obj;
                cfva cfvaVar = ctle.a;
                cfypVar.getClass();
                csvs.c(cfypVar.c(epjp.this, i, list, fbqxVar, messageCoreData.B().b()), "BugleUsageStatistics", "Failed to log P2pSuggestionRequest");
                return ffcu.a;
            }
        };
        optional.ifPresent(new Consumer() { // from class: ctkz
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                cfva cfvaVar = ctle.a;
                ffji.this.invoke(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        List s = s(list, true);
        epjt epjtVar = (epjt) epju.a.createBuilder();
        epjn j = j(epjpVar, fbqp.UNKNOWN_SOURCE, s.size(), p(s), n(s), ((Boolean) ((cfup) ctkq.e.get()).e()).booleanValue() ? ctjg.c(messageCoreData) : ctjg.a(list), r(s), m(list2), 0, fbqxVar, 256);
        epjtVar.copyOnWrite();
        epju epjuVar = (epju) epjtVar.instance;
        epjq epjqVar = (epjq) j.build();
        epjqVar.getClass();
        epjuVar.d = epjqVar;
        epjuVar.b |= 2;
        epjtVar.copyOnWrite();
        epju epjuVar2 = (epju) epjtVar.instance;
        eygr eygrVar = epjuVar2.e;
        if (!eygrVar.c()) {
            epjuVar2.e = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(list3, epjuVar2.e);
        epjtVar.copyOnWrite();
        epju epjuVar3 = (epju) epjtVar.instance;
        epjuVar3.b |= 1;
        epjuVar3.c = i2;
        eyfy build = epjtVar.build();
        build.getClass();
        eora eoraVar = (eora) eorb.a.createBuilder();
        eoqz eoqzVar = eoqz.P2P_SUGGESTION_REQUEST;
        eoraVar.copyOnWrite();
        eorb eorbVar = (eorb) eoraVar.instance;
        eorbVar.c = eoqzVar.i;
        eorbVar.b |= 1;
        eoraVar.copyOnWrite();
        eorb eorbVar2 = (eorb) eoraVar.instance;
        eorbVar2.e = (epju) build;
        eorbVar2.b |= 4;
        long k = k(messageCoreData);
        eoraVar.copyOnWrite();
        eorb eorbVar3 = (eorb) eoraVar.instance;
        eorbVar3.b |= 64;
        eorbVar3.i = k;
        eyfy build2 = eoraVar.build();
        build2.getClass();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_P2P_SUGGESTION;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b = 1 | eolvVar.b;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eolvVar2.w = (eorb) build2;
        eolvVar2.b |= 32768;
        ((akxl) this.c.b()).j(eoluVar);
    }

    @Override // defpackage.ctkr
    public final void d(epjp epjpVar, fbqp fbqpVar, List list, int i, eoqz eoqzVar, boolean z, float f, final MessageCoreData messageCoreData, Boolean bool, Boolean bool2) {
        final epjp epjpVar2;
        final int i2;
        epjpVar.getClass();
        fbqpVar.getClass();
        list.getClass();
        eoqzVar.getClass();
        messageCoreData.getClass();
        if (((Boolean) ((cfup) ctkq.d.get()).e()).booleanValue()) {
            return;
        }
        final List s = s(list, false);
        if (eoqzVar == eoqz.P2P_SUGGESTION_CLICK) {
            Optional optional = (Optional) this.d.b();
            epjpVar2 = epjpVar;
            i2 = i;
            final ffji ffjiVar = new ffji() { // from class: ctkw
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    cfyp cfypVar = (cfyp) obj;
                    cfva cfvaVar = ctle.a;
                    cfypVar.getClass();
                    epjp epjpVar3 = epjp.this;
                    List list2 = s;
                    csvs.c(cfypVar.a(epjpVar3, fbqp.CONVERSATION_VIEW, list2.size(), list2, i2, messageCoreData.B()), "Bugle", "Failed to log P2pSuggestionClick");
                    return ffcu.a;
                }
            };
            optional.ifPresent(new Consumer() { // from class: ctkx
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    cfva cfvaVar = ctle.a;
                    ffji.this.invoke(obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else {
            epjpVar2 = epjpVar;
            i2 = i;
        }
        epjn j = j(epjpVar2, fbqpVar, s.size(), p(s), n(s), ((Boolean) ((cfup) ctkq.e.get()).e()).booleanValue() ? ctjg.c(messageCoreData) : ctjg.a(list), r(s), null, i2, null, 640);
        eora eoraVar = (eora) eorb.a.createBuilder();
        eoraVar.copyOnWrite();
        eorb eorbVar = (eorb) eoraVar.instance;
        eorbVar.c = eoqzVar.i;
        eorbVar.b |= 1;
        long k = k(messageCoreData);
        eoraVar.copyOnWrite();
        eorb eorbVar2 = (eorb) eoraVar.instance;
        eorbVar2.b |= 64;
        eorbVar2.i = k;
        int ordinal = eoqzVar.ordinal();
        if (ordinal == 3 || ordinal == 4) {
            epjj epjjVar = (epjj) epjk.a.createBuilder();
            epjjVar.copyOnWrite();
            epjk epjkVar = (epjk) epjjVar.instance;
            epjq epjqVar = (epjq) j.build();
            epjqVar.getClass();
            epjkVar.c = epjqVar;
            epjkVar.b |= 1;
            epjjVar.copyOnWrite();
            epjk epjkVar2 = (epjk) epjjVar.instance;
            epjkVar2.b |= 2;
            epjkVar2.d = z;
            epjl epjlVar = (epjl) epjm.a.createBuilder();
            epjlVar.getClass();
            epjlVar.copyOnWrite();
            epjm epjmVar = (epjm) epjlVar.instance;
            epjmVar.b |= 1;
            epjmVar.c = f;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                epjlVar.copyOnWrite();
                epjm epjmVar2 = (epjm) epjlVar.instance;
                epjmVar2.b |= 2;
                epjmVar2.d = booleanValue;
            }
            if (bool2 != null) {
                boolean booleanValue2 = bool2.booleanValue();
                epjlVar.copyOnWrite();
                epjm epjmVar3 = (epjm) epjlVar.instance;
                epjmVar3.b |= 4;
                epjmVar3.e = booleanValue2;
            }
            epjjVar.copyOnWrite();
            epjk epjkVar3 = (epjk) epjjVar.instance;
            epjm epjmVar4 = (epjm) epjlVar.build();
            epjmVar4.getClass();
            epjkVar3.e = epjmVar4;
            epjkVar3.b |= 4;
            eoraVar.copyOnWrite();
            eorb eorbVar3 = (eorb) eoraVar.instance;
            epjk epjkVar4 = (epjk) epjjVar.build();
            epjkVar4.getClass();
            eorbVar3.f = epjkVar4;
            eorbVar3.b |= 8;
        } else if (ordinal == 7) {
            epjh epjhVar = (epjh) epji.a.createBuilder();
            epjhVar.copyOnWrite();
            epji epjiVar = (epji) epjhVar.instance;
            epjq epjqVar2 = (epjq) j.build();
            epjqVar2.getClass();
            epjiVar.c = epjqVar2;
            epjiVar.b |= 1;
            eoraVar.copyOnWrite();
            eorb eorbVar4 = (eorb) eoraVar.instance;
            epji epjiVar2 = (epji) epjhVar.build();
            epjiVar2.getClass();
            eorbVar4.h = epjiVar2;
            eorbVar4.b |= 32;
        }
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_P2P_SUGGESTION;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eorb eorbVar5 = (eorb) eoraVar.build();
        eorbVar5.getClass();
        eolvVar2.w = eorbVar5;
        eolvVar2.b |= 32768;
        ((akxl) this.c.b()).j(eoluVar);
    }

    @Override // defpackage.ctkr
    public final void e(final epjp epjpVar, eooi eooiVar, List list, List list2, final MessageCoreData messageCoreData) {
        epjpVar.getClass();
        eooiVar.getClass();
        list.getClass();
        list2.getClass();
        messageCoreData.getClass();
        if (((Boolean) ((cfup) ctkq.a.get()).e()).booleanValue()) {
            return;
        }
        ekzz f = eleg.f("SmartsClearcutLogger.logP2pSuggestionReceivedMessage");
        try {
            final List s = s(list, false);
            Optional optional = (Optional) this.d.b();
            final ffji ffjiVar = new ffji() { // from class: ctla
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    cfyp cfypVar = (cfyp) obj;
                    cfva cfvaVar = ctle.a;
                    cfypVar.getClass();
                    epjp epjpVar2 = epjp.this;
                    MessageCoreData messageCoreData2 = messageCoreData;
                    List list3 = s;
                    csvs.c(cfypVar.b(epjpVar2, eooi.INCOMING, list3.size(), list3, messageCoreData2.B()), "Bugle", "Failed to log P2pSuggestionReceivedMessage");
                    return ffcu.a;
                }
            };
            optional.ifPresent(new Consumer() { // from class: ctlb
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    cfva cfvaVar = ctle.a;
                    ffji.this.invoke(obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            epjn j = j(epjpVar, o(eooiVar), s.size(), p(s), n(s), ((Boolean) ((cfup) ctkq.e.get()).e()).booleanValue() ? ctjg.c(messageCoreData) : ctjg.a(list), r(s), l(list2, messageCoreData.o()), 0, null, 768);
            if (((Boolean) ((cfup) ctjd.ae.get()).e()).booleanValue()) {
                long b = ((akvz) this.b.b()).b(messageCoreData.z());
                j.copyOnWrite();
                epjq epjqVar = (epjq) j.instance;
                epjq epjqVar2 = epjq.a;
                epjqVar.b |= 128;
                epjqVar.m = b;
            }
            epjr epjrVar = (epjr) epjs.a.createBuilder();
            epjrVar.copyOnWrite();
            epjs epjsVar = (epjs) epjrVar.instance;
            epjq epjqVar3 = (epjq) j.build();
            epjqVar3.getClass();
            epjsVar.c = epjqVar3;
            epjsVar.b |= 1;
            eyfy build = epjrVar.build();
            build.getClass();
            eora eoraVar = (eora) eorb.a.createBuilder();
            eoqz eoqzVar = eoqz.P2P_SUGGESTION_RECEIVED_MESSAGE;
            eoraVar.copyOnWrite();
            eorb eorbVar = (eorb) eoraVar.instance;
            eorbVar.c = eoqzVar.i;
            eorbVar.b |= 1;
            eoraVar.copyOnWrite();
            eorb eorbVar2 = (eorb) eoraVar.instance;
            eorbVar2.g = (epjs) build;
            eorbVar2.b |= 16;
            long k = k(messageCoreData);
            eoraVar.copyOnWrite();
            eorb eorbVar3 = (eorb) eoraVar.instance;
            eorbVar3.b |= 64;
            eorbVar3.i = k;
            eyfy build2 = eoraVar.build();
            build2.getClass();
            eolu eoluVar = (eolu) eolv.a.createBuilder();
            eolt eoltVar = eolt.BUGLE_P2P_SUGGESTION;
            eoluVar.copyOnWrite();
            eolv eolvVar = (eolv) eoluVar.instance;
            eolvVar.j = eoltVar.dk;
            eolvVar.b |= 1;
            eoluVar.copyOnWrite();
            eolv eolvVar2 = (eolv) eoluVar.instance;
            eolvVar2.w = (eorb) build2;
            eolvVar2.b |= 32768;
            ((akxl) this.c.b()).j(eoluVar);
            ffig.a(f, null);
        } finally {
        }
    }

    @Override // defpackage.ctkr
    public final void f(epjp epjpVar, List list, MessageCoreData messageCoreData) {
        epjpVar.getClass();
        list.getClass();
        int i = engw.d;
        engw engwVar = enou.a;
        engwVar.getClass();
        engwVar.getClass();
        c(epjpVar, 1, 0, list, engwVar, engwVar, fbqx.UNKNOWN_REJECTION_REASON, messageCoreData);
    }

    @Override // defpackage.ctkr
    public final void g(final epjp epjpVar, final eooi eooiVar, List list, List list2, Optional optional, final MessageCoreData messageCoreData) {
        epjpVar.getClass();
        eooiVar.getClass();
        list.getClass();
        list2.getClass();
        messageCoreData.getClass();
        if (((Boolean) ((cfup) ctkq.a.get()).e()).booleanValue()) {
            return;
        }
        final List s = s(list, false);
        Optional optional2 = (Optional) this.d.b();
        final ffji ffjiVar = new ffji() { // from class: ctlc
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                cfyp cfypVar = (cfyp) obj;
                cfva cfvaVar = ctle.a;
                cfypVar.getClass();
                epjp epjpVar2 = epjp.this;
                eooi eooiVar2 = eooiVar;
                MessageCoreData messageCoreData2 = messageCoreData;
                List list3 = s;
                csvs.c(cfypVar.d(epjpVar2, eooiVar2, list3.size(), list3, messageCoreData2.B()), "Bugle", "Failed to log P2pSuggestionSentMessage");
                return ffcu.a;
            }
        };
        optional2.ifPresent(new Consumer() { // from class: ctld
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                cfva cfvaVar = ctle.a;
                ffji.this.invoke(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        epjn j = j(epjpVar, o(eooiVar), s.size(), p(s), n(s), ((Boolean) ((cfup) ctkq.e.get()).e()).booleanValue() ? ctjg.c(messageCoreData) : ctjg.a(list), r(s), l(list2, messageCoreData.r()), 0, null, 768);
        if (((Boolean) ((cfup) ctjd.ae.get()).e()).booleanValue()) {
            long b = ((akvz) this.b.b()).b(messageCoreData.z());
            j.copyOnWrite();
            epjq epjqVar = (epjq) j.instance;
            epjq epjqVar2 = epjq.a;
            epjqVar.b |= 128;
            epjqVar.m = b;
        }
        final epjv epjvVar = (epjv) epjw.a.createBuilder();
        epjvVar.copyOnWrite();
        epjw epjwVar = (epjw) epjvVar.instance;
        epjq epjqVar3 = (epjq) j.build();
        epjqVar3.getClass();
        epjwVar.c = epjqVar3;
        epjwVar.b |= 1;
        final ffji ffjiVar2 = new ffji() { // from class: ctkt
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                epje epjeVar = (epje) obj;
                cfva cfvaVar = ctle.a;
                epjeVar.getClass();
                epjv epjvVar2 = epjv.this;
                epjvVar2.copyOnWrite();
                epjw epjwVar2 = (epjw) epjvVar2.instance;
                epjw epjwVar3 = epjw.a;
                epjwVar2.d = epjeVar;
                epjwVar2.b |= 2;
                return ffcu.a;
            }
        };
        optional.ifPresent(new Consumer() { // from class: ctku
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                cfva cfvaVar = ctle.a;
                ffji.this.invoke(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        eora eoraVar = (eora) eorb.a.createBuilder();
        eoqz eoqzVar = eoqz.P2P_SUGGESTION_SENT_MESSAGE;
        eoraVar.copyOnWrite();
        eorb eorbVar = (eorb) eoraVar.instance;
        eorbVar.c = eoqzVar.i;
        eorbVar.b |= 1;
        eoraVar.copyOnWrite();
        eorb eorbVar2 = (eorb) eoraVar.instance;
        epjw epjwVar2 = (epjw) epjvVar.build();
        epjwVar2.getClass();
        eorbVar2.d = epjwVar2;
        eorbVar2.b |= 2;
        long k = k(messageCoreData);
        eoraVar.copyOnWrite();
        eorb eorbVar3 = (eorb) eoraVar.instance;
        eorbVar3.b |= 64;
        eorbVar3.i = k;
        eyfy build = eoraVar.build();
        build.getClass();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_P2P_SUGGESTION;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eolvVar2.w = (eorb) build;
        eolvVar2.b |= 32768;
        ((akxl) this.c.b()).j(eoluVar);
    }

    @Override // defpackage.ctkr
    public final void h(fbwv fbwvVar) {
        fbwvVar.getClass();
        if (((Boolean) ((cfup) ctkq.b.get()).e()).booleanValue()) {
            return;
        }
        epjn epjnVar = (epjn) epjq.a.createBuilder();
        epjnVar.a(m(ffdx.b(fbwvVar)));
        eyfy build = epjnVar.build();
        build.getClass();
        eopy eopyVar = (eopy) eopz.a.createBuilder();
        eopyVar.copyOnWrite();
        eopz eopzVar = (eopz) eopyVar.instance;
        eopzVar.d = (epjq) build;
        eopzVar.b |= 2;
        eyfy build2 = eopyVar.build();
        build2.getClass();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_MESSAGE_CLASSIFICATION;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eolvVar2.bd = (eopz) build2;
        eolvVar2.e |= 536870912;
        ((akxl) this.c.b()).j(eoluVar);
    }

    @Override // defpackage.ctkr
    public final void i(epjp epjpVar, eooi eooiVar, List list, List list2, MessageCoreData messageCoreData) {
        epjpVar.getClass();
        eooiVar.getClass();
        list.getClass();
        list2.getClass();
        messageCoreData.getClass();
        g(epjpVar, eooiVar, list, list2, Optional.empty(), messageCoreData);
    }
}
