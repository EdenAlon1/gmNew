package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import com.google.android.libraries.internal.growth.growthkit.internal.debug.TestingToolsBroadcastReceiver;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class akkq implements dvbn {
    private final akis a;

    public akkq(akis akisVar) {
        this.a = akisVar;
    }

    @Override // defpackage.dvbn
    public final /* synthetic */ void a(BroadcastReceiver broadcastReceiver) {
        TestingToolsBroadcastReceiver testingToolsBroadcastReceiver = (TestingToolsBroadcastReceiver) broadcastReceiver;
        testingToolsBroadcastReceiver.b = (eafv) this.a.fT.b();
        testingToolsBroadcastReceiver.c = (dvmt) this.a.gU.b();
        testingToolsBroadcastReceiver.d = (eafv) this.a.gd.b();
        testingToolsBroadcastReceiver.e = (dvmq) this.a.fV.b();
        testingToolsBroadcastReceiver.f = (dvmx) this.a.fX.b();
        testingToolsBroadcastReceiver.g = this.a.a.mg();
        testingToolsBroadcastReceiver.h = (errl) this.a.fY.b();
        testingToolsBroadcastReceiver.i = fbaz.a(this.a.a.eM);
        testingToolsBroadcastReceiver.j = this.a.dU();
        testingToolsBroadcastReceiver.k = (errl) this.a.gA.b();
        testingToolsBroadcastReceiver.l = (Context) this.a.q.b();
        testingToolsBroadcastReceiver.m = (ListenableFuture) this.a.gi.b();
        testingToolsBroadcastReceiver.n = this.a.a.rd();
        testingToolsBroadcastReceiver.o = this.a.a.qL();
        testingToolsBroadcastReceiver.p = (eafv) this.a.gf.b();
        testingToolsBroadcastReceiver.q = emxc.j(this.a.a.rR());
        testingToolsBroadcastReceiver.r = this.a.gE;
    }
}
