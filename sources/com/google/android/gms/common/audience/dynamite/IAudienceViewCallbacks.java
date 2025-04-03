package com.google.android.gms.common.audience.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.people.data.AudienceMember;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IAudienceViewCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAudienceViewCallbacks {
        static final int TRANSACTION_editAudience = 4;
        static final int TRANSACTION_removeAudienceMember = 3;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAudienceViewCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.audience.dynamite.IAudienceViewCallbacks");
            }

            @Override // com.google.android.gms.common.audience.dynamite.IAudienceViewCallbacks
            public void editAudience() {
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.common.audience.dynamite.IAudienceViewCallbacks
            public void removeAudienceMember(AudienceMember audienceMember) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, audienceMember);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.common.audience.dynamite.IAudienceViewCallbacks");
        }

        public static IAudienceViewCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.audience.dynamite.IAudienceViewCallbacks");
            return queryLocalInterface instanceof IAudienceViewCallbacks ? (IAudienceViewCallbacks) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 3) {
                AudienceMember audienceMember = (AudienceMember) rve.a(parcel, AudienceMember.CREATOR);
                enforceNoDataAvail(parcel);
                removeAudienceMember(audienceMember);
            } else {
                if (i != 4) {
                    return false;
                }
                editAudience();
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void editAudience();

    void removeAudienceMember(AudienceMember audienceMember);
}
