package defpackage;

import defpackage.eyfq;
import defpackage.eyfy;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eyfq<MessageType extends eyfy<MessageType, BuilderType>, BuilderType extends eyfq<MessageType, BuilderType>> extends eydk<MessageType, BuilderType> {
    private final MessageType defaultInstance;
    public MessageType instance;

    protected eyfq(MessageType messagetype) {
        this.defaultInstance = messagetype;
        if (messagetype.isMutable()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.instance = newMutableInstance();
    }

    private static <MessageType> void mergeFromInstance(MessageType messagetype, MessageType messagetype2) {
        eyib.a.b(messagetype).h(messagetype, messagetype2);
    }

    private MessageType newMutableInstance() {
        return (MessageType) this.defaultInstance.newMutableInstance();
    }

    @Override // defpackage.eyhr
    public final MessageType build() {
        MessageType buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw newUninitializedMessageException(buildPartial);
    }

    @Override // defpackage.eyhr
    public MessageType buildPartial() {
        if (!this.instance.isMutable()) {
            return this.instance;
        }
        this.instance.makeImmutable();
        return this.instance;
    }

    public final BuilderType clear() {
        if (this.defaultInstance.isMutable()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.instance = newMutableInstance();
        return this;
    }

    public final void copyOnWrite() {
        if (this.instance.isMutable()) {
            return;
        }
        copyOnWriteInternal();
    }

    protected void copyOnWriteInternal() {
        MessageType newMutableInstance = newMutableInstance();
        mergeFromInstance(newMutableInstance, this.instance);
        this.instance = newMutableInstance;
    }

    @Override // defpackage.eyht
    public MessageType getDefaultInstanceForType() {
        return this.defaultInstance;
    }

    @Override // defpackage.eyht
    public final boolean isInitialized() {
        boolean isInitialized;
        isInitialized = eyfy.isInitialized(this.instance, false);
        return isInitialized;
    }

    @Override // defpackage.eydk
    /* renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BuilderType mo371clone() {
        BuilderType buildertype = (BuilderType) getDefaultInstanceForType().newBuilderForType();
        buildertype.instance = buildPartial();
        return buildertype;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.eydk
    public BuilderType internalMergeFrom(MessageType messagetype) {
        return mergeFrom((eyfq<MessageType, BuilderType>) messagetype);
    }

    @Override // defpackage.eydk, defpackage.eyhr
    public BuilderType mergeFrom(eyel eyelVar, eyfc eyfcVar) {
        copyOnWrite();
        try {
            eyib.a.b(this.instance).i(this.instance, eyem.p(eyelVar), eyfcVar);
            return this;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof IOException) {
                throw ((IOException) e.getCause());
            }
            throw e;
        }
    }

    /* renamed from: clear, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ eyhr m377clear() {
        clear();
        return this;
    }

    public BuilderType mergeFrom(MessageType messagetype) {
        if (getDefaultInstanceForType().equals(messagetype)) {
            return this;
        }
        copyOnWrite();
        mergeFromInstance(this.instance, messagetype);
        return this;
    }

    @Override // defpackage.eydk
    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public BuilderType mo375mergeFrom(byte[] bArr, int i, int i2) {
        eyfc eyfcVar = eyfc.a;
        eyib eyibVar = eyib.a;
        return mo376mergeFrom(bArr, i, i2, eyfc.a);
    }

    @Override // defpackage.eydk
    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public BuilderType mo376mergeFrom(byte[] bArr, int i, int i2, eyfc eyfcVar) {
        copyOnWrite();
        try {
            eyib.a.b(this.instance).j(this.instance, bArr, i, i + i2, new eydr(eyfcVar));
            return this;
        } catch (eygu e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw new eygu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
