package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.google.android.gms.kids.internal.InternalParentalControlsClient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgtl extends BroadcastReceiver {
    final /* synthetic */ InternalParentalControlsClient a;

    public dgtl(InternalParentalControlsClient internalParentalControlsClient) {
        this.a = internalParentalControlsClient;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        final InternalParentalControlsClient internalParentalControlsClient = this.a;
        internalParentalControlsClient.m = false;
        final Set<dgsp> ar = ffdx.ar(internalParentalControlsClient.b);
        dfwj dfwjVar = InternalParentalControlsClient.a;
        Objects.toString(ar);
        dfwjVar.b("Re-registering listeners: ".concat(ar.toString()));
        ArrayList arrayList = new ArrayList(ffdx.n(ar, 10));
        for (final dgsp dgspVar : ar) {
            dgspVar.getClass();
            internalParentalControlsClient.b.remove(dgspVar);
            arrayList.add(internalParentalControlsClient.e(new ffix() { // from class: dgte
                @Override // defpackage.ffix
                public final Object invoke() {
                    return dhrt.d(Arrays.asList(InternalParentalControlsClient.this.k(dftq.a(dgspVar, "ParentalControlsListener"), 14108)));
                }
            }, new ffix() { // from class: dgtf
                @Override // defpackage.ffix
                public final Object invoke() {
                    InternalParentalControlsClient.a.b("Ignoring call to unregister listener");
                    return null;
                }
            }));
        }
        dhrt.d(arrayList).d(new dhqh() { // from class: dgsy
            @Override // defpackage.dhqh
            public final Object a(dhre dhreVar) {
                InternalParentalControlsClient internalParentalControlsClient2 = InternalParentalControlsClient.this;
                if (!internalParentalControlsClient2.n) {
                    return dhrt.c(true);
                }
                dftd dftdVar = internalParentalControlsClient2.l;
                dfsr dfsrVar = new dfsr(internalParentalControlsClient2.h);
                Handler handler = dftdVar.o;
                handler.sendMessage(handler.obtainMessage(14, dfsrVar));
                return dfsrVar.b.a;
            }
        }).e(erpp.a, new dhqh() { // from class: dgsz
            @Override // defpackage.dhqh
            public final Object a(dhre dhreVar) {
                Set set = ar;
                ArrayList arrayList2 = new ArrayList(ffdx.n(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList2.add(internalParentalControlsClient.c((dgsp) it.next()));
                }
                return dhrt.d(arrayList2);
            }
        }).c(erpp.a, new dhqh() { // from class: dgta
            @Override // defpackage.dhqh
            public final Object a(dhre dhreVar) {
                InternalParentalControlsClient.a.b("Re-registration completed");
                return ffcu.a;
            }
        });
    }
}
