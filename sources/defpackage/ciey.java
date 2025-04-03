package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ciey implements cifg {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/net/handler/ditto/ListMessagesDelegate");
    public final akzt b;
    public final ffbr c;
    private final cgzv d;
    private final bbgi e;
    private final ffbr f;
    private final bcsf g;
    private final bcsq h;
    private final ffbr i;
    private final ffbr j;
    private final Optional k;
    private final errl l;

    public ciey(cgzv cgzvVar, bbgi bbgiVar, ffbr ffbrVar, bcsf bcsfVar, akzt akztVar, bcsq bcsqVar, ffbr ffbrVar2, ffbr ffbrVar3, Optional optional, ffbr ffbrVar4, errl errlVar) {
        this.d = cgzvVar;
        this.e = bbgiVar;
        this.f = ffbrVar;
        this.g = bcsfVar;
        this.b = akztVar;
        this.h = bcsqVar;
        this.i = ffbrVar2;
        this.j = ffbrVar3;
        this.k = optional;
        this.c = ffbrVar4;
        this.l = errlVar;
    }

    @Override // defpackage.cifg
    public final /* synthetic */ elfl a(ciff ciffVar) {
        return cife.a(this, ciffVar);
    }

    @Override // defpackage.cifg
    public final /* bridge */ /* synthetic */ elfl b(final ciff ciffVar, eyhs eyhsVar) {
        final eryu eryuVar = (eryu) eyhsVar;
        return (this.k.isEmpty() ? elfo.e("") : elfl.g(((ejar) this.j.b()).b((eisx) this.k.get())).f(eizq.class, new eroh() { // from class: ciet
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                ensk j = ciey.a.j();
                j.Y(ente.a, "BugleNetwork");
                ((enrr) ((enrr) ((enrr) j).g((eizq) obj)).h("com/google/android/apps/messaging/shared/net/handler/ditto/ListMessagesDelegate", "getAccountScopedEmailAddress", 135, "ListMessagesDelegate.java")).q("Injected account is invalid.");
                return elfo.e("");
            }
        }, this.l)).i(new eroh() { // from class: ciew
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                cibr cibrVar;
                eryu eryuVar2 = eryuVar;
                final String str = (String) obj;
                if ((eryuVar2.b & 1) != 0) {
                    erys erysVar = eryuVar2.f;
                    if (erysVar == null) {
                        erysVar = erys.a;
                    }
                    MessageIdType b = bdhb.b(erysVar.b);
                    erys erysVar2 = eryuVar2.f;
                    if (erysVar2 == null) {
                        erysVar2 = erys.a;
                    }
                    cibrVar = new cibr(b, erysVar2.c);
                } else if (eryuVar2.e.isEmpty()) {
                    cibrVar = new cibr(bdhb.a, Long.MAX_VALUE);
                } else {
                    List i = emye.b((char) 8291).i(eryuVar2.e);
                    cibrVar = i.size() != 2 ? new cibr(bdhb.a, Long.MAX_VALUE) : new cibr(bdhb.b((String) i.get(0)), Long.parseLong((String) i.get(1)));
                }
                final cibr cibrVar2 = cibrVar;
                int i2 = eryuVar2.d;
                final int intValue = i2 <= 0 ? ((Integer) bzaq.d.e()).intValue() : Math.min(i2, ((Integer) bzaq.d.e()).intValue());
                ciff ciffVar2 = ciffVar;
                final ciey cieyVar = ciey.this;
                final ConversationIdType b2 = bdgq.b(eryuVar2.c);
                boolean equals = b2.equals(bdgq.a);
                errl errlVar = ((cibs) ciffVar2).d;
                if (!equals || (2 & eryuVar2.b) == 0) {
                    return elfo.g(eldl.m(new Callable() { // from class: cies
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            ciey cieyVar2 = ciey.this;
                            eryv d = cieyVar2.d(str, b2, cibrVar2, intValue);
                            cieyVar2.b.e("Bugle.Ditto.ListMessages.Response.MessageCount", ((eryw) d.instance).c.size());
                            return (eryw) d.build();
                        }
                    }), errlVar);
                }
                ensk h = ciey.a.h();
                h.Y(ente.a, "BugleNetwork");
                ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/net/handler/ditto/ListMessagesDelegate", "listMessagesAsync", 152, "ListMessagesDelegate.java")).q("conversationId is empty, try to list messages using other ids");
                cgxd cgxdVar = (cgxd) cieyVar.c.b();
                esof esofVar = eryuVar2.g;
                if (esofVar == null) {
                    esofVar = esof.a;
                }
                return cgxdVar.a(esofVar).h(new emwl() { // from class: cier
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        ciey cieyVar2 = ciey.this;
                        eryv d = cieyVar2.d(str, (ConversationIdType) obj2, cibrVar2, intValue);
                        cieyVar2.b.e("Bugle.Ditto.ListMessages.Response.MessageCount", ((eryw) d.instance).c.size());
                        return (eryw) d.build();
                    }
                }, errlVar);
            }
        }, this.l);
    }

    @Override // defpackage.cifg
    public final /* synthetic */ eyhs c(eyee eyeeVar) {
        return (eryu) eyfy.parseFrom(eryu.a, eyeeVar);
    }

    public final eryv d(String str, ConversationIdType conversationIdType, ciex ciexVar, int i) {
        eryv eryvVar = (eryv) eryw.a.createBuilder();
        bjjd bjjdVar = (bjjd) this.h.a(conversationIdType, -1).o();
        try {
            int count = bjjdVar.getCount();
            eryvVar.copyOnWrite();
            ((eryw) eryvVar.instance).e = count;
            bcse a2 = this.g.a();
            bjjdVar.moveToFirst();
            while (true) {
                if (bjjdVar.isAfterLast()) {
                    break;
                }
                a2 = this.g.e(bjjdVar);
                if (((cibr) ciexVar).a.equals(a2.u())) {
                    if (a2.i() <= ((cibr) ciexVar).b) {
                        break;
                    }
                    bjjdVar.moveToNext();
                } else if (a2.i() < ((cibr) ciexVar).b) {
                    while (a2.i() <= ((cibr) ciexVar).b && bjjdVar.moveToPrevious()) {
                        a2 = this.g.e(bjjdVar);
                    }
                } else {
                    bjjdVar.moveToNext();
                }
            }
            int a3 = cidb.a();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 >= i || !bjjdVar.moveToNext()) {
                    break;
                }
                bcse e = this.g.e(bjjdVar);
                Iterator it = e.g.iterator();
                while (it.hasNext()) {
                    ((bdpt) this.i.b()).d((MessagePartCoreData) it.next(), str);
                }
                erzn n = this.d.n(e);
                i3 += n.getSerializedSize();
                if (i3 >= a3) {
                    this.b.c("Bugle.Ditto.ListMessages.TooBigResponse.Counts");
                    bjjdVar.moveToPrevious();
                    break;
                }
                eryvVar.copyOnWrite();
                eryw erywVar = (eryw) eryvVar.instance;
                n.getClass();
                eygr eygrVar = erywVar.c;
                if (!eygrVar.c()) {
                    erywVar.c = eyfy.mutableCopy(eygrVar);
                }
                erywVar.c.add(n);
                arrayList.add(e);
                arrayList2.add(e.u());
                i2++;
                a2 = e;
            }
            if (bjjdVar.moveToNext() && ((eryw) eryvVar.instance).c.size() > 0) {
                eryr eryrVar = (eryr) erys.a.createBuilder();
                String b = a2.u().b();
                eryrVar.copyOnWrite();
                erys erysVar = (erys) eryrVar.instance;
                b.getClass();
                erysVar.b = b;
                long i4 = a2.i();
                eryrVar.copyOnWrite();
                ((erys) eryrVar.instance).c = i4;
                eryvVar.copyOnWrite();
                eryw erywVar2 = (eryw) eryvVar.instance;
                erys erysVar2 = (erys) eryrVar.build();
                erysVar2.getClass();
                erywVar2.f = erysVar2;
                erywVar2.b |= 1;
                String str2 = String.valueOf(a2.u()) + "\u2063" + a2.i();
                eryvVar.copyOnWrite();
                ((eryw) eryvVar.instance).d = str2;
            }
            if (((Boolean) bzpf.a.e()).booleanValue()) {
                bzpi bzpiVar = (bzpi) this.f.b();
                bzpg bzpgVar = (bzpg) bzph.a.createBuilder();
                Iterable iterable = (Iterable) Collection.EL.stream(arrayList2).map(new Function() { // from class: cieu
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((MessageIdType) obj).b();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toCollection(new Supplier() { // from class: ciev
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new ArrayList();
                    }
                }));
                bzpgVar.copyOnWrite();
                bzph bzphVar = (bzph) bzpgVar.instance;
                bzphVar.a();
                eydl.addAll(iterable, bzphVar.b);
                bzpiVar.a((bzph) bzpgVar.build());
            } else {
                this.e.e(arrayList, false).s();
            }
            bjjdVar.close();
            return eryvVar;
        } catch (Throwable th) {
            try {
                bjjdVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
