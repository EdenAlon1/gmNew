package com.google.communication.synapse.security.scytale;

import defpackage.esot;
import defpackage.eyee;
import defpackage.eyel;
import defpackage.eyfc;
import defpackage.eyfr;
import defpackage.eyfx;
import defpackage.eyfy;
import defpackage.eyht;
import defpackage.eyhz;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig extends eyfy<ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig, esot> implements eyht {
    private static final ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig DEFAULT_INSTANCE;
    private static volatile eyhz<ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig> PARSER = null;
    public static final int RUN_PER_TABLE_SCHEMA_VALIDATION_FIELD_NUMBER = 2;
    public static final int RUN_SQLITE_MASTER_SCHEMA_VALIDATION_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean runPerTableSchemaValidation_;
    private boolean runSqliteMasterSchemaValidation_;

    static {
        ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig scytaleExperimentConfigOuterClass$ScytaleExperimentConfig = new ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig();
        DEFAULT_INSTANCE = scytaleExperimentConfigOuterClass$ScytaleExperimentConfig;
        eyfy.registerDefaultInstance(ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig.class, scytaleExperimentConfigOuterClass$ScytaleExperimentConfig);
    }

    private ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRunPerTableSchemaValidation() {
        this.bitField0_ &= -3;
        this.runPerTableSchemaValidation_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRunSqliteMasterSchemaValidation() {
        this.bitField0_ &= -2;
        this.runSqliteMasterSchemaValidation_ = false;
    }

    public static ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static esot newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig parseDelimitedFrom(InputStream inputStream) {
        return (ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig parseFrom(eyee eyeeVar) {
        return (ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig) eyfy.parseFrom(DEFAULT_INSTANCE, eyeeVar);
    }

    public static eyhz<ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRunPerTableSchemaValidation(boolean z) {
        this.bitField0_ |= 2;
        this.runPerTableSchemaValidation_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRunSqliteMasterSchemaValidation(boolean z) {
        this.bitField0_ |= 1;
        this.runSqliteMasterSchemaValidation_ = z;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "runSqliteMasterSchemaValidation_", "runPerTableSchemaValidation_"});
        }
        if (ordinal == 3) {
            return new ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig();
        }
        if (ordinal == 4) {
            return new esot();
        }
        if (ordinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz<ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig> eyhzVar2 = PARSER;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig.class) {
            eyhzVar = PARSER;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(DEFAULT_INSTANCE);
                PARSER = eyhzVar;
            }
        }
        return eyhzVar;
    }

    public boolean getRunPerTableSchemaValidation() {
        return this.runPerTableSchemaValidation_;
    }

    public boolean getRunSqliteMasterSchemaValidation() {
        return this.runSqliteMasterSchemaValidation_;
    }

    public boolean hasRunPerTableSchemaValidation() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRunSqliteMasterSchemaValidation() {
        return (this.bitField0_ & 1) != 0;
    }

    public static esot newBuilder(ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig scytaleExperimentConfigOuterClass$ScytaleExperimentConfig) {
        return DEFAULT_INSTANCE.createBuilder(scytaleExperimentConfigOuterClass$ScytaleExperimentConfig);
    }

    public static ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig parseDelimitedFrom(InputStream inputStream, eyfc eyfcVar) {
        return (ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, eyfcVar);
    }

    public static ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig parseFrom(eyee eyeeVar, eyfc eyfcVar) {
        return (ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig) eyfy.parseFrom(DEFAULT_INSTANCE, eyeeVar, eyfcVar);
    }

    public static ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig parseFrom(eyel eyelVar) {
        return (ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig) eyfy.parseFrom(DEFAULT_INSTANCE, eyelVar);
    }

    public static ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig parseFrom(eyel eyelVar, eyfc eyfcVar) {
        return (ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig) eyfy.parseFrom(DEFAULT_INSTANCE, eyelVar, eyfcVar);
    }

    public static ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig parseFrom(InputStream inputStream) {
        return (ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig) eyfy.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig parseFrom(InputStream inputStream, eyfc eyfcVar) {
        return (ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig) eyfy.parseFrom(DEFAULT_INSTANCE, inputStream, eyfcVar);
    }

    public static ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig parseFrom(ByteBuffer byteBuffer) {
        return (ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig) eyfy.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig parseFrom(ByteBuffer byteBuffer, eyfc eyfcVar) {
        return (ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig) eyfy.parseFrom(DEFAULT_INSTANCE, byteBuffer, eyfcVar);
    }

    public static ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig parseFrom(byte[] bArr) {
        return (ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig) eyfy.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig parseFrom(byte[] bArr, eyfc eyfcVar) {
        return (ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig) eyfy.parseFrom(DEFAULT_INSTANCE, bArr, eyfcVar);
    }
}
