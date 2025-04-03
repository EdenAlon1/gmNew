package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cycj implements cybz {
    public final ejvp b;
    public final ffbr c;
    public final ffbr d;
    public final bctx e;
    public final altk f;
    public final errl g;
    public final ctas h;
    public final Long i;
    public final int j;
    public bvvl k;
    public blxu l;
    public final AtomicBoolean m = new AtomicBoolean(true);
    private final ejvb o;
    private final cuye p;
    private dtrs q;
    private dtrs r;
    private static final cskc n = cskc.g("Bugle", "AddContactBanner2o");
    public static final enru a = enru.c("com/google/android/apps/messaging/ui/conversation/banners2o/addcontact/dataservice/AddContactBannerDataServiceImpl");

    public cycj(ejvb ejvbVar, ejvp ejvpVar, ffbr ffbrVar, ffbr ffbrVar2, bctx bctxVar, cuye cuyeVar, altk altkVar, ctas ctasVar, errl errlVar, Long l, Long l2) {
        this.o = ejvbVar;
        this.b = ejvpVar;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = bctxVar;
        this.p = cuyeVar;
        this.f = altkVar;
        this.g = errlVar;
        this.h = ctasVar;
        this.i = l;
        this.j = l2.intValue();
    }

    public static final boolean d(ParticipantsTable.BindData bindData) {
        if (bindData == null) {
            return false;
        }
        String U = bindData.U();
        return !aoqw.j(U) || aoqw.h(U);
    }

    private static boolean e(bduq bduqVar) {
        return bduqVar != null && bduqVar.b().isPresent();
    }

    private final boolean f(ParticipantsTable.BindData bindData) {
        return bindData.D().a() && this.p.c();
    }

    @Override // defpackage.cybz
    public final ejuh a(lkk lkkVar, final ConversationIdType conversationIdType) {
        bvvl bvvlVar = this.k;
        if (bvvlVar != null) {
            bvvlVar.P(this.q);
        }
        this.k = bcui.e(conversationIdType);
        cych cychVar = new cych(this, conversationIdType);
        this.q = cychVar;
        this.k.M(lkkVar, cychVar);
        blxu blxuVar = this.l;
        if (blxuVar != null) {
            blxuVar.P(this.r);
        }
        blxv a2 = blxy.a();
        a2.z("createMessageAnnotationQuery");
        a2.c(new Function() { // from class: cycg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                blxx blxxVar = (blxx) obj;
                blxxVar.b(ConversationIdType.this);
                return blxxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        this.l = a2.b();
        cyci cyciVar = new cyci(this, conversationIdType);
        this.r = cyciVar;
        this.l.M(lkkVar, cyciVar);
        return new ejuy(this.o, new eros() { // from class: cycf
            @Override // defpackage.eros
            public final erph a(erpc erpcVar) {
                final cycj cycjVar = cycj.this;
                final bvvl bvvlVar2 = cycjVar.k;
                final blxu blxuVar2 = cycjVar.l;
                final elfl g = elfo.g(new Callable() { // from class: cycb
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return cycj.this.e.a(bvvlVar2.y());
                    }
                }, cycjVar.g);
                final elfl g2 = elfo.g(new Callable() { // from class: cycc
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        blxt blxtVar = (blxt) blxu.this.o();
                        try {
                            bduq bduqVar = new bduq();
                            bduqVar.d(bttf.a(blxtVar).cW());
                            blxtVar.close();
                            return bduqVar;
                        } catch (Throwable th) {
                            try {
                                blxtVar.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                }, cycjVar.g);
                final ConversationIdType conversationIdType2 = conversationIdType;
                final elfl g3 = elfo.g(new Callable() { // from class: cyca
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        boolean z;
                        int intValue = ((Integer) cybw.a.e()).intValue();
                        cycj cycjVar2 = cycj.this;
                        ConversationIdType conversationIdType3 = conversationIdType2;
                        if (intValue > 0) {
                            int a3 = ((cycm) cycjVar2.d.b()).a(conversationIdType3);
                            if (cycjVar2.m.compareAndSet(true, false) && a3 == intValue + 1 && cybw.a()) {
                                cycjVar2.f.aw(3);
                            }
                            if (a3 > intValue) {
                                z = true;
                                MessageCoreData i = ((bdmq) cycjVar2.c.b()).i(conversationIdType3);
                                boolean z2 = i == null && i.cI();
                                ensk h = cycj.a.h();
                                h.Y(ente.a, "BugleBanners");
                                enrr enrrVar = (enrr) h;
                                enrrVar.Y(cybx.h, Boolean.valueOf(z));
                                enrrVar.Y(cybx.i, Boolean.valueOf(z2));
                                ((enrr) enrrVar.h("com/google/android/apps/messaging/ui/conversation/banners2o/addcontact/dataservice/AddContactBannerDataServiceImpl", "isNotDismissedAndFirstIncoming", 342, "AddContactBannerDataServiceImpl.java")).q("Check add contact banner is dismissed and first incoming");
                                return Boolean.valueOf(z && z2);
                            }
                        }
                        z = false;
                        MessageCoreData i2 = ((bdmq) cycjVar2.c.b()).i(conversationIdType3);
                        if (i2 == null) {
                        }
                        ensk h2 = cycj.a.h();
                        h2.Y(ente.a, "BugleBanners");
                        enrr enrrVar2 = (enrr) h2;
                        enrrVar2.Y(cybx.h, Boolean.valueOf(z));
                        enrrVar2.Y(cybx.i, Boolean.valueOf(z2));
                        ((enrr) enrrVar2.h("com/google/android/apps/messaging/ui/conversation/banners2o/addcontact/dataservice/AddContactBannerDataServiceImpl", "isNotDismissedAndFirstIncoming", 342, "AddContactBannerDataServiceImpl.java")).q("Check add contact banner is dismissed and first incoming");
                        return Boolean.valueOf(z && z2);
                    }
                }, cycjVar.g);
                elfl e = elfo.e(false);
                final elfl h = g.h(new emwl() { // from class: cycd
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        ParticipantsTable.BindData a3 = ((bctw) obj).a();
                        if (a3 == null || a3.x() == null) {
                            return null;
                        }
                        cycj cycjVar2 = cycj.this;
                        Uri x = a3.x();
                        ctas ctasVar = cycjVar2.h;
                        int i = cycjVar2.j;
                        return ctasVar.b(x, i, i, cycjVar2.i.longValue());
                    }
                }, cycjVar.g);
                return new erph(elfo.k(g, g2, g3, e, h).a(new Callable() { // from class: cyce
                    /* JADX WARN: Code restructure failed: missing block: B:11:0x005b, code lost:
                    
                        if (defpackage.cycj.d(r0) != false) goto L16;
                     */
                    @Override // java.util.concurrent.Callable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object call() {
                        /*
                            r10 = this;
                            elfl r0 = r2
                            java.lang.Object r1 = defpackage.erqt.q(r0)
                            bctw r1 = (defpackage.bctw) r1
                            java.lang.Object r2 = defpackage.erqt.q(r0)
                            bctw r2 = (defpackage.bctw) r2
                            elfl r3 = r3
                            java.lang.Object r4 = defpackage.erqt.q(r3)
                            bduq r4 = (defpackage.bduq) r4
                            elfl r5 = r4
                            java.lang.Object r6 = defpackage.erqt.q(r5)
                            java.lang.Boolean r6 = (java.lang.Boolean) r6
                            boolean r6 = r6.booleanValue()
                            cycj r7 = defpackage.cycj.this
                            r8 = 1
                            r9 = 0
                            if (r6 == 0) goto L34
                            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r2 = r2.a()
                            boolean r2 = r7.c(r2, r4)
                            if (r2 == 0) goto L34
                            r2 = r8
                            goto L35
                        L34:
                            r2 = r9
                        L35:
                            java.lang.Object r0 = defpackage.erqt.q(r0)
                            bctw r0 = (defpackage.bctw) r0
                            java.lang.Object r3 = defpackage.erqt.q(r3)
                            bduq r3 = (defpackage.bduq) r3
                            java.lang.Object r4 = defpackage.erqt.q(r5)
                            java.lang.Boolean r4 = (java.lang.Boolean) r4
                            boolean r4 = r4.booleanValue()
                            if (r4 == 0) goto L5e
                            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r0 = r0.a()
                            boolean r3 = r7.c(r0, r3)
                            if (r3 == 0) goto L5e
                            boolean r0 = defpackage.cycj.d(r0)
                            if (r0 == 0) goto L5e
                            goto L5f
                        L5e:
                            r8 = r9
                        L5f:
                            elfl r0 = r5
                            java.lang.Object r0 = defpackage.erqt.q(r0)
                            byte[] r0 = (byte[]) r0
                            cycn r3 = new cycn
                            r3.<init>(r1, r2, r8, r0)
                            return r3
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyce.call():java.lang.Object");
                    }
                }, erpp.a));
            }
        }, "ADD_CONTACT_BANNER_STATE_KEY".concat(conversationIdType.toString()));
    }

    @Override // defpackage.cybz
    public final void b(final ConversationIdType conversationIdType) {
        final cycm cycmVar = (cycm) this.d.b();
        ekzz f = eleg.f("AddContactBanner2DatabaseOperationsImpl#dismissAddContactBanner");
        try {
            axnw.h(elfo.g(new Callable() { // from class: cyck
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    bczy bczyVar = (bczy) cycm.this.a.b();
                    String[] strArr = bsom.a;
                    bsoe bsoeVar = new bsoe();
                    bsoeVar.ap("setConversationOpenCount");
                    bsoeVar.E(((Integer) cybw.a.e()).intValue() + 2);
                    return Boolean.valueOf(bczyVar.ak(conversationIdType, bsoeVar));
                }
            }, cycmVar.b));
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean c(ParticipantsTable.BindData bindData, bduq bduqVar) {
        if (bindData != null && TextUtils.isEmpty(bindData.U())) {
            n.r("AddContactBannerDataServiceImpl#isParticipantValidForAddContact: 1:1 conversation, but otherParticipant's normalizedDestination is empty. Without this, we can't correctly add the destination as a contact, nor report it as spam.");
            return false;
        }
        if (bindData == null) {
            ensk h = a.h();
            h.Y(ente.a, "BugleBanners");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/ui/conversation/banners2o/addcontact/dataservice/AddContactBannerDataServiceImpl", "isParticipantValidForBanner", 276, "AddContactBannerDataServiceImpl.java")).q("Invalid participant for add contact, group conversation");
            return false;
        }
        ensk h2 = a.h();
        h2.Y(ente.a, "BugleBanners");
        enrr enrrVar = (enrr) h2;
        enrrVar.Y(cybx.a, Boolean.valueOf(bindData.ab()));
        enrrVar.Y(cybx.b, Boolean.valueOf(bindData.Y()));
        enrrVar.Y(cybx.d, Boolean.valueOf(!TextUtils.isEmpty(bindData.T())));
        enrrVar.Y(cybx.c, Boolean.valueOf(e(bduqVar)));
        enrrVar.Y(cybx.e, Boolean.valueOf(!d(bindData)));
        enrrVar.Y(cybx.f, Boolean.valueOf(f(bindData)));
        enrrVar.Y(cybx.g, Boolean.valueOf(bindData.o() == 1));
        ((enrr) enrrVar.h("com/google/android/apps/messaging/ui/conversation/banners2o/addcontact/dataservice/AddContactBannerDataServiceImpl", "isParticipantValidForBanner", 291, "AddContactBannerDataServiceImpl.java")).q("Check add contact banner is participant valid for add contact banner");
        return (bindData.o() == 1 || f(bindData) || (!aewg.j() && !d(bindData)) || !TextUtils.isEmpty(bindData.T()) || e(bduqVar) || bindData.Y() || bindData.ab()) ? false : true;
    }
}
