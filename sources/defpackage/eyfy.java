package defpackage;

import androidx.car.app.model.Alert;
import defpackage.eyfq;
import defpackage.eyfy;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eyfy<MessageType extends eyfy<MessageType, BuilderType>, BuilderType extends eyfq<MessageType, BuilderType>> extends eydl<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Class<?>, eyfy<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected eyjd unknownFields = eyjd.a;

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends eyft<MessageType, BuilderType>, BuilderType extends eyfs<MessageType, BuilderType>, T> eyfw<MessageType, T> checkIsLite(eyfa<MessageType, T> eyfaVar) {
        return (eyfw) eyfaVar;
    }

    private static <T extends eyfy<T, ?>> T checkMessageInitialized(T t) {
        if (t == null || t.isInitialized()) {
            return t;
        }
        throw t.newUninitializedMessageException().a();
    }

    private int computeSerializedSize(eyik<?> eyikVar) {
        return eyikVar == null ? eyib.a.b(this).a(this) : eyikVar.a(this);
    }

    protected static eygc emptyBooleanList() {
        return eydu.b;
    }

    protected static eygd emptyDoubleList() {
        return eyet.b;
    }

    protected static eygh emptyFloatList() {
        return eyfl.b;
    }

    public static eygi emptyIntList() {
        return eygb.a;
    }

    public static eygl emptyLongList() {
        return eyhg.a;
    }

    public static <E> eygr<E> emptyProtobufList() {
        return eyic.b;
    }

    private void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == eyjd.a) {
            this.unknownFields = new eyjd();
        }
    }

    static <T extends eyfy> T getDefaultInstance(Class<T> cls) {
        eyfy<?, ?> eyfyVar = defaultInstanceMap.get(cls);
        if (eyfyVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                eyfyVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (eyfyVar != null) {
            return eyfyVar;
        }
        eyfy<?, ?> defaultInstanceForType = ((eyfy) eyjj.g(cls)).getDefaultInstanceForType();
        if (defaultInstanceForType == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, defaultInstanceForType);
        return defaultInstanceForType;
    }

    static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e);
        }
    }

    static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static Object newMessageInfo(eyhs eyhsVar, String str, Object[] objArr) {
        return new eyid(eyhsVar, str, objArr);
    }

    public static <ContainingType extends eyhs, Type> eyfw<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, eyhs eyhsVar, eygf eygfVar, int i, eyjr eyjrVar, boolean z, Class cls) {
        return new eyfw<>(containingtype, eyic.b, eyhsVar, new eyfv(eygfVar, i, eyjrVar, true, z));
    }

    public static <ContainingType extends eyhs, Type> eyfw<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, eyhs eyhsVar, eygf eygfVar, int i, eyjr eyjrVar, Class cls) {
        return new eyfw<>(containingtype, type, eyhsVar, new eyfv(eygfVar, i, eyjrVar, false, false));
    }

    public static <T extends eyfy<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream) {
        eyfc eyfcVar = eyfc.a;
        eyib eyibVar = eyib.a;
        T t2 = (T) parsePartialDelimitedFrom(t, inputStream, eyfc.a);
        checkMessageInitialized(t2);
        return t2;
    }

    public static <T extends eyfy<T, ?>> T parseFrom(T t, eyee eyeeVar) {
        eyfc eyfcVar = eyfc.a;
        eyib eyibVar = eyib.a;
        T t2 = (T) parseFrom(t, eyeeVar, eyfc.a);
        checkMessageInitialized(t2);
        return t2;
    }

    private static <T extends eyfy<T, ?>> T parsePartialDelimitedFrom(T t, InputStream inputStream, eyfc eyfcVar) {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            eyel K = eyel.K(new eydj(inputStream, eyel.I(read, inputStream)));
            T t2 = (T) parsePartialFrom(t, K, eyfcVar);
            K.z(0);
            return t2;
        } catch (eygu e) {
            if (e.a) {
                throw new eygu(e);
            }
            throw e;
        } catch (IOException e2) {
            throw new eygu(e2);
        }
    }

    private static <T extends eyfy<T, ?>> T parsePartialFrom(T t, eyee eyeeVar, eyfc eyfcVar) {
        eyel l = eyeeVar.l();
        T t2 = (T) parsePartialFrom(t, l, eyfcVar);
        l.z(0);
        return t2;
    }

    protected static <T extends eyfy> void registerDefaultInstance(Class<T> cls, T t) {
        t.markImmutable();
        defaultInstanceMap.put(cls, t);
    }

    public Object buildMessageInfo() {
        return dynamicMethod(eyfx.BUILD_MESSAGE_INFO, null, null);
    }

    public void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    public void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Alert.DURATION_SHOW_INDEFINITELY);
    }

    public int computeHashCode() {
        return eyib.a.b(this).b(this);
    }

    public final <MessageType extends eyfy<MessageType, BuilderType>, BuilderType extends eyfq<MessageType, BuilderType>> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(eyfx.NEW_BUILDER, null, null);
    }

    protected abstract Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return eyib.a.b(this).k(this, (eyfy) obj);
        }
        return false;
    }

    @Override // defpackage.eyht
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) dynamicMethod(eyfx.GET_DEFAULT_INSTANCE, null, null);
    }

    public int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    @Override // defpackage.eydl
    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Alert.DURATION_SHOW_INDEFINITELY;
    }

    @Override // defpackage.eyhs
    public final eyhz<MessageType> getParserForType() {
        return (eyhz) dynamicMethod(eyfx.GET_PARSER, null, null);
    }

    @Override // defpackage.eyhs
    public int getSerializedSize() {
        return getSerializedSize(null);
    }

    public int hashCode() {
        if (isMutable()) {
            return computeHashCode();
        }
        if (hashCodeIsNotMemoized()) {
            setMemoizedHashCode(computeHashCode());
        }
        return getMemoizedHashCode();
    }

    public boolean hashCodeIsNotMemoized() {
        return getMemoizedHashCode() == 0;
    }

    @Override // defpackage.eyht
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public boolean isMutable() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    protected void makeImmutable() {
        eyib.a.b(this).g(this);
        markImmutable();
    }

    public void markImmutable() {
        this.memoizedSerializedSize &= Alert.DURATION_SHOW_INDEFINITELY;
    }

    protected void mergeLengthDelimitedField(int i, eyee eyeeVar) {
        ensureUnknownFieldsInitialized();
        eyjd eyjdVar = this.unknownFields;
        eyjdVar.c();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        eyjdVar.f(eyjt.c(i, 2), eyeeVar);
    }

    protected final void mergeUnknownFields(eyjd eyjdVar) {
        this.unknownFields = eyjd.b(this.unknownFields, eyjdVar);
    }

    protected void mergeVarintField(int i, int i2) {
        ensureUnknownFieldsInitialized();
        eyjd eyjdVar = this.unknownFields;
        eyjdVar.c();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        eyjdVar.f(eyjt.c(i, 0), Long.valueOf(i2));
    }

    @Override // defpackage.eydl
    public eyhx mutableCopy() {
        throw new UnsupportedOperationException("Lite does not support the mutable API.");
    }

    @Override // defpackage.eyhs
    public final BuilderType newBuilderForType() {
        return (BuilderType) dynamicMethod(eyfx.NEW_BUILDER, null, null);
    }

    public MessageType newMutableInstance() {
        return (MessageType) dynamicMethod(eyfx.NEW_MUTABLE_INSTANCE, null, null);
    }

    protected boolean parseUnknownField(int i, eyel eyelVar) {
        if (eyjt.b(i) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.g(i, eyelVar);
    }

    public void setMemoizedHashCode(int i) {
        this.memoizedHashCode = i;
    }

    @Override // defpackage.eydl
    public void setMemoizedSerializedSize(int i) {
        if (i < 0) {
            throw new IllegalStateException(a.h(i, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = i | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    @Override // defpackage.eyhs
    public final BuilderType toBuilder() {
        return (BuilderType) ((eyfq) dynamicMethod(eyfx.NEW_BUILDER, null, null)).mergeFrom((eyfq) this);
    }

    public String toString() {
        String obj = super.toString();
        int i = eyhu.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        eyhu.b(this, sb, 0);
        return sb.toString();
    }

    @Override // defpackage.eyhs
    public void writeTo(eyer eyerVar) {
        eyik b = eyib.a.b(this);
        eyes eyesVar = eyerVar.f;
        if (eyesVar == null) {
            eyesVar = new eyes(eyerVar);
        }
        b.m(this, eyesVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends eyfy<T, ?>> boolean isInitialized(T t, boolean z) {
        byte byteValue = ((Byte) t.dynamicMethod(eyfx.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean l = eyib.a.b(t).l(t);
        if (z) {
            t.dynamicMethod(eyfx.SET_MEMOIZED_IS_INITIALIZED, true != l ? null : t, null);
        }
        return l;
    }

    public static eygc mutableCopy(eygc eygcVar) {
        int size = eygcVar.size();
        return eygcVar.e(size + size);
    }

    public final <MessageType extends eyfy<MessageType, BuilderType>, BuilderType extends eyfq<MessageType, BuilderType>> BuilderType createBuilder(MessageType messagetype) {
        return (BuilderType) createBuilder().mergeFrom(messagetype);
    }

    @Override // defpackage.eydl
    public int getSerializedSize(eyik eyikVar) {
        if (isMutable()) {
            int computeSerializedSize = computeSerializedSize(eyikVar);
            if (computeSerializedSize >= 0) {
                return computeSerializedSize;
            }
            throw new IllegalStateException(a.h(computeSerializedSize, "serialized size must be non-negative, was "));
        }
        if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return getMemoizedSerializedSize();
        }
        int computeSerializedSize2 = computeSerializedSize(eyikVar);
        setMemoizedSerializedSize(computeSerializedSize2);
        return computeSerializedSize2;
    }

    public static eygd mutableCopy(eygd eygdVar) {
        int size = eygdVar.size();
        return eygdVar.e(size + size);
    }

    protected static <T extends eyfy<T, ?>> T parsePartialFrom(T t, eyel eyelVar) {
        eyfc eyfcVar = eyfc.a;
        eyib eyibVar = eyib.a;
        return (T) parsePartialFrom(t, eyelVar, eyfc.a);
    }

    protected static <T extends eyfy<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream, eyfc eyfcVar) {
        T t2 = (T) parsePartialDelimitedFrom(t, inputStream, eyfcVar);
        checkMessageInitialized(t2);
        return t2;
    }

    public static <T extends eyfy<T, ?>> T parseFrom(T t, eyee eyeeVar, eyfc eyfcVar) {
        T t2 = (T) parsePartialFrom(t, eyeeVar, eyfcVar);
        checkMessageInitialized(t2);
        return t2;
    }

    public static eygh mutableCopy(eygh eyghVar) {
        int size = eyghVar.size();
        return eyghVar.e(size + size);
    }

    protected static <T extends eyfy<T, ?>> T parseFrom(T t, eyel eyelVar) {
        eyfc eyfcVar = eyfc.a;
        eyib eyibVar = eyib.a;
        return (T) parseFrom(t, eyelVar, eyfc.a);
    }

    static <T extends eyfy<T, ?>> T parsePartialFrom(T t, eyel eyelVar, eyfc eyfcVar) {
        T t2 = (T) t.newMutableInstance();
        try {
            eyik b = eyib.a.b(t2);
            b.i(t2, eyem.p(eyelVar), eyfcVar);
            b.g(t2);
            return t2;
        } catch (eygu e) {
            if (e.a) {
                throw new eygu(e);
            }
            throw e;
        } catch (eyjb e2) {
            throw e2.a();
        } catch (IOException e3) {
            if (e3.getCause() instanceof eygu) {
                throw ((eygu) e3.getCause());
            }
            throw new eygu(e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof eygu) {
                throw ((eygu) e4.getCause());
            }
            throw e4;
        }
    }

    public static eygi mutableCopy(eygi eygiVar) {
        int size = eygiVar.size();
        return eygiVar.e(size + size);
    }

    public static <T extends eyfy<T, ?>> T parseFrom(T t, eyel eyelVar, eyfc eyfcVar) {
        T t2 = (T) parsePartialFrom(t, eyelVar, eyfcVar);
        checkMessageInitialized(t2);
        return t2;
    }

    public static eygl mutableCopy(eygl eyglVar) {
        int size = eyglVar.size();
        return eyglVar.e(size + size);
    }

    public static <T extends eyfy<T, ?>> T parseFrom(T t, InputStream inputStream) {
        eyel K = eyel.K(inputStream);
        eyfc eyfcVar = eyfc.a;
        eyib eyibVar = eyib.a;
        T t2 = (T) parsePartialFrom(t, K, eyfc.a);
        checkMessageInitialized(t2);
        return t2;
    }

    public static <E> eygr<E> mutableCopy(eygr<E> eygrVar) {
        int size = eygrVar.size();
        return eygrVar.e(size + size);
    }

    public static <T extends eyfy<T, ?>> T parseFrom(T t, InputStream inputStream, eyfc eyfcVar) {
        T t2 = (T) parsePartialFrom(t, eyel.K(inputStream), eyfcVar);
        checkMessageInitialized(t2);
        return t2;
    }

    public static <T extends eyfy<T, ?>> T parseFrom(T t, ByteBuffer byteBuffer) {
        eyfc eyfcVar = eyfc.a;
        eyib eyibVar = eyib.a;
        return (T) parseFrom(t, byteBuffer, eyfc.a);
    }

    public static <T extends eyfy<T, ?>> T parseFrom(T t, ByteBuffer byteBuffer, eyfc eyfcVar) {
        T t2 = (T) parseFrom(t, eyel.L(byteBuffer), eyfcVar);
        checkMessageInitialized(t2);
        return t2;
    }

    public static <T extends eyfy<T, ?>> T parseFrom(T t, byte[] bArr) {
        int length = bArr.length;
        eyfc eyfcVar = eyfc.a;
        eyib eyibVar = eyib.a;
        T t2 = (T) parsePartialFrom(t, bArr, 0, length, eyfc.a);
        checkMessageInitialized(t2);
        return t2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends eyfy<T, ?>> T parsePartialFrom(T t, byte[] bArr, int i, int i2, eyfc eyfcVar) {
        if (i2 == 0) {
            return t;
        }
        T t2 = (T) t.newMutableInstance();
        try {
            eyik b = eyib.a.b(t2);
            b.j(t2, bArr, i, i + i2, new eydr(eyfcVar));
            b.g(t2);
            return t2;
        } catch (eygu e) {
            if (e.a) {
                throw new eygu(e);
            }
            throw e;
        } catch (eyjb e2) {
            throw e2.a();
        } catch (IOException e3) {
            if (e3.getCause() instanceof eygu) {
                throw ((eygu) e3.getCause());
            }
            throw new eygu(e3);
        } catch (IndexOutOfBoundsException unused) {
            throw new eygu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public static <T extends eyfy<T, ?>> T parseFrom(T t, byte[] bArr, eyfc eyfcVar) {
        T t2 = (T) parsePartialFrom(t, bArr, 0, bArr.length, eyfcVar);
        checkMessageInitialized(t2);
        return t2;
    }
}
