package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckpb extends ceut {
    public static final entd a;
    public static final enhk b;
    public final ckju c;
    public final dtuu d;
    private final errm e;
    private final errl f;

    static {
        cfvl.f(cfvl.b, "rcs_service_connection_wait_timeout_for_pwq", 3000L);
        a = entd.c("BugleGroupManagement");
        b = enhk.l(new Predicate() { // from class: ckoy
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
                return ((ckon) obj).b;
            }
        }, ckng.NAME_CHANGE);
    }

    public ckpb(errm errmVar, errl errlVar, ckju ckjuVar, dtuu dtuuVar) {
        this.e = errmVar;
        this.f = errlVar;
        this.c = ckjuVar;
        this.d = dtuuVar;
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("GroupSessionStartedHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return ckpd.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        final ckpd ckpdVar = (ckpd) eyhsVar;
        final long j = ckpdVar.c;
        return elfo.h(new erog() { // from class: ckot
            @Override // defpackage.erog
            public final ListenableFuture a() {
                entd entdVar = ckpb.a;
                return elfo.e(ckpd.this);
            }
        }, this.f).h(new emwl() { // from class: ckou
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ckpd ckpdVar2 = (ckpd) obj;
                if (ckpdVar2.d.isEmpty()) {
                    ((ensz) ((ensz) ckpb.a.j()).h("com/google/android/apps/messaging/shared/rcs/groups/invite/GroupSessionStartedHandler", "areValidGroupSessionStartedParameters", 186, "GroupSessionStartedHandler.java")).q("Invalid parameters. RCS group ID not set");
                } else {
                    if (!ckpdVar2.e.isEmpty()) {
                        long j2 = j;
                        ckpb ckpbVar = ckpb.this;
                        ckjy w = ckjz.w();
                        w.j(false);
                        w.q(true);
                        w.w(epby.GROUP_SESSION_STARTED_EVENT);
                        w.p(false);
                        w.z(j2);
                        w.u(ckpdVar2.d);
                        w.n(ckpdVar2.f);
                        final ConversationIdType a2 = ckpbVar.c.a(w.D());
                        if (a2.b()) {
                            ensz enszVar = (ensz) ckpb.a.i();
                            enszVar.Y(csux.J, ckpdVar2.d);
                            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/rcs/groups/invite/GroupSessionStartedHandler", "processPendingWorkItemAsync", 147, "GroupSessionStartedHandler.java")).q("Could not retrieve conversation. Skipping conference URI update.");
                            return ceyt.k();
                        }
                        ckpd ckpdVar3 = ckpdVar;
                        String str = ckpdVar2.e;
                        emxf.b(!TextUtils.isEmpty(str), "Calling updateConferenceUri with empty URI");
                        String[] strArr = bsom.a;
                        bsoe bsoeVar = new bsoe();
                        bsoeVar.ap("updateConferenceUri");
                        bsoeVar.ad(new Function() { // from class: ckoz
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                bsol bsolVar = (bsol) obj2;
                                entd entdVar = ckpb.a;
                                bsolVar.q(ConversationIdType.this);
                                return bsolVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        bsoeVar.N(str);
                        bsoeVar.b().e();
                        if ((ckpdVar3.b & 1) != 0) {
                            final ckon ckonVar = ckpdVar3.g;
                            if (ckonVar == null) {
                                ckonVar = ckon.a;
                            }
                            ckpbVar.d.d("GroupSessionStartedHandler#updateRcsGroupCapabilities", new Runnable() { // from class: ckpa
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean test;
                                    entd entdVar = ckpb.a;
                                    final ConversationIdType conversationIdType = ConversationIdType.this;
                                    bseh b2 = bsom.b(conversationIdType);
                                    if (b2 == null) {
                                        return;
                                    }
                                    cknf a3 = b2.K().a();
                                    enqu listIterator = ckpb.b.entrySet().listIterator();
                                    while (listIterator.hasNext()) {
                                        ckon ckonVar2 = ckonVar;
                                        Map.Entry entry = (Map.Entry) listIterator.next();
                                        test = afg$$ExternalSyntheticApiModelOutline0.m106m(entry.getKey()).test(ckonVar2);
                                        if (test) {
                                            a3.c((ckng) entry.getValue());
                                        } else {
                                            a3.b((ckng) entry.getValue());
                                        }
                                    }
                                    bsoe bsoeVar2 = new bsoe();
                                    bsoeVar2.ap("updateRcsGroupCapabilities");
                                    bsoeVar2.ad(new Function() { // from class: ckox
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj2) {
                                            bsol bsolVar = (bsol) obj2;
                                            entd entdVar2 = ckpb.a;
                                            bsolVar.q(ConversationIdType.this);
                                            return bsolVar;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    bsoeVar2.O(a3.a());
                                    bsoeVar2.b().e();
                                }
                            });
                        }
                        return ceyt.i();
                    }
                    ((ensz) ((ensz) ckpb.a.j()).h("com/google/android/apps/messaging/shared/rcs/groups/invite/GroupSessionStartedHandler", "areValidGroupSessionStartedParameters", 191, "GroupSessionStartedHandler.java")).q("Invalid parameters. RCS conference URI not set");
                }
                ensk n = ckpb.a.n();
                n.Y(csux.H, Long.valueOf(ckpdVar2.c));
                ((ensz) n.h("com/google/android/apps/messaging/shared/rcs/groups/invite/GroupSessionStartedHandler", "processPendingWorkItemAsync", 122, "GroupSessionStartedHandler.java")).q("Invalid GroupSessionStartedParameters. Ignoring incoming RCS group invitation. This is probably because this conversation is actually a one to one conversation and this handler is scheduled to support legacy CS.apk clients.");
                return ceyt.i();
            }
        }, this.e).f(TimeoutException.class, new eroh() { // from class: ckov
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                entd entdVar = ckpb.a;
                return elfo.e(ceyt.m());
            }
        }, this.f).f(ehxg.class, new eroh() { // from class: ckow
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                entd entdVar = ckpb.a;
                return elfo.e(ceyt.m());
            }
        }, this.f);
    }
}
