package defpackage;

import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Message;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.stream.Stream;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djpn extends djop {
    final /* synthetic */ djqf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djpn(djqf djqfVar) {
        super(djqfVar);
        this.b = djqfVar;
    }

    @Override // defpackage.diya, defpackage.dixy
    public final String a() {
        return "RegisteredState";
    }

    @Override // defpackage.djop, defpackage.diya, defpackage.dixy
    public final void b() {
        super.b();
        this.b.G.c();
        djqf djqfVar = this.b;
        if (djqfVar.l) {
            eeno eenoVar = djqfVar.x;
            String str = djqfVar.y;
            if (eenoVar == null || str == null) {
                dkty.h(djqfVar.m, "SipTransport or Public User Identity is null.", new Object[0]);
                djqf djqfVar2 = this.b;
                djqfVar2.w(djqfVar2.ag);
                return;
            } else {
                djkw i = djkx.i();
                i.g(eenoVar.e());
                ((djku) i).b = str;
                i.e(eenoVar.o() ? eejk.TLS : eenoVar.n() ? eejk.TCP : eejk.UDP);
                i.c(eenoVar.a());
                i.b(this.b.C);
                this.b.s.a = i.a();
            }
        }
        final djqf djqfVar3 = this.b;
        eehr eehrVar = djqfVar3.v;
        if (eehrVar != null) {
            dktn dktnVar = djqfVar3.m;
            final String b = emxe.b(eehrVar.a);
            dkty.d(dktnVar, "Notify Registered. CallId=%s", b);
            djqfVar3.R.execute(new Runnable() { // from class: djok
                @Override // java.lang.Runnable
                public final void run() {
                    Stream stream = Collection.EL.stream(djqf.this.P);
                    final String str2 = b;
                    stream.forEach(new Consumer() { // from class: djnt
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            diyy diyyVar = djqf.d;
                            ((djjv) obj).j(str2);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
            });
            djqfVar3.R.execute(new Runnable() { // from class: djol
                @Override // java.lang.Runnable
                public final void run() {
                    Collection.EL.stream(djqf.this.O).forEach(new Consumer() { // from class: djoj
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            diyy diyyVar = djqf.d;
                            ((djkh) obj).h();
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
            });
            djqf djqfVar4 = this.b;
            djqfVar4.p.e(djqfVar4.z, djqfVar4.C);
        }
        this.b.K();
    }

    @Override // defpackage.djop, defpackage.diya, defpackage.dixy
    public final void c() {
        super.c();
        djqf djqfVar = this.b;
        djqfVar.z();
        djqfVar.p(14);
        this.b.L.c();
        djqf djqfVar2 = this.b;
        if (djqfVar2.l) {
            djqfVar2.s.c();
        }
        final djqf djqfVar3 = this.b;
        final dilc dilcVar = djqfVar3.D;
        dkty.d(djqfVar3.m, "Notify Terminated. reason=%s", dilcVar);
        djqfVar3.R.execute(new Runnable() { // from class: djoc
            @Override // java.lang.Runnable
            public final void run() {
                Collection.EL.stream(djqf.this.P).forEach(new Consumer() { // from class: djod
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        diyy diyyVar = djqf.d;
                        ((djjv) obj).l();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        });
        djqfVar3.R.execute(new Runnable() { // from class: djoe
            @Override // java.lang.Runnable
            public final void run() {
                Stream stream = Collection.EL.stream(djqf.this.O);
                final dilc dilcVar2 = dilcVar;
                stream.forEach(new Consumer() { // from class: djnv
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        diyy diyyVar = djqf.d;
                        ((djkh) obj).i(dilc.this);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        });
    }

    @Override // defpackage.djop, defpackage.diya, defpackage.dixy
    public final boolean e(Message message) {
        int i = message.what;
        if (i == 4) {
            int i2 = message.arg1;
            NetworkInfo networkInfo = (NetworkInfo) message.obj;
            djqf djqfVar = this.a;
            if (djqfVar.l) {
                dkty.d(djqfVar.m, "Using network callback for connectivity detection, ignore Connectivity Events.", new Object[0]);
            } else {
                dkty.p(djqfVar.m, "state=%d activeNetworkInfo=%s:", Integer.valueOf(i2), networkInfo);
                if (((Boolean) djqf.h.a()).booleanValue() || networkInfo != null) {
                    if (i2 == 1) {
                        if (networkInfo != null) {
                            this.a.q.c();
                            djjt a = this.a.q.a();
                            if (a == null) {
                                dkty.l(this.a.m, "No network for RCS.", new Object[0]);
                                this.a.N(dilc.NETWORK_ERROR);
                                djqf djqfVar2 = this.a;
                                djqfVar2.w(djqfVar2.ah);
                            } else if (a.c() != super.f()) {
                                dkty.l(this.a.m, "Preferred network changed. Re-registering.", new Object[0]);
                                this.a.s(9, dilc.NETWORK_CHANGE);
                            }
                        }
                    } else if (networkInfo == null || super.f() == networkInfo.getType()) {
                        dkty.l(this.a.m, "Network is lost. type:%d", Integer.valueOf(super.f()));
                        this.a.N(dilc.NETWORK_ERROR);
                        djqf djqfVar3 = this.a;
                        djqfVar3.w(djqfVar3.ah);
                    }
                }
            }
            return true;
        }
        if (i == 5) {
            Bundle bundle = (Bundle) message.obj;
            this.b.C(bundle.getString("transport_id"), (Throwable) bundle.getSerializable("transport_error_cause"));
            return true;
        }
        if (i == 8 || i == 9) {
            this.b.N(message.obj);
            djqf djqfVar4 = this.b;
            dkty.d(djqfVar4.m, "Deregistering. reason=%s", djqfVar4.D);
            if (dilc.NETWORK_ERROR.equals(message.obj) || dilc.NO_RETRY_NO_DEREGISTER_FOR_TEST.equals(message.obj)) {
                djqf djqfVar5 = this.b;
                djqfVar5.w(djqfVar5.ah);
                return true;
            }
            djqf djqfVar6 = this.b;
            djqfVar6.w(djqfVar6.ag);
            return true;
        }
        if (i == 14) {
            djqf djqfVar7 = this.b;
            djqfVar7.w(djqfVar7.ae);
            return true;
        }
        if (i == 17) {
            this.b.N(dilc.SIM_REMOVED);
            djqf djqfVar8 = this.b;
            djqfVar8.w(djqfVar8.ag);
            return true;
        }
        if (i != 21) {
            return super.e(message);
        }
        dkty.r(this.b.m, "Network is lost.", new Object[0]);
        this.b.O();
        this.b.N(dilc.NETWORK_ERROR);
        djqf djqfVar9 = this.b;
        djqfVar9.w(djqfVar9.ah);
        return true;
    }
}
