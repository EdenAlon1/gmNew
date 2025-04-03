package com.google.android.apps.tachyon.contacts.reachability;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.apps.tachyon.contacts.reachability.IReachabilityInviteLinkCallback;
import com.google.android.apps.tachyon.contacts.reachability.IReachabilityQueryCallback;
import com.google.android.apps.tachyon.contacts.reachability.IReachabilityQueryNoCacheCallback;
import defpackage.rve;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IReachabilityService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IReachabilityService {
        static final int TRANSACTION_generateInviteLink = 3;
        static final int TRANSACTION_generateMeetingInviteLink = 4;
        static final int TRANSACTION_queryReachability = 1;
        static final int TRANSACTION_queryReachabilityNoCache = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IReachabilityService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.tachyon.contacts.reachability.IReachabilityService");
            }

            @Override // com.google.android.apps.tachyon.contacts.reachability.IReachabilityService
            public void generateInviteLink(List<String> list, IReachabilityInviteLinkCallback iReachabilityInviteLinkCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeStringList(list);
                rve.f(obtainAndWriteInterfaceToken, iReachabilityInviteLinkCallback);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.tachyon.contacts.reachability.IReachabilityService
            public void generateMeetingInviteLink(List<String> list, IReachabilityInviteLinkCallback iReachabilityInviteLinkCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeStringList(list);
                rve.f(obtainAndWriteInterfaceToken, iReachabilityInviteLinkCallback);
                transactOneway(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.tachyon.contacts.reachability.IReachabilityService
            public void queryReachability(List<String> list, IReachabilityQueryCallback iReachabilityQueryCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeStringList(list);
                rve.f(obtainAndWriteInterfaceToken, iReachabilityQueryCallback);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.tachyon.contacts.reachability.IReachabilityService
            public void queryReachabilityNoCache(List<String> list, IReachabilityQueryNoCacheCallback iReachabilityQueryNoCacheCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeStringList(list);
                rve.f(obtainAndWriteInterfaceToken, iReachabilityQueryNoCacheCallback);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.tachyon.contacts.reachability.IReachabilityService");
        }

        public static IReachabilityService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.tachyon.contacts.reachability.IReachabilityService");
            return queryLocalInterface instanceof IReachabilityService ? (IReachabilityService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                IReachabilityQueryCallback asInterface = IReachabilityQueryCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                queryReachability(createStringArrayList, asInterface);
            } else if (i == 2) {
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                IReachabilityQueryNoCacheCallback asInterface2 = IReachabilityQueryNoCacheCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                queryReachabilityNoCache(createStringArrayList2, asInterface2);
            } else if (i == 3) {
                ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
                IReachabilityInviteLinkCallback asInterface3 = IReachabilityInviteLinkCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                generateInviteLink(createStringArrayList3, asInterface3);
            } else {
                if (i != 4) {
                    return false;
                }
                ArrayList<String> createStringArrayList4 = parcel.createStringArrayList();
                IReachabilityInviteLinkCallback asInterface4 = IReachabilityInviteLinkCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                generateMeetingInviteLink(createStringArrayList4, asInterface4);
            }
            return true;
        }
    }

    void generateInviteLink(List<String> list, IReachabilityInviteLinkCallback iReachabilityInviteLinkCallback);

    void generateMeetingInviteLink(List<String> list, IReachabilityInviteLinkCallback iReachabilityInviteLinkCallback);

    void queryReachability(List<String> list, IReachabilityQueryCallback iReachabilityQueryCallback);

    void queryReachabilityNoCache(List<String> list, IReachabilityQueryNoCacheCallback iReachabilityQueryNoCacheCallback);
}
