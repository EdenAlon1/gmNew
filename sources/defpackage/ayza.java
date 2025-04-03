package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayza {
    public static final cfup a = cfvl.q(185945909);
    public final ayvn b;
    public final ayyn c;
    public final errl d;
    public final ffbr e;

    public ayza(ayvn ayvnVar, ayyn ayynVar, errl errlVar, ffbr ffbrVar) {
        this.b = ayvnVar;
        this.c = ayynVar;
        this.d = errlVar;
        this.e = ffbrVar;
    }

    public static elfl a(final ayym ayymVar, final ConversationIdType conversationIdType) {
        return conversationIdType.b() ? elfo.e(ayyl.c()) : elfo.g(new Callable() { // from class: ayyj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ayym.this.a(conversationIdType);
            }
        }, ayymVar.c);
    }

    public final elfl b(final ConversationIdType conversationIdType, final Runnable runnable, final epvo epvoVar) {
        final ayym a2 = this.c.a(this.b.a());
        final elfl a3 = a(a2, conversationIdType);
        final elfl i = a3.i(new eroh() { // from class: ayyr
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                cfup cfupVar = ayza.a;
                try {
                    runnable.run();
                    return elfo.e(null);
                } catch (RuntimeException e) {
                    return elfo.d(e);
                }
            }
        }, this.d).i(new eroh() { // from class: ayys
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ayza.a(ayym.this, conversationIdType);
            }
        }, this.d);
        return elfo.m(a3, i).a(new Callable() { // from class: ayyt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ayyl ayylVar = (ayyl) erqt.q(a3);
                ayyl ayylVar2 = (ayyl) erqt.q(i);
                ayyl c = ayyl.c();
                int i2 = engw.d;
                ayza.this.c(ayylVar, ayylVar2, c, enou.a, epvoVar);
                return null;
            }
        }, this.d);
    }

    public final void c(ayyl ayylVar, ayyl ayylVar2, ayyl ayylVar3, engw engwVar, epvo epvoVar) {
        epvk epvkVar = (epvk) epvp.a.createBuilder();
        epvj a2 = ayylVar.a();
        epvkVar.copyOnWrite();
        epvp epvpVar = (epvp) epvkVar.instance;
        epvpVar.f = a2;
        epvpVar.b |= 16;
        epvj a3 = ayylVar2.a();
        epvkVar.copyOnWrite();
        epvp epvpVar2 = (epvp) epvkVar.instance;
        epvpVar2.h = a3;
        epvpVar2.b |= 64;
        Stream map = Collection.EL.stream(engwVar).map(new Function() { // from class: ayyy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ayym.c((ayvk) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        Iterable iterable = (Iterable) map.collect(endq.a);
        epvkVar.copyOnWrite();
        epvp epvpVar3 = (epvp) epvkVar.instance;
        eygr eygrVar = epvpVar3.i;
        if (!eygrVar.c()) {
            epvpVar3.i = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(iterable, epvpVar3.i);
        epvkVar.copyOnWrite();
        epvp epvpVar4 = (epvp) epvkVar.instance;
        epvpVar4.d = 1;
        epvpVar4.b |= 2;
        int i2 = 1 != (ayylVar2.a().b & 1) ? 3 : 2;
        epvkVar.copyOnWrite();
        epvp epvpVar5 = (epvp) epvkVar.instance;
        epvpVar5.e = i2 - 1;
        epvpVar5.b |= 8;
        epvkVar.copyOnWrite();
        epvp epvpVar6 = (epvp) epvkVar.instance;
        epvpVar6.c = epvoVar.n;
        epvpVar6.b |= 1;
        if ((ayylVar3.a().b & 1) != 0) {
            epvj a4 = ayylVar3.a();
            epvkVar.copyOnWrite();
            epvp epvpVar7 = (epvp) epvkVar.instance;
            epvpVar7.g = a4;
            epvpVar7.b |= 32;
        }
        final epwb epwbVar = (epwb) epwc.a.createBuilder();
        epvy b = ayylVar.b();
        epwbVar.copyOnWrite();
        epwc epwcVar = (epwc) epwbVar.instance;
        epwcVar.d = b;
        epwcVar.b |= 2;
        epvy b2 = ayylVar2.b();
        epwbVar.copyOnWrite();
        epwc epwcVar2 = (epwc) epwbVar.instance;
        epwcVar2.e = b2;
        epwcVar2.b |= 4;
        Iterable iterable2 = (Iterable) Collection.EL.stream(engwVar).map(new Function() { // from class: ayyz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ayym.e((ayvk) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(endq.a);
        epwbVar.copyOnWrite();
        epwc epwcVar3 = (epwc) epwbVar.instance;
        eygr eygrVar2 = epwcVar3.f;
        if (!eygrVar2.c()) {
            epwcVar3.f = eyfy.mutableCopy(eygrVar2);
        }
        eydl.addAll(iterable2, epwcVar3.f);
        Collection.EL.stream(ayylVar.a().g).map(new Function() { // from class: ayyp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cfup cfupVar = ayza.a;
                epvd epvdVar = ((epvw) obj).d;
                if (epvdVar == null) {
                    epvdVar = epvd.a;
                }
                return epvdVar.e;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).findFirst().ifPresent(new Consumer() { // from class: ayyq
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                epwb epwbVar2 = epwb.this;
                String str = (String) obj;
                epwbVar2.copyOnWrite();
                epwc epwcVar4 = (epwc) epwbVar2.instance;
                epwc epwcVar5 = epwc.a;
                str.getClass();
                epwcVar4.b |= 1;
                epwcVar4.c = str;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        akxl akxlVar = (akxl) this.e.b();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_CONVERSATION_MATCHING;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eola eolaVar = (eola) eolb.a.createBuilder();
        eolaVar.copyOnWrite();
        eolb eolbVar = (eolb) eolaVar.instance;
        epvp epvpVar8 = (epvp) epvkVar.build();
        epvpVar8.getClass();
        eolbVar.c = epvpVar8;
        eolbVar.b = 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eolb eolbVar2 = (eolb) eolaVar.build();
        eolbVar2.getClass();
        eolvVar2.aT = eolbVar2;
        eolvVar2.e |= 131072;
        akxlVar.j(eoluVar);
        akxl akxlVar2 = (akxl) this.e.b();
        eolu eoluVar2 = (eolu) eolv.a.createBuilder();
        eolt eoltVar2 = eolt.BUGLE_CONVERSATION_MATCHING;
        eoluVar2.copyOnWrite();
        eolv eolvVar3 = (eolv) eoluVar2.instance;
        eolvVar3.j = eoltVar2.dk;
        eolvVar3.b |= 1;
        eola eolaVar2 = (eola) eolb.a.createBuilder();
        eolaVar2.copyOnWrite();
        eolb eolbVar3 = (eolb) eolaVar2.instance;
        epwc epwcVar4 = (epwc) epwbVar.build();
        epwcVar4.getClass();
        eolbVar3.c = epwcVar4;
        eolbVar3.b = 2;
        eoluVar2.copyOnWrite();
        eolv eolvVar4 = (eolv) eoluVar2.instance;
        eolb eolbVar4 = (eolb) eolaVar2.build();
        eolbVar4.getClass();
        eolvVar4.aT = eolbVar4;
        eolvVar4.e |= 131072;
        akxlVar2.n(eoluVar2);
    }
}
