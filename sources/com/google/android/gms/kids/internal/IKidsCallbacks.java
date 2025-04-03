package com.google.android.gms.kids.internal;

import android.app.PendingIntent;
import android.database.CursorWindow;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.kids.EnsureSupervisionSetupResponse;
import defpackage.rve;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IKidsCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IKidsCallbacks {
        static final int TRANSACTION_onBoolean = 3;
        static final int TRANSACTION_onBooleanList = 5;
        static final int TRANSACTION_onCursorWindow = 2;
        static final int TRANSACTION_onEnsureSupervisionSetupResponse = 6;
        static final int TRANSACTION_onPendingIntent = 4;
        static final int TRANSACTION_onStatus = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IKidsCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.kids.internal.IKidsCallbacks");
            }

            @Override // com.google.android.gms.kids.internal.IKidsCallbacks
            public void onBoolean(Status status, boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.internal.IKidsCallbacks
            public void onBooleanList(Status status, List<Boolean> list) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeList(list);
                transactOneway(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.internal.IKidsCallbacks
            public void onCursorWindow(Status status, CursorWindow cursorWindow) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, cursorWindow);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.internal.IKidsCallbacks
            public void onEnsureSupervisionSetupResponse(Status status, EnsureSupervisionSetupResponse ensureSupervisionSetupResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, ensureSupervisionSetupResponse);
                transactOneway(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.internal.IKidsCallbacks
            public void onPendingIntent(Status status, PendingIntent pendingIntent) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, pendingIntent);
                transactOneway(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.internal.IKidsCallbacks
            public void onStatus(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.kids.internal.IKidsCallbacks");
        }

        public static IKidsCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.kids.internal.IKidsCallbacks");
            return queryLocalInterface instanceof IKidsCallbacks ? (IKidsCallbacks) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    Status status = (Status) rve.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onStatus(status);
                    return true;
                case 2:
                    Status status2 = (Status) rve.a(parcel, Status.CREATOR);
                    CursorWindow cursorWindow = (CursorWindow) rve.a(parcel, CursorWindow.CREATOR);
                    enforceNoDataAvail(parcel);
                    onCursorWindow(status2, cursorWindow);
                    return true;
                case 3:
                    Status status3 = (Status) rve.a(parcel, Status.CREATOR);
                    boolean g = rve.g(parcel);
                    enforceNoDataAvail(parcel);
                    onBoolean(status3, g);
                    return true;
                case 4:
                    Status status4 = (Status) rve.a(parcel, Status.CREATOR);
                    PendingIntent pendingIntent = (PendingIntent) rve.a(parcel, PendingIntent.CREATOR);
                    enforceNoDataAvail(parcel);
                    onPendingIntent(status4, pendingIntent);
                    return true;
                case 5:
                    Status status5 = (Status) rve.a(parcel, Status.CREATOR);
                    ArrayList b = rve.b(parcel);
                    enforceNoDataAvail(parcel);
                    onBooleanList(status5, b);
                    return true;
                case 6:
                    Status status6 = (Status) rve.a(parcel, Status.CREATOR);
                    EnsureSupervisionSetupResponse ensureSupervisionSetupResponse = (EnsureSupervisionSetupResponse) rve.a(parcel, EnsureSupervisionSetupResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onEnsureSupervisionSetupResponse(status6, ensureSupervisionSetupResponse);
                    return true;
                default:
                    return false;
            }
        }
    }

    void onBoolean(Status status, boolean z);

    void onBooleanList(Status status, List<Boolean> list);

    void onCursorWindow(Status status, CursorWindow cursorWindow);

    void onEnsureSupervisionSetupResponse(Status status, EnsureSupervisionSetupResponse ensureSupervisionSetupResponse);

    void onPendingIntent(Status status, PendingIntent pendingIntent);

    void onStatus(Status status);
}
