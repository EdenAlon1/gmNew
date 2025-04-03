package com.google.android.gms.wallet.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentRequest;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.WebPaymentDataRequest;
import com.google.android.gms.wallet.firstparty.ExecuteBuyFlowRequest;
import com.google.android.gms.wallet.firstparty.GetBuyFlowInitializationTokenRequest;
import com.google.android.gms.wallet.firstparty.GetClientTokenRequest;
import com.google.android.gms.wallet.firstparty.InitializeBuyFlowRequest;
import com.google.android.gms.wallet.firstparty.SetUpBiometricAuthenticationKeysRequest;
import com.google.android.gms.wallet.firstparty.WarmUpUiProcessRequest;
import com.google.android.gms.wallet.firstparty.saveinstrument.GetSaveInstrumentDetailsRequest;
import com.google.android.gms.wallet.firstparty.saveinstrument.SaveInstrumentRequest;
import com.google.android.gms.wallet.firstparty.setupwizard.GetSetupWizardIntentRequest;
import com.google.android.gms.wallet.internal.IWalletServiceCallbacks;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IOwService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IOwService {
        static final int TRANSACTION_changeMaskedWallet = 3;
        static final int TRANSACTION_checkForPreAuthorization = 5;
        static final int TRANSACTION_createWalletObjects = 6;
        static final int TRANSACTION_executeBuyFlow = 16;
        static final int TRANSACTION_getBuyFlowInitializationToken = 12;
        static final int TRANSACTION_getClientToken = 15;
        static final int TRANSACTION_getFullWallet = 2;
        static final int TRANSACTION_getInstrumentAvailability = 25;
        static final int TRANSACTION_getMaskedWalletForPreauthorizedBuyer = 1;
        static final int TRANSACTION_getPaymentCardRecognitionIntent = 24;
        static final int TRANSACTION_getSaveInstrumentDetails = 20;
        static final int TRANSACTION_getSetupWizardIntent = 23;
        static final int TRANSACTION_initializeBuyFlow = 13;
        static final int TRANSACTION_isNewUser = 11;
        static final int TRANSACTION_isReadyToPay = 14;
        static final int TRANSACTION_loadPaymentData = 19;
        static final int TRANSACTION_loadWebPaymentData = 17;
        static final int TRANSACTION_notifyTransactionStatus = 4;
        static final int TRANSACTION_saveInstrument = 18;
        static final int TRANSACTION_setUpBiometricAuthenticationKeys = 21;
        static final int TRANSACTION_trackWalletFragmentButtonClicked = 10;
        static final int TRANSACTION_trackWalletFragmentButtonInitialized = 9;
        static final int TRANSACTION_warmUpUiProcess = 22;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IOwService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.wallet.internal.IOwService");
            }

            @Override // com.google.android.gms.wallet.internal.IOwService
            public void changeMaskedWallet(String str, String str2, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                rve.f(obtainAndWriteInterfaceToken, iWalletServiceCallbacks);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IOwService
            public void checkForPreAuthorization(Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, bundle);
                rve.f(obtainAndWriteInterfaceToken, iWalletServiceCallbacks);
                transactOneway(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IOwService
            public void createWalletObjects(CreateWalletObjectsRequest createWalletObjectsRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, createWalletObjectsRequest);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                rve.f(obtainAndWriteInterfaceToken, iWalletServiceCallbacks);
                transactOneway(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IOwService
            public void executeBuyFlow(ExecuteBuyFlowRequest executeBuyFlowRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, executeBuyFlowRequest);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                rve.f(obtainAndWriteInterfaceToken, iWalletServiceCallbacks);
                transactOneway(16, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IOwService
            public void getBuyFlowInitializationToken(GetBuyFlowInitializationTokenRequest getBuyFlowInitializationTokenRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, getBuyFlowInitializationTokenRequest);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                rve.f(obtainAndWriteInterfaceToken, iWalletServiceCallbacks);
                transactOneway(12, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IOwService
            public void getClientToken(GetClientTokenRequest getClientTokenRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, getClientTokenRequest);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                rve.f(obtainAndWriteInterfaceToken, iWalletServiceCallbacks);
                transactOneway(15, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IOwService
            public void getFullWallet(FullWalletRequest fullWalletRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, fullWalletRequest);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                rve.f(obtainAndWriteInterfaceToken, iWalletServiceCallbacks);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IOwService
            public void getInstrumentAvailability(Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, bundle);
                rve.f(obtainAndWriteInterfaceToken, iWalletServiceCallbacks);
                transactOneway(25, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IOwService
            public void getMaskedWalletForPreauthorizedBuyer(MaskedWalletRequest maskedWalletRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, maskedWalletRequest);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                rve.f(obtainAndWriteInterfaceToken, iWalletServiceCallbacks);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IOwService
            public void getPaymentCardRecognitionIntent(PaymentCardRecognitionIntentRequest paymentCardRecognitionIntentRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, paymentCardRecognitionIntentRequest);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                rve.f(obtainAndWriteInterfaceToken, iWalletServiceCallbacks);
                transactOneway(24, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IOwService
            public void getSaveInstrumentDetails(GetSaveInstrumentDetailsRequest getSaveInstrumentDetailsRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, getSaveInstrumentDetailsRequest);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                rve.f(obtainAndWriteInterfaceToken, iWalletServiceCallbacks);
                transactOneway(20, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IOwService
            public void getSetupWizardIntent(GetSetupWizardIntentRequest getSetupWizardIntentRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, getSetupWizardIntentRequest);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                rve.f(obtainAndWriteInterfaceToken, iWalletServiceCallbacks);
                transactOneway(23, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IOwService
            public void initializeBuyFlow(InitializeBuyFlowRequest initializeBuyFlowRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, initializeBuyFlowRequest);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                rve.f(obtainAndWriteInterfaceToken, iWalletServiceCallbacks);
                transactOneway(13, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IOwService
            public void isNewUser(Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, bundle);
                rve.f(obtainAndWriteInterfaceToken, iWalletServiceCallbacks);
                transactOneway(11, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IOwService
            public void isReadyToPay(IsReadyToPayRequest isReadyToPayRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, isReadyToPayRequest);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                rve.f(obtainAndWriteInterfaceToken, iWalletServiceCallbacks);
                transactOneway(14, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IOwService
            public void loadPaymentData(PaymentDataRequest paymentDataRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, paymentDataRequest);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                rve.f(obtainAndWriteInterfaceToken, iWalletServiceCallbacks);
                transactOneway(19, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IOwService
            public void loadWebPaymentData(WebPaymentDataRequest webPaymentDataRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, webPaymentDataRequest);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                rve.f(obtainAndWriteInterfaceToken, iWalletServiceCallbacks);
                transactOneway(17, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IOwService
            public void notifyTransactionStatus(NotifyTransactionStatusRequest notifyTransactionStatusRequest, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, notifyTransactionStatusRequest);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IOwService
            public void saveInstrument(SaveInstrumentRequest saveInstrumentRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, saveInstrumentRequest);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                rve.f(obtainAndWriteInterfaceToken, iWalletServiceCallbacks);
                transactOneway(18, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IOwService
            public void setUpBiometricAuthenticationKeys(SetUpBiometricAuthenticationKeysRequest setUpBiometricAuthenticationKeysRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, setUpBiometricAuthenticationKeysRequest);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                rve.f(obtainAndWriteInterfaceToken, iWalletServiceCallbacks);
                transactOneway(21, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IOwService
            public void trackWalletFragmentButtonClicked(Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(10, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IOwService
            public void trackWalletFragmentButtonInitialized(Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(9, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IOwService
            public void warmUpUiProcess(WarmUpUiProcessRequest warmUpUiProcessRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, warmUpUiProcessRequest);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                rve.f(obtainAndWriteInterfaceToken, iWalletServiceCallbacks);
                transactOneway(22, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.wallet.internal.IOwService");
        }

        public static IOwService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
            return queryLocalInterface instanceof IOwService ? (IOwService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    MaskedWalletRequest maskedWalletRequest = (MaskedWalletRequest) rve.a(parcel, MaskedWalletRequest.CREATOR);
                    Bundle bundle = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    IWalletServiceCallbacks asInterface = IWalletServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getMaskedWalletForPreauthorizedBuyer(maskedWalletRequest, bundle, asInterface);
                    return true;
                case 2:
                    FullWalletRequest fullWalletRequest = (FullWalletRequest) rve.a(parcel, FullWalletRequest.CREATOR);
                    Bundle bundle2 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    IWalletServiceCallbacks asInterface2 = IWalletServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getFullWallet(fullWalletRequest, bundle2, asInterface2);
                    return true;
                case 3:
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    Bundle bundle3 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    IWalletServiceCallbacks asInterface3 = IWalletServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    changeMaskedWallet(readString, readString2, bundle3, asInterface3);
                    return true;
                case 4:
                    NotifyTransactionStatusRequest notifyTransactionStatusRequest = (NotifyTransactionStatusRequest) rve.a(parcel, NotifyTransactionStatusRequest.CREATOR);
                    Bundle bundle4 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    notifyTransactionStatus(notifyTransactionStatusRequest, bundle4);
                    return true;
                case 5:
                    Bundle bundle5 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    IWalletServiceCallbacks asInterface4 = IWalletServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    checkForPreAuthorization(bundle5, asInterface4);
                    return true;
                case 6:
                    CreateWalletObjectsRequest createWalletObjectsRequest = (CreateWalletObjectsRequest) rve.a(parcel, CreateWalletObjectsRequest.CREATOR);
                    Bundle bundle6 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    IWalletServiceCallbacks asInterface5 = IWalletServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    createWalletObjects(createWalletObjectsRequest, bundle6, asInterface5);
                    return true;
                case 7:
                case 8:
                default:
                    return false;
                case 9:
                    Bundle bundle7 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    trackWalletFragmentButtonInitialized(bundle7);
                    return true;
                case 10:
                    Bundle bundle8 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    trackWalletFragmentButtonClicked(bundle8);
                    return true;
                case 11:
                    Bundle bundle9 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    IWalletServiceCallbacks asInterface6 = IWalletServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    isNewUser(bundle9, asInterface6);
                    return true;
                case 12:
                    GetBuyFlowInitializationTokenRequest getBuyFlowInitializationTokenRequest = (GetBuyFlowInitializationTokenRequest) rve.a(parcel, GetBuyFlowInitializationTokenRequest.CREATOR);
                    Bundle bundle10 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    IWalletServiceCallbacks asInterface7 = IWalletServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getBuyFlowInitializationToken(getBuyFlowInitializationTokenRequest, bundle10, asInterface7);
                    return true;
                case 13:
                    InitializeBuyFlowRequest initializeBuyFlowRequest = (InitializeBuyFlowRequest) rve.a(parcel, InitializeBuyFlowRequest.CREATOR);
                    Bundle bundle11 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    IWalletServiceCallbacks asInterface8 = IWalletServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    initializeBuyFlow(initializeBuyFlowRequest, bundle11, asInterface8);
                    return true;
                case 14:
                    IsReadyToPayRequest isReadyToPayRequest = (IsReadyToPayRequest) rve.a(parcel, IsReadyToPayRequest.CREATOR);
                    Bundle bundle12 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    IWalletServiceCallbacks asInterface9 = IWalletServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    isReadyToPay(isReadyToPayRequest, bundle12, asInterface9);
                    return true;
                case 15:
                    GetClientTokenRequest getClientTokenRequest = (GetClientTokenRequest) rve.a(parcel, GetClientTokenRequest.CREATOR);
                    Bundle bundle13 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    IWalletServiceCallbacks asInterface10 = IWalletServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getClientToken(getClientTokenRequest, bundle13, asInterface10);
                    return true;
                case 16:
                    ExecuteBuyFlowRequest executeBuyFlowRequest = (ExecuteBuyFlowRequest) rve.a(parcel, ExecuteBuyFlowRequest.CREATOR);
                    Bundle bundle14 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    IWalletServiceCallbacks asInterface11 = IWalletServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    executeBuyFlow(executeBuyFlowRequest, bundle14, asInterface11);
                    return true;
                case 17:
                    WebPaymentDataRequest webPaymentDataRequest = (WebPaymentDataRequest) rve.a(parcel, WebPaymentDataRequest.CREATOR);
                    Bundle bundle15 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    IWalletServiceCallbacks asInterface12 = IWalletServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    loadWebPaymentData(webPaymentDataRequest, bundle15, asInterface12);
                    return true;
                case 18:
                    SaveInstrumentRequest saveInstrumentRequest = (SaveInstrumentRequest) rve.a(parcel, SaveInstrumentRequest.CREATOR);
                    Bundle bundle16 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    IWalletServiceCallbacks asInterface13 = IWalletServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    saveInstrument(saveInstrumentRequest, bundle16, asInterface13);
                    return true;
                case 19:
                    PaymentDataRequest paymentDataRequest = (PaymentDataRequest) rve.a(parcel, PaymentDataRequest.CREATOR);
                    Bundle bundle17 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    IWalletServiceCallbacks asInterface14 = IWalletServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    loadPaymentData(paymentDataRequest, bundle17, asInterface14);
                    return true;
                case 20:
                    GetSaveInstrumentDetailsRequest getSaveInstrumentDetailsRequest = (GetSaveInstrumentDetailsRequest) rve.a(parcel, GetSaveInstrumentDetailsRequest.CREATOR);
                    Bundle bundle18 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    IWalletServiceCallbacks asInterface15 = IWalletServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getSaveInstrumentDetails(getSaveInstrumentDetailsRequest, bundle18, asInterface15);
                    return true;
                case 21:
                    SetUpBiometricAuthenticationKeysRequest setUpBiometricAuthenticationKeysRequest = (SetUpBiometricAuthenticationKeysRequest) rve.a(parcel, SetUpBiometricAuthenticationKeysRequest.CREATOR);
                    Bundle bundle19 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    IWalletServiceCallbacks asInterface16 = IWalletServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    setUpBiometricAuthenticationKeys(setUpBiometricAuthenticationKeysRequest, bundle19, asInterface16);
                    return true;
                case 22:
                    WarmUpUiProcessRequest warmUpUiProcessRequest = (WarmUpUiProcessRequest) rve.a(parcel, WarmUpUiProcessRequest.CREATOR);
                    Bundle bundle20 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    IWalletServiceCallbacks asInterface17 = IWalletServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    warmUpUiProcess(warmUpUiProcessRequest, bundle20, asInterface17);
                    return true;
                case 23:
                    GetSetupWizardIntentRequest getSetupWizardIntentRequest = (GetSetupWizardIntentRequest) rve.a(parcel, GetSetupWizardIntentRequest.CREATOR);
                    Bundle bundle21 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    IWalletServiceCallbacks asInterface18 = IWalletServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getSetupWizardIntent(getSetupWizardIntentRequest, bundle21, asInterface18);
                    return true;
                case 24:
                    PaymentCardRecognitionIntentRequest paymentCardRecognitionIntentRequest = (PaymentCardRecognitionIntentRequest) rve.a(parcel, PaymentCardRecognitionIntentRequest.CREATOR);
                    Bundle bundle22 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    IWalletServiceCallbacks asInterface19 = IWalletServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getPaymentCardRecognitionIntent(paymentCardRecognitionIntentRequest, bundle22, asInterface19);
                    return true;
                case 25:
                    Bundle bundle23 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    IWalletServiceCallbacks asInterface20 = IWalletServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getInstrumentAvailability(bundle23, asInterface20);
                    return true;
            }
        }
    }

    void changeMaskedWallet(String str, String str2, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks);

    void checkForPreAuthorization(Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks);

    void createWalletObjects(CreateWalletObjectsRequest createWalletObjectsRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks);

    void executeBuyFlow(ExecuteBuyFlowRequest executeBuyFlowRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks);

    void getBuyFlowInitializationToken(GetBuyFlowInitializationTokenRequest getBuyFlowInitializationTokenRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks);

    void getClientToken(GetClientTokenRequest getClientTokenRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks);

    void getFullWallet(FullWalletRequest fullWalletRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks);

    void getInstrumentAvailability(Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks);

    void getMaskedWalletForPreauthorizedBuyer(MaskedWalletRequest maskedWalletRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks);

    void getPaymentCardRecognitionIntent(PaymentCardRecognitionIntentRequest paymentCardRecognitionIntentRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks);

    void getSaveInstrumentDetails(GetSaveInstrumentDetailsRequest getSaveInstrumentDetailsRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks);

    void getSetupWizardIntent(GetSetupWizardIntentRequest getSetupWizardIntentRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks);

    void initializeBuyFlow(InitializeBuyFlowRequest initializeBuyFlowRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks);

    void isNewUser(Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks);

    void isReadyToPay(IsReadyToPayRequest isReadyToPayRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks);

    void loadPaymentData(PaymentDataRequest paymentDataRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks);

    void loadWebPaymentData(WebPaymentDataRequest webPaymentDataRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks);

    void notifyTransactionStatus(NotifyTransactionStatusRequest notifyTransactionStatusRequest, Bundle bundle);

    void saveInstrument(SaveInstrumentRequest saveInstrumentRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks);

    void setUpBiometricAuthenticationKeys(SetUpBiometricAuthenticationKeysRequest setUpBiometricAuthenticationKeysRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks);

    void trackWalletFragmentButtonClicked(Bundle bundle);

    void trackWalletFragmentButtonInitialized(Bundle bundle);

    void warmUpUiProcess(WarmUpUiProcessRequest warmUpUiProcessRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks);
}
