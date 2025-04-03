package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.concurrent.Callable;
import java.util.function.Predicate;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cagv extends ceut {
    public static final cskc a = cskc.g("BugleEtouffee", "DowngradeOnUnencryptedMessageHandler");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    private final errl k;

    public cagv(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, errl errlVar, ffbr ffbrVar8, ffbr ffbrVar9) {
        this.c = ffbrVar;
        this.e = ffbrVar2;
        this.b = ffbrVar3;
        this.d = ffbrVar4;
        this.f = ffbrVar5;
        this.g = ffbrVar6;
        this.i = ffbrVar7;
        this.k = errlVar;
        this.h = ffbrVar8;
        this.j = ffbrVar9;
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("DowngradeOnUnencryptedMessageHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cagy.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(final ceuw ceuwVar, eyhs eyhsVar) {
        final cagy cagyVar = (cagy) eyhsVar;
        cfva cfvaVar = aoqm.a;
        ((Boolean) new aopq().get()).booleanValue();
        return elfo.g(new Callable() { // from class: cagu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cagv cagvVar = cagv.this;
                ecri a2 = ((alrv) cagvVar.b.b()).a();
                cagy cagyVar2 = cagyVar;
                ConversationIdType b = bdgq.b(cagyVar2.c);
                bcyk a3 = ((bdeo) cagvVar.i.b()).a(b);
                if (a3 == null) {
                    csjb a4 = cagv.a.a();
                    a4.I("Early return for null conversation.");
                    a4.c(b);
                    a4.h(bdhg.a(cagyVar2.e));
                    a4.r();
                    return ceyt.i();
                }
                if (!a3.K()) {
                    csjb a5 = cagv.a.a();
                    a5.I("Early return for consistent encryption status.");
                    a5.c(b);
                    a5.h(bdhg.a(cagyVar2.e));
                    a5.r();
                    return ceyt.i();
                }
                MessageCoreData n = ((bdmq) cagvVar.e.b()).n(b);
                if (n != null && n.cB() && n.r() > cagyVar2.d && n.cI()) {
                    csjb c = cagv.a.c();
                    c.I("Will not downgrade because a new encrypted message has been received");
                    c.c(b);
                    c.h(bdhg.a(cagyVar2.e));
                    c.r();
                    return ceyt.i();
                }
                engw b2 = ((bdfw) cagvVar.d.b()).b(b);
                csjb a6 = cagv.a.a();
                a6.I("Attempting to downgrade a conversation");
                a6.c(b);
                a6.h(bdhg.a(cagyVar2.e));
                a6.y("conversation type", a3.L());
                a6.r();
                if (b2.isEmpty()) {
                    csjb c2 = cagv.a.c();
                    c2.I("Unable to downgrade conversation because recipient list is empty");
                    c2.c(b);
                    c2.h(bdhg.a(cagyVar2.e));
                    c2.r();
                } else if (a3.X()) {
                    csjb c3 = cagv.a.c();
                    c3.I("Downgrading group conversation");
                    c3.c(b);
                    c3.h(bdhg.a(cagyVar2.e));
                    c3.r();
                    ((bzzi) cagvVar.g.b()).g(b, bdhg.a(cagyVar2.e));
                    ((akzt) cagvVar.h.b()).e("Bugle.Etouffee.Conversation.Encryption.Update", caqc.DOWNGRADE_GROUP_ON_RECEIVING_UNENCRYPTED_MESSAGE_FROM_BUGLE.u);
                    bcvy bcvyVar = (bcvy) cagvVar.c.b();
                    awui awuiVar = cagyVar2.h;
                    if (awuiVar == null) {
                        awuiVar = awui.a;
                    }
                    bcvx a7 = bcvyVar.a(awuiVar, b);
                    caqc caqcVar = caqc.DEFAULT;
                    caqcVar.getClass();
                    ((caag) a7).e(0, caqcVar);
                    String str = cagyVar2.e;
                    if (!Pattern.matches((String) awtm.a.e(), str)) {
                        csjb c4 = cagv.a.c();
                        c4.I("Downgrading group, unrecognized rcs message id format");
                        c4.c(b);
                        c4.h(bdhg.a(cagyVar2.e));
                        c4.r();
                        ((akzt) cagvVar.h.b()).e("Bugle.Etouffee.Conversation.Encryption.Update", caqc.DOWNGRADE_GROUP_ON_RECEIVING_UNENCRYPTED_MESSAGE_FROM_NON_BUGLE.u);
                        awui awuiVar2 = cagyVar2.g;
                        if (awuiVar2 == null) {
                            awuiVar2 = awui.a;
                        }
                        a7.c(awuiVar2, true, eozn.RECEIVED_UNENCRYPTED_MESSAGE_IN_ENCRYPTED_CONVERSATION);
                    }
                } else if (((aoku) b2.get(0)).e().isEmpty()) {
                    csjb c5 = cagv.a.c();
                    c5.I("Unable to downgrade conversation because rcs identifier is empty");
                    c5.c(b);
                    c5.h(bdhg.a(cagyVar2.e));
                    c5.r();
                } else {
                    ceuw ceuwVar2 = ceuwVar;
                    csjb c6 = cagv.a.c();
                    c6.I("Valid unencrypted message received to downgrade encrypted conversation");
                    c6.c(b);
                    c6.h(bdhg.a(cagyVar2.e));
                    c6.r();
                    awui awuiVar3 = (awui) ((aoku) b2.get(0)).e().get();
                    if (!ceuwVar2.b()) {
                        bcvy bcvyVar2 = (bcvy) cagvVar.c.b();
                        awui awuiVar4 = cagyVar2.h;
                        if (awuiVar4 == null) {
                            awuiVar4 = awui.a;
                        }
                        bcvx a8 = bcvyVar2.a(awuiVar4, b);
                        if (Collection.EL.stream(((caen) ((caag) a8).d.b()).f.c(awuiVar3.d)).anyMatch(new Predicate() { // from class: caej
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
                            public final boolean test(Object obj) {
                                return ((boqd) obj).j();
                            }
                        })) {
                            a8.c(awuiVar3, false, eozn.RECEIVED_UNENCRYPTED_MESSAGE_IN_ENCRYPTED_CONVERSATION);
                            ((bzzi) cagvVar.g.b()).g(b, bdhg.a(cagyVar2.e));
                            cahf cahfVar = (cahf) cagvVar.f.b();
                            cahd cahdVar = (cahd) cahe.a.createBuilder();
                            String str2 = cagyVar2.c;
                            cahdVar.copyOnWrite();
                            cahe caheVar = (cahe) cahdVar.instance;
                            str2.getClass();
                            caheVar.b = str2;
                            cahe caheVar2 = (cahe) cahdVar.build();
                            cetp cetpVar = new cetp();
                            cetpVar.b = "etouffee-downgrade-conversation".concat(b.toString());
                            ((cevh) cahfVar.a.b()).g(ceyr.h("undelivered_message_fallback", caheVar2, cetpVar.a()));
                        }
                    }
                }
                ((alrv) cagvVar.b.b()).h(a2, alrv.N);
                return ceyt.i();
            }
        }, this.k);
    }
}
