package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cidp implements cifg {
    public static final cskc a = cskc.g("BugleNetwork", "GetConversationDelegate");
    public final chqc b;
    public final ffbr c;
    public final ffbr d;
    public final errl e;
    public final ffbr f;
    private final errl g;
    private final ffbr h;

    public cidp(errl errlVar, errl errlVar2, chqc chqcVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.g = errlVar;
        this.b = chqcVar;
        this.c = ffbrVar;
        this.d = ffbrVar3;
        this.e = errlVar2;
        this.f = ffbrVar2;
        this.h = ffbrVar4;
    }

    @Override // defpackage.cifg
    public final /* synthetic */ elfl a(ciff ciffVar) {
        return cife.a(this, ciffVar);
    }

    @Override // defpackage.cifg
    public final /* bridge */ /* synthetic */ elfl b(ciff ciffVar, eyhs eyhsVar) {
        erwj erwjVar = (erwj) eyhsVar;
        ConversationIdType b = bdgq.b(erwjVar.c);
        if (!b.b() || (erwjVar.b & 1) == 0) {
            return d(b);
        }
        ((enrr) a.i().h("com/google/android/apps/messaging/shared/net/handler/ditto/GetConversationDelegate", "handleRequestInternal", 79, "GetConversationDelegate.java")).q("conversationId is empty, trying to get the conversation using other ids instead");
        cgxd cgxdVar = (cgxd) this.h.b();
        esof esofVar = erwjVar.d;
        if (esofVar == null) {
            esofVar = esof.a;
        }
        return cgxdVar.a(esofVar).i(new eroh() { // from class: cidm
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return cidp.this.d((ConversationIdType) obj);
            }
        }, this.g);
    }

    @Override // defpackage.cifg
    public final /* bridge */ /* synthetic */ eyhs c(eyee eyeeVar) {
        return (erwj) eyfy.parseFrom(erwj.a, eyeeVar, eyfc.a());
    }

    public final elfl d(final ConversationIdType conversationIdType) {
        elfl i;
        if (conversationIdType.b()) {
            a.r("conversationId is null");
            i = elfo.e(erwl.a);
        } else {
            i = elfo.g(new Callable() { // from class: cidj
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return ((azwh) cidp.this.d.b()).a(conversationIdType);
                }
            }, this.g).i(new eroh() { // from class: cidk
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    ConversationIdType conversationIdType2 = conversationIdType;
                    final bcyk bcykVar = (bcyk) obj;
                    if (bcykVar != null) {
                        final cidp cidpVar = cidp.this;
                        return cidpVar.b.b(conversationIdType2).i(new eroh() { // from class: cidn
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                return ((cgzv) cidp.this.c.b()).e(bcykVar, (engw) obj2);
                            }
                        }, cidpVar.e).h(new emwl() { // from class: cido
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                erur erurVar = (erur) obj2;
                                erwk erwkVar = (erwk) erwl.a.createBuilder();
                                erwkVar.copyOnWrite();
                                erwl erwlVar = (erwl) erwkVar.instance;
                                erurVar.getClass();
                                erwlVar.c = erurVar;
                                erwlVar.b |= 1;
                                return (erwl) erwkVar.build();
                            }
                        }, cidpVar.e);
                    }
                    csjb e = cidp.a.e();
                    e.A("conversation is null", conversationIdType2);
                    e.r();
                    return elfo.e(erwl.a);
                }
            }, this.e);
        }
        return i.i(new eroh() { // from class: cidl
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final erwl erwlVar = (erwl) obj;
                if (!((Boolean) ((cfup) bzaq.o.get()).e()).booleanValue()) {
                    return elfo.e(erwlVar);
                }
                chrr chrrVar = (chrr) cidp.this.f.b();
                erur erurVar = erwlVar.c;
                if (erurVar == null) {
                    erurVar = erur.a;
                }
                if (!erurVar.equals(erur.a) && !erurVar.u && erurVar.i) {
                    eruw eruwVar = eruw.RCS;
                    int i2 = erurVar.t;
                    eruw eruwVar2 = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : eruwVar : eruw.XMS : eruw.UNKNOWN_CONVERSATION_TYPE;
                    if (eruwVar2 == null) {
                        eruwVar2 = eruw.UNRECOGNIZED;
                    }
                    if (eruwVar.equals(eruwVar2)) {
                        erur erurVar2 = erwlVar.c;
                        if (erurVar2 == null) {
                            erurVar2 = erur.a;
                        }
                        return chrrVar.d(erurVar2, 1).h(new emwl() { // from class: chrm
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                erur erurVar3 = (erur) obj2;
                                erwk erwkVar = (erwk) erwl.this.toBuilder();
                                erwkVar.copyOnWrite();
                                erwl erwlVar2 = (erwl) erwkVar.instance;
                                erwlVar2.c = null;
                                erwlVar2.b &= -2;
                                erwkVar.copyOnWrite();
                                erwl erwlVar3 = (erwl) erwkVar.instance;
                                erurVar3.getClass();
                                erwlVar3.c = erurVar3;
                                erwlVar3.b |= 1;
                                return (erwl) erwkVar.build();
                            }
                        }, chrrVar.b);
                    }
                }
                return elfo.e(erwlVar);
            }
        }, this.e);
    }
}
