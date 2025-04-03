package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.apps.aicore.aidl.IAstroboyService;
import com.google.android.apps.aicore.aidl.IBaymaxService;
import com.google.android.apps.aicore.aidl.IDownloadListener;
import com.google.android.apps.aicore.aidl.IDownloadListener2;
import com.google.android.apps.aicore.aidl.IImageDescriptionService;
import com.google.android.apps.aicore.aidl.IInfoExtractionService;
import com.google.android.apps.aicore.aidl.ILLMService;
import com.google.android.apps.aicore.aidl.IMagicRewriteService;
import com.google.android.apps.aicore.aidl.IMockService;
import com.google.android.apps.aicore.aidl.IOcrService;
import com.google.android.apps.aicore.aidl.IOptimusService;
import com.google.android.apps.aicore.aidl.IProofreadingService;
import com.google.android.apps.aicore.aidl.IQuestionToAnswerService;
import com.google.android.apps.aicore.aidl.IRosieRobotService;
import com.google.android.apps.aicore.aidl.ISmartReplyService;
import com.google.android.apps.aicore.aidl.ISonnyService;
import com.google.android.apps.aicore.aidl.ISuggestedTextService;
import com.google.android.apps.aicore.aidl.ISummarizationService;
import com.google.android.apps.aicore.aidl.ITarsService;
import com.google.android.apps.aicore.aidl.ITextClassificationService;
import com.google.android.apps.aicore.aidl.ITextEmbeddingService;
import com.google.android.apps.aicore.aidl.ITextToImageService;
import defpackage.rve;
import defpackage.rvg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IAICoreService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAICoreService {
        static final int TRANSACTION_getApiVersion = 11;
        static final int TRANSACTION_getAstroboyService = 28;
        static final int TRANSACTION_getBaymaxService = 25;
        static final int TRANSACTION_getDownloadableSizeInBytes = 19;
        static final int TRANSACTION_getFeature = 14;
        static final int TRANSACTION_getFeatureOrControl = 32;
        static final int TRANSACTION_getFeatureStatus = 3;
        static final int TRANSACTION_getImageDescriptionService = 30;
        static final int TRANSACTION_getInfoExtractionService = 24;
        static final int TRANSACTION_getLLMService = 5;
        static final int TRANSACTION_getMagicRewriteService = 15;
        static final int TRANSACTION_getMockService = 20;
        static final int TRANSACTION_getOcrService = 18;
        static final int TRANSACTION_getOptimusService = 29;
        static final int TRANSACTION_getProofreadingService = 9;
        static final int TRANSACTION_getQuestionToAnswerService = 23;
        static final int TRANSACTION_getRosieRobotService = 27;
        static final int TRANSACTION_getSmartReplyService = 8;
        static final int TRANSACTION_getSonnyService = 31;
        static final int TRANSACTION_getSuggestedTextService = 16;
        static final int TRANSACTION_getSummarizationService = 6;
        static final int TRANSACTION_getTarsService = 26;
        static final int TRANSACTION_getTextClassificationService = 21;
        static final int TRANSACTION_getTextEmbeddingService = 17;
        static final int TRANSACTION_getTextToImageService = 10;
        static final int TRANSACTION_getTokenCapacity = 22;
        static final int TRANSACTION_initializeSafety = 33;
        static final int TRANSACTION_isPersistentModeEnabled = 13;
        static final int TRANSACTION_listFeatures = 2;
        static final int TRANSACTION_requestDownloadableFeature = 4;
        static final int TRANSACTION_requestDownloadableFeatureWithDownloadListener = 7;
        static final int TRANSACTION_requestDownloadableFeatureWithDownloadListener2 = 12;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAICoreService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IAICoreService");
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public int getApiVersion() {
                Parcel transactAndReadException = transactAndReadException(11, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public IAstroboyService getAstroboyService(rvg rvgVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rvgVar);
                Parcel transactAndReadException = transactAndReadException(28, obtainAndWriteInterfaceToken);
                IAstroboyService asInterface = IAstroboyService.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public IBaymaxService getBaymaxService(rvg rvgVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rvgVar);
                Parcel transactAndReadException = transactAndReadException(25, obtainAndWriteInterfaceToken);
                IBaymaxService asInterface = IBaymaxService.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public long getDownloadableSizeInBytes(rvg rvgVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rvgVar);
                Parcel transactAndReadException = transactAndReadException(19, obtainAndWriteInterfaceToken);
                long readLong = transactAndReadException.readLong();
                transactAndReadException.recycle();
                return readLong;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public rvg getFeature(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                Parcel transactAndReadException = transactAndReadException(14, obtainAndWriteInterfaceToken);
                rvg rvgVar = (rvg) rve.a(transactAndReadException, rvg.CREATOR);
                transactAndReadException.recycle();
                return rvgVar;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public rvg getFeatureOrControl(int i, int i2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                Parcel transactAndReadException = transactAndReadException(32, obtainAndWriteInterfaceToken);
                rvg rvgVar = (rvg) rve.a(transactAndReadException, rvg.CREATOR);
                transactAndReadException.recycle();
                return rvgVar;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public int getFeatureStatus(rvg rvgVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rvgVar);
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public IImageDescriptionService getImageDescriptionService(rvg rvgVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rvgVar);
                Parcel transactAndReadException = transactAndReadException(30, obtainAndWriteInterfaceToken);
                IImageDescriptionService asInterface = IImageDescriptionService.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public IInfoExtractionService getInfoExtractionService(rvg rvgVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rvgVar);
                Parcel transactAndReadException = transactAndReadException(24, obtainAndWriteInterfaceToken);
                IInfoExtractionService asInterface = IInfoExtractionService.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public ILLMService getLLMService(rvg rvgVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rvgVar);
                Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken);
                ILLMService asInterface = ILLMService.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public IMagicRewriteService getMagicRewriteService(rvg rvgVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rvgVar);
                Parcel transactAndReadException = transactAndReadException(15, obtainAndWriteInterfaceToken);
                IMagicRewriteService asInterface = IMagicRewriteService.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public IMockService getMockService() {
                Parcel transactAndReadException = transactAndReadException(20, obtainAndWriteInterfaceToken());
                IMockService asInterface = IMockService.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public IOcrService getOcrService(rvg rvgVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rvgVar);
                Parcel transactAndReadException = transactAndReadException(18, obtainAndWriteInterfaceToken);
                IOcrService asInterface = IOcrService.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public IOptimusService getOptimusService(rvg rvgVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rvgVar);
                Parcel transactAndReadException = transactAndReadException(29, obtainAndWriteInterfaceToken);
                IOptimusService asInterface = IOptimusService.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public IProofreadingService getProofreadingService(rvg rvgVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rvgVar);
                Parcel transactAndReadException = transactAndReadException(9, obtainAndWriteInterfaceToken);
                IProofreadingService asInterface = IProofreadingService.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public IQuestionToAnswerService getQuestionToAnswerService(rvg rvgVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rvgVar);
                Parcel transactAndReadException = transactAndReadException(23, obtainAndWriteInterfaceToken);
                IQuestionToAnswerService asInterface = IQuestionToAnswerService.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public IRosieRobotService getRosieRobotService(rvg rvgVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rvgVar);
                Parcel transactAndReadException = transactAndReadException(27, obtainAndWriteInterfaceToken);
                IRosieRobotService asInterface = IRosieRobotService.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public ISmartReplyService getSmartReplyService(rvg rvgVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rvgVar);
                Parcel transactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken);
                ISmartReplyService asInterface = ISmartReplyService.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public ISonnyService getSonnyService(rvg rvgVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rvgVar);
                Parcel transactAndReadException = transactAndReadException(31, obtainAndWriteInterfaceToken);
                ISonnyService asInterface = ISonnyService.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public ISuggestedTextService getSuggestedTextService(rvg rvgVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rvgVar);
                Parcel transactAndReadException = transactAndReadException(16, obtainAndWriteInterfaceToken);
                ISuggestedTextService asInterface = ISuggestedTextService.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public ISummarizationService getSummarizationService(rvg rvgVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rvgVar);
                Parcel transactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken);
                ISummarizationService asInterface = ISummarizationService.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public ITarsService getTarsService(rvg rvgVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rvgVar);
                Parcel transactAndReadException = transactAndReadException(26, obtainAndWriteInterfaceToken);
                ITarsService asInterface = ITarsService.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public ITextClassificationService getTextClassificationService(rvg rvgVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rvgVar);
                Parcel transactAndReadException = transactAndReadException(21, obtainAndWriteInterfaceToken);
                ITextClassificationService asInterface = ITextClassificationService.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public ITextEmbeddingService getTextEmbeddingService(rvg rvgVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rvgVar);
                Parcel transactAndReadException = transactAndReadException(17, obtainAndWriteInterfaceToken);
                ITextEmbeddingService asInterface = ITextEmbeddingService.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public ITextToImageService getTextToImageService(rvg rvgVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rvgVar);
                Parcel transactAndReadException = transactAndReadException(10, obtainAndWriteInterfaceToken);
                ITextToImageService asInterface = ITextToImageService.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public int getTokenCapacity(rvg rvgVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rvgVar);
                Parcel transactAndReadException = transactAndReadException(22, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public void initializeSafety(rvg rvgVar, IDownloadListener2 iDownloadListener2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rvgVar);
                rve.f(obtainAndWriteInterfaceToken, iDownloadListener2);
                transactAndReadExceptionReturnVoid(33, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public boolean isPersistentModeEnabled() {
                Parcel transactAndReadException = transactAndReadException(13, obtainAndWriteInterfaceToken());
                boolean g = rve.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public rvg[] listFeatures() {
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                rvg[] rvgVarArr = (rvg[]) transactAndReadException.createTypedArray(rvg.CREATOR);
                transactAndReadException.recycle();
                return rvgVarArr;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public int requestDownloadableFeature(rvg rvgVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rvgVar);
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public int requestDownloadableFeatureWithDownloadListener(rvg rvgVar, IDownloadListener iDownloadListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rvgVar);
                rve.f(obtainAndWriteInterfaceToken, iDownloadListener);
                Parcel transactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public int requestDownloadableFeatureWithDownloadListener2(rvg rvgVar, IDownloadListener2 iDownloadListener2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rvgVar);
                rve.f(obtainAndWriteInterfaceToken, iDownloadListener2);
                Parcel transactAndReadException = transactAndReadException(12, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IAICoreService");
        }

        public static IAICoreService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IAICoreService");
            return queryLocalInterface instanceof IAICoreService ? (IAICoreService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    rvg[] listFeatures = listFeatures();
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(listFeatures, 1);
                    return true;
                case 3:
                    rvg rvgVar = (rvg) rve.a(parcel, rvg.CREATOR);
                    enforceNoDataAvail(parcel);
                    int featureStatus = getFeatureStatus(rvgVar);
                    parcel2.writeNoException();
                    parcel2.writeInt(featureStatus);
                    return true;
                case 4:
                    rvg rvgVar2 = (rvg) rve.a(parcel, rvg.CREATOR);
                    enforceNoDataAvail(parcel);
                    int requestDownloadableFeature = requestDownloadableFeature(rvgVar2);
                    parcel2.writeNoException();
                    parcel2.writeInt(requestDownloadableFeature);
                    return true;
                case 5:
                    rvg rvgVar3 = (rvg) rve.a(parcel, rvg.CREATOR);
                    enforceNoDataAvail(parcel);
                    ILLMService lLMService = getLLMService(rvgVar3);
                    parcel2.writeNoException();
                    rve.f(parcel2, lLMService);
                    return true;
                case 6:
                    rvg rvgVar4 = (rvg) rve.a(parcel, rvg.CREATOR);
                    enforceNoDataAvail(parcel);
                    ISummarizationService summarizationService = getSummarizationService(rvgVar4);
                    parcel2.writeNoException();
                    rve.f(parcel2, summarizationService);
                    return true;
                case 7:
                    rvg rvgVar5 = (rvg) rve.a(parcel, rvg.CREATOR);
                    IDownloadListener asInterface = IDownloadListener.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    int requestDownloadableFeatureWithDownloadListener = requestDownloadableFeatureWithDownloadListener(rvgVar5, asInterface);
                    parcel2.writeNoException();
                    parcel2.writeInt(requestDownloadableFeatureWithDownloadListener);
                    return true;
                case 8:
                    rvg rvgVar6 = (rvg) rve.a(parcel, rvg.CREATOR);
                    enforceNoDataAvail(parcel);
                    ISmartReplyService smartReplyService = getSmartReplyService(rvgVar6);
                    parcel2.writeNoException();
                    rve.f(parcel2, smartReplyService);
                    return true;
                case 9:
                    rvg rvgVar7 = (rvg) rve.a(parcel, rvg.CREATOR);
                    enforceNoDataAvail(parcel);
                    IProofreadingService proofreadingService = getProofreadingService(rvgVar7);
                    parcel2.writeNoException();
                    rve.f(parcel2, proofreadingService);
                    return true;
                case 10:
                    rvg rvgVar8 = (rvg) rve.a(parcel, rvg.CREATOR);
                    enforceNoDataAvail(parcel);
                    ITextToImageService textToImageService = getTextToImageService(rvgVar8);
                    parcel2.writeNoException();
                    rve.f(parcel2, textToImageService);
                    return true;
                case 11:
                    int apiVersion = getApiVersion();
                    parcel2.writeNoException();
                    parcel2.writeInt(apiVersion);
                    return true;
                case 12:
                    rvg rvgVar9 = (rvg) rve.a(parcel, rvg.CREATOR);
                    IDownloadListener2 asInterface2 = IDownloadListener2.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    int requestDownloadableFeatureWithDownloadListener2 = requestDownloadableFeatureWithDownloadListener2(rvgVar9, asInterface2);
                    parcel2.writeNoException();
                    parcel2.writeInt(requestDownloadableFeatureWithDownloadListener2);
                    return true;
                case 13:
                    boolean isPersistentModeEnabled = isPersistentModeEnabled();
                    parcel2.writeNoException();
                    int i3 = rve.a;
                    parcel2.writeInt(isPersistentModeEnabled ? 1 : 0);
                    return true;
                case 14:
                    int readInt = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    rvg feature = getFeature(readInt);
                    parcel2.writeNoException();
                    rve.e(parcel2, feature);
                    return true;
                case 15:
                    rvg rvgVar10 = (rvg) rve.a(parcel, rvg.CREATOR);
                    enforceNoDataAvail(parcel);
                    IMagicRewriteService magicRewriteService = getMagicRewriteService(rvgVar10);
                    parcel2.writeNoException();
                    rve.f(parcel2, magicRewriteService);
                    return true;
                case 16:
                    rvg rvgVar11 = (rvg) rve.a(parcel, rvg.CREATOR);
                    enforceNoDataAvail(parcel);
                    ISuggestedTextService suggestedTextService = getSuggestedTextService(rvgVar11);
                    parcel2.writeNoException();
                    rve.f(parcel2, suggestedTextService);
                    return true;
                case 17:
                    rvg rvgVar12 = (rvg) rve.a(parcel, rvg.CREATOR);
                    enforceNoDataAvail(parcel);
                    ITextEmbeddingService textEmbeddingService = getTextEmbeddingService(rvgVar12);
                    parcel2.writeNoException();
                    rve.f(parcel2, textEmbeddingService);
                    return true;
                case 18:
                    rvg rvgVar13 = (rvg) rve.a(parcel, rvg.CREATOR);
                    enforceNoDataAvail(parcel);
                    IOcrService ocrService = getOcrService(rvgVar13);
                    parcel2.writeNoException();
                    rve.f(parcel2, ocrService);
                    return true;
                case 19:
                    rvg rvgVar14 = (rvg) rve.a(parcel, rvg.CREATOR);
                    enforceNoDataAvail(parcel);
                    long downloadableSizeInBytes = getDownloadableSizeInBytes(rvgVar14);
                    parcel2.writeNoException();
                    parcel2.writeLong(downloadableSizeInBytes);
                    return true;
                case 20:
                    IMockService mockService = getMockService();
                    parcel2.writeNoException();
                    rve.f(parcel2, mockService);
                    return true;
                case 21:
                    rvg rvgVar15 = (rvg) rve.a(parcel, rvg.CREATOR);
                    enforceNoDataAvail(parcel);
                    ITextClassificationService textClassificationService = getTextClassificationService(rvgVar15);
                    parcel2.writeNoException();
                    rve.f(parcel2, textClassificationService);
                    return true;
                case 22:
                    rvg rvgVar16 = (rvg) rve.a(parcel, rvg.CREATOR);
                    enforceNoDataAvail(parcel);
                    int tokenCapacity = getTokenCapacity(rvgVar16);
                    parcel2.writeNoException();
                    parcel2.writeInt(tokenCapacity);
                    return true;
                case 23:
                    rvg rvgVar17 = (rvg) rve.a(parcel, rvg.CREATOR);
                    enforceNoDataAvail(parcel);
                    IQuestionToAnswerService questionToAnswerService = getQuestionToAnswerService(rvgVar17);
                    parcel2.writeNoException();
                    rve.f(parcel2, questionToAnswerService);
                    return true;
                case 24:
                    rvg rvgVar18 = (rvg) rve.a(parcel, rvg.CREATOR);
                    enforceNoDataAvail(parcel);
                    IInfoExtractionService infoExtractionService = getInfoExtractionService(rvgVar18);
                    parcel2.writeNoException();
                    rve.f(parcel2, infoExtractionService);
                    return true;
                case 25:
                    rvg rvgVar19 = (rvg) rve.a(parcel, rvg.CREATOR);
                    enforceNoDataAvail(parcel);
                    IBaymaxService baymaxService = getBaymaxService(rvgVar19);
                    parcel2.writeNoException();
                    rve.f(parcel2, baymaxService);
                    return true;
                case 26:
                    rvg rvgVar20 = (rvg) rve.a(parcel, rvg.CREATOR);
                    enforceNoDataAvail(parcel);
                    ITarsService tarsService = getTarsService(rvgVar20);
                    parcel2.writeNoException();
                    rve.f(parcel2, tarsService);
                    return true;
                case 27:
                    rvg rvgVar21 = (rvg) rve.a(parcel, rvg.CREATOR);
                    enforceNoDataAvail(parcel);
                    IRosieRobotService rosieRobotService = getRosieRobotService(rvgVar21);
                    parcel2.writeNoException();
                    rve.f(parcel2, rosieRobotService);
                    return true;
                case 28:
                    rvg rvgVar22 = (rvg) rve.a(parcel, rvg.CREATOR);
                    enforceNoDataAvail(parcel);
                    IAstroboyService astroboyService = getAstroboyService(rvgVar22);
                    parcel2.writeNoException();
                    rve.f(parcel2, astroboyService);
                    return true;
                case 29:
                    rvg rvgVar23 = (rvg) rve.a(parcel, rvg.CREATOR);
                    enforceNoDataAvail(parcel);
                    IOptimusService optimusService = getOptimusService(rvgVar23);
                    parcel2.writeNoException();
                    rve.f(parcel2, optimusService);
                    return true;
                case 30:
                    rvg rvgVar24 = (rvg) rve.a(parcel, rvg.CREATOR);
                    enforceNoDataAvail(parcel);
                    IImageDescriptionService imageDescriptionService = getImageDescriptionService(rvgVar24);
                    parcel2.writeNoException();
                    rve.f(parcel2, imageDescriptionService);
                    return true;
                case 31:
                    rvg rvgVar25 = (rvg) rve.a(parcel, rvg.CREATOR);
                    enforceNoDataAvail(parcel);
                    ISonnyService sonnyService = getSonnyService(rvgVar25);
                    parcel2.writeNoException();
                    rve.f(parcel2, sonnyService);
                    return true;
                case 32:
                    int readInt2 = parcel.readInt();
                    int readInt3 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    rvg featureOrControl = getFeatureOrControl(readInt2, readInt3);
                    parcel2.writeNoException();
                    rve.e(parcel2, featureOrControl);
                    return true;
                case 33:
                    rvg rvgVar26 = (rvg) rve.a(parcel, rvg.CREATOR);
                    IDownloadListener2 asInterface3 = IDownloadListener2.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    initializeSafety(rvgVar26, asInterface3);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    int getApiVersion();

    IAstroboyService getAstroboyService(rvg rvgVar);

    IBaymaxService getBaymaxService(rvg rvgVar);

    long getDownloadableSizeInBytes(rvg rvgVar);

    rvg getFeature(int i);

    rvg getFeatureOrControl(int i, int i2);

    int getFeatureStatus(rvg rvgVar);

    IImageDescriptionService getImageDescriptionService(rvg rvgVar);

    IInfoExtractionService getInfoExtractionService(rvg rvgVar);

    ILLMService getLLMService(rvg rvgVar);

    IMagicRewriteService getMagicRewriteService(rvg rvgVar);

    IMockService getMockService();

    IOcrService getOcrService(rvg rvgVar);

    IOptimusService getOptimusService(rvg rvgVar);

    IProofreadingService getProofreadingService(rvg rvgVar);

    IQuestionToAnswerService getQuestionToAnswerService(rvg rvgVar);

    IRosieRobotService getRosieRobotService(rvg rvgVar);

    ISmartReplyService getSmartReplyService(rvg rvgVar);

    ISonnyService getSonnyService(rvg rvgVar);

    ISuggestedTextService getSuggestedTextService(rvg rvgVar);

    ISummarizationService getSummarizationService(rvg rvgVar);

    ITarsService getTarsService(rvg rvgVar);

    ITextClassificationService getTextClassificationService(rvg rvgVar);

    ITextEmbeddingService getTextEmbeddingService(rvg rvgVar);

    ITextToImageService getTextToImageService(rvg rvgVar);

    int getTokenCapacity(rvg rvgVar);

    void initializeSafety(rvg rvgVar, IDownloadListener2 iDownloadListener2);

    boolean isPersistentModeEnabled();

    rvg[] listFeatures();

    int requestDownloadableFeature(rvg rvgVar);

    @Deprecated
    int requestDownloadableFeatureWithDownloadListener(rvg rvgVar, IDownloadListener iDownloadListener);

    int requestDownloadableFeatureWithDownloadListener2(rvg rvgVar, IDownloadListener2 iDownloadListener2);
}
