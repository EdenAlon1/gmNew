package defpackage;

import android.os.Message;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.stream.Stream;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djqe extends djop {
    final /* synthetic */ djqf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djqe(djqf djqfVar) {
        super(djqfVar);
        this.b = djqfVar;
    }

    @Override // defpackage.diya, defpackage.dixy
    public final String a() {
        return "WaitForNetworkState";
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005b, code lost:
    
        if (r0.T.a(r0.o) != null) goto L17;
     */
    @Override // defpackage.djop, defpackage.diya, defpackage.dixy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djqe.b():void");
    }

    @Override // defpackage.djop, defpackage.diya, defpackage.dixy
    public final boolean e(Message message) {
        int i = message.what;
        if (i == 4) {
            g();
            return true;
        }
        if (i == 8) {
            this.b.N(message.obj);
            djqf djqfVar = this.b;
            djqfVar.w(djqfVar.W);
            return true;
        }
        if (i == 17) {
            this.b.N(dilc.SIM_REMOVED);
            djqf djqfVar2 = this.b;
            djqfVar2.w(djqfVar2.aj);
            return true;
        }
        switch (i) {
            case 20:
                djkr djkrVar = (djkr) message.obj;
                djqf djqfVar3 = this.b;
                djqfVar3.B = djkrVar;
                djqfVar3.w(djqfVar3.Z);
                return true;
            case 21:
                dkty.r(this.b.m, "Network is lost.", new Object[0]);
                this.b.O();
                djqf djqfVar4 = this.b;
                djqfVar4.w(djqfVar4.ak);
                return true;
            case 22:
                dkty.r(this.b.m, "Network is not available.", new Object[0]);
                this.b.A.set(null);
                djqf djqfVar5 = this.b;
                djqfVar5.w(djqfVar5.ak);
                return true;
            default:
                return super.e(message);
        }
    }

    public final void g() {
        djqf djqfVar = this.b;
        boolean z = djqfVar.l;
        dktn dktnVar = djqfVar.m;
        if (z) {
            dkty.r(dktnVar, "Do not use ImsNetworkInterface.", new Object[0]);
            return;
        }
        dkty.d(dktnVar, "Selecting Network Interface.", new Object[0]);
        this.b.q.c();
        final djjt a = this.b.q.a();
        if (a == null) {
            dkty.d(this.b.m, "ImsNetworkInterface is not available.", new Object[0]);
            return;
        }
        dkty.d(this.b.m, "Registering over %s (%s)", a.g(), a);
        this.b.w = a;
        final djqf djqfVar2 = this.b;
        dkty.d(djqfVar2.m, "Notify ImsNetworkInterface selected. selected=%s", a);
        djqfVar2.R.execute(new Runnable() { // from class: djob
            @Override // java.lang.Runnable
            public final void run() {
                Stream stream = Collection.EL.stream(djqf.this.P);
                final djjt djjtVar = a;
                stream.forEach(new Consumer() { // from class: djof
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        diyy diyyVar = djqf.d;
                        ((djjv) obj).h(djjt.this);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        });
        djqf djqfVar3 = this.b;
        djqfVar3.w(djqfVar3.Z);
    }
}
