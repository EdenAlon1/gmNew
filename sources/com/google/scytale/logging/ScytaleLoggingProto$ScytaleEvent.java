package com.google.scytale.logging;

import defpackage.eyee;
import defpackage.eyel;
import defpackage.eyfc;
import defpackage.eyfr;
import defpackage.eyfx;
import defpackage.eyfy;
import defpackage.eyhs;
import defpackage.eyht;
import defpackage.eyhz;
import defpackage.faky;
import defpackage.fakz;
import defpackage.fala;
import defpackage.falb;
import defpackage.falc;
import defpackage.fald;
import defpackage.fale;
import defpackage.falf;
import defpackage.falg;
import defpackage.falh;
import defpackage.fali;
import defpackage.falj;
import defpackage.falk;
import defpackage.fall;
import defpackage.falm;
import defpackage.faln;
import defpackage.falo;
import defpackage.falp;
import defpackage.falq;
import defpackage.falr;
import defpackage.fals;
import defpackage.falt;
import defpackage.falu;
import defpackage.falv;
import defpackage.falw;
import defpackage.falx;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ScytaleLoggingProto$ScytaleEvent extends eyfy<ScytaleLoggingProto$ScytaleEvent, falu> implements eyht {
    public static final int API_RESULT_FIELD_NUMBER = 2;
    public static final int DATABASE_OPEN_ERROR_FIELD_NUMBER = 3;
    public static final int DECRYPTION_SUCCESSFUL_FIELD_NUMBER = 7;
    private static final ScytaleLoggingProto$ScytaleEvent DEFAULT_INSTANCE;
    public static final int ENCRYPTION_SUCCESSFUL_FIELD_NUMBER = 9;
    public static final int FAILED_TO_DECRYPT_FIELD_NUMBER = 6;
    public static final int FAILED_TO_ENCRYPT_FIELD_NUMBER = 8;
    public static final int FTD_SHOULD_NOT_BE_SENT_FIELD_NUMBER = 11;
    public static final int KEY_TRANSPARENCY_EVENT_FIELD_NUMBER = 12;
    private static volatile eyhz<ScytaleLoggingProto$ScytaleEvent> PARSER = null;
    public static final int PREKEY_FETCH_COMPLETE_FIELD_NUMBER = 10;
    public static final int SCHEMA_MIGRATION_END_FIELD_NUMBER = 5;
    public static final int SCHEMA_MIGRATION_START_FIELD_NUMBER = 4;
    public static final int SET_DEVICE_ID_EVENT_FIELD_NUMBER = 13;
    public static final int TRACE_ID_FIELD_NUMBER = 1;
    private Object event_;
    private int eventCase_ = 0;
    private String traceId_ = "";

    static {
        ScytaleLoggingProto$ScytaleEvent scytaleLoggingProto$ScytaleEvent = new ScytaleLoggingProto$ScytaleEvent();
        DEFAULT_INSTANCE = scytaleLoggingProto$ScytaleEvent;
        eyfy.registerDefaultInstance(ScytaleLoggingProto$ScytaleEvent.class, scytaleLoggingProto$ScytaleEvent);
    }

    private ScytaleLoggingProto$ScytaleEvent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApiResult() {
        if (this.eventCase_ == 2) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDatabaseOpenError() {
        if (this.eventCase_ == 3) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDecryptionSuccessful() {
        if (this.eventCase_ == 7) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEncryptionSuccessful() {
        if (this.eventCase_ == 9) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvent() {
        this.eventCase_ = 0;
        this.event_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFailedToDecrypt() {
        if (this.eventCase_ == 6) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFailedToEncrypt() {
        if (this.eventCase_ == 8) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFtdShouldNotBeSent() {
        if (this.eventCase_ == 11) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeyTransparencyEvent() {
        if (this.eventCase_ == 12) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrekeyFetchComplete() {
        if (this.eventCase_ == 10) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSchemaMigrationEnd() {
        if (this.eventCase_ == 5) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSchemaMigrationStart() {
        if (this.eventCase_ == 4) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSetDeviceIdEvent() {
        if (this.eventCase_ == 13) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTraceId() {
        this.traceId_ = getDefaultInstance().getTraceId();
    }

    public static ScytaleLoggingProto$ScytaleEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeApiResult(fakz fakzVar) {
        fakzVar.getClass();
        eyhs eyhsVar = fakzVar;
        if (this.eventCase_ == 2) {
            eyhsVar = fakzVar;
            if (this.event_ != fakz.a) {
                faky fakyVar = (faky) fakz.a.createBuilder((fakz) this.event_);
                fakyVar.mergeFrom((faky) fakzVar);
                eyhsVar = fakyVar.buildPartial();
            }
        }
        this.event_ = eyhsVar;
        this.eventCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDatabaseOpenError(falb falbVar) {
        falbVar.getClass();
        eyhs eyhsVar = falbVar;
        if (this.eventCase_ == 3) {
            eyhsVar = falbVar;
            if (this.event_ != falb.a) {
                fala falaVar = (fala) falb.a.createBuilder((falb) this.event_);
                falaVar.mergeFrom((fala) falbVar);
                eyhsVar = falaVar.buildPartial();
            }
        }
        this.event_ = eyhsVar;
        this.eventCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDecryptionSuccessful(fald faldVar) {
        faldVar.getClass();
        eyhs eyhsVar = faldVar;
        if (this.eventCase_ == 7) {
            eyhsVar = faldVar;
            if (this.event_ != fald.a) {
                falc falcVar = (falc) fald.a.createBuilder((fald) this.event_);
                falcVar.mergeFrom((falc) faldVar);
                eyhsVar = falcVar.buildPartial();
            }
        }
        this.event_ = eyhsVar;
        this.eventCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEncryptionSuccessful(falf falfVar) {
        falfVar.getClass();
        eyhs eyhsVar = falfVar;
        if (this.eventCase_ == 9) {
            eyhsVar = falfVar;
            if (this.event_ != falf.a) {
                fale faleVar = (fale) falf.a.createBuilder((falf) this.event_);
                faleVar.mergeFrom((fale) falfVar);
                eyhsVar = faleVar.buildPartial();
            }
        }
        this.event_ = eyhsVar;
        this.eventCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFailedToDecrypt(falh falhVar) {
        falhVar.getClass();
        eyhs eyhsVar = falhVar;
        if (this.eventCase_ == 6) {
            eyhsVar = falhVar;
            if (this.event_ != falh.a) {
                falg falgVar = (falg) falh.a.createBuilder((falh) this.event_);
                falgVar.mergeFrom((falg) falhVar);
                eyhsVar = falgVar.buildPartial();
            }
        }
        this.event_ = eyhsVar;
        this.eventCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFailedToEncrypt(falj faljVar) {
        faljVar.getClass();
        eyhs eyhsVar = faljVar;
        if (this.eventCase_ == 8) {
            eyhsVar = faljVar;
            if (this.event_ != falj.a) {
                fali faliVar = (fali) falj.a.createBuilder((falj) this.event_);
                faliVar.mergeFrom((fali) faljVar);
                eyhsVar = faliVar.buildPartial();
            }
        }
        this.event_ = eyhsVar;
        this.eventCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFtdShouldNotBeSent(fall fallVar) {
        fallVar.getClass();
        eyhs eyhsVar = fallVar;
        if (this.eventCase_ == 11) {
            eyhsVar = fallVar;
            if (this.event_ != fall.a) {
                falk falkVar = (falk) fall.a.createBuilder((fall) this.event_);
                falkVar.mergeFrom((falk) fallVar);
                eyhsVar = falkVar.buildPartial();
            }
        }
        this.event_ = eyhsVar;
        this.eventCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeKeyTransparencyEvent(faln falnVar) {
        falnVar.getClass();
        eyhs eyhsVar = falnVar;
        if (this.eventCase_ == 12) {
            eyhsVar = falnVar;
            if (this.event_ != faln.a) {
                falm falmVar = (falm) faln.a.createBuilder((faln) this.event_);
                falmVar.mergeFrom((falm) falnVar);
                eyhsVar = falmVar.buildPartial();
            }
        }
        this.event_ = eyhsVar;
        this.eventCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePrekeyFetchComplete(falp falpVar) {
        falpVar.getClass();
        eyhs eyhsVar = falpVar;
        if (this.eventCase_ == 10) {
            eyhsVar = falpVar;
            if (this.event_ != falp.a) {
                falo faloVar = (falo) falp.a.createBuilder((falp) this.event_);
                faloVar.mergeFrom((falo) falpVar);
                eyhsVar = faloVar.buildPartial();
            }
        }
        this.event_ = eyhsVar;
        this.eventCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSchemaMigrationEnd(falr falrVar) {
        falrVar.getClass();
        eyhs eyhsVar = falrVar;
        if (this.eventCase_ == 5) {
            eyhsVar = falrVar;
            if (this.event_ != falr.a) {
                falq falqVar = (falq) falr.a.createBuilder((falr) this.event_);
                falqVar.mergeFrom((falq) falrVar);
                eyhsVar = falqVar.buildPartial();
            }
        }
        this.event_ = eyhsVar;
        this.eventCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSchemaMigrationStart(falt faltVar) {
        faltVar.getClass();
        eyhs eyhsVar = faltVar;
        if (this.eventCase_ == 4) {
            eyhsVar = faltVar;
            if (this.event_ != falt.a) {
                fals falsVar = (fals) falt.a.createBuilder((falt) this.event_);
                falsVar.mergeFrom((fals) faltVar);
                eyhsVar = falsVar.buildPartial();
            }
        }
        this.event_ = eyhsVar;
        this.eventCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSetDeviceIdEvent(falx falxVar) {
        falxVar.getClass();
        eyhs eyhsVar = falxVar;
        if (this.eventCase_ == 13) {
            eyhsVar = falxVar;
            if (this.event_ != falx.a) {
                falw falwVar = (falw) falx.a.createBuilder((falx) this.event_);
                falwVar.mergeFrom((falw) falxVar);
                eyhsVar = falwVar.buildPartial();
            }
        }
        this.event_ = eyhsVar;
        this.eventCase_ = 13;
    }

    public static falu newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ScytaleLoggingProto$ScytaleEvent parseDelimitedFrom(InputStream inputStream) {
        return (ScytaleLoggingProto$ScytaleEvent) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ScytaleLoggingProto$ScytaleEvent parseFrom(eyee eyeeVar) {
        return (ScytaleLoggingProto$ScytaleEvent) eyfy.parseFrom(DEFAULT_INSTANCE, eyeeVar);
    }

    public static eyhz<ScytaleLoggingProto$ScytaleEvent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApiResult(fakz fakzVar) {
        fakzVar.getClass();
        this.event_ = fakzVar;
        this.eventCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDatabaseOpenError(falb falbVar) {
        falbVar.getClass();
        this.event_ = falbVar;
        this.eventCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDecryptionSuccessful(fald faldVar) {
        faldVar.getClass();
        this.event_ = faldVar;
        this.eventCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEncryptionSuccessful(falf falfVar) {
        falfVar.getClass();
        this.event_ = falfVar;
        this.eventCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailedToDecrypt(falh falhVar) {
        falhVar.getClass();
        this.event_ = falhVar;
        this.eventCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailedToEncrypt(falj faljVar) {
        faljVar.getClass();
        this.event_ = faljVar;
        this.eventCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFtdShouldNotBeSent(fall fallVar) {
        fallVar.getClass();
        this.event_ = fallVar;
        this.eventCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyTransparencyEvent(faln falnVar) {
        falnVar.getClass();
        this.event_ = falnVar;
        this.eventCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrekeyFetchComplete(falp falpVar) {
        falpVar.getClass();
        this.event_ = falpVar;
        this.eventCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSchemaMigrationEnd(falr falrVar) {
        falrVar.getClass();
        this.event_ = falrVar;
        this.eventCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSchemaMigrationStart(falt faltVar) {
        faltVar.getClass();
        this.event_ = faltVar;
        this.eventCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSetDeviceIdEvent(falx falxVar) {
        falxVar.getClass();
        this.event_ = falxVar;
        this.eventCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTraceId(String str) {
        str.getClass();
        this.traceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTraceIdBytes(eyee eyeeVar) {
        checkByteStringIsUtf8(eyeeVar);
        this.traceId_ = eyeeVar.E();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\r\u0001\u0000\u0001\r\r\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000", new Object[]{"event_", "eventCase_", "traceId_", fakz.class, falb.class, falt.class, falr.class, falh.class, fald.class, falj.class, falf.class, falp.class, fall.class, faln.class, falx.class});
        }
        if (ordinal == 3) {
            return new ScytaleLoggingProto$ScytaleEvent();
        }
        if (ordinal == 4) {
            return new falu();
        }
        if (ordinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz<ScytaleLoggingProto$ScytaleEvent> eyhzVar2 = PARSER;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ScytaleLoggingProto$ScytaleEvent.class) {
            eyhzVar = PARSER;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(DEFAULT_INSTANCE);
                PARSER = eyhzVar;
            }
        }
        return eyhzVar;
    }

    public fakz getApiResult() {
        return this.eventCase_ == 2 ? (fakz) this.event_ : fakz.a;
    }

    public falb getDatabaseOpenError() {
        return this.eventCase_ == 3 ? (falb) this.event_ : falb.a;
    }

    public fald getDecryptionSuccessful() {
        return this.eventCase_ == 7 ? (fald) this.event_ : fald.a;
    }

    public falf getEncryptionSuccessful() {
        return this.eventCase_ == 9 ? (falf) this.event_ : falf.a;
    }

    public falv getEventCase() {
        int i = this.eventCase_;
        if (i == 0) {
            return falv.EVENT_NOT_SET;
        }
        switch (i) {
            case 2:
                return falv.API_RESULT;
            case 3:
                return falv.DATABASE_OPEN_ERROR;
            case 4:
                return falv.SCHEMA_MIGRATION_START;
            case 5:
                return falv.SCHEMA_MIGRATION_END;
            case 6:
                return falv.FAILED_TO_DECRYPT;
            case 7:
                return falv.DECRYPTION_SUCCESSFUL;
            case 8:
                return falv.FAILED_TO_ENCRYPT;
            case 9:
                return falv.ENCRYPTION_SUCCESSFUL;
            case 10:
                return falv.PREKEY_FETCH_COMPLETE;
            case 11:
                return falv.FTD_SHOULD_NOT_BE_SENT;
            case 12:
                return falv.KEY_TRANSPARENCY_EVENT;
            case 13:
                return falv.SET_DEVICE_ID_EVENT;
            default:
                return null;
        }
    }

    public falh getFailedToDecrypt() {
        return this.eventCase_ == 6 ? (falh) this.event_ : falh.a;
    }

    public falj getFailedToEncrypt() {
        return this.eventCase_ == 8 ? (falj) this.event_ : falj.a;
    }

    public fall getFtdShouldNotBeSent() {
        return this.eventCase_ == 11 ? (fall) this.event_ : fall.a;
    }

    public faln getKeyTransparencyEvent() {
        return this.eventCase_ == 12 ? (faln) this.event_ : faln.a;
    }

    public falp getPrekeyFetchComplete() {
        return this.eventCase_ == 10 ? (falp) this.event_ : falp.a;
    }

    public falr getSchemaMigrationEnd() {
        return this.eventCase_ == 5 ? (falr) this.event_ : falr.a;
    }

    public falt getSchemaMigrationStart() {
        return this.eventCase_ == 4 ? (falt) this.event_ : falt.a;
    }

    public falx getSetDeviceIdEvent() {
        return this.eventCase_ == 13 ? (falx) this.event_ : falx.a;
    }

    public String getTraceId() {
        return this.traceId_;
    }

    public eyee getTraceIdBytes() {
        return eyee.A(this.traceId_);
    }

    public boolean hasApiResult() {
        return this.eventCase_ == 2;
    }

    public boolean hasDatabaseOpenError() {
        return this.eventCase_ == 3;
    }

    public boolean hasDecryptionSuccessful() {
        return this.eventCase_ == 7;
    }

    public boolean hasEncryptionSuccessful() {
        return this.eventCase_ == 9;
    }

    public boolean hasFailedToDecrypt() {
        return this.eventCase_ == 6;
    }

    public boolean hasFailedToEncrypt() {
        return this.eventCase_ == 8;
    }

    public boolean hasFtdShouldNotBeSent() {
        return this.eventCase_ == 11;
    }

    public boolean hasKeyTransparencyEvent() {
        return this.eventCase_ == 12;
    }

    public boolean hasPrekeyFetchComplete() {
        return this.eventCase_ == 10;
    }

    public boolean hasSchemaMigrationEnd() {
        return this.eventCase_ == 5;
    }

    public boolean hasSchemaMigrationStart() {
        return this.eventCase_ == 4;
    }

    public boolean hasSetDeviceIdEvent() {
        return this.eventCase_ == 13;
    }

    public static falu newBuilder(ScytaleLoggingProto$ScytaleEvent scytaleLoggingProto$ScytaleEvent) {
        return DEFAULT_INSTANCE.createBuilder(scytaleLoggingProto$ScytaleEvent);
    }

    public static ScytaleLoggingProto$ScytaleEvent parseDelimitedFrom(InputStream inputStream, eyfc eyfcVar) {
        return (ScytaleLoggingProto$ScytaleEvent) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, eyfcVar);
    }

    public static ScytaleLoggingProto$ScytaleEvent parseFrom(eyee eyeeVar, eyfc eyfcVar) {
        return (ScytaleLoggingProto$ScytaleEvent) eyfy.parseFrom(DEFAULT_INSTANCE, eyeeVar, eyfcVar);
    }

    public static ScytaleLoggingProto$ScytaleEvent parseFrom(eyel eyelVar) {
        return (ScytaleLoggingProto$ScytaleEvent) eyfy.parseFrom(DEFAULT_INSTANCE, eyelVar);
    }

    public static ScytaleLoggingProto$ScytaleEvent parseFrom(eyel eyelVar, eyfc eyfcVar) {
        return (ScytaleLoggingProto$ScytaleEvent) eyfy.parseFrom(DEFAULT_INSTANCE, eyelVar, eyfcVar);
    }

    public static ScytaleLoggingProto$ScytaleEvent parseFrom(InputStream inputStream) {
        return (ScytaleLoggingProto$ScytaleEvent) eyfy.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ScytaleLoggingProto$ScytaleEvent parseFrom(InputStream inputStream, eyfc eyfcVar) {
        return (ScytaleLoggingProto$ScytaleEvent) eyfy.parseFrom(DEFAULT_INSTANCE, inputStream, eyfcVar);
    }

    public static ScytaleLoggingProto$ScytaleEvent parseFrom(ByteBuffer byteBuffer) {
        return (ScytaleLoggingProto$ScytaleEvent) eyfy.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ScytaleLoggingProto$ScytaleEvent parseFrom(ByteBuffer byteBuffer, eyfc eyfcVar) {
        return (ScytaleLoggingProto$ScytaleEvent) eyfy.parseFrom(DEFAULT_INSTANCE, byteBuffer, eyfcVar);
    }

    public static ScytaleLoggingProto$ScytaleEvent parseFrom(byte[] bArr) {
        return (ScytaleLoggingProto$ScytaleEvent) eyfy.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ScytaleLoggingProto$ScytaleEvent parseFrom(byte[] bArr, eyfc eyfcVar) {
        return (ScytaleLoggingProto$ScytaleEvent) eyfy.parseFrom(DEFAULT_INSTANCE, bArr, eyfcVar);
    }
}
