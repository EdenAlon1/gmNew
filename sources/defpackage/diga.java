package defpackage;

import android.util.Log;
import com.google.android.gms.wearable.internal.IRpcResponseCallback;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.WearableListenerStubImpl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class diga implements dfto {
    final /* synthetic */ MessageEventParcelable a;
    final /* synthetic */ IRpcResponseCallback b;

    public diga(MessageEventParcelable messageEventParcelable, IRpcResponseCallback iRpcResponseCallback) {
        this.a = messageEventParcelable;
        this.b = iRpcResponseCallback;
    }

    @Override // defpackage.dfto
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        MessageEventParcelable messageEventParcelable = this.a;
        dhre d = ((dhzu) obj).d(messageEventParcelable.d, messageEventParcelable.b, messageEventParcelable.c);
        final IRpcResponseCallback iRpcResponseCallback = this.b;
        d.s(new dhqs() { // from class: difz
            @Override // defpackage.dhqs
            public final void a(dhre dhreVar) {
                IRpcResponseCallback iRpcResponseCallback2 = IRpcResponseCallback.this;
                if (dhreVar.m()) {
                    WearableListenerStubImpl.b(iRpcResponseCallback2, true, (byte[]) dhreVar.i());
                } else {
                    Log.e("WearableListenerStub", "Failed to resolve future, sending null response", dhreVar.h());
                    WearableListenerStubImpl.b(iRpcResponseCallback2, false, null);
                }
            }
        });
    }

    @Override // defpackage.dfto
    public final void b() {
        Log.e("WearableListenerStub", "Failed to notify listener, sending null response");
        WearableListenerStubImpl.b(this.b, false, null);
    }
}
