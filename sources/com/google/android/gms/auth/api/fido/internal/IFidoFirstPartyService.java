package com.google.android.gms.auth.api.fido.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IFidoFirstPartyService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IFidoFirstPartyService {

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IFidoFirstPartyService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.fido.internal.IFidoFirstPartyService");
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.fido.internal.IFidoFirstPartyService");
        }

        public static IFidoFirstPartyService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.fido.internal.IFidoFirstPartyService");
            return queryLocalInterface instanceof IFidoFirstPartyService ? (IFidoFirstPartyService) queryLocalInterface : new Proxy(iBinder);
        }
    }
}
