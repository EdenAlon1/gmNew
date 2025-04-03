package com.google.android.gms.wallet.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentResponse;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.WebPaymentData;
import com.google.android.gms.wallet.button.GetInstrumentAvailabilityResponse;
import com.google.android.gms.wallet.firstparty.GetBuyFlowInitializationTokenResponse;
import com.google.android.gms.wallet.firstparty.GetClientTokenResponse;
import com.google.android.gms.wallet.firstparty.SetUpBiometricAuthenticationKeysResponse;
import com.google.android.gms.wallet.firstparty.WarmUpUiProcessResponse;
import com.google.android.gms.wallet.firstparty.saveinstrument.GetSaveInstrumentDetailsResponse;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IWalletServiceCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IWalletServiceCallbacks {
        static final int TRANSACTION_onBiometricAuthenticationKeysSetUp = 16;
        static final int TRANSACTION_onBuyFlowInitializationTokenReceived = 7;
        static final int TRANSACTION_onClientTokenReceived = 10;
        static final int TRANSACTION_onExecuteBuyFlowStatusReceived = 11;
        static final int TRANSACTION_onFullWalletLoaded = 2;
        static final int TRANSACTION_onGetInstrumentAvailabilityResponse = 20;
        static final int TRANSACTION_onGetSaveInstrumentDetailsResponse = 15;
        static final int TRANSACTION_onInitializeBuyFlowStatusReceived = 8;
        static final int TRANSACTION_onIsNewUserDetermined = 6;
        static final int TRANSACTION_onIsReadyToPayDetermined = 9;
        static final int TRANSACTION_onMaskedWalletLoaded = 1;
        static final int TRANSACTION_onPaymentCardRecognitionIntentResponseReceived = 19;
        static final int TRANSACTION_onPaymentDataLoaded = 14;
        static final int TRANSACTION_onPreAuthorizationDetermined = 3;
        static final int TRANSACTION_onSaveInstrumentStatusReceived = 13;
        static final int TRANSACTION_onSetupWizardIntentReceived = 18;
        static final int TRANSACTION_onWalletObjectsCreated = 4;
        static final int TRANSACTION_onWarmUpUiProcessResponseReceived = 17;
        static final int TRANSACTION_onWebPaymentDataLoaded = 12;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IWalletServiceCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
            }

            @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
            public void onBiometricAuthenticationKeysSetUp(Status status, SetUpBiometricAuthenticationKeysResponse setUpBiometricAuthenticationKeysResponse, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, setUpBiometricAuthenticationKeysResponse);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(16, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
            public void onBuyFlowInitializationTokenReceived(Status status, GetBuyFlowInitializationTokenResponse getBuyFlowInitializationTokenResponse, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, getBuyFlowInitializationTokenResponse);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
            public void onClientTokenReceived(Status status, GetClientTokenResponse getClientTokenResponse, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, getClientTokenResponse);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(10, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
            public void onExecuteBuyFlowStatusReceived(Status status, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(11, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
            public void onFullWalletLoaded(int i, FullWallet fullWallet, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                rve.d(obtainAndWriteInterfaceToken, fullWallet);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
            public void onGetInstrumentAvailabilityResponse(Status status, GetInstrumentAvailabilityResponse getInstrumentAvailabilityResponse, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, getInstrumentAvailabilityResponse);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(20, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
            public void onGetSaveInstrumentDetailsResponse(Status status, GetSaveInstrumentDetailsResponse getSaveInstrumentDetailsResponse, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, getSaveInstrumentDetailsResponse);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(15, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
            public void onInitializeBuyFlowStatusReceived(Status status, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(8, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
            public void onIsNewUserDetermined(int i, boolean z, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                int i2 = rve.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
            public void onIsReadyToPayDetermined(Status status, boolean z, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(9, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
            public void onMaskedWalletLoaded(int i, MaskedWallet maskedWallet, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                rve.d(obtainAndWriteInterfaceToken, maskedWallet);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
            public void onPaymentCardRecognitionIntentResponseReceived(Status status, PaymentCardRecognitionIntentResponse paymentCardRecognitionIntentResponse, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, paymentCardRecognitionIntentResponse);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(19, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
            public void onPaymentDataLoaded(Status status, PaymentData paymentData, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, paymentData);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(14, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
            public void onPreAuthorizationDetermined(int i, boolean z, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                int i2 = rve.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
            public void onSaveInstrumentStatusReceived(Status status, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(13, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
            public void onSetupWizardIntentReceived(int i, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(18, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
            public void onWalletObjectsCreated(int i, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
            public void onWarmUpUiProcessResponseReceived(Status status, WarmUpUiProcessResponse warmUpUiProcessResponse, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, warmUpUiProcessResponse);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(17, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
            public void onWebPaymentDataLoaded(Status status, WebPaymentData webPaymentData, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, webPaymentData);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(12, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
        }

        public static IWalletServiceCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
            return queryLocalInterface instanceof IWalletServiceCallbacks ? (IWalletServiceCallbacks) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    int readInt = parcel.readInt();
                    MaskedWallet maskedWallet = (MaskedWallet) rve.a(parcel, MaskedWallet.CREATOR);
                    Bundle bundle = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onMaskedWalletLoaded(readInt, maskedWallet, bundle);
                    return true;
                case 2:
                    int readInt2 = parcel.readInt();
                    FullWallet fullWallet = (FullWallet) rve.a(parcel, FullWallet.CREATOR);
                    Bundle bundle2 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onFullWalletLoaded(readInt2, fullWallet, bundle2);
                    return true;
                case 3:
                    int readInt3 = parcel.readInt();
                    boolean g = rve.g(parcel);
                    Bundle bundle3 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onPreAuthorizationDetermined(readInt3, g, bundle3);
                    return true;
                case 4:
                    int readInt4 = parcel.readInt();
                    Bundle bundle4 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onWalletObjectsCreated(readInt4, bundle4);
                    return true;
                case 5:
                default:
                    return false;
                case 6:
                    int readInt5 = parcel.readInt();
                    boolean g2 = rve.g(parcel);
                    Bundle bundle5 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onIsNewUserDetermined(readInt5, g2, bundle5);
                    return true;
                case 7:
                    Status status = (Status) rve.a(parcel, Status.CREATOR);
                    GetBuyFlowInitializationTokenResponse getBuyFlowInitializationTokenResponse = (GetBuyFlowInitializationTokenResponse) rve.a(parcel, GetBuyFlowInitializationTokenResponse.CREATOR);
                    Bundle bundle6 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onBuyFlowInitializationTokenReceived(status, getBuyFlowInitializationTokenResponse, bundle6);
                    return true;
                case 8:
                    Status status2 = (Status) rve.a(parcel, Status.CREATOR);
                    Bundle bundle7 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onInitializeBuyFlowStatusReceived(status2, bundle7);
                    return true;
                case 9:
                    Status status3 = (Status) rve.a(parcel, Status.CREATOR);
                    boolean g3 = rve.g(parcel);
                    Bundle bundle8 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onIsReadyToPayDetermined(status3, g3, bundle8);
                    return true;
                case 10:
                    Status status4 = (Status) rve.a(parcel, Status.CREATOR);
                    GetClientTokenResponse getClientTokenResponse = (GetClientTokenResponse) rve.a(parcel, GetClientTokenResponse.CREATOR);
                    Bundle bundle9 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onClientTokenReceived(status4, getClientTokenResponse, bundle9);
                    return true;
                case 11:
                    Status status5 = (Status) rve.a(parcel, Status.CREATOR);
                    Bundle bundle10 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onExecuteBuyFlowStatusReceived(status5, bundle10);
                    return true;
                case 12:
                    Status status6 = (Status) rve.a(parcel, Status.CREATOR);
                    WebPaymentData webPaymentData = (WebPaymentData) rve.a(parcel, WebPaymentData.CREATOR);
                    Bundle bundle11 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onWebPaymentDataLoaded(status6, webPaymentData, bundle11);
                    return true;
                case 13:
                    Status status7 = (Status) rve.a(parcel, Status.CREATOR);
                    Bundle bundle12 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onSaveInstrumentStatusReceived(status7, bundle12);
                    return true;
                case 14:
                    Status status8 = (Status) rve.a(parcel, Status.CREATOR);
                    PaymentData paymentData = (PaymentData) rve.a(parcel, PaymentData.CREATOR);
                    Bundle bundle13 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onPaymentDataLoaded(status8, paymentData, bundle13);
                    return true;
                case 15:
                    Status status9 = (Status) rve.a(parcel, Status.CREATOR);
                    GetSaveInstrumentDetailsResponse getSaveInstrumentDetailsResponse = (GetSaveInstrumentDetailsResponse) rve.a(parcel, GetSaveInstrumentDetailsResponse.CREATOR);
                    Bundle bundle14 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetSaveInstrumentDetailsResponse(status9, getSaveInstrumentDetailsResponse, bundle14);
                    return true;
                case 16:
                    Status status10 = (Status) rve.a(parcel, Status.CREATOR);
                    SetUpBiometricAuthenticationKeysResponse setUpBiometricAuthenticationKeysResponse = (SetUpBiometricAuthenticationKeysResponse) rve.a(parcel, SetUpBiometricAuthenticationKeysResponse.CREATOR);
                    Bundle bundle15 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onBiometricAuthenticationKeysSetUp(status10, setUpBiometricAuthenticationKeysResponse, bundle15);
                    return true;
                case 17:
                    Status status11 = (Status) rve.a(parcel, Status.CREATOR);
                    WarmUpUiProcessResponse warmUpUiProcessResponse = (WarmUpUiProcessResponse) rve.a(parcel, WarmUpUiProcessResponse.CREATOR);
                    Bundle bundle16 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onWarmUpUiProcessResponseReceived(status11, warmUpUiProcessResponse, bundle16);
                    return true;
                case 18:
                    int readInt6 = parcel.readInt();
                    Bundle bundle17 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onSetupWizardIntentReceived(readInt6, bundle17);
                    return true;
                case 19:
                    Status status12 = (Status) rve.a(parcel, Status.CREATOR);
                    PaymentCardRecognitionIntentResponse paymentCardRecognitionIntentResponse = (PaymentCardRecognitionIntentResponse) rve.a(parcel, PaymentCardRecognitionIntentResponse.CREATOR);
                    Bundle bundle18 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onPaymentCardRecognitionIntentResponseReceived(status12, paymentCardRecognitionIntentResponse, bundle18);
                    return true;
                case 20:
                    Status status13 = (Status) rve.a(parcel, Status.CREATOR);
                    GetInstrumentAvailabilityResponse getInstrumentAvailabilityResponse = (GetInstrumentAvailabilityResponse) rve.a(parcel, GetInstrumentAvailabilityResponse.CREATOR);
                    Bundle bundle19 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetInstrumentAvailabilityResponse(status13, getInstrumentAvailabilityResponse, bundle19);
                    return true;
            }
        }
    }

    void onBiometricAuthenticationKeysSetUp(Status status, SetUpBiometricAuthenticationKeysResponse setUpBiometricAuthenticationKeysResponse, Bundle bundle);

    void onBuyFlowInitializationTokenReceived(Status status, GetBuyFlowInitializationTokenResponse getBuyFlowInitializationTokenResponse, Bundle bundle);

    void onClientTokenReceived(Status status, GetClientTokenResponse getClientTokenResponse, Bundle bundle);

    void onExecuteBuyFlowStatusReceived(Status status, Bundle bundle);

    void onFullWalletLoaded(int i, FullWallet fullWallet, Bundle bundle);

    void onGetInstrumentAvailabilityResponse(Status status, GetInstrumentAvailabilityResponse getInstrumentAvailabilityResponse, Bundle bundle);

    void onGetSaveInstrumentDetailsResponse(Status status, GetSaveInstrumentDetailsResponse getSaveInstrumentDetailsResponse, Bundle bundle);

    void onInitializeBuyFlowStatusReceived(Status status, Bundle bundle);

    void onIsNewUserDetermined(int i, boolean z, Bundle bundle);

    void onIsReadyToPayDetermined(Status status, boolean z, Bundle bundle);

    void onMaskedWalletLoaded(int i, MaskedWallet maskedWallet, Bundle bundle);

    void onPaymentCardRecognitionIntentResponseReceived(Status status, PaymentCardRecognitionIntentResponse paymentCardRecognitionIntentResponse, Bundle bundle);

    void onPaymentDataLoaded(Status status, PaymentData paymentData, Bundle bundle);

    void onPreAuthorizationDetermined(int i, boolean z, Bundle bundle);

    void onSaveInstrumentStatusReceived(Status status, Bundle bundle);

    void onSetupWizardIntentReceived(int i, Bundle bundle);

    void onWalletObjectsCreated(int i, Bundle bundle);

    void onWarmUpUiProcessResponseReceived(Status status, WarmUpUiProcessResponse warmUpUiProcessResponse, Bundle bundle);

    void onWebPaymentDataLoaded(Status status, WebPaymentData webPaymentData, Bundle bundle);
}
