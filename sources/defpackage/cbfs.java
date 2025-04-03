package defpackage;

import android.content.Context;
import android.provider.ContactsContract;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbfs {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/participantrefresh/ParticipantRefresh");
    static final cfup b = cfvl.i(cfvl.b, "disable_logging_participant_refresh", false);
    static final ecda c = new ecda("ParticipantRefreshFromContactsLatency");
    public static final cskc d = cskc.g("BugleDataModel", "ParticipantRefresh");
    public static final bvvl e;
    private final Context A;
    private final ffbr B;
    private final ffbr C;
    private final ffbr D;
    private final ffbr E;
    public final ffbr f;
    public final ffbr g;
    public final dtuu h;
    public final ffbr i;
    public final ffbr j;
    public final ffbr k;
    public final ffbr l;
    public final ffbr m;
    public final ffbr n;
    public final ffbr o;
    public final ffbr p;
    public final ffbr q;
    public final ffbr r;
    public final ffbr s;
    public final ffbr t;
    public final ffbr u;
    public final ffbr v;
    public final ffbr w;
    public final errl x;
    private final ffbr y;
    private final cbfr z;

    static {
        cfvl.i(cfvl.b, "enable_overriding_normalized_destination_only_with_valid_destination", true);
        bvvn e2 = ParticipantsTable.e();
        e2.z("SELF_PARTICIPANTS_WITH_INVALID_SIM_SLOT_ID_QUERY");
        e2.c(ParticipantsTable.c.a);
        e2.h(new Function() { // from class: cbfe
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvvw bvvwVar = (bvvw) obj;
                enru enruVar = cbfs.a;
                bvvwVar.v(-1);
                bvvwVar.y();
                return bvvwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        e = e2.b();
    }

    public cbfs(ffbr ffbrVar, cbfr cbfrVar, ffbr ffbrVar2, Context context, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, dtuu dtuuVar, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, ffbr ffbrVar14, ffbr ffbrVar15, ffbr ffbrVar16, ffbr ffbrVar17, ffbr ffbrVar18, ffbr ffbrVar19, ffbr ffbrVar20, ffbr ffbrVar21, errl errlVar, ffbr ffbrVar22) {
        this.y = ffbrVar;
        this.z = cbfrVar;
        this.f = ffbrVar2;
        this.A = context;
        this.B = ffbrVar3;
        this.C = ffbrVar4;
        this.g = ffbrVar5;
        this.h = dtuuVar;
        this.i = ffbrVar6;
        this.j = ffbrVar8;
        this.k = ffbrVar7;
        this.l = ffbrVar9;
        this.m = ffbrVar10;
        this.n = ffbrVar11;
        this.o = ffbrVar12;
        this.p = ffbrVar13;
        this.q = ffbrVar14;
        this.r = ffbrVar15;
        this.s = ffbrVar16;
        this.t = ffbrVar17;
        this.u = ffbrVar18;
        this.v = ffbrVar19;
        this.w = ffbrVar20;
        this.D = ffbrVar21;
        this.x = errlVar;
        this.E = ffbrVar22;
    }

    final void a() {
        cbfr cbfrVar = this.z;
        if (cbfrVar.c.compareAndSet(false, true)) {
            d.p("ContactContentObserver initialize");
            cbfrVar.a.getContentResolver().registerContentObserver(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, true, cbfrVar);
            cbfrVar.b.set(true);
        }
    }

    public final void b(final ParticipantsTable.BindData bindData) {
        final bvvr f = ParticipantsTable.f();
        f.ap("ParticipantRefresh#updateParticipant");
        f.H(bindData.U());
        f.n(bindData.u());
        f.C(bindData.T());
        f.v(bindData.R());
        f.t(bindData.Q());
        f.M(bindData.x());
        f.j(bdqo.a(bindData).b);
        f.s(bdqo.a(bindData).c);
        f.I(bindData.o());
        f.l(bindData.N());
        f.O(bindData.W());
        f.S(bindData.X());
        f.q(bindData.v());
        f.G(bindData.y());
        f.J(bindData.G());
        f.F(bindData.F());
        if (bdtd.m(bindData)) {
            f.r(bindData.P());
        }
        final String S = bindData.S();
        if (S != null) {
            this.h.d("ParticipantRefresh#updateParticipant", new Runnable() { // from class: cbff
                @Override // java.lang.Runnable
                public final void run() {
                    int size;
                    boolean booleanValue = ((Boolean) ((cfup) bdrs.b.get()).e()).booleanValue();
                    cbfs cbfsVar = cbfs.this;
                    bvvr bvvrVar = f;
                    final String str = S;
                    if (booleanValue) {
                        bdsp bdspVar = bdtd.m(bindData) ? bdsp.h : bdsp.i;
                        bdrv bdrvVar = (bdrv) cbfsVar.o.b();
                        bvvrVar.V(new Function() { // from class: cbfo
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                bvvw bvvwVar = (bvvw) obj;
                                enru enruVar = cbfs.a;
                                bvvwVar.k(str);
                                return bvvwVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        bvvrVar.am();
                        size = bdrvVar.b(bvvrVar, bdspVar);
                    } else if (((Boolean) ((cfup) bdrs.a.get()).e()).booleanValue()) {
                        bdrv bdrvVar2 = (bdrv) cbfsVar.o.b();
                        bvvrVar.V(new Function() { // from class: cbfp
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                bvvw bvvwVar = (bvvw) obj;
                                enru enruVar = cbfs.a;
                                bvvwVar.k(str);
                                return bvvwVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        bvvrVar.am();
                        size = bdrvVar2.a(bvvrVar.b());
                    } else {
                        bvvrVar.V(new Function() { // from class: cbfq
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                bvvw bvvwVar = (bvvw) obj;
                                enru enruVar = cbfs.a;
                                bvvwVar.k(str);
                                return bvvwVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        bvvrVar.am();
                        size = bvvrVar.b().a().size();
                    }
                    String concat = size == 0 ? "No update made to participant: ".concat(str) : "Successfully updated participant: ".concat(str);
                    if (size != 1) {
                        cbfs.d.p(concat);
                        ((bdsy) cbfsVar.i.b()).a(4, 3);
                    } else {
                        cbfs.d.q(concat);
                        ((bdsy) cbfsVar.i.b()).a(4, 2);
                    }
                }
            });
        }
    }

    final boolean c() {
        return ((ctud) this.C.b()).i() && ((ctud) this.C.b()).l();
    }

    public final boolean d(bvpo bvpoVar) {
        int i;
        boolean z;
        ekzz f = eleg.f("ParticipantRefresh.refreshParticipant");
        try {
            if (!bvpoVar.F.a()) {
                if (bdtd.n(bvpoVar)) {
                    i = ((bdtd) this.g.b()).b(bvpoVar);
                    z = i == 2;
                } else {
                    i = 0;
                }
                z = 1 == ((f(bvpoVar, true != bdtd.n(bvpoVar) ? 7 : 6) ? 1 : 0) | i);
                f.close();
                return z;
            }
            csjb c2 = d.c();
            c2.I("Not overwriting data of vSms participant from contacts");
            c2.k(bvpoVar.f);
            c2.r();
            f.close();
            return z;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean e(ConversationIdType conversationIdType, SelfIdentityId selfIdentityId) {
        boolean al = ((bczy) this.y.b()).al(conversationIdType, selfIdentityId);
        if (al) {
            ((cbgf) this.B.b()).d(conversationIdType);
        }
        ayfe.a(this.A, conversationIdType, selfIdentityId);
        return al;
    }

    public final boolean f(final bvpo bvpoVar, final int i) {
        Object obj;
        alse alseVar = (alse) this.E.b();
        ecda ecdaVar = c;
        Supplier supplier = new Supplier() { // from class: cbex
            /* JADX WARN: Removed duplicated region for block: B:16:0x019c  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x014f  */
            @Override // java.util.function.Supplier
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object get() {
                /*
                    Method dump skipped, instructions count: 868
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cbex.get():java.lang.Object");
            }
        };
        ecri d2 = alseVar.a.d();
        ecrh ecrhVar = ecrh.SUCCESS;
        try {
            try {
                obj = supplier.get();
                alseVar.a.f(d2, ecdaVar, null, ecrhVar);
                return ((Boolean) obj).booleanValue();
            } catch (RuntimeException e2) {
                ecrhVar = ecrh.ERROR;
                throw e2;
            }
        } catch (Throwable th) {
            alseVar.a.f(d2, ecdaVar, null, ecrhVar);
            throw th;
        }
    }
}
