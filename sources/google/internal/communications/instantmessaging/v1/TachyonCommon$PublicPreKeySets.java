package google.internal.communications.instantmessaging.v1;

import defpackage.eydl;
import defpackage.eyee;
import defpackage.eyel;
import defpackage.eyfc;
import defpackage.eyfr;
import defpackage.eyfx;
import defpackage.eyfy;
import defpackage.eygr;
import defpackage.eyht;
import defpackage.eyhz;
import defpackage.fcfc;
import defpackage.fcfd;
import defpackage.fcfe;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class TachyonCommon$PublicPreKeySets extends eyfy<TachyonCommon$PublicPreKeySets, fcfe> implements eyht {
    private static final TachyonCommon$PublicPreKeySets DEFAULT_INSTANCE;
    private static volatile eyhz<TachyonCommon$PublicPreKeySets> PARSER = null;
    public static final int SETS_FIELD_NUMBER = 1;
    private eygr<fcfc> sets_ = emptyProtobufList();

    static {
        TachyonCommon$PublicPreKeySets tachyonCommon$PublicPreKeySets = new TachyonCommon$PublicPreKeySets();
        DEFAULT_INSTANCE = tachyonCommon$PublicPreKeySets;
        eyfy.registerDefaultInstance(TachyonCommon$PublicPreKeySets.class, tachyonCommon$PublicPreKeySets);
    }

    private TachyonCommon$PublicPreKeySets() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSets(Iterable<? extends fcfc> iterable) {
        ensureSetsIsMutable();
        eydl.addAll(iterable, this.sets_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSets(int i, fcfc fcfcVar) {
        fcfcVar.getClass();
        ensureSetsIsMutable();
        this.sets_.add(i, fcfcVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSets() {
        this.sets_ = emptyProtobufList();
    }

    private void ensureSetsIsMutable() {
        eygr<fcfc> eygrVar = this.sets_;
        if (eygrVar.c()) {
            return;
        }
        this.sets_ = eyfy.mutableCopy(eygrVar);
    }

    public static TachyonCommon$PublicPreKeySets getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static fcfe newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TachyonCommon$PublicPreKeySets parseDelimitedFrom(InputStream inputStream) {
        return (TachyonCommon$PublicPreKeySets) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TachyonCommon$PublicPreKeySets parseFrom(eyee eyeeVar) {
        return (TachyonCommon$PublicPreKeySets) eyfy.parseFrom(DEFAULT_INSTANCE, eyeeVar);
    }

    public static eyhz<TachyonCommon$PublicPreKeySets> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSets(int i) {
        ensureSetsIsMutable();
        this.sets_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSets(int i, fcfc fcfcVar) {
        fcfcVar.getClass();
        ensureSetsIsMutable();
        this.sets_.set(i, fcfcVar);
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"sets_", fcfc.class});
        }
        if (ordinal == 3) {
            return new TachyonCommon$PublicPreKeySets();
        }
        if (ordinal == 4) {
            return new fcfe();
        }
        if (ordinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz<TachyonCommon$PublicPreKeySets> eyhzVar2 = PARSER;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (TachyonCommon$PublicPreKeySets.class) {
            eyhzVar = PARSER;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(DEFAULT_INSTANCE);
                PARSER = eyhzVar;
            }
        }
        return eyhzVar;
    }

    public fcfc getSets(int i) {
        return this.sets_.get(i);
    }

    public int getSetsCount() {
        return this.sets_.size();
    }

    public List<fcfc> getSetsList() {
        return this.sets_;
    }

    public fcfd getSetsOrBuilder(int i) {
        return this.sets_.get(i);
    }

    public List<? extends fcfd> getSetsOrBuilderList() {
        return this.sets_;
    }

    public static fcfe newBuilder(TachyonCommon$PublicPreKeySets tachyonCommon$PublicPreKeySets) {
        return DEFAULT_INSTANCE.createBuilder(tachyonCommon$PublicPreKeySets);
    }

    public static TachyonCommon$PublicPreKeySets parseDelimitedFrom(InputStream inputStream, eyfc eyfcVar) {
        return (TachyonCommon$PublicPreKeySets) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, eyfcVar);
    }

    public static TachyonCommon$PublicPreKeySets parseFrom(eyee eyeeVar, eyfc eyfcVar) {
        return (TachyonCommon$PublicPreKeySets) eyfy.parseFrom(DEFAULT_INSTANCE, eyeeVar, eyfcVar);
    }

    public static TachyonCommon$PublicPreKeySets parseFrom(eyel eyelVar) {
        return (TachyonCommon$PublicPreKeySets) eyfy.parseFrom(DEFAULT_INSTANCE, eyelVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSets(fcfc fcfcVar) {
        fcfcVar.getClass();
        ensureSetsIsMutable();
        this.sets_.add(fcfcVar);
    }

    public static TachyonCommon$PublicPreKeySets parseFrom(eyel eyelVar, eyfc eyfcVar) {
        return (TachyonCommon$PublicPreKeySets) eyfy.parseFrom(DEFAULT_INSTANCE, eyelVar, eyfcVar);
    }

    public static TachyonCommon$PublicPreKeySets parseFrom(InputStream inputStream) {
        return (TachyonCommon$PublicPreKeySets) eyfy.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TachyonCommon$PublicPreKeySets parseFrom(InputStream inputStream, eyfc eyfcVar) {
        return (TachyonCommon$PublicPreKeySets) eyfy.parseFrom(DEFAULT_INSTANCE, inputStream, eyfcVar);
    }

    public static TachyonCommon$PublicPreKeySets parseFrom(ByteBuffer byteBuffer) {
        return (TachyonCommon$PublicPreKeySets) eyfy.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static TachyonCommon$PublicPreKeySets parseFrom(ByteBuffer byteBuffer, eyfc eyfcVar) {
        return (TachyonCommon$PublicPreKeySets) eyfy.parseFrom(DEFAULT_INSTANCE, byteBuffer, eyfcVar);
    }

    public static TachyonCommon$PublicPreKeySets parseFrom(byte[] bArr) {
        return (TachyonCommon$PublicPreKeySets) eyfy.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TachyonCommon$PublicPreKeySets parseFrom(byte[] bArr, eyfc eyfcVar) {
        return (TachyonCommon$PublicPreKeySets) eyfy.parseFrom(DEFAULT_INSTANCE, bArr, eyfcVar);
    }
}
