package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awqj {
    public final ffbr a;
    public final chep b;
    public final ffbr c;
    public final errl d;
    public final ffbr e;
    public final aswe f;
    public final chww g;
    private final bzgd h;

    public awqj(bzgd bzgdVar, ffbr ffbrVar, chep chepVar, ffbr ffbrVar2, chww chwwVar, errl errlVar, ffbr ffbrVar3, aswe asweVar) {
        this.h = bzgdVar;
        this.a = ffbrVar;
        this.b = chepVar;
        this.c = ffbrVar2;
        this.g = chwwVar;
        this.d = errlVar;
        this.e = ffbrVar3;
        this.f = asweVar;
    }

    public static esda b(ConversationIdType conversationIdType, String str, boolean z) {
        escz esczVar = (escz) esda.a.createBuilder();
        String a = conversationIdType.a();
        esczVar.copyOnWrite();
        esda esdaVar = (esda) esczVar.instance;
        a.getClass();
        esdaVar.c = a;
        esam esamVar = (esam) esao.a.createBuilder();
        esamVar.copyOnWrite();
        ((esao) esamVar.instance).b = esan.a(3);
        esamVar.copyOnWrite();
        esao esaoVar = (esao) esamVar.instance;
        str.getClass();
        esaoVar.c = str;
        esao esaoVar2 = (esao) esamVar.build();
        esczVar.copyOnWrite();
        esda esdaVar2 = (esda) esczVar.instance;
        esaoVar2.getClass();
        esdaVar2.d = esaoVar2;
        esdaVar2.b |= 1;
        esczVar.copyOnWrite();
        ((esda) esczVar.instance).e = z;
        return (esda) esczVar.build();
    }

    public final elfl a(final ConversationIdType conversationIdType, final String str, final boolean z) {
        return this.h.j(new Function() { // from class: awqd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                esda b;
                chwv a;
                bzej bzejVar = (bzej) obj;
                final fcek d = bzejVar.d();
                bzge c = bzejVar.c();
                String e = bzejVar.e();
                final awqj awqjVar = awqj.this;
                boolean a2 = ((ersq) ((asev) awqjVar.f).a.b()).a("bugle.use_conversation_id_v2_for_typing_events");
                final ConversationIdType conversationIdType2 = conversationIdType;
                String str2 = str;
                boolean z2 = z;
                if (a2) {
                    ekzz f = eleg.f("IsComposingDittoSender#getExistingConversation");
                    try {
                        efbd.b();
                        bsob e2 = bsom.e();
                        e2.z("IsComposingDittoSender#getExistingConversation");
                        e2.i(new Function() { // from class: awqh
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                bsol bsolVar = (bsol) obj2;
                                bsolVar.q(ConversationIdType.this);
                                return bsolVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        e2.x(1);
                        e2.f(new Function() { // from class: awqi
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                bskp bskpVar = (bskp) obj2;
                                return new bskq[]{bskpVar.a, bskpVar.aa, bskpVar.y};
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        bskr bskrVar = (bskr) e2.b().o();
                        f.close();
                        if (bskrVar.moveToFirst()) {
                            esoe esoeVar = (esoe) esof.a.createBuilder();
                            String a3 = bskrVar.h().a();
                            esoeVar.copyOnWrite();
                            esof esofVar = (esof) esoeVar.instance;
                            a3.getClass();
                            esofVar.c = a3;
                            if (bskrVar.u() != null) {
                                esog esogVar = (esog) esoh.a.createBuilder();
                                String b2 = emxe.b(bskrVar.u());
                                esogVar.copyOnWrite();
                                ((esoh) esogVar.instance).b = b2;
                                esoh esohVar = (esoh) esogVar.build();
                                esoeVar.copyOnWrite();
                                esof esofVar2 = (esof) esoeVar.instance;
                                esohVar.getClass();
                                esofVar2.d = esohVar;
                                esofVar2.b |= 1;
                            } else {
                                String t = bskrVar.t();
                                if (t != null) {
                                    esoeVar.copyOnWrite();
                                    ((esof) esoeVar.instance).e = t;
                                }
                            }
                            escz esczVar = (escz) esda.a.createBuilder();
                            esof esofVar3 = (esof) esoeVar.build();
                            esczVar.copyOnWrite();
                            esda esdaVar = (esda) esczVar.instance;
                            esofVar3.getClass();
                            esdaVar.f = esofVar3;
                            esdaVar.b |= 2;
                            String a4 = conversationIdType2.a();
                            esczVar.copyOnWrite();
                            esda esdaVar2 = (esda) esczVar.instance;
                            a4.getClass();
                            esdaVar2.c = a4;
                            esam esamVar = (esam) esao.a.createBuilder();
                            esamVar.copyOnWrite();
                            ((esao) esamVar.instance).b = esan.a(3);
                            esamVar.copyOnWrite();
                            esao esaoVar = (esao) esamVar.instance;
                            str2.getClass();
                            esaoVar.c = str2;
                            esao esaoVar2 = (esao) esamVar.build();
                            esczVar.copyOnWrite();
                            esda esdaVar3 = (esda) esczVar.instance;
                            esaoVar2.getClass();
                            esdaVar3.d = esaoVar2;
                            esdaVar3.b |= 1;
                            esczVar.copyOnWrite();
                            ((esda) esczVar.instance).e = z2;
                            b = (esda) esczVar.build();
                        } else {
                            b = awqj.b(conversationIdType2, str2, z2);
                        }
                    } finally {
                    }
                } else {
                    b = awqj.b(conversationIdType2, str2, z2);
                }
                esdd esddVar = (esdd) esde.a.createBuilder();
                esddVar.copyOnWrite();
                esde esdeVar = (esde) esddVar.instance;
                b.getClass();
                eygr eygrVar = esdeVar.b;
                if (!eygrVar.c()) {
                    esdeVar.b = eyfy.mutableCopy(eygrVar);
                }
                esdeVar.b.add(b);
                esde esdeVar2 = (esde) esddVar.build();
                if (((cgcu) awqjVar.e.b()).a()) {
                    chwu a5 = awqjVar.g.a(c, esaa.GET_UPDATES);
                    a5.c = e;
                    erxg erxgVar = (erxg) erxi.a.createBuilder();
                    erxgVar.copyOnWrite();
                    erxi erxiVar = (erxi) erxgVar.instance;
                    esdeVar2.getClass();
                    erxiVar.c = esdeVar2;
                    erxiVar.b = 4;
                    a5.b(erxgVar.build());
                    a5.l = true;
                    a5.i = fbzr.EPHEMERAL;
                    a = a5.a();
                } else {
                    chwu c2 = awqjVar.g.c(d, ((cgcu) awqjVar.e.b()).a() ? c.c : Optional.empty(), esaa.GET_UPDATES);
                    c2.c = e;
                    erxg erxgVar2 = (erxg) erxi.a.createBuilder();
                    erxgVar2.copyOnWrite();
                    erxi erxiVar2 = (erxi) erxgVar2.instance;
                    esdeVar2.getClass();
                    erxiVar2.c = esdeVar2;
                    erxiVar2.b = 4;
                    c2.b(erxgVar2.build());
                    c2.l = true;
                    c2.i = fbzr.EPHEMERAL;
                    a = c2.a();
                }
                chwv chwvVar = a;
                ((bzea) awqjVar.a.b()).f(e, ((cgcu) awqjVar.e.b()).a() ? c.b : d.c, esaa.GET_UPDATES.a(), 4, chwvVar.c);
                return (((cgcu) awqjVar.e.b()).a() ? (cheq) awqjVar.c.b() : awqjVar.b).a(chwvVar).h(new emwl() { // from class: awqf
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        fbzx fbzxVar = (fbzx) obj2;
                        if (fbzxVar == null) {
                            return null;
                        }
                        chwv.s(awqj.this.b, fbzxVar, d);
                        return null;
                    }
                }, awqjVar.d).e(fedn.class, new emwl() { // from class: awqg
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        chwv.r((fedn) obj2);
                        return null;
                    }
                }, erpp.a);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).h(new emwl() { // from class: awqe
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return null;
            }
        }, erpp.a);
    }
}
