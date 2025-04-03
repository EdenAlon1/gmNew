package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.concurrent.ThreadLocalRandom;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayzn {
    public static final /* synthetic */ int b = 0;
    private final ffbr d;
    static final cfup a = cfvl.c(cfvl.b, "shadow_launch_2_conversation_match_logging_sampling_percent", 1.0d);
    private static final cskc c = cskc.g("BugleDataModel", "ShadowLaunch2Logger");

    public ayzn(ffbr ffbrVar) {
        this.d = ffbrVar;
    }

    public final elfl a(ConversationIdType conversationIdType, boolean z, Optional optional, engw engwVar, final epvo epvoVar) {
        final ConversationIdType conversationIdType2 = (z || conversationIdType.b()) ? bdgq.a : conversationIdType;
        if (!z) {
            conversationIdType = bdgq.a;
        }
        if (((ConversationIdType) optional.map(new Function() { // from class: ayzl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i = ayzn.b;
                return ((bseh) obj).C();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(bdgq.a)).equals(conversationIdType2)) {
            csjb c2 = c.c();
            c2.I("Telephony and BCM conversations matched.");
            c2.A("trigger", epvoVar);
            c2.B("telephonyConversationIdIsNew", z);
            c2.y("messageRecipients.size()", engwVar.size());
            c2.r();
            final ayza ayzaVar = (ayza) this.d.b();
            final cfup cfupVar = a;
            return elfo.f(new Runnable() { // from class: ayyu
                @Override // java.lang.Runnable
                public final void run() {
                    int i;
                    if (((Boolean) ayza.a.e()).booleanValue()) {
                        if (cful.a(ThreadLocalRandom.current(), cfupVar)) {
                            ConversationIdType conversationIdType3 = conversationIdType2;
                            ayza ayzaVar2 = ayza.this;
                            if (!conversationIdType3.b()) {
                                ayyn ayynVar = ayzaVar2.c;
                                ayvn ayvnVar = (ayvn) ayynVar.a.b();
                                ayvnVar.getClass();
                                errl errlVar = (errl) ayynVar.h.b();
                                errlVar.getClass();
                                bcyk a2 = ((bdeo) new ayym(errlVar, ayynVar.b, ayynVar.c, ayynVar.d, ayynVar.e, ayynVar.f, ayynVar.g, ayvnVar.a()).d.b()).a(conversationIdType3);
                                if (a2 != null) {
                                    i = ayym.f(a2);
                                    epvo epvoVar2 = epvoVar;
                                    epvq epvqVar = (epvq) epvr.a.createBuilder();
                                    epvqVar.copyOnWrite();
                                    epvr epvrVar = (epvr) epvqVar.instance;
                                    epvrVar.c = epvoVar2.n;
                                    epvrVar.b |= 1;
                                    epvqVar.copyOnWrite();
                                    epvr epvrVar2 = (epvr) epvqVar.instance;
                                    epvrVar2.d = 1;
                                    epvrVar2.b |= 2;
                                    epvqVar.copyOnWrite();
                                    epvr epvrVar3 = (epvr) epvqVar.instance;
                                    epvrVar3.e = i - 1;
                                    epvrVar3.b |= 4;
                                    epvr epvrVar4 = (epvr) epvqVar.build();
                                    akxl akxlVar = (akxl) ayzaVar2.e.b();
                                    eolu eoluVar = (eolu) eolv.a.createBuilder();
                                    eolt eoltVar = eolt.BUGLE_CONVERSATION_MATCHING;
                                    eoluVar.copyOnWrite();
                                    eolv eolvVar = (eolv) eoluVar.instance;
                                    eolvVar.j = eoltVar.dk;
                                    eolvVar.b = 1 | eolvVar.b;
                                    eola eolaVar = (eola) eolb.a.createBuilder();
                                    eolaVar.copyOnWrite();
                                    eolb eolbVar = (eolb) eolaVar.instance;
                                    epvrVar4.getClass();
                                    eolbVar.c = epvrVar4;
                                    eolbVar.b = 3;
                                    eoluVar.copyOnWrite();
                                    eolv eolvVar2 = (eolv) eoluVar.instance;
                                    eolb eolbVar2 = (eolb) eolaVar.build();
                                    eolbVar2.getClass();
                                    eolvVar2.aT = eolbVar2;
                                    eolvVar2.e |= 131072;
                                    akxlVar.j(eoluVar);
                                }
                            }
                            i = 1;
                            epvo epvoVar22 = epvoVar;
                            epvq epvqVar2 = (epvq) epvr.a.createBuilder();
                            epvqVar2.copyOnWrite();
                            epvr epvrVar5 = (epvr) epvqVar2.instance;
                            epvrVar5.c = epvoVar22.n;
                            epvrVar5.b |= 1;
                            epvqVar2.copyOnWrite();
                            epvr epvrVar22 = (epvr) epvqVar2.instance;
                            epvrVar22.d = 1;
                            epvrVar22.b |= 2;
                            epvqVar2.copyOnWrite();
                            epvr epvrVar32 = (epvr) epvqVar2.instance;
                            epvrVar32.e = i - 1;
                            epvrVar32.b |= 4;
                            epvr epvrVar42 = (epvr) epvqVar2.build();
                            akxl akxlVar2 = (akxl) ayzaVar2.e.b();
                            eolu eoluVar2 = (eolu) eolv.a.createBuilder();
                            eolt eoltVar2 = eolt.BUGLE_CONVERSATION_MATCHING;
                            eoluVar2.copyOnWrite();
                            eolv eolvVar3 = (eolv) eoluVar2.instance;
                            eolvVar3.j = eoltVar2.dk;
                            eolvVar3.b = 1 | eolvVar3.b;
                            eola eolaVar2 = (eola) eolb.a.createBuilder();
                            eolaVar2.copyOnWrite();
                            eolb eolbVar3 = (eolb) eolaVar2.instance;
                            epvrVar42.getClass();
                            eolbVar3.c = epvrVar42;
                            eolbVar3.b = 3;
                            eoluVar2.copyOnWrite();
                            eolv eolvVar22 = (eolv) eoluVar2.instance;
                            eolb eolbVar22 = (eolb) eolaVar2.build();
                            eolbVar22.getClass();
                            eolvVar22.aT = eolbVar22;
                            eolvVar22.e |= 131072;
                            akxlVar2.j(eoluVar2);
                        }
                    }
                }
            }, ayzaVar.d);
        }
        ConversationIdType C = optional.isPresent() ? ((bseh) optional.get()).C() : bdgq.a;
        csjb c3 = c.c();
        c3.I("Telephony and BCM conversations mismatched.");
        c3.B("telephonyConversationIdIsNew", z);
        c3.A("telephonyConversationId", conversationIdType2.toString());
        c3.A("bcmMatchedConversation", C);
        c3.A("trigger", epvoVar);
        c3.r();
        final ayza ayzaVar2 = (ayza) this.d.b();
        if (!conversationIdType2.b() && conversationIdType2.equals(conversationIdType)) {
            conversationIdType = bdgq.a;
        }
        emxf.a(!conversationIdType2.equals(C));
        final ayvm a2 = ayzaVar2.b.a();
        ayym a3 = ayzaVar2.c.a(a2);
        final elfl a4 = ayza.a(a3, conversationIdType2);
        final elfl a5 = ayza.a(a3, C);
        final elfl a6 = ayza.a(a3, conversationIdType);
        Stream map = Collection.EL.stream(engwVar).map(new Function() { // from class: ayyw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ayvm.this.a((String) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        final engw engwVar2 = (engw) map.collect(endq.a);
        return elfo.m(a4, a5, a6).a(new Callable() { // from class: ayyx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ayza.this.c((ayyl) erqt.q(a4), (ayyl) erqt.q(a5), (ayyl) erqt.q(a6), engwVar2, epvoVar);
                return null;
            }
        }, ayzaVar2.d);
    }
}
