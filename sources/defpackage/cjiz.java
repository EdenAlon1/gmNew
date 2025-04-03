package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.time.Duration;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjiz implements cjie {
    public static final /* synthetic */ int e = 0;
    public final cbgf b;
    public final dtuu c;
    public final bdxd d;
    private final bbfo f;

    public cjiz(cbgf cbgfVar, dtuu dtuuVar, bbfo bbfoVar, bdxd bdxdVar) {
        cbgfVar.getClass();
        dtuuVar.getClass();
        bbfoVar.getClass();
        bdxdVar.getClass();
        this.b = cbgfVar;
        this.c = dtuuVar;
        this.f = bbfoVar;
        this.d = bdxdVar;
    }

    public static final void c(final List list) {
        String[] strArr = PartsTable.a;
        bwdi bwdiVar = new bwdi();
        bwdiVar.ap("updateGooglePhotosPartToSucceeded");
        bwdiVar.w(byzc.SUCCEEDED);
        bwdiVar.D(new Function() { // from class: cjin
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bwdm bwdmVar = (bwdm) obj;
                int i = cjiz.e;
                bwdmVar.p(list);
                bwdmVar.m(byza.GOOGLE_PHOTOS_LINK);
                return bwdmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bwdiVar.b().e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int d(List list, buby bubyVar, buxr buxrVar) {
        String[] strArr = bucb.a;
        buca bucaVar = new buca();
        engr engrVar = new engr();
        enqv it = ((engw) list).iterator();
        while (it.hasNext()) {
            engrVar.h(String.valueOf(bdhb.a((MessageIdType) it.next())));
        }
        bucaVar.aq(new dtrw("message_photos_sharing.message_id", 3, buca.at(engrVar.g()), true));
        bubyVar.af(new bubz(bucaVar));
        bubyVar.b().e();
        String[] strArr2 = MessagesTable.a;
        buxz buxzVar = new buxz();
        buxzVar.u(list);
        buxrVar.X(buxzVar);
        buxrVar.ak();
        return buxrVar.b().e();
    }

    public final Object a(ffgu ffguVar) {
        Object c = fgfz.c(this.f.b(6).t(), ffguVar);
        return c == ffhh.a ? c : ffcu.a;
    }

    public final void b(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final MessageIdType messageIdType = (MessageIdType) it.next();
            buxo d = MessagesTable.d();
            d.z("replaceGooglePhotosAttachmentsWithAlbumLinkTest-messages");
            d.h(new Function() { // from class: cjio
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar = (buxz) obj;
                    int i = cjiz.e;
                    buxzVar.q(MessageIdType.this);
                    return buxzVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            d.f(new Function() { // from class: cjip
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    int i = cjiz.e;
                    return ((buum) obj).b;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            engw f = d.b().f();
            f.getClass();
            final ConversationIdType conversationIdType = (ConversationIdType) ffdx.K(f);
            bwdf c = PartsTable.c();
            c.z("replaceGooglePhotosAttachmentsWithAlbumLinkTest-parts");
            c.h(new Function() { // from class: cjiq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bwdm bwdmVar = (bwdm) obj;
                    int i = cjiz.e;
                    bwdmVar.n(MessageIdType.this);
                    return bwdmVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            c.f(new Function() { // from class: cjir
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    int i = cjiz.e;
                    return ((bwat) obj).c;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bwav bwavVar = (bwav) c.b().p(PartsTable.d.c);
            try {
                engw l = bwavVar.l();
                bwavVar.close();
                l.getClass();
                String aA = ffdx.aA(l, "\n", null, null, null, 62);
                String w = ffpc.J(aA) ? str : a.w(str, aA, "\n");
                bwcy bwcyVar = new bwcy();
                bwcyVar.f("replaceGooglePhotosAttachmentsWithAlbumLinkTest");
                bwcyVar.a(new Function() { // from class: cjis
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bwdm bwdmVar = (bwdm) obj;
                        int i = cjiz.e;
                        bwdmVar.n(MessageIdType.this);
                        bwdmVar.b(new Function() { // from class: cjii
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                bwdm bwdmVar2 = (bwdm) obj2;
                                int i2 = cjiz.e;
                                bwdmVar2.m(byza.GOOGLE_PHOTOS_LINK);
                                return bwdmVar2;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Function() { // from class: cjij
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                bwdm bwdmVar2 = (bwdm) obj2;
                                int i2 = cjiz.e;
                                bwdmVar2.f("text/plain");
                                return bwdmVar2;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        return bwdmVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bwcyVar.d();
                bvwq bvwqVar = new bvwq();
                bvwqVar.t("text/plain");
                bvwqVar.Y(w);
                bvwqVar.J(messageIdType);
                bvwqVar.T(eohh.TEXT_PART.a());
                bvwqVar.u(conversationIdType);
                bvwqVar.d();
                this.c.g(new dtut() { // from class: cjig
                    @Override // defpackage.dtut
                    public final ekzz a() {
                        int i = cjiz.e;
                        return eleg.f("GPSSPI::requestLinkPreview::runAfterCommit");
                    }
                }, null, new Runnable() { // from class: cjih
                    @Override // java.lang.Runnable
                    public final void run() {
                        cfva cfvaVar = cjja.a;
                        Object e2 = cjja.f.e();
                        e2.getClass();
                        int intValue = ((Number) e2).intValue();
                        cerz cerzVar = (cerz) cesa.a.createBuilder();
                        MessageIdType messageIdType2 = messageIdType;
                        String b = messageIdType2.b();
                        cerzVar.copyOnWrite();
                        cesa cesaVar = (cesa) cerzVar.instance;
                        b.getClass();
                        cesaVar.b |= 1;
                        cesaVar.c = b;
                        cerzVar.copyOnWrite();
                        cesa cesaVar2 = (cesa) cerzVar.instance;
                        cesaVar2.d = 3;
                        cesaVar2.b |= 2;
                        cesa cesaVar3 = (cesa) cerzVar.build();
                        cetp cetpVar = new cetp();
                        cetpVar.c = Duration.ofMillis(intValue);
                        cfkl a = cetpVar.a();
                        cjiz cjizVar = cjiz.this;
                        ((cevh) cjizVar.d.a.a.b()).g(ceyr.h("request_link_preview", cesaVar3, a));
                        cjizVar.b.l(conversationIdType, messageIdType2, new String[0]);
                    }
                });
            } finally {
            }
        }
    }
}
