package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cygi implements cyfy {
    static final cfva a = cfvl.f(cfvl.b, "nudge_dismiss_delay", TimeUnit.SECONDS.toMillis(1));
    public static final /* synthetic */ int j = 0;
    public final ejvp b;
    public final errl c;
    public final errm d;
    public final ffbr e;
    public final ffbr f;
    public final cjdi g;
    public buxm h;
    public btvr i;
    private final ejvb k;
    private dtrs l;
    private dtrs m;

    public cygi(ejvb ejvbVar, ejvp ejvpVar, errl errlVar, errm errmVar, ffbr ffbrVar, ffbr ffbrVar2, cjdi cjdiVar) {
        this.k = ejvbVar;
        this.b = ejvpVar;
        this.c = errlVar;
        this.d = errmVar;
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.g = cjdiVar;
    }

    @Override // defpackage.cyfy
    public final ejuh a(lkk lkkVar, final ConversationIdType conversationIdType) {
        buxm b = ctrt.a(conversationIdType).b();
        this.h = b;
        dtrs dtrsVar = this.l;
        if (dtrsVar != null) {
            b.P(dtrsVar);
        }
        cygg cyggVar = new cygg(this, conversationIdType);
        this.l = cyggVar;
        this.h.M(lkkVar, cyggVar);
        btvs a2 = btvy.a();
        a2.z("createNudgeClassificationsQuery");
        a2.c(new Function() { // from class: cyfz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                btvx btvxVar = (btvx) obj;
                int i = cygi.j;
                buxo a3 = ctrt.a(ConversationIdType.this);
                a3.f(new Function() { // from class: cygc
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        int i2 = cygi.j;
                        return ((buum) obj2).a;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                btvxVar.e(a3.b());
                return btvxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        a2.c(new Function() { // from class: cyga
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                btvx btvxVar = (btvx) obj;
                int i = cygi.j;
                btvxVar.b(fbrc.NUDGE_CLASSIFICATION);
                return btvxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        btvr b2 = a2.b();
        this.i = b2;
        dtrs dtrsVar2 = this.m;
        if (dtrsVar2 != null) {
            b2.P(dtrsVar2);
        }
        cygh cyghVar = new cygh(this, conversationIdType);
        this.m = cyghVar;
        this.i.M(lkkVar, cyghVar);
        return new ejuy(this.k, new eros() { // from class: cygb
            @Override // defpackage.eros
            public final erph a(erpc erpcVar) {
                final elfl e;
                final cygi cygiVar = cygi.this;
                if (ctjd.f() && ((Optional) cygiVar.f.b()).isPresent()) {
                    e = ((ctta) ((Optional) cygiVar.f.b()).get()).b();
                } else {
                    ctsw createBuilder = ctsx.a.createBuilder();
                    createBuilder.copyOnWrite();
                    ctsx ctsxVar = (ctsx) createBuilder.instance;
                    ctsxVar.b |= 1;
                    ctsxVar.c = false;
                    createBuilder.copyOnWrite();
                    ctsx.a((ctsx) createBuilder.instance);
                    e = elfo.e(createBuilder.build());
                }
                final elfl g = elfo.g(new Callable() { // from class: cygd
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        cygi cygiVar2 = cygi.this;
                        engw J = ((bdmq) cygiVar2.e.b()).J(cygiVar2.h);
                        if (J.size() == 1) {
                            return (MessageCoreData) J.get(0);
                        }
                        return null;
                    }
                }, cygiVar.c);
                final elfl g2 = elfo.g(new Callable() { // from class: cyge
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return (btus) ((btvh) cygi.this.i.o()).cS();
                    }
                }, cygiVar.c);
                return new erph(elfo.k(e, g, g2).a(new Callable() { // from class: cygf
                    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
                    
                        if (r4 != null) goto L20;
                     */
                    @Override // java.util.concurrent.Callable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object call() {
                        /*
                            r7 = this;
                            elfl r0 = r2
                            java.lang.Object r0 = defpackage.erqt.q(r0)
                            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r0 = (com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData) r0
                            r1 = 1
                            r2 = 0
                            if (r0 == 0) goto L14
                            boolean r3 = r0.cI()
                            if (r3 == 0) goto L14
                            r3 = r1
                            goto L15
                        L14:
                            r3 = r2
                        L15:
                            elfl r4 = r3
                            java.lang.Object r4 = defpackage.erqt.q(r4)
                            ctsx r4 = (defpackage.ctsx) r4
                            if (r3 == 0) goto L22
                            boolean r3 = r4.c
                            goto L24
                        L22:
                            boolean r3 = r4.d
                        L24:
                            elfl r4 = r4
                            java.lang.Object r4 = defpackage.erqt.q(r4)
                            btus r4 = (defpackage.btus) r4
                            if (r3 == 0) goto L41
                            if (r0 == 0) goto L41
                            cygi r3 = defpackage.cygi.this
                            long r5 = r0.o()
                            cjdi r3 = r3.g
                            boolean r3 = r3.a(r5)
                            if (r3 == 0) goto L41
                            if (r4 == 0) goto L41
                            goto L42
                        L41:
                            r1 = r2
                        L42:
                            if (r4 == 0) goto L49
                            fbwv r2 = r4.k()
                            goto L4a
                        L49:
                            r2 = 0
                        L4a:
                            cygj r3 = new cygj
                            r3.<init>(r1, r0, r2)
                            return r3
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.cygf.call():java.lang.Object");
                    }
                }, cygiVar.d));
            }
        }, "NUDGE_BANNER_STATE_KEY".concat(conversationIdType.toString()));
    }
}
