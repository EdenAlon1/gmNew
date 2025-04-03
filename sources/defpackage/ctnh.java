package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.apps.messaging.R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.learning.internal.training.IInAppTrainerCanceller;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctnh implements ctiu {
    public static final cfva a = cfvl.s(cfvl.b, "brella_trainer_configs", new emyl() { // from class: ctmz
        @Override // defpackage.emyl
        public final Object get() {
            cfva cfvaVar = ctnh.a;
            return crsw.a.toByteArray();
        }
    });
    public static final cskc b = cskc.g("Bugle", "P2pConversationTrainingUtils");
    public final errl c;
    public final crss e;
    public final ctmr f;
    private final ctyx g;
    private final Context h;
    private final cqoh i;
    private final ctzg j;
    private final emyl m;
    private final Object l = new Object();
    public final emyl d = emys.a(new emyl() { // from class: ctnb
        @Override // defpackage.emyl
        public final Object get() {
            cfva cfvaVar = ctnh.a;
            try {
                return (crsw) eyfy.parseFrom(crsw.a, (byte[]) ctnh.a.e(), eyfc.a());
            } catch (eygu e) {
                ctnh.b.o("Failed to parse Brella trainer configs flag.", e);
                return crsw.a;
            }
        }
    });
    private final AtomicBoolean k = new AtomicBoolean(false);

    public ctnh(ctyx ctyxVar, final Context context, cqoh cqohVar, ctzg ctzgVar, final errl errlVar, crss crssVar, ctmr ctmrVar) {
        this.g = ctyxVar;
        this.h = context;
        this.i = cqohVar;
        this.j = ctzgVar;
        this.m = emys.a(new emyl() { // from class: ctnc
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.emyl
            public final Object get() {
                boolean booleanValue = ((Boolean) ctjd.C.e()).booleanValue();
                Context context2 = context;
                errl errlVar2 = errlVar;
                emyl emylVar = ctnh.this.d;
                if (!booleanValue) {
                    ctnh.b.m("Brella training not enabled");
                    int i = engw.d;
                    return new ctng(false, enou.a);
                }
                try {
                    crsw crswVar = (crsw) emylVar.get();
                    engr engrVar = new engr();
                    eygr eygrVar = crswVar.b;
                    for (int i2 = 0; i2 < eygrVar.size(); i2++) {
                        int i3 = i2 + 3100;
                        if (i3 <= 3200) {
                            crsu crsuVar = (crsu) eygrVar.get(i2);
                            synchronized (dgtn.a) {
                                dgtn.b = true;
                            }
                            engrVar.h(new excv(context2, crsuVar.b, crsuVar.c, errlVar2, i3));
                        }
                    }
                    return new ctng(true, engrVar.g());
                } catch (Throwable unused) {
                    ctnh.b.n("Could not instantiate Brella training, Brella GMSCore likely not available");
                    int i4 = engw.d;
                    return new ctng(false, enou.a);
                }
            }
        });
        this.c = errlVar;
        this.e = crssVar;
        this.f = ctmrVar;
    }

    private final void k(ctzf ctzfVar) {
        if (this.j.b(ctzfVar)) {
            this.k.set(false);
            d();
        }
    }

    private final void l(boolean z) {
        this.g.h("federated_learning_popup_is_showing", z);
    }

    private final boolean m(ctzf ctzfVar, boolean z) {
        if (!z || !ctzfVar.c()) {
            return false;
        }
        this.g.h(this.h.getString(R.string.p2p_conversation_suggestions_training_enabled_pref_key), false);
        return true;
    }

    @Override // defpackage.ctiu
    public final void a() {
        boolean q = this.g.q(this.h.getString(R.string.p2p_conversation_suggestions_training_enabled_pref_key), false);
        ctzf a2 = this.j.a("federated_learning_feature_consent");
        if (m(a2, q) || a2.b() == q) {
            return;
        }
        this.g.h(this.h.getString(R.string.p2p_conversation_suggestions_training_enabled_pref_key), a2.b());
    }

    @Override // defpackage.ctiu
    public final void b() {
        this.g.h("p2p_conversation_training_popup_dismissed", true);
        l(false);
    }

    @Override // defpackage.ctiu
    public final void c() {
        k(this.j.a("federated_learning_feature_consent"));
        b();
    }

    @Override // defpackage.ctiu
    public final void d() {
        if (this.k.get()) {
            return;
        }
        synchronized (this.l) {
            if (this.k.get()) {
                return;
            }
            this.k.set(true);
            if (((Boolean) ctjd.C.e()).booleanValue() && ((ctng) this.m.get()).a) {
                elfl.g(elfr.j(this.e.a.a(), new emwl() { // from class: crsq
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        crsw crswVar = ((crsp) obj).c;
                        return crswVar == null ? crsw.a : crswVar;
                    }
                }, erpp.a)).i(new eroh() { // from class: ctna
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        final ctnh ctnhVar = ctnh.this;
                        if (((crsw) ctnhVar.d.get()).equals((crsw) obj)) {
                            return elfo.e(null);
                        }
                        ctmr ctmrVar = ctnhVar.f;
                        final dhri dhriVar = new dhri();
                        final Context context = ctmrVar.a;
                        final errl errlVar = ctmrVar.b;
                        errlVar.execute(new Runnable() { // from class: dgvp
                            @Override // java.lang.Runnable
                            public final void run() {
                                Context context2 = context;
                                dhri dhriVar2 = dhriVar;
                                Executor executor = errlVar;
                                try {
                                    IInAppTrainerCanceller iInAppTrainerCanceller = (IInAppTrainerCanceller) dgvf.a(context2, "com.google.android.gms.learning.dynamite.training.InAppTrainerCancellerImpl", new dgve() { // from class: dgvq
                                        @Override // defpackage.dgve
                                        public final IInterface a(IBinder iBinder) {
                                            return IInAppTrainerCanceller.Stub.asInterface(iBinder);
                                        }
                                    });
                                    try {
                                        iInAppTrainerCanceller.init(ObjectWrapper.wrap(context2), ObjectWrapper.wrap(executor), new dgvr(dhriVar2, iInAppTrainerCanceller));
                                    } catch (RemoteException e) {
                                        dhriVar2.c(new dfqu(new Status(8, emyt.a(e))));
                                    }
                                } catch (dgvd e2) {
                                    dhriVar2.c(new dfqu(new Status(17, "Cannot create in-app canceller: ".concat(String.valueOf(e2.getMessage())))));
                                }
                            }
                        });
                        return elfl.g(erny.g(duin.a(dhriVar.a), new eroh() { // from class: excu
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                dgvt dgvtVar = (dgvt) obj2;
                                dhri dhriVar2 = new dhri();
                                try {
                                    dgvtVar.a.cancelJobsByType(0, new dgvs(dhriVar2));
                                } catch (RemoteException e) {
                                    dhriVar2.c(new dfqu(new Status(8, emyt.a(e))));
                                }
                                return duin.a(dhriVar2.a);
                            }
                        }, errlVar)).e(Exception.class, new emwl() { // from class: ctnd
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                ctnh.b.s("Failed to cancel existing in-app trainers, if any.", (Exception) obj2);
                                return null;
                            }
                        }, ctnhVar.c).i(new eroh() { // from class: ctne
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                ctnh ctnhVar2 = ctnh.this;
                                final crsw crswVar = (crsw) ctnhVar2.d.get();
                                return ctnhVar2.e.a.b(new emwl() { // from class: crsr
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj3) {
                                        crso crsoVar = (crso) ((crsp) obj3).toBuilder();
                                        crsoVar.copyOnWrite();
                                        crsp crspVar = (crsp) crsoVar.instance;
                                        crsw crswVar2 = crsw.this;
                                        crswVar2.getClass();
                                        crspVar.c = crswVar2;
                                        crspVar.b |= 1;
                                        return (crsp) crsoVar.build();
                                    }
                                }, erpp.a);
                            }
                        }, ctnhVar.c);
                    }
                }, this.c).k(axou.a(new ctnf(this)), this.c);
            }
        }
    }

    @Override // defpackage.ctiu
    public final void e() {
        csix.g();
        l(true);
        if (this.g.e("p2p_conversation_training_popup_seen_timestamp", -1L) == -1) {
            this.g.k("p2p_conversation_training_popup_seen_timestamp", this.i.f().toEpochMilli());
        }
        ctzg ctzgVar = this.j;
        ctzgVar.c(ctzgVar.a("federated_learning_feature_consent"), 3);
    }

    @Override // defpackage.ctiu
    public final void f(boolean z) {
        csix.k(this.j.d("federated_learning_feature_consent", z));
        this.k.set(false);
        d();
    }

    @Override // defpackage.ctiu
    public final boolean g() {
        return ((Boolean) ctjd.C.e()).booleanValue();
    }

    @Override // defpackage.ctiu
    public final boolean h() {
        return this.j.a("federated_learning_feature_consent").a();
    }

    @Override // defpackage.ctiu
    public final boolean i() {
        if (((Boolean) ctjd.C.e()).booleanValue() && ((Boolean) ctjd.D.e()).booleanValue()) {
            ctzf a2 = this.j.a("federated_learning_feature_consent");
            if (!a2.a() && !a2.d()) {
                if (a2.c() && m(a2, this.g.q(this.h.getString(R.string.p2p_conversation_suggestions_training_enabled_pref_key), false))) {
                    return false;
                }
                if (!this.g.q("p2p_conversation_training_popup_dismissed", false)) {
                    return true;
                }
                k(a2);
                return false;
            }
        }
        return false;
    }

    final List j() {
        return ((ctng) this.m.get()).b;
    }
}
