package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tlv implements crty {
    public static final entd a = entd.c("BugleCmsCall");
    static final emyl b = cfvl.x(202740020, "specify_order_by_for_conversations_and_messages");
    static final cfup c;
    static final cfup d;
    static final cfup e;
    public final tmf f;
    public final tns g;
    public final errl h;
    public final ffbr i;
    private final ffbr j;
    private final axkm k;
    private final ffbr l;

    static {
        cfvl.e(cfvl.b, "cms_list_objects_page_size", 100);
        c = cfvl.f(cfvl.b, "cms_grpc_deadline_sec", 60L);
        d = cfvl.e(cfvl.b, "cms_list_conversation_objects_page_size", 1);
        e = cfvl.e(cfvl.b, "cms_list_top_conversation_object_page_size", 15);
    }

    public tlv(ffbr ffbrVar, tmf tmfVar, tns tnsVar, axkm axkmVar, ffbr ffbrVar2, errl errlVar, ffbr ffbrVar3) {
        this.j = ffbrVar;
        this.f = tmfVar;
        this.g = tnsVar;
        this.k = axkmVar;
        this.l = ffbrVar2;
        this.h = errlVar;
        this.i = ffbrVar3;
    }

    public static void Z(String str, String str2) {
        if (!str.isEmpty() && !str2.isEmpty() && str.equals(str2)) {
            throw new crtx(str);
        }
    }

    public static void aa(String str, String str2) {
        ensz enszVar = (ensz) a.h();
        enszVar.Y(cdii.H, str);
        enszVar.Y(cdii.G, str2);
        ((ensz) enszVar.h("com/google/android/apps/messaging/cloudstore/grpc/CloudMessageStoreClientImpl", "logCmsRequest", 1553, "CloudMessageStoreClientImpl.java")).o();
    }

    public static void ab(String str, String str2, int i) {
        ensz enszVar = (ensz) a.h();
        enszVar.Y(cdii.H, str);
        enszVar.Y(cdii.G, str2);
        enszVar.Y(cdii.L, Integer.valueOf(i));
        ((ensz) enszVar.h("com/google/android/apps/messaging/cloudstore/grpc/CloudMessageStoreClientImpl", "logCmsRequest", 1563, "CloudMessageStoreClientImpl.java")).o();
    }

    private final elfl al(final boolean z, Function function) {
        final tmf tmfVar = this.f;
        return tmfVar.a(tmfVar.c()).i(new eroh() { // from class: tmb
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final etas etasVar = (etas) obj;
                if (!csgj.a() || !((Boolean) ((cfup) csgj.u.get()).e()).booleanValue()) {
                    return elfo.e(etasVar);
                }
                if (!z) {
                    tmf tmfVar2 = tmf.this;
                    return tmfVar2.b.q().h(new emwl() { // from class: tmd
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            cskc cskcVar = tmf.a;
                            int i = true != ((Boolean) obj2).booleanValue() ? 4 : 3;
                            etas etasVar2 = etas.this;
                            etasVar2.copyOnWrite();
                            etau etauVar = (etau) etasVar2.instance;
                            etau etauVar2 = etau.a;
                            etauVar.f = etat.a(i);
                            return etasVar2;
                        }
                    }, tmfVar2.c);
                }
                etasVar.copyOnWrite();
                etau etauVar = (etau) etasVar.instance;
                etau etauVar2 = etau.a;
                etauVar.f = etat.a(4);
                return elfo.e(etasVar);
            }
        }, tmfVar.c).i(new tlz(tmfVar), tmfVar.c).h(new tmc(), tmfVar.c).i(new tjo(function), this.h).f(fedn.class, new tjn(this), this.h);
    }

    @Override // defpackage.crty
    public final elfl A(final String str, final boolean z) {
        return i(new Function() { // from class: tje
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                etau etauVar = (etau) obj;
                tlv.aa("listConversationObjects", etauVar.d);
                eszm Y = tlv.this.Y();
                esyj esyjVar = (esyj) esyk.a.createBuilder();
                esyjVar.copyOnWrite();
                esyk esykVar = (esyk) esyjVar.instance;
                etauVar.getClass();
                esykVar.c = etauVar;
                esykVar.b |= 1;
                Integer num = z ? (Integer) tlv.e.e() : (Integer) tlv.d.e();
                String str2 = str;
                int intValue = num.intValue();
                esyjVar.copyOnWrite();
                ((esyk) esyjVar.instance).e = intValue;
                esyjVar.copyOnWrite();
                esyk esykVar2 = (esyk) esyjVar.instance;
                str2.getClass();
                esykVar2.d = str2;
                String str3 = true != ((Boolean) ((cfup) tlv.b.get()).e()).booleanValue() ? "" : "message_content.message_time desc, create_time desc, object_id desc";
                esyjVar.copyOnWrite();
                ((esyk) esyjVar.instance).f = str3;
                esyk esykVar3 = (esyk) esyjVar.build();
                fdxk fdxkVar = Y.a;
                febs febsVar = eszn.m;
                if (febsVar == null) {
                    synchronized (eszn.class) {
                        febsVar = eszn.m;
                        if (febsVar == null) {
                            febp a2 = febs.a();
                            a2.c = febr.UNARY;
                            a2.d = febs.c("google.communications.jibemessagestore.v1.MessageStore", "ListConversationObjects");
                            a2.b();
                            esyk esykVar4 = esyk.a;
                            eyfc eyfcVar = ffag.a;
                            a2.a = new ffae(esykVar4);
                            a2.b = new ffae(esym.a);
                            febsVar = a2.a();
                            eszn.m = febsVar;
                        }
                    }
                }
                return ffat.a(fdxkVar.a(febsVar, Y.b), esykVar3);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).h(new emwl() { // from class: tjf
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                entd entdVar = tlv.a;
                return engw.n(((esym) obj).b);
            }
        }, erpp.a);
    }

    @Override // defpackage.crty
    public final elfl B() {
        return E("", eyja.a);
    }

    public final elfl C(final esyo esyoVar) {
        eszm Y = Y();
        fdxk fdxkVar = Y.a;
        febs febsVar = eszn.i;
        if (febsVar == null) {
            synchronized (eszn.class) {
                febsVar = eszn.i;
                if (febsVar == null) {
                    febp a2 = febs.a();
                    a2.c = febr.UNARY;
                    a2.d = febs.c("google.communications.jibemessagestore.v1.MessageStore", "ListConversations");
                    a2.b();
                    esyo esyoVar2 = esyo.a;
                    eyfc eyfcVar = ffag.a;
                    a2.a = new ffae(esyoVar2);
                    a2.b = new ffae(esyq.a);
                    febsVar = a2.a();
                    eszn.i = febsVar;
                }
            }
        }
        return elfl.g(ffat.a(fdxkVar.a(febsVar, Y.b), esyoVar)).h(new emwl() { // from class: tkv
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                esyq esyqVar = (esyq) obj;
                entd entdVar = tlv.a;
                tlv.Z(esyo.this.e, esyqVar.c);
                return new csdq(engw.n(esyqVar.b), esyqVar.c, esyqVar.d);
            }
        }, erpp.a);
    }

    @Override // defpackage.crty
    public final elfl D(String str) {
        return E(str, eyja.a);
    }

    @Override // defpackage.crty
    public final elfl E(final String str, final eyja eyjaVar) {
        return i(new Function() { // from class: tjb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                etau etauVar = (etau) obj;
                tlv.aa("listConversations", etauVar.d);
                esyn esynVar = (esyn) esyo.a.createBuilder();
                esynVar.copyOnWrite();
                esyo esyoVar = (esyo) esynVar.instance;
                etauVar.getClass();
                esyoVar.c = etauVar;
                esyoVar.b |= 1;
                String str2 = true != ((Boolean) ((cfup) tlv.b.get()).e()).booleanValue() ? "" : "most_recent_message_time desc, conversation_id desc";
                esynVar.copyOnWrite();
                ((esyo) esynVar.instance).f = str2;
                eyja eyjaVar2 = eyjaVar;
                if (!emxb.a(eyjaVar2, eyja.a)) {
                    esynVar.copyOnWrite();
                    esyo esyoVar2 = (esyo) esynVar.instance;
                    eyjaVar2.getClass();
                    esyoVar2.d = eyjaVar2;
                    esyoVar2.b |= 2;
                    esynVar.copyOnWrite();
                    ((esyo) esynVar.instance).g = true;
                }
                String str3 = str;
                if (!TextUtils.isEmpty(str3)) {
                    esynVar.copyOnWrite();
                    esyo esyoVar3 = (esyo) esynVar.instance;
                    str3.getClass();
                    esyoVar3.e = str3;
                }
                return tlv.this.C((esyo) esynVar.build());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.crty
    public final elfl F() {
        return i(new Function() { // from class: tkq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                etau etauVar = (etau) obj;
                tlv.aa("listObjects", etauVar.d);
                esyv esyvVar = (esyv) esyw.a.createBuilder();
                esyvVar.copyOnWrite();
                esyw esywVar = (esyw) esyvVar.instance;
                etauVar.getClass();
                esywVar.c = etauVar;
                esywVar.b |= 1;
                esyvVar.copyOnWrite();
                ((esyw) esyvVar.instance).d = "root";
                esyvVar.a("cipher");
                return tlv.this.L((esyw) esyvVar.build());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.crty
    public final elfl G(final String str) {
        return i(new Function() { // from class: tjk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                etau etauVar = (etau) obj;
                tlv.aa("listObjects", etauVar.d);
                esyv esyvVar = (esyv) esyw.a.createBuilder();
                esyvVar.copyOnWrite();
                esyw esywVar = (esyw) esyvVar.instance;
                etauVar.getClass();
                esywVar.c = etauVar;
                esywVar.b |= 1;
                esyvVar.copyOnWrite();
                ((esyw) esyvVar.instance).d = "root";
                esyvVar.a("cipher");
                esyvVar.copyOnWrite();
                esyw esywVar2 = (esyw) esyvVar.instance;
                String str2 = str;
                str2.getClass();
                esywVar2.g = str2;
                return tlv.this.L((esyw) esyvVar.build());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.crty
    public final elfl H() {
        return i(new Function() { // from class: tkt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                etau etauVar = (etau) obj;
                tlv.aa("listFiles", etauVar.d);
                eszm Y = tlv.this.Y();
                esyr esyrVar = (esyr) esys.a.createBuilder();
                esyrVar.copyOnWrite();
                esys esysVar = (esys) esyrVar.instance;
                etauVar.getClass();
                esysVar.c = etauVar;
                esysVar.b |= 1;
                esys esysVar2 = (esys) esyrVar.build();
                fdxk fdxkVar = Y.a;
                febs febsVar = eszn.B;
                if (febsVar == null) {
                    synchronized (eszn.class) {
                        febsVar = eszn.B;
                        if (febsVar == null) {
                            febp a2 = febs.a();
                            a2.c = febr.UNARY;
                            a2.d = febs.c("google.communications.jibemessagestore.v1.MessageStore", "ListFiles");
                            a2.b();
                            esys esysVar3 = esys.a;
                            eyfc eyfcVar = ffag.a;
                            a2.a = new ffae(esysVar3);
                            a2.b = new ffae(esyu.a);
                            febsVar = a2.a();
                            eszn.B = febsVar;
                        }
                    }
                }
                return elfl.g(ffat.a(fdxkVar.a(febsVar, Y.b), esysVar2)).h(new emwl() { // from class: tlf
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        esyu esyuVar = (esyu) obj2;
                        entd entdVar = tlv.a;
                        return new csdq(engw.n(esyuVar.b), esyuVar.c, esyuVar.d);
                    }
                }, erpp.a);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.crty
    public final elfl I() {
        return K("", eyja.a);
    }

    @Override // defpackage.crty
    public final elfl J(String str) {
        return K(str, eyja.a);
    }

    @Override // defpackage.crty
    public final elfl K(final String str, final eyja eyjaVar) {
        return i(new Function() { // from class: tks
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                etau etauVar = (etau) obj;
                tlv.aa("listObjects", etauVar.d);
                esyv esyvVar = (esyv) esyw.a.createBuilder();
                esyvVar.copyOnWrite();
                esyw esywVar = (esyw) esyvVar.instance;
                etauVar.getClass();
                esywVar.c = etauVar;
                esywVar.b |= 1;
                esyvVar.copyOnWrite();
                ((esyw) esyvVar.instance).d = "inbox";
                tlv tlvVar = tlv.this;
                int intValue = ((Long) tlvVar.i.b()).intValue();
                esyvVar.copyOnWrite();
                ((esyw) esyvVar.instance).f = intValue;
                String str2 = true != ((Boolean) ((cfup) tlv.b.get()).e()).booleanValue() ? "" : "message_content.message_time desc, create_time desc, object_id desc";
                esyvVar.copyOnWrite();
                ((esyw) esyvVar.instance).h = str2;
                eyja eyjaVar2 = eyjaVar;
                if (!emxb.a(eyjaVar2, eyja.a)) {
                    esyvVar.copyOnWrite();
                    esyw esywVar2 = (esyw) esyvVar.instance;
                    eyjaVar2.getClass();
                    esywVar2.j = eyjaVar2;
                    esywVar2.b |= 32;
                    esyvVar.copyOnWrite();
                    ((esyw) esyvVar.instance).i = true;
                }
                String str3 = str;
                if (!TextUtils.isEmpty(str3)) {
                    esyvVar.copyOnWrite();
                    esyw esywVar3 = (esyw) esyvVar.instance;
                    str3.getClass();
                    esywVar3.g = str3;
                }
                return tlvVar.L((esyw) esyvVar.build());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final elfl L(final esyw esywVar) {
        return elfl.g(Y().e(esywVar)).h(new emwl() { // from class: tkn
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                esyy esyyVar = (esyy) obj;
                entd entdVar = tlv.a;
                tlv.Z(esyw.this.g, esyyVar.c);
                return new csdq(engw.n(esyyVar.b), esyyVar.c, esyyVar.d);
            }
        }, erpp.a);
    }

    @Override // defpackage.crty
    public final elfl M() {
        return Q("", eyja.a);
    }

    @Override // defpackage.crty
    public final elfl N(final engw engwVar) {
        return i(new Function() { // from class: tkx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                etau etauVar = (etau) obj;
                tlv.aa("listParticipants", etauVar.d);
                esyz esyzVar = (esyz) esza.a.createBuilder();
                esyzVar.copyOnWrite();
                esza eszaVar = (esza) esyzVar.instance;
                etauVar.getClass();
                eszaVar.c = etauVar;
                eszaVar.b |= 1;
                esyzVar.copyOnWrite();
                esza eszaVar2 = (esza) esyzVar.instance;
                eygr eygrVar = eszaVar2.e;
                if (!eygrVar.c()) {
                    eszaVar2.e = eyfy.mutableCopy(eygrVar);
                }
                engw engwVar2 = engwVar;
                tlv tlvVar = tlv.this;
                eydl.addAll(engwVar2, eszaVar2.e);
                return tlvVar.O((esza) esyzVar.build());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final elfl O(final esza eszaVar) {
        eszm Y = Y();
        fdxk fdxkVar = Y.a;
        febs febsVar = eszn.y;
        if (febsVar == null) {
            synchronized (eszn.class) {
                febsVar = eszn.y;
                if (febsVar == null) {
                    febp a2 = febs.a();
                    a2.c = febr.UNARY;
                    a2.d = febs.c("google.communications.jibemessagestore.v1.MessageStore", "ListParticipants");
                    a2.b();
                    esza eszaVar2 = esza.a;
                    eyfc eyfcVar = ffag.a;
                    a2.a = new ffae(eszaVar2);
                    a2.b = new ffae(eszc.a);
                    febsVar = a2.a();
                    eszn.y = febsVar;
                }
            }
        }
        return elfl.g(ffat.a(fdxkVar.a(febsVar, Y.b), eszaVar)).h(new emwl() { // from class: tjr
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                eszc eszcVar = (eszc) obj;
                entd entdVar = tlv.a;
                tlv.Z(esza.this.f, eszcVar.c);
                return new csdq(engw.n(eszcVar.b), eszcVar.c, eszcVar.d);
            }
        }, erpp.a);
    }

    @Override // defpackage.crty
    public final elfl P(String str) {
        return Q(str, eyja.a);
    }

    @Override // defpackage.crty
    public final elfl Q(final String str, final eyja eyjaVar) {
        return i(new Function() { // from class: tlj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                etau etauVar = (etau) obj;
                tlv.aa("listParticipants", etauVar.d);
                esyz esyzVar = (esyz) esza.a.createBuilder();
                esyzVar.copyOnWrite();
                esza eszaVar = (esza) esyzVar.instance;
                etauVar.getClass();
                eszaVar.c = etauVar;
                eszaVar.b |= 1;
                String str2 = str;
                if (!str2.isEmpty()) {
                    esyzVar.copyOnWrite();
                    esza eszaVar2 = (esza) esyzVar.instance;
                    str2.getClass();
                    eszaVar2.f = str2;
                }
                eyja eyjaVar2 = eyjaVar;
                esyz esyzVar2 = (esyz) ((esza) esyzVar.build()).toBuilder();
                if (!emxb.a(eyjaVar2, eyja.a)) {
                    esyzVar2.copyOnWrite();
                    esza eszaVar3 = (esza) esyzVar2.instance;
                    eyjaVar2.getClass();
                    eszaVar3.d = eyjaVar2;
                    eszaVar3.b |= 2;
                }
                return tlv.this.O((esza) esyzVar2.build());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.crty
    public final elfl R() {
        etau d2 = this.f.d();
        aa("resetBox", d2.d);
        eszm Y = Y();
        etav etavVar = (etav) etaw.a.createBuilder();
        etavVar.copyOnWrite();
        etaw etawVar = (etaw) etavVar.instance;
        d2.getClass();
        etawVar.c = d2;
        etawVar.b |= 1;
        etaw etawVar2 = (etaw) etavVar.build();
        fdxk fdxkVar = Y.a;
        febs febsVar = eszn.t;
        if (febsVar == null) {
            synchronized (eszn.class) {
                febsVar = eszn.t;
                if (febsVar == null) {
                    febp a2 = febs.a();
                    a2.c = febr.UNARY;
                    a2.d = febs.c("google.communications.jibemessagestore.v1.MessageStore", "ResetBox");
                    a2.b();
                    etaw etawVar3 = etaw.a;
                    eyfc eyfcVar = ffag.a;
                    a2.a = new ffae(etawVar3);
                    a2.b = new ffae(eyex.a);
                    febsVar = a2.a();
                    eszn.t = febsVar;
                }
            }
        }
        return elfl.g(ffat.a(fdxkVar.a(febsVar, Y.b), etawVar2));
    }

    @Override // defpackage.crty
    public final elfl S(esvv esvvVar, eyfh eyfhVar, esze eszeVar) {
        etau d2 = this.f.d();
        aa("updateBox", d2.d);
        etaz etazVar = (etaz) etba.a.createBuilder();
        etazVar.copyOnWrite();
        etba etbaVar = (etba) etazVar.instance;
        d2.getClass();
        etbaVar.c = d2;
        etbaVar.b |= 1;
        etazVar.copyOnWrite();
        etba etbaVar2 = (etba) etazVar.instance;
        esvvVar.getClass();
        etbaVar2.d = esvvVar;
        etbaVar2.b |= 2;
        etazVar.copyOnWrite();
        etba etbaVar3 = (etba) etazVar.instance;
        eyfhVar.getClass();
        etbaVar3.e = eyfhVar;
        etbaVar3.b |= 4;
        etazVar.copyOnWrite();
        etba etbaVar4 = (etba) etazVar.instance;
        eszeVar.getClass();
        etbaVar4.f = eszeVar;
        etbaVar4.b |= 8;
        return elfl.g(Y().f((etba) etazVar.build()));
    }

    @Override // defpackage.crty
    public final elfl T(final eswr eswrVar, final eyfh eyfhVar, boolean z) {
        return al(z, new Function() { // from class: tkw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                etau etauVar = (etau) obj;
                tlv.aa("updateConversation", etauVar.d);
                eszm Y = tlv.this.Y();
                etbb etbbVar = (etbb) etbc.a.createBuilder();
                etbbVar.copyOnWrite();
                etbc etbcVar = (etbc) etbbVar.instance;
                etauVar.getClass();
                etbcVar.c = etauVar;
                etbcVar.b |= 1;
                etbbVar.copyOnWrite();
                etbc etbcVar2 = (etbc) etbbVar.instance;
                eswr eswrVar2 = eswrVar;
                eswrVar2.getClass();
                etbcVar2.d = eswrVar2;
                etbcVar2.b |= 2;
                etbbVar.copyOnWrite();
                etbc etbcVar3 = (etbc) etbbVar.instance;
                etbcVar3.e = eyfhVar;
                etbcVar3.b |= 4;
                etbc etbcVar4 = (etbc) etbbVar.build();
                fdxk fdxkVar = Y.a;
                febs febsVar = eszn.k;
                if (febsVar == null) {
                    synchronized (eszn.class) {
                        febsVar = eszn.k;
                        if (febsVar == null) {
                            febp a2 = febs.a();
                            a2.c = febr.UNARY;
                            a2.d = febs.c("google.communications.jibemessagestore.v1.MessageStore", "UpdateConversation");
                            a2.b();
                            etbc etbcVar5 = etbc.a;
                            eyfc eyfcVar = ffag.a;
                            a2.a = new ffae(etbcVar5);
                            a2.b = new ffae(eswr.a);
                            febsVar = a2.a();
                            eszn.k = febsVar;
                        }
                    }
                }
                return ffat.a(fdxkVar.a(febsVar, Y.b), etbcVar4);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.crty
    public final elfl U(final esxk esxkVar, final eyfh eyfhVar, boolean z) {
        return al(z, new Function() { // from class: tkb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                etau etauVar = (etau) obj;
                tlv.aa("updateFile", etauVar.d);
                eszm Y = tlv.this.Y();
                etbd etbdVar = (etbd) etbe.a.createBuilder();
                etbdVar.copyOnWrite();
                etbe etbeVar = (etbe) etbdVar.instance;
                etauVar.getClass();
                etbeVar.c = etauVar;
                etbeVar.b |= 1;
                etbdVar.copyOnWrite();
                etbe etbeVar2 = (etbe) etbdVar.instance;
                esxk esxkVar2 = esxkVar;
                esxkVar2.getClass();
                etbeVar2.d = esxkVar2;
                etbeVar2.b |= 2;
                etbdVar.copyOnWrite();
                etbe etbeVar3 = (etbe) etbdVar.instance;
                eyfh eyfhVar2 = eyfhVar;
                eyfhVar2.getClass();
                etbeVar3.e = eyfhVar2;
                etbeVar3.b |= 8;
                etbe etbeVar4 = (etbe) etbdVar.build();
                fdxk fdxkVar = Y.a;
                febs febsVar = eszn.C;
                if (febsVar == null) {
                    synchronized (eszn.class) {
                        febsVar = eszn.C;
                        if (febsVar == null) {
                            febp a2 = febs.a();
                            a2.c = febr.UNARY;
                            a2.d = febs.c("google.communications.jibemessagestore.v1.MessageStore", "UpdateFile");
                            a2.b();
                            etbe etbeVar5 = etbe.a;
                            eyfc eyfcVar = ffag.a;
                            a2.a = new ffae(etbeVar5);
                            a2.b = new ffae(esxk.a);
                            febsVar = a2.a();
                            eszn.C = febsVar;
                        }
                    }
                }
                return ffat.a(fdxkVar.a(febsVar, Y.b), etbeVar4);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.crty
    public final elfl V(final eszz eszzVar, final eyfh eyfhVar, final esze eszeVar, boolean z) {
        return al(z, new Function() { // from class: tjc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                etau etauVar = (etau) obj;
                tlv.aa("updateObject", etauVar.d);
                eszm Y = tlv.this.Y();
                etbf etbfVar = (etbf) etbg.a.createBuilder();
                etbfVar.copyOnWrite();
                etbg etbgVar = (etbg) etbfVar.instance;
                etauVar.getClass();
                etbgVar.c = etauVar;
                etbgVar.b |= 1;
                etbfVar.copyOnWrite();
                etbg etbgVar2 = (etbg) etbfVar.instance;
                eszz eszzVar2 = eszzVar;
                eszzVar2.getClass();
                etbgVar2.d = eszzVar2;
                etbgVar2.b |= 2;
                etbfVar.copyOnWrite();
                etbg etbgVar3 = (etbg) etbfVar.instance;
                eyfh eyfhVar2 = eyfhVar;
                eyfhVar2.getClass();
                etbgVar3.e = eyfhVar2;
                etbgVar3.b |= 4;
                etbfVar.copyOnWrite();
                etbg etbgVar4 = (etbg) etbfVar.instance;
                esze eszeVar2 = eszeVar;
                eszeVar2.getClass();
                etbgVar4.f = eszeVar2;
                etbgVar4.b |= 8;
                return Y.g((etbg) etbfVar.build());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.crty
    public final elfl W(final etah etahVar, final eyfh eyfhVar, boolean z) {
        return al(z, new Function() { // from class: tkl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                etau etauVar = (etau) obj;
                tlv.aa("updateParticipant", etauVar.d);
                eszm Y = tlv.this.Y();
                etbh etbhVar = (etbh) etbi.a.createBuilder();
                etbhVar.copyOnWrite();
                etbi etbiVar = (etbi) etbhVar.instance;
                etauVar.getClass();
                etbiVar.c = etauVar;
                etbiVar.b |= 1;
                etbhVar.copyOnWrite();
                etbi etbiVar2 = (etbi) etbhVar.instance;
                etah etahVar2 = etahVar;
                etahVar2.getClass();
                etbiVar2.d = etahVar2;
                etbiVar2.b |= 2;
                etbhVar.copyOnWrite();
                etbi etbiVar3 = (etbi) etbhVar.instance;
                eyfh eyfhVar2 = eyfhVar;
                eyfhVar2.getClass();
                etbiVar3.e = eyfhVar2;
                etbiVar3.b |= 4;
                etbi etbiVar4 = (etbi) etbhVar.build();
                fdxk fdxkVar = Y.a;
                febs febsVar = eszn.z;
                if (febsVar == null) {
                    synchronized (eszn.class) {
                        febsVar = eszn.z;
                        if (febsVar == null) {
                            febp a2 = febs.a();
                            a2.c = febr.UNARY;
                            a2.d = febs.c("google.communications.jibemessagestore.v1.MessageStore", "UpdateParticipant");
                            a2.b();
                            etbi etbiVar5 = etbi.a;
                            eyfc eyfcVar = ffag.a;
                            a2.a = new ffae(etbiVar5);
                            a2.b = new ffae(etah.a);
                            febsVar = a2.a();
                            eszn.z = febsVar;
                        }
                    }
                }
                return ffat.a(fdxkVar.a(febsVar, Y.b), etbiVar4);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.crty
    public final elfl X(final String str, final etaq etaqVar, final eyfh eyfhVar, boolean z) {
        return al(z, new Function() { // from class: tky
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                etau etauVar = (etau) obj;
                tlv.aa("updatePayloadPart", etauVar.d);
                eszm Y = tlv.this.Y();
                etbj etbjVar = (etbj) etbk.a.createBuilder();
                etbjVar.copyOnWrite();
                etbk etbkVar = (etbk) etbjVar.instance;
                etauVar.getClass();
                etbkVar.c = etauVar;
                etbkVar.b |= 1;
                etbjVar.copyOnWrite();
                etbk etbkVar2 = (etbk) etbjVar.instance;
                etaq etaqVar2 = etaqVar;
                etaqVar2.getClass();
                etbkVar2.e = etaqVar2;
                etbkVar2.b |= 2;
                etbjVar.copyOnWrite();
                etbk etbkVar3 = (etbk) etbjVar.instance;
                String str2 = str;
                str2.getClass();
                etbkVar3.d = str2;
                etbjVar.copyOnWrite();
                etbk etbkVar4 = (etbk) etbjVar.instance;
                eyfh eyfhVar2 = eyfhVar;
                eyfhVar2.getClass();
                etbkVar4.f = eyfhVar2;
                etbkVar4.b |= 4;
                etbk etbkVar5 = (etbk) etbjVar.build();
                fdxk fdxkVar = Y.a;
                febs febsVar = eszn.f;
                if (febsVar == null) {
                    synchronized (eszn.class) {
                        febsVar = eszn.f;
                        if (febsVar == null) {
                            febp a2 = febs.a();
                            a2.c = febr.UNARY;
                            a2.d = febs.c("google.communications.jibemessagestore.v1.MessageStore", "UpdatePayloadPart");
                            a2.b();
                            etbk etbkVar6 = etbk.a;
                            eyfc eyfcVar = ffag.a;
                            a2.a = new ffae(etbkVar6);
                            a2.b = new ffae(etaq.a);
                            febsVar = a2.a();
                            eszn.f = febsVar;
                        }
                    }
                }
                return ffat.a(fdxkVar.a(febsVar, Y.b), etbkVar5);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    final eszm Y() {
        eszm eszmVar = (eszm) this.j.b();
        fdxi fdxiVar = evcy.a;
        evby evbyVar = new evby();
        evbyVar.b(enip.r("https://www.googleapis.com/auth/carrier-message-store", "https://www.googleapis.com/auth/android-messages"));
        eszm eszmVar2 = (eszm) ((eszm) eszmVar.m(fdxiVar, new evce(evbyVar.c()))).j(((Long) c.e()).longValue(), TimeUnit.SECONDS);
        return Boolean.TRUE.equals(this.l.b()) ? (eszm) eszmVar2.m(evgq.b, 8736) : eszmVar2;
    }

    @Override // defpackage.crty
    public final elfl a(final List list, boolean z) {
        return al(z, new Function() { // from class: tjh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                etau etauVar = (etau) obj;
                String str = etauVar.d;
                List list2 = list;
                tlv.ab("batchCreateConversations", str, list2.size());
                eszm Y = tlv.this.Y();
                esuv esuvVar = (esuv) esuw.a.createBuilder();
                esuvVar.copyOnWrite();
                esuw esuwVar = (esuw) esuvVar.instance;
                eygr eygrVar = esuwVar.d;
                if (!eygrVar.c()) {
                    esuwVar.d = eyfy.mutableCopy(eygrVar);
                }
                eydl.addAll(list2, esuwVar.d);
                esuvVar.copyOnWrite();
                esuw esuwVar2 = (esuw) esuvVar.instance;
                etauVar.getClass();
                esuwVar2.c = etauVar;
                esuwVar2.b |= 1;
                esuw esuwVar3 = (esuw) esuvVar.build();
                fdxk fdxkVar = Y.a;
                febs febsVar = eszn.g;
                if (febsVar == null) {
                    synchronized (eszn.class) {
                        febsVar = eszn.g;
                        if (febsVar == null) {
                            febp a2 = febs.a();
                            a2.c = febr.UNARY;
                            a2.d = febs.c("google.communications.jibemessagestore.v1.MessageStore", "BatchCreateConversations");
                            a2.b();
                            esuw esuwVar4 = esuw.a;
                            eyfc eyfcVar = ffag.a;
                            a2.a = new ffae(esuwVar4);
                            a2.b = new ffae(esuy.a);
                            febsVar = a2.a();
                            eszn.g = febsVar;
                        }
                    }
                }
                return ffat.a(fdxkVar.a(febsVar, Y.b), esuwVar3);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.crty
    public final elfl ac(final List list) {
        return al(false, new Function() { // from class: tkk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                etau etauVar = (etau) obj;
                String str = etauVar.d;
                List list2 = list;
                tlv.ab("batchDeleteFiles", str, list2.size());
                eszm Y = tlv.this.Y();
                esvh esvhVar = (esvh) esvi.a.createBuilder();
                esvhVar.copyOnWrite();
                esvi esviVar = (esvi) esvhVar.instance;
                etauVar.getClass();
                esviVar.c = etauVar;
                esviVar.b |= 1;
                esvhVar.copyOnWrite();
                esvi esviVar2 = (esvi) esvhVar.instance;
                eygr eygrVar = esviVar2.d;
                if (!eygrVar.c()) {
                    esviVar2.d = eyfy.mutableCopy(eygrVar);
                }
                eydl.addAll(list2, esviVar2.d);
                esvi esviVar3 = (esvi) esvhVar.build();
                fdxk fdxkVar = Y.a;
                febs febsVar = eszn.A;
                if (febsVar == null) {
                    synchronized (eszn.class) {
                        febsVar = eszn.A;
                        if (febsVar == null) {
                            febp a2 = febs.a();
                            a2.c = febr.UNARY;
                            a2.d = febs.c("google.communications.jibemessagestore.v1.MessageStore", "BatchDeleteFiles");
                            a2.b();
                            esvi esviVar4 = esvi.a;
                            eyfc eyfcVar = ffag.a;
                            a2.a = new ffae(esviVar4);
                            a2.b = new ffae(esvk.a);
                            febsVar = a2.a();
                            eszn.A = febsVar;
                        }
                    }
                }
                return ffat.a(fdxkVar.a(febsVar, Y.b), esviVar3);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.crty
    public final elfl ad(final String str, boolean z) {
        return al(z, new Function() { // from class: tlk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                etau etauVar = (etau) obj;
                tlv.aa("deleteConversation", etauVar.d);
                eszm Y = tlv.this.Y();
                eswz eswzVar = (eswz) esxa.a.createBuilder();
                eswzVar.copyOnWrite();
                esxa esxaVar = (esxa) eswzVar.instance;
                etauVar.getClass();
                esxaVar.c = etauVar;
                esxaVar.b |= 1;
                eswzVar.copyOnWrite();
                esxa esxaVar2 = (esxa) eswzVar.instance;
                String str2 = str;
                str2.getClass();
                esxaVar2.d = str2;
                eswzVar.copyOnWrite();
                ((esxa) eswzVar.instance).e = true;
                esxa esxaVar3 = (esxa) eswzVar.build();
                fdxk fdxkVar = Y.a;
                febs febsVar = eszn.j;
                if (febsVar == null) {
                    synchronized (eszn.class) {
                        febsVar = eszn.j;
                        if (febsVar == null) {
                            febp a2 = febs.a();
                            a2.c = febr.UNARY;
                            a2.d = febs.c("google.communications.jibemessagestore.v1.MessageStore", "DeleteConversation");
                            a2.b();
                            esxa esxaVar4 = esxa.a;
                            eyfc eyfcVar = ffag.a;
                            a2.a = new ffae(esxaVar4);
                            a2.b = new ffae(eyex.a);
                            febsVar = a2.a();
                            eszn.j = febsVar;
                        }
                    }
                }
                return ffat.a(fdxkVar.a(febsVar, Y.b), esxaVar3);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).h(new emwl() { // from class: tll
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                entd entdVar = tlv.a;
                return true;
            }
        }, this.h).f(fedn.class, new eroh() { // from class: tlm
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                fedn fednVar = (fedn) obj;
                Status status = fednVar.a;
                entd entdVar = tlv.a;
                return status.getCode().equals(Status.Code.NOT_FOUND) ? elfo.e(false) : elfo.d(fednVar);
            }
        }, this.h);
    }

    @Override // defpackage.crty
    public final elfl ae(final eyja eyjaVar) {
        return i(new Function() { // from class: tku
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                etau etauVar = (etau) obj;
                tlv.aa("listConversations", etauVar.d);
                esyn esynVar = (esyn) esyo.a.createBuilder();
                esynVar.copyOnWrite();
                esyo esyoVar = (esyo) esynVar.instance;
                etauVar.getClass();
                esyoVar.c = etauVar;
                esyoVar.b |= 1;
                esynVar.copyOnWrite();
                ((esyo) esynVar.instance).i = 0;
                esynVar.copyOnWrite();
                ((esyo) esynVar.instance).g = true;
                eyja eyjaVar2 = eyjaVar;
                if (!eyjaVar2.equals(eykm.c)) {
                    esynVar.copyOnWrite();
                    esyo esyoVar2 = (esyo) esynVar.instance;
                    eyjaVar2.getClass();
                    esyoVar2.d = eyjaVar2;
                    esyoVar2.b |= 2;
                }
                return tlv.this.C((esyo) esynVar.build()).h(new tjv(), erpp.a);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.crty
    public final elfl af(final eyja eyjaVar) {
        return i(new Function() { // from class: tjz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                etau etauVar = (etau) obj;
                tlv.aa("listObjects", etauVar.d);
                esyv esyvVar = (esyv) esyw.a.createBuilder();
                esyvVar.copyOnWrite();
                esyw esywVar = (esyw) esyvVar.instance;
                etauVar.getClass();
                esywVar.c = etauVar;
                esywVar.b |= 1;
                esyvVar.copyOnWrite();
                ((esyw) esyvVar.instance).d = "inbox";
                esyvVar.copyOnWrite();
                ((esyw) esyvVar.instance).f = 0;
                esyvVar.copyOnWrite();
                ((esyw) esyvVar.instance).i = true;
                eyja eyjaVar2 = eyjaVar;
                if (!eyjaVar2.equals(eykm.c)) {
                    esyvVar.copyOnWrite();
                    esyw esywVar2 = (esyw) esyvVar.instance;
                    eyjaVar2.getClass();
                    esywVar2.j = eyjaVar2;
                    esywVar2.b |= 32;
                }
                return tlv.this.L((esyw) esyvVar.build()).h(new tjv(), erpp.a);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.crty
    public final elfl ag(final eyja eyjaVar) {
        return i(new Function() { // from class: tkp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                etau etauVar = (etau) obj;
                tlv.aa("listParticipants", etauVar.d);
                esyz esyzVar = (esyz) esza.a.createBuilder();
                esyzVar.copyOnWrite();
                esza eszaVar = (esza) esyzVar.instance;
                etauVar.getClass();
                eszaVar.c = etauVar;
                eszaVar.b |= 1;
                esyzVar.copyOnWrite();
                ((esza) esyzVar.instance).i = 0;
                esyzVar.copyOnWrite();
                ((esza) esyzVar.instance).g = true;
                eyja eyjaVar2 = eyjaVar;
                if (!eyjaVar2.equals(eykm.c)) {
                    esyzVar.copyOnWrite();
                    esza eszaVar2 = (esza) esyzVar.instance;
                    eyjaVar2.getClass();
                    eszaVar2.d = eyjaVar2;
                    eszaVar2.b |= 2;
                }
                return tlv.this.O((esza) esyzVar.build()).h(new tjv(), erpp.a);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.crty
    public final elfl ah(final int i) {
        axkm axkmVar = this.k;
        elfl k = axkmVar.k();
        axkmVar.n.getClass();
        return k.h(new emwl() { // from class: tlg
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Boolean.valueOf(axkl.g((axez) obj));
            }
        }, this.h).i(new eroh() { // from class: tlp
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                final tlv tlvVar = tlv.this;
                final int i2 = i;
                if (booleanValue) {
                    return tlvVar.i(new Function() { // from class: tla
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            etau etauVar = (etau) obj2;
                            tlv.aa("getUserStorageInfo", etauVar.d);
                            eszm Y = tlv.this.Y();
                            esxz esxzVar = (esxz) esyb.a.createBuilder();
                            esxzVar.copyOnWrite();
                            esyb esybVar = (esyb) esxzVar.instance;
                            etauVar.getClass();
                            esybVar.c = etauVar;
                            esybVar.b |= 1;
                            esxzVar.copyOnWrite();
                            esyb esybVar2 = (esyb) esxzVar.instance;
                            esybVar2.d = esya.a(i2);
                            esybVar2.b |= 2;
                            return Y.d((esyb) esxzVar.build());
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).h(new emwl() { // from class: tlb
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            entd entdVar = tlv.a;
                            etbm etbmVar = ((esyd) obj2).b;
                            return etbmVar == null ? etbm.a : etbmVar;
                        }
                    }, tlvVar.h);
                }
                etau d2 = tlvVar.f.d();
                tlv.aa("getUserStorageInfo", d2.d);
                eszm Y = tlvVar.Y();
                esxz esxzVar = (esxz) esyb.a.createBuilder();
                esxzVar.copyOnWrite();
                esyb esybVar = (esyb) esxzVar.instance;
                esybVar.d = esya.a(i2);
                esybVar.b |= 2;
                esxzVar.copyOnWrite();
                esyb esybVar2 = (esyb) esxzVar.instance;
                d2.getClass();
                esybVar2.c = d2;
                esybVar2.b |= 1;
                return elfl.g(Y.d((esyb) esxzVar.build())).h(new emwl() { // from class: tlc
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        entd entdVar = tlv.a;
                        etbm etbmVar = ((esyd) obj2).b;
                        return etbmVar == null ? etbm.a : etbmVar;
                    }
                }, tlvVar.h);
            }
        }, this.h);
    }

    @Override // defpackage.crty
    public final elfl ai(final esvv esvvVar, final eyfh eyfhVar, final esze eszeVar, int i) {
        return this.f.e(i).i(new eroh() { // from class: tle
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                etau etauVar = (etau) obj;
                tlv.aa("updateBox", etauVar.d);
                etaz etazVar = (etaz) etba.a.createBuilder();
                etazVar.copyOnWrite();
                etba etbaVar = (etba) etazVar.instance;
                etauVar.getClass();
                etbaVar.c = etauVar;
                etbaVar.b |= 1;
                etazVar.copyOnWrite();
                etba etbaVar2 = (etba) etazVar.instance;
                esvv esvvVar2 = esvvVar;
                esvvVar2.getClass();
                etbaVar2.d = esvvVar2;
                etbaVar2.b |= 2;
                etazVar.copyOnWrite();
                etba etbaVar3 = (etba) etazVar.instance;
                eyfh eyfhVar2 = eyfhVar;
                eyfhVar2.getClass();
                etbaVar3.e = eyfhVar2;
                etbaVar3.b |= 4;
                etazVar.copyOnWrite();
                etba etbaVar4 = (etba) etazVar.instance;
                esze eszeVar2 = eszeVar;
                eszeVar2.getClass();
                etbaVar4.f = eszeVar2;
                etbaVar4.b |= 8;
                return tlv.this.Y().f((etba) etazVar.build());
            }
        }, this.h).f(fedn.class, new tjn(this), this.h);
    }

    final elfl aj(Function function) {
        tmf tmfVar = this.f;
        return tmfVar.a(tmfVar.c()).i(new tlz(tmfVar), tmfVar.c).h(new emwl() { // from class: tma
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                etas etasVar = (etas) obj;
                cskc cskcVar = tmf.a;
                etasVar.copyOnWrite();
                etau etauVar = (etau) etasVar.instance;
                etau etauVar2 = etau.a;
                etauVar.f = etat.a(4);
                return (etau) etasVar.build();
            }
        }, tmfVar.c).i(new tjo(function), this.h).f(fedn.class, new tjn(this), this.h);
    }

    @Override // defpackage.crty
    public final elfl ak(final eszz eszzVar, final eyfh eyfhVar, final esze eszeVar) {
        return aj(new Function() { // from class: tlo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                etau etauVar = (etau) obj;
                tlv.aa("updateObject", etauVar.d);
                eszm Y = tlv.this.Y();
                etbf etbfVar = (etbf) etbg.a.createBuilder();
                etbfVar.copyOnWrite();
                etbg etbgVar = (etbg) etbfVar.instance;
                etauVar.getClass();
                etbgVar.c = etauVar;
                etbgVar.b |= 1;
                etbfVar.copyOnWrite();
                etbg etbgVar2 = (etbg) etbfVar.instance;
                eszz eszzVar2 = eszzVar;
                eszzVar2.getClass();
                etbgVar2.d = eszzVar2;
                etbgVar2.b |= 2;
                etbfVar.copyOnWrite();
                etbg etbgVar3 = (etbg) etbfVar.instance;
                eyfh eyfhVar2 = eyfhVar;
                eyfhVar2.getClass();
                etbgVar3.e = eyfhVar2;
                etbgVar3.b |= 4;
                etbfVar.copyOnWrite();
                etbg etbgVar4 = (etbg) etbfVar.instance;
                esze eszeVar2 = eszeVar;
                eszeVar2.getClass();
                etbgVar4.f = eszeVar2;
                etbgVar4.b |= 8;
                return Y.g((etbg) etbfVar.build());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.crty
    public final elfl b(final List list, boolean z) {
        return al(z, new Function() { // from class: tjp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                etau etauVar = (etau) obj;
                String str = etauVar.d;
                List list2 = list;
                tlv.ab("batchCreateObjects", str, list2.size());
                eszm Y = tlv.this.Y();
                esuz esuzVar = (esuz) esva.a.createBuilder();
                esuzVar.copyOnWrite();
                esva esvaVar = (esva) esuzVar.instance;
                eygr eygrVar = esvaVar.d;
                if (!eygrVar.c()) {
                    esvaVar.d = eyfy.mutableCopy(eygrVar);
                }
                eydl.addAll(list2, esvaVar.d);
                esuzVar.copyOnWrite();
                esva esvaVar2 = (esva) esuzVar.instance;
                etauVar.getClass();
                esvaVar2.c = etauVar;
                esvaVar2.b |= 1;
                esva esvaVar3 = (esva) esuzVar.build();
                fdxk fdxkVar = Y.a;
                febs febsVar = eszn.n;
                if (febsVar == null) {
                    synchronized (eszn.class) {
                        febsVar = eszn.n;
                        if (febsVar == null) {
                            febp a2 = febs.a();
                            a2.c = febr.UNARY;
                            a2.d = febs.c("google.communications.jibemessagestore.v1.MessageStore", "BatchCreateObjects");
                            a2.b();
                            esva esvaVar4 = esva.a;
                            eyfc eyfcVar = ffag.a;
                            a2.a = new ffae(esvaVar4);
                            a2.b = new ffae(esvc.a);
                            febsVar = a2.a();
                            eszn.n = febsVar;
                        }
                    }
                }
                return ffat.a(fdxkVar.a(febsVar, Y.b), esvaVar3);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.crty
    public final elfl c(final List list, boolean z) {
        return al(z, new Function() { // from class: tjd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                etau etauVar = (etau) obj;
                String str = etauVar.d;
                List list2 = list;
                tlv.ab("batchCreateParticipants", str, list2.size());
                eszm Y = tlv.this.Y();
                esvd esvdVar = (esvd) esve.a.createBuilder();
                esvdVar.copyOnWrite();
                esve esveVar = (esve) esvdVar.instance;
                eygr eygrVar = esveVar.d;
                if (!eygrVar.c()) {
                    esveVar.d = eyfy.mutableCopy(eygrVar);
                }
                eydl.addAll(list2, esveVar.d);
                esvdVar.copyOnWrite();
                esve esveVar2 = (esve) esvdVar.instance;
                etauVar.getClass();
                esveVar2.c = etauVar;
                esveVar2.b |= 1;
                esve esveVar3 = (esve) esvdVar.build();
                fdxk fdxkVar = Y.a;
                febs febsVar = eszn.u;
                if (febsVar == null) {
                    synchronized (eszn.class) {
                        febsVar = eszn.u;
                        if (febsVar == null) {
                            febp a2 = febs.a();
                            a2.c = febr.UNARY;
                            a2.d = febs.c("google.communications.jibemessagestore.v1.MessageStore", "BatchCreateParticipants");
                            a2.b();
                            esve esveVar4 = esve.a;
                            eyfc eyfcVar = ffag.a;
                            a2.a = new ffae(esveVar4);
                            a2.b = new ffae(esvg.a);
                            febsVar = a2.a();
                            eszn.u = febsVar;
                        }
                    }
                }
                return ffat.a(fdxkVar.a(febsVar, Y.b), esveVar3);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.crty
    public final elfl d(final engw engwVar) {
        return i(new Function() { // from class: tld
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                etau etauVar = (etau) obj;
                String str = etauVar.d;
                engw engwVar2 = engwVar;
                tlv.ab("batchGetObjectsByCorrelationIds", str, engwVar2.size());
                eszm Y = tlv.this.Y();
                esvl esvlVar = (esvl) esvm.a.createBuilder();
                esvlVar.copyOnWrite();
                esvm esvmVar = (esvm) esvlVar.instance;
                etauVar.getClass();
                esvmVar.c = etauVar;
                esvmVar.b |= 1;
                esvlVar.copyOnWrite();
                esvm esvmVar2 = (esvm) esvlVar.instance;
                eygr eygrVar = esvmVar2.d;
                if (!eygrVar.c()) {
                    esvmVar2.d = eyfy.mutableCopy(eygrVar);
                }
                eydl.addAll(engwVar2, esvmVar2.d);
                esvm esvmVar3 = (esvm) esvlVar.build();
                fdxk fdxkVar = Y.a;
                febs febsVar = eszn.p;
                if (febsVar == null) {
                    synchronized (eszn.class) {
                        febsVar = eszn.p;
                        if (febsVar == null) {
                            febp a2 = febs.a();
                            a2.c = febr.UNARY;
                            a2.d = febs.c("google.communications.jibemessagestore.v1.MessageStore", "BatchGetObjectsByCorrelationIds");
                            a2.b();
                            esvm esvmVar4 = esvm.a;
                            eyfc eyfcVar = ffag.a;
                            a2.a = new ffae(esvmVar4);
                            a2.b = new ffae(esvo.a);
                            febsVar = a2.a();
                            eszn.p = febsVar;
                        }
                    }
                }
                return ffat.a(fdxkVar.a(febsVar, Y.b), esvmVar3);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.crty
    public final elfl e(final engw engwVar) {
        return i(new Function() { // from class: tkd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                etau etauVar = (etau) obj;
                String str = etauVar.d;
                engw engwVar2 = engwVar;
                tlv.ab("batchGetParticipants", str, engwVar2.size());
                eszm Y = tlv.this.Y();
                esvp esvpVar = (esvp) esvq.a.createBuilder();
                esvpVar.copyOnWrite();
                esvq esvqVar = (esvq) esvpVar.instance;
                etauVar.getClass();
                esvqVar.c = etauVar;
                esvqVar.b |= 1;
                esvpVar.copyOnWrite();
                esvq esvqVar2 = (esvq) esvpVar.instance;
                eygr eygrVar = esvqVar2.d;
                if (!eygrVar.c()) {
                    esvqVar2.d = eyfy.mutableCopy(eygrVar);
                }
                eydl.addAll(engwVar2, esvqVar2.d);
                esvq esvqVar3 = (esvq) esvpVar.build();
                fdxk fdxkVar = Y.a;
                febs febsVar = eszn.x;
                if (febsVar == null) {
                    synchronized (eszn.class) {
                        febsVar = eszn.x;
                        if (febsVar == null) {
                            febp a2 = febs.a();
                            a2.c = febr.UNARY;
                            a2.d = febs.c("google.communications.jibemessagestore.v1.MessageStore", "BatchGetParticipants");
                            a2.b();
                            esvq esvqVar4 = esvq.a;
                            eyfc eyfcVar = ffag.a;
                            a2.a = new ffae(esvqVar4);
                            a2.b = new ffae(esvs.a);
                            febsVar = a2.a();
                            eszn.x = febsVar;
                        }
                    }
                }
                return ffat.a(fdxkVar.a(febsVar, Y.b), esvqVar3);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).h(new emwl() { // from class: tke
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                esvs esvsVar = (esvs) obj;
                entd entdVar = tlv.a;
                int size = esvsVar.c.size();
                engw engwVar2 = engw.this;
                if (size != engwVar2.size() || esvsVar.b.size() != engwVar2.size()) {
                    fagm fagmVar = fagm.a;
                    throw new crtw();
                }
                enhd enhdVar = new enhd();
                for (int i = 0; i < engwVar2.size(); i++) {
                    String str = (String) engwVar2.get(i);
                    fagm fagmVar2 = (fagm) esvsVar.c.get(i);
                    etah etahVar = (etah) esvsVar.b.get(i);
                    if (fagmVar2.b == Status.Code.NOT_FOUND.value()) {
                        enhdVar.k(str, Optional.empty());
                    } else {
                        if (fagmVar2.b != Status.Code.OK.value()) {
                            throw new crtw((String) engwVar2.get(i), "At least one participant lookup failed");
                        }
                        if (!str.equals(etahVar.c)) {
                            fagl faglVar = (fagl) fagm.a.createBuilder();
                            int value = Status.Code.FAILED_PRECONDITION.value();
                            faglVar.copyOnWrite();
                            ((fagm) faglVar.instance).b = value;
                            throw new crtw(str, "Participant Id does not match lookup Id");
                        }
                        enhdVar.k(str, Optional.of(etahVar));
                    }
                }
                return enhdVar.c();
            }
        }, this.h);
    }

    @Override // defpackage.crty
    public final elfl f(final eszz eszzVar, boolean z) {
        return al(z, new Function() { // from class: tjs
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                etau etauVar = (etau) obj;
                tlv.aa("createObject", etauVar.d);
                eszm Y = tlv.this.Y();
                eswx eswxVar = (eswx) eswy.a.createBuilder();
                eswxVar.copyOnWrite();
                eswy eswyVar = (eswy) eswxVar.instance;
                etauVar.getClass();
                eswyVar.c = etauVar;
                eswyVar.b |= 1;
                eswxVar.copyOnWrite();
                eswy eswyVar2 = (eswy) eswxVar.instance;
                eszz eszzVar2 = eszzVar;
                eszzVar2.getClass();
                eswyVar2.d = eszzVar2;
                eswyVar2.b |= 2;
                return Y.b((eswy) eswxVar.build());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.crty
    public final elfl g(final String str, boolean z) {
        return al(z, new Function() { // from class: tlr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                etau etauVar = (etau) obj;
                tlv.aa("deleteObject", etauVar.d);
                eszm Y = tlv.this.Y();
                esxb esxbVar = (esxb) esxc.a.createBuilder();
                esxbVar.copyOnWrite();
                esxc esxcVar = (esxc) esxbVar.instance;
                etauVar.getClass();
                esxcVar.c = etauVar;
                esxcVar.b |= 1;
                esxbVar.copyOnWrite();
                esxc esxcVar2 = (esxc) esxbVar.instance;
                String str2 = str;
                str2.getClass();
                esxcVar2.d = str2;
                esxc esxcVar3 = (esxc) esxbVar.build();
                fdxk fdxkVar = Y.a;
                febs febsVar = eszn.d;
                if (febsVar == null) {
                    synchronized (eszn.class) {
                        febsVar = eszn.d;
                        if (febsVar == null) {
                            febp a2 = febs.a();
                            a2.c = febr.UNARY;
                            a2.d = febs.c("google.communications.jibemessagestore.v1.MessageStore", "DeleteObject");
                            a2.b();
                            esxc esxcVar4 = esxc.a;
                            eyfc eyfcVar = ffag.a;
                            a2.a = new ffae(esxcVar4);
                            a2.b = new ffae(eyex.a);
                            febsVar = a2.a();
                            eszn.d = febsVar;
                        }
                    }
                }
                return ffat.a(fdxkVar.a(febsVar, Y.b), esxcVar3);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).h(new emwl() { // from class: tls
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                entd entdVar = tlv.a;
                return true;
            }
        }, this.h).f(fedn.class, new eroh() { // from class: tlt
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                fedn fednVar = (fedn) obj;
                Status status = fednVar.a;
                entd entdVar = tlv.a;
                return status.getCode().equals(Status.Code.NOT_FOUND) ? elfo.e(false) : elfo.d(fednVar);
            }
        }, this.h);
    }

    @Override // defpackage.crty
    public final elfl h(final String str, boolean z) {
        return al(z, new Function() { // from class: tkf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                etau etauVar = (etau) obj;
                tlv.aa("deleteParticipant", etauVar.d);
                eszm Y = tlv.this.Y();
                esxd esxdVar = (esxd) esxe.a.createBuilder();
                esxdVar.copyOnWrite();
                esxe esxeVar = (esxe) esxdVar.instance;
                etauVar.getClass();
                esxeVar.c = etauVar;
                esxeVar.b |= 1;
                esxdVar.copyOnWrite();
                esxe esxeVar2 = (esxe) esxdVar.instance;
                String str2 = str;
                str2.getClass();
                esxeVar2.d = str2;
                esxe esxeVar3 = (esxe) esxdVar.build();
                fdxk fdxkVar = Y.a;
                febs febsVar = eszn.v;
                if (febsVar == null) {
                    synchronized (eszn.class) {
                        febsVar = eszn.v;
                        if (febsVar == null) {
                            febp a2 = febs.a();
                            a2.c = febr.UNARY;
                            a2.d = febs.c("google.communications.jibemessagestore.v1.MessageStore", "DeleteParticipant");
                            a2.b();
                            esxe esxeVar4 = esxe.a;
                            eyfc eyfcVar = ffag.a;
                            a2.a = new ffae(esxeVar4);
                            a2.b = new ffae(eyex.a);
                            febsVar = a2.a();
                            eszn.v = febsVar;
                        }
                    }
                }
                return ffat.a(fdxkVar.a(febsVar, Y.b), esxeVar3);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).h(new emwl() { // from class: tkg
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                entd entdVar = tlv.a;
                return true;
            }
        }, this.h).f(fedn.class, new eroh() { // from class: tkh
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                fedn fednVar = (fedn) obj;
                Status status = fednVar.a;
                entd entdVar = tlv.a;
                return status.getCode().equals(Status.Code.NOT_FOUND) ? elfo.e(false) : elfo.d(fednVar);
            }
        }, this.h);
    }

    final elfl i(Function function) {
        tmf tmfVar = this.f;
        return tmfVar.a(tmfVar.c()).i(new tlz(tmfVar), tmfVar.c).h(new tmc(), tmfVar.c).i(new tjo(function), this.h).f(fedn.class, new tjn(this), this.h);
    }

    @Override // defpackage.crty
    public final elfl j() {
        return aj(new Function() { // from class: tka
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                etau etauVar = (etau) obj;
                tlv.aa("exportUserDataReference", etauVar.d);
                eszm Y = tlv.this.Y();
                esxg esxgVar = (esxg) esxh.a.createBuilder();
                esxgVar.copyOnWrite();
                esxh esxhVar = (esxh) esxgVar.instance;
                etauVar.getClass();
                esxhVar.c = etauVar;
                esxhVar.b |= 1;
                esxh esxhVar2 = (esxh) esxgVar.build();
                fdxk fdxkVar = Y.a;
                febs febsVar = eszn.E;
                if (febsVar == null) {
                    synchronized (eszn.class) {
                        febsVar = eszn.E;
                        if (febsVar == null) {
                            febp a2 = febs.a();
                            a2.c = febr.UNARY;
                            a2.d = febs.c("google.communications.jibemessagestore.v1.MessageStore", "ExportUserDataReference");
                            a2.b();
                            esxh esxhVar3 = esxh.a;
                            eyfc eyfcVar = ffag.a;
                            a2.a = new ffae(esxhVar3);
                            a2.b = new ffae(esxk.a);
                            febsVar = a2.a();
                            eszn.E = febsVar;
                        }
                    }
                }
                return ffat.a(fdxkVar.a(febsVar, Y.b), esxhVar2);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.crty
    public final elfl k(eyfh eyfhVar) {
        etau d2 = this.f.d();
        aa("getBox", d2.d);
        esxn esxnVar = (esxn) esxo.a.createBuilder();
        esxnVar.copyOnWrite();
        esxo esxoVar = (esxo) esxnVar.instance;
        d2.getClass();
        esxoVar.c = d2;
        esxoVar.b |= 1;
        esxnVar.copyOnWrite();
        esxo esxoVar2 = (esxo) esxnVar.instance;
        eyfhVar.getClass();
        esxoVar2.d = eyfhVar;
        esxoVar2.b |= 2;
        esxo esxoVar3 = (esxo) esxnVar.build();
        eszm Y = Y();
        fdxk fdxkVar = Y.a;
        febs febsVar = eszn.q;
        if (febsVar == null) {
            synchronized (eszn.class) {
                febsVar = eszn.q;
                if (febsVar == null) {
                    febp a2 = febs.a();
                    a2.c = febr.UNARY;
                    a2.d = febs.c("google.communications.jibemessagestore.v1.MessageStore", "GetBox");
                    a2.b();
                    esxo esxoVar4 = esxo.a;
                    eyfc eyfcVar = ffag.a;
                    a2.a = new ffae(esxoVar4);
                    a2.b = new ffae(esvv.b);
                    febsVar = a2.a();
                    eszn.q = febsVar;
                }
            }
        }
        return elfl.g(ffat.a(fdxkVar.a(febsVar, Y.b), esxoVar3));
    }

    @Override // defpackage.crty
    public final elfl l() {
        return s("cms_daily_timestamp").e(fedn.class, new emwl() { // from class: tjj
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                fedn fednVar = (fedn) obj;
                Status status = fednVar.a;
                entd entdVar = tlv.a;
                if (status.getCode() != Status.Code.NOT_FOUND) {
                    throw fednVar;
                }
                ((ensz) ((ensz) tlv.a.h()).h("com/google/android/apps/messaging/cloudstore/grpc/CloudMessageStoreClientImpl", "getCmsCurrentTimestamp", 1400, "CloudMessageStoreClientImpl.java")).q("CMS Timestamp Object not found with correlation id cms_daily_timestamp.");
                return eszz.a;
            }
        }, this.h).i(new eroh() { // from class: tjl
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final eszz eszzVar = (eszz) obj;
                boolean equals = eszzVar.equals(eszz.a);
                final tlv tlvVar = tlv.this;
                if (!equals) {
                    ((ensz) ((ensz) tlv.a.h()).h("com/google/android/apps/messaging/cloudstore/grpc/CloudMessageStoreClientImpl", "getCmsCurrentTimestamp", 1417, "CloudMessageStoreClientImpl.java")).q("Updating CMS Timestamp Object.");
                    eyfg eyfgVar = (eyfg) eyfh.a.createBuilder();
                    eyfgVar.a("labels");
                    eyfgVar.a("payload");
                    final eyfh eyfhVar = (eyfh) eyfgVar.build();
                    tmf tmfVar = tlvVar.f;
                    final esze eszeVar = esze.a;
                    return tmfVar.e(4).i(new eroh() { // from class: tkj
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            etau etauVar = (etau) obj2;
                            tlv.aa("updateObject", etauVar.d);
                            etbf etbfVar = (etbf) etbg.a.createBuilder();
                            etbfVar.copyOnWrite();
                            etbg etbgVar = (etbg) etbfVar.instance;
                            etauVar.getClass();
                            etbgVar.c = etauVar;
                            etbgVar.b |= 1;
                            etbfVar.copyOnWrite();
                            etbg etbgVar2 = (etbg) etbfVar.instance;
                            eszz eszzVar2 = eszzVar;
                            eszzVar2.getClass();
                            etbgVar2.d = eszzVar2;
                            etbgVar2.b |= 2;
                            etbfVar.copyOnWrite();
                            etbg etbgVar3 = (etbg) etbfVar.instance;
                            eyfh eyfhVar2 = eyfhVar;
                            eyfhVar2.getClass();
                            etbgVar3.e = eyfhVar2;
                            etbgVar3.b |= 4;
                            etbfVar.copyOnWrite();
                            etbg etbgVar4 = (etbg) etbfVar.instance;
                            esze eszeVar2 = eszeVar;
                            eszeVar2.getClass();
                            etbgVar4.f = eszeVar2;
                            etbgVar4.b |= 8;
                            return tlv.this.Y().g((etbg) etbfVar.build());
                        }
                    }, tlvVar.h).f(fedn.class, new tjn(tlvVar), tlvVar.h);
                }
                eszy eszyVar = (eszy) eszz.a.createBuilder();
                eszyVar.copyOnWrite();
                ((eszz) eszyVar.instance).d = "root";
                eszyVar.copyOnWrite();
                ((eszz) eszyVar.instance).e = etad.a(4);
                eszyVar.copyOnWrite();
                ((eszz) eszyVar.instance).k = "cms_daily_timestamp";
                eszyVar.a("cms_daily_timestamp");
                etan etanVar = (etan) etao.a.createBuilder();
                etap etapVar = (etap) etaq.a.createBuilder();
                etapVar.copyOnWrite();
                ((etaq) etapVar.instance).f = "cms_daily_timestamp@message.cms.google";
                etapVar.copyOnWrite();
                ((etaq) etapVar.instance).e = "message/encrypted";
                eydp eydpVar = (eydp) eydq.a.createBuilder();
                eydpVar.copyOnWrite();
                ((eydq) eydpVar.instance).b = "type.googleapis.com/communication.messages.proto.cloud_store.encrypted_data.EncryptedData";
                esii esiiVar = (esii) esij.a.createBuilder();
                esiiVar.copyOnWrite();
                ((esij) esiiVar.instance).c = -1;
                eyee byteString = eydq.a.toByteString();
                esiiVar.copyOnWrite();
                ((esij) esiiVar.instance).b = byteString;
                eyee byteString2 = ((esij) esiiVar.build()).toByteString();
                eydpVar.copyOnWrite();
                ((eydq) eydpVar.instance).c = byteString2;
                etapVar.copyOnWrite();
                etaq etaqVar = (etaq) etapVar.instance;
                eydq eydqVar = (eydq) eydpVar.build();
                eydqVar.getClass();
                etaqVar.g = eydqVar;
                etaqVar.b |= 1;
                etanVar.a((etaq) etapVar.build());
                eszyVar.copyOnWrite();
                eszz eszzVar2 = (eszz) eszyVar.instance;
                etao etaoVar = (etao) etanVar.build();
                etaoVar.getClass();
                eszzVar2.i = etaoVar;
                eszzVar2.b |= 4;
                final eszz eszzVar3 = (eszz) eszyVar.build();
                ((ensz) ((ensz) tlv.a.h()).h("com/google/android/apps/messaging/cloudstore/grpc/CloudMessageStoreClientImpl", "getCmsCurrentTimestamp", 1413, "CloudMessageStoreClientImpl.java")).q("Creating new CMS Timestamp Object.");
                return tlvVar.f.e(4).i(new eroh() { // from class: tkm
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        etau etauVar = (etau) obj2;
                        tlv.aa("createObject", etauVar.d);
                        eswx eswxVar = (eswx) eswy.a.createBuilder();
                        eswxVar.copyOnWrite();
                        eswy eswyVar = (eswy) eswxVar.instance;
                        etauVar.getClass();
                        eswyVar.c = etauVar;
                        eswyVar.b |= 1;
                        eswxVar.copyOnWrite();
                        eswy eswyVar2 = (eswy) eswxVar.instance;
                        eszz eszzVar4 = eszzVar3;
                        eszzVar4.getClass();
                        eswyVar2.d = eszzVar4;
                        eswyVar2.b |= 2;
                        return tlv.this.Y().b((eswy) eswxVar.build());
                    }
                }, tlvVar.h).f(fedn.class, new tjn(tlvVar), tlvVar.h);
            }
        }, this.h).h(new emwl() { // from class: tjm
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                entd entdVar = tlv.a;
                eyja e2 = eykm.e(((eszz) obj).j);
                ((ensz) ((ensz) tlv.a.h()).h("com/google/android/apps/messaging/cloudstore/grpc/CloudMessageStoreClientImpl", "getCmsCurrentTimestamp", 1428, "CloudMessageStoreClientImpl.java")).t("Obtained cmsTimestampObject with timestamp: %s", eykm.i(e2));
                return e2;
            }
        }, this.h).f(fedn.class, new tjn(this), this.h);
    }

    @Override // defpackage.crty
    public final elfl m(final String str) {
        return i(new Function() { // from class: tko
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                etau etauVar = (etau) obj;
                tlv.aa("getConversation", etauVar.d);
                eszm Y = tlv.this.Y();
                esxr esxrVar = (esxr) esxs.a.createBuilder();
                esxrVar.copyOnWrite();
                esxs esxsVar = (esxs) esxrVar.instance;
                etauVar.getClass();
                esxsVar.c = etauVar;
                esxsVar.b |= 1;
                esxrVar.copyOnWrite();
                esxs esxsVar2 = (esxs) esxrVar.instance;
                String str2 = str;
                str2.getClass();
                esxsVar2.d = str2;
                esxs esxsVar3 = (esxs) esxrVar.build();
                fdxk fdxkVar = Y.a;
                febs febsVar = eszn.h;
                if (febsVar == null) {
                    synchronized (eszn.class) {
                        febsVar = eszn.h;
                        if (febsVar == null) {
                            febp a2 = febs.a();
                            a2.c = febr.UNARY;
                            a2.d = febs.c("google.communications.jibemessagestore.v1.MessageStore", "GetConversation");
                            a2.b();
                            esxs esxsVar4 = esxs.a;
                            eyfc eyfcVar = ffag.a;
                            a2.a = new ffae(esxsVar4);
                            a2.b = new ffae(eswr.a);
                            febsVar = a2.a();
                            eszn.h = febsVar;
                        }
                    }
                }
                return ffat.a(fdxkVar.a(febsVar, Y.b), esxsVar3);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.crty
    public final elfl n(final String str) {
        return i(new Function() { // from class: tlu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                etau etauVar = (etau) obj;
                tlv.aa("getConversationByCorrelationId", etauVar.d);
                eszm Y = tlv.this.Y();
                esxp esxpVar = (esxp) esxq.a.createBuilder();
                esxpVar.copyOnWrite();
                esxq esxqVar = (esxq) esxpVar.instance;
                etauVar.getClass();
                esxqVar.c = etauVar;
                esxqVar.b |= 1;
                esxpVar.copyOnWrite();
                esxq esxqVar2 = (esxq) esxpVar.instance;
                String str2 = str;
                str2.getClass();
                esxqVar2.d = str2;
                esxq esxqVar3 = (esxq) esxpVar.build();
                fdxk fdxkVar = Y.a;
                febs febsVar = eszn.l;
                if (febsVar == null) {
                    synchronized (eszn.class) {
                        febsVar = eszn.l;
                        if (febsVar == null) {
                            febp a2 = febs.a();
                            a2.c = febr.UNARY;
                            a2.d = febs.c("google.communications.jibemessagestore.v1.MessageStore", "GetConversationByCorrelationId");
                            a2.b();
                            esxq esxqVar4 = esxq.a;
                            eyfc eyfcVar = ffag.a;
                            a2.a = new ffae(esxqVar4);
                            a2.b = new ffae(eswr.a);
                            febsVar = a2.a();
                            eszn.l = febsVar;
                        }
                    }
                }
                return ffat.a(fdxkVar.a(febsVar, Y.b), esxqVar3);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.crty
    public final elfl o() {
        return i(new Function() { // from class: tli
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                etau etauVar = (etau) obj;
                tlv.aa("listConversations", etauVar.d);
                esyn esynVar = (esyn) esyo.a.createBuilder();
                esynVar.copyOnWrite();
                esyo esyoVar = (esyo) esynVar.instance;
                etauVar.getClass();
                esyoVar.c = etauVar;
                esyoVar.b |= 1;
                esynVar.copyOnWrite();
                ((esyo) esynVar.instance).i = 0;
                return tlv.this.C((esyo) esynVar.build()).h(new emwl() { // from class: tjg
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        int i = ((csdq) obj2).c;
                        entd entdVar = tlv.a;
                        return Integer.valueOf(i);
                    }
                }, erpp.a);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.crty
    public final elfl p() {
        return i(new Function() { // from class: tjw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                etau etauVar = (etau) obj;
                tlv.aa("listObjects", etauVar.d);
                esyv esyvVar = (esyv) esyw.a.createBuilder();
                esyvVar.copyOnWrite();
                esyw esywVar = (esyw) esyvVar.instance;
                etauVar.getClass();
                esywVar.c = etauVar;
                esywVar.b |= 1;
                esyvVar.copyOnWrite();
                ((esyw) esyvVar.instance).d = "inbox";
                esyvVar.copyOnWrite();
                ((esyw) esyvVar.instance).f = 0;
                return tlv.this.L((esyw) esyvVar.build()).h(new emwl() { // from class: tju
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        int i = ((csdq) obj2).c;
                        entd entdVar = tlv.a;
                        return Integer.valueOf(i);
                    }
                }, erpp.a);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.crty
    public final elfl q(final String str) {
        return i(new Function() { // from class: tlq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                etau etauVar = (etau) obj;
                tlv.aa("getObject", etauVar.d);
                eszm Y = tlv.this.Y();
                esxv esxvVar = (esxv) esxw.a.createBuilder();
                esxvVar.copyOnWrite();
                esxw esxwVar = (esxw) esxvVar.instance;
                etauVar.getClass();
                esxwVar.c = etauVar;
                esxwVar.b |= 1;
                esxvVar.copyOnWrite();
                esxw esxwVar2 = (esxw) esxvVar.instance;
                String str2 = str;
                str2.getClass();
                esxwVar2.d = str2;
                esxw esxwVar3 = (esxw) esxvVar.build();
                fdxk fdxkVar = Y.a;
                febs febsVar = eszn.b;
                if (febsVar == null) {
                    synchronized (eszn.class) {
                        febsVar = eszn.b;
                        if (febsVar == null) {
                            febp a2 = febs.a();
                            a2.c = febr.UNARY;
                            a2.d = febs.c("google.communications.jibemessagestore.v1.MessageStore", "GetObject");
                            a2.b();
                            esxw esxwVar4 = esxw.a;
                            eyfc eyfcVar = ffag.a;
                            a2.a = new ffae(esxwVar4);
                            a2.b = new ffae(eszz.a);
                            febsVar = a2.a();
                            eszn.b = febsVar;
                        }
                    }
                }
                return ffat.a(fdxkVar.a(febsVar, Y.b), esxwVar3);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.crty
    public final elfl r(final String str) {
        return i(new Function() { // from class: tjy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                etau etauVar = (etau) obj;
                tlv.aa("getObjectByCorrelationId", etauVar.d);
                eszm Y = tlv.this.Y();
                esxt esxtVar = (esxt) esxu.a.createBuilder();
                esxtVar.copyOnWrite();
                esxu esxuVar = (esxu) esxtVar.instance;
                etauVar.getClass();
                esxuVar.c = etauVar;
                esxuVar.b |= 1;
                esxtVar.copyOnWrite();
                ((esxu) esxtVar.instance).d = str;
                return Y.c((esxu) esxtVar.build());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.crty
    public final elfl s(String str) {
        etau d2 = this.f.d();
        aa("getObjectByCorrelationIdAcrossDevices", d2.d);
        eszm Y = Y();
        esxt esxtVar = (esxt) esxu.a.createBuilder();
        esxtVar.copyOnWrite();
        esxu esxuVar = (esxu) esxtVar.instance;
        d2.getClass();
        esxuVar.c = d2;
        esxuVar.b |= 1;
        esxtVar.copyOnWrite();
        ((esxu) esxtVar.instance).d = str;
        return elfl.g(Y.c((esxu) esxtVar.build()));
    }

    @Override // defpackage.crty
    public final elfl t(final String str) {
        return i(new Function() { // from class: tkc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                etau etauVar = (etau) obj;
                tlv.aa("getParticipants", etauVar.d);
                eszm Y = tlv.this.Y();
                esxx esxxVar = (esxx) esxy.a.createBuilder();
                esxxVar.copyOnWrite();
                esxy esxyVar = (esxy) esxxVar.instance;
                etauVar.getClass();
                esxyVar.c = etauVar;
                esxyVar.b |= 1;
                esxxVar.copyOnWrite();
                esxy esxyVar2 = (esxy) esxxVar.instance;
                String str2 = str;
                str2.getClass();
                esxyVar2.d = str2;
                esxy esxyVar3 = (esxy) esxxVar.build();
                fdxk fdxkVar = Y.a;
                febs febsVar = eszn.w;
                if (febsVar == null) {
                    synchronized (eszn.class) {
                        febsVar = eszn.w;
                        if (febsVar == null) {
                            febp a2 = febs.a();
                            a2.c = febr.UNARY;
                            a2.d = febs.c("google.communications.jibemessagestore.v1.MessageStore", "GetParticipant");
                            a2.b();
                            esxy esxyVar4 = esxy.a;
                            eyfc eyfcVar = ffag.a;
                            a2.a = new ffae(esxyVar4);
                            a2.b = new ffae(etah.a);
                            febsVar = a2.a();
                            eszn.w = febsVar;
                        }
                    }
                }
                return ffat.a(fdxkVar.a(febsVar, Y.b), esxyVar3);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.crty
    public final elfl u() {
        return i(new Function() { // from class: tjq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                etau etauVar = (etau) obj;
                tlv.aa("listParticipants", etauVar.d);
                esyz esyzVar = (esyz) esza.a.createBuilder();
                esyzVar.copyOnWrite();
                esza eszaVar = (esza) esyzVar.instance;
                etauVar.getClass();
                eszaVar.c = etauVar;
                eszaVar.b |= 1;
                esyzVar.copyOnWrite();
                ((esza) esyzVar.instance).i = 0;
                return tlv.this.O((esza) esyzVar.build()).h(new emwl() { // from class: tkr
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        int i = ((csdq) obj2).c;
                        entd entdVar = tlv.a;
                        return Integer.valueOf(i);
                    }
                }, erpp.a);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.crty
    public final elfl v() {
        etau d2 = this.f.d();
        aa("listBoxEvents", d2.d);
        eszm Y = Y();
        esyf esyfVar = (esyf) esyg.a.createBuilder();
        esyfVar.copyOnWrite();
        esyg esygVar = (esyg) esyfVar.instance;
        d2.getClass();
        esygVar.c = d2;
        esygVar.b |= 1;
        esyfVar.copyOnWrite();
        esyg esygVar2 = (esyg) esyfVar.instance;
        eygi eygiVar = esygVar2.d;
        if (!eygiVar.c()) {
            esygVar2.d = eyfy.mutableCopy(eygiVar);
        }
        esygVar2.d.h(6);
        esyfVar.copyOnWrite();
        ((esyg) esyfVar.instance).e = 1;
        esyg esygVar3 = (esyg) esyfVar.build();
        fdxk fdxkVar = Y.a;
        febs febsVar = eszn.r;
        if (febsVar == null) {
            synchronized (eszn.class) {
                febsVar = eszn.r;
                if (febsVar == null) {
                    febp a2 = febs.a();
                    a2.c = febr.UNARY;
                    a2.d = febs.c("google.communications.jibemessagestore.v1.MessageStore", "ListBoxEvents");
                    a2.b();
                    esyg esygVar4 = esyg.a;
                    eyfc eyfcVar = ffag.a;
                    a2.a = new ffae(esygVar4);
                    a2.b = new ffae(esyi.a);
                    febsVar = a2.a();
                    eszn.r = febsVar;
                }
            }
        }
        return elfl.g(ffat.a(fdxkVar.a(febsVar, Y.b), esygVar3)).h(new emwl() { // from class: tji
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                entd entdVar = tlv.a;
                return Collection.EL.stream(((esyi) obj).b).findFirst().map(new Function() { // from class: tki
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        eyja eyjaVar = ((eswb) obj2).b;
                        return eyjaVar == null ? eyja.a : eyjaVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }
        }, erpp.a);
    }

    @Override // defpackage.crty
    public final elfl w() {
        etau d2 = this.f.d();
        aa("listObjects", d2.d);
        esyv esyvVar = (esyv) esyw.a.createBuilder();
        esyvVar.copyOnWrite();
        esyw esywVar = (esyw) esyvVar.instance;
        d2.getClass();
        esywVar.c = d2;
        esywVar.b |= 1;
        esyvVar.copyOnWrite();
        ((esyw) esyvVar.instance).d = "root";
        esyvVar.a("encrypted_backup_key");
        return elfl.g(Y().e((esyw) esyvVar.build())).h(new emwl() { // from class: tlh
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                entd entdVar = tlv.a;
                return Boolean.valueOf(((esyy) obj).b.size() > 0);
            }
        }, erpp.a);
    }

    @Override // defpackage.crty
    public final elfl x() {
        etau d2 = this.f.d();
        aa("listObjects", d2.d);
        esyv esyvVar = (esyv) esyw.a.createBuilder();
        esyvVar.copyOnWrite();
        esyw esywVar = (esyw) esyvVar.instance;
        d2.getClass();
        esywVar.c = d2;
        esywVar.b |= 1;
        esyvVar.copyOnWrite();
        ((esyw) esyvVar.instance).d = "root";
        esyvVar.a("backup_key");
        return elfl.g(Y().e((esyw) esyvVar.build())).h(new emwl() { // from class: tkz
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                entd entdVar = tlv.a;
                return Boolean.valueOf(((esyy) obj).b.size() > 0);
            }
        }, erpp.a);
    }

    @Override // defpackage.crty
    public final elfl y() {
        final ArrayList arrayList = new ArrayList();
        arrayList.add("backup_key");
        if (csgj.a()) {
            arrayList.add("encrypted_backup_key");
        }
        return i(new Function() { // from class: tln
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                etau etauVar = (etau) obj;
                tlv.aa("listObjects", etauVar.d);
                esyv esyvVar = (esyv) esyw.a.createBuilder();
                esyvVar.copyOnWrite();
                esyw esywVar = (esyw) esyvVar.instance;
                etauVar.getClass();
                esywVar.c = etauVar;
                esywVar.b |= 1;
                esyvVar.copyOnWrite();
                ((esyw) esyvVar.instance).d = "root";
                esyvVar.copyOnWrite();
                esyw esywVar2 = (esyw) esyvVar.instance;
                esywVar2.a();
                eydl.addAll(arrayList, esywVar2.e);
                return tlv.this.L((esyw) esyvVar.build());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.crty
    public final elfl z(String str) {
        return A(str, ((Boolean) ((cfup) csgj.U.get()).e()).booleanValue());
    }
}
