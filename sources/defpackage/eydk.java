package defpackage;

import defpackage.eydk;
import defpackage.eydl;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eydk<MessageType extends eydl<MessageType, BuilderType>, BuilderType extends eydk<MessageType, BuilderType>> implements eyhr {
    @Deprecated
    protected static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        addAll((Iterable) iterable, (List) collection);
    }

    private static <T> void addAllCheckingNulls(Iterable<T> iterable, List<? super T> list) {
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof eyic) {
                ((eyic) list).d(list.size() + size);
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    resetListAndThrow(list, size2);
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i = 0; i < size3; i++) {
            aaaf aaafVar = (Object) list2.get(i);
            if (aaafVar == null) {
                resetListAndThrow(list, size2);
            }
            list.add(aaafVar);
        }
    }

    private String getReadingExceptionMessage(String str) {
        return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
    }

    protected static eyjb newUninitializedMessageException(eyhs eyhsVar) {
        return new eyjb();
    }

    private static void resetListAndThrow(List<?> list, int i) {
        String str = "Element at index " + (list.size() - i) + " is null.";
        int size = list.size();
        while (true) {
            size--;
            if (size < i) {
                throw new NullPointerException(str);
            }
            list.remove(size);
        }
    }

    @Override // 
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType mo371clone();

    protected abstract BuilderType internalMergeFrom(MessageType messagetype);

    public boolean mergeDelimitedFrom(InputStream inputStream) {
        eyfc eyfcVar = eyfc.a;
        eyib eyibVar = eyib.a;
        return mergeDelimitedFrom(inputStream, eyfc.a);
    }

    @Override // defpackage.eyhr
    public BuilderType mergeFrom(eyee eyeeVar) {
        try {
            eyel l = eyeeVar.l();
            m373mergeFrom(l);
            l.z(0);
            return this;
        } catch (eygu e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(getReadingExceptionMessage("ByteString"), e2);
        }
    }

    @Override // defpackage.eyhr
    public abstract BuilderType mergeFrom(eyel eyelVar, eyfc eyfcVar);

    protected static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        eygs.d(iterable);
        if (!(iterable instanceof eyhb)) {
            if (iterable instanceof eyia) {
                list.addAll((Collection) iterable);
                return;
            } else {
                addAllCheckingNulls(iterable, list);
                return;
            }
        }
        List a = ((eyhb) iterable).a();
        eyhb eyhbVar = (eyhb) list;
        int size = list.size();
        for (Object obj : a) {
            if (obj == null) {
                String str = "Element at index " + (eyhbVar.size() - size) + " is null.";
                int size2 = eyhbVar.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        throw new NullPointerException(str);
                    }
                    eyhbVar.remove(size2);
                }
            } else if (obj instanceof eyee) {
                eyhbVar.b();
            } else if (obj instanceof byte[]) {
                eyee.x((byte[]) obj);
                eyhbVar.b();
            } else {
                eyhbVar.add((String) obj);
            }
        }
    }

    public boolean mergeDelimitedFrom(InputStream inputStream, eyfc eyfcVar) {
        int read = inputStream.read();
        if (read == -1) {
            return false;
        }
        m374mergeFrom((InputStream) new eydj(inputStream, eyel.I(read, inputStream)), eyfcVar);
        return true;
    }

    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public BuilderType m372mergeFrom(eyee eyeeVar, eyfc eyfcVar) {
        try {
            eyel l = eyeeVar.l();
            mergeFrom(l, eyfcVar);
            l.z(0);
            return this;
        } catch (eygu e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(getReadingExceptionMessage("ByteString"), e2);
        }
    }

    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public BuilderType m373mergeFrom(eyel eyelVar) {
        eyfc eyfcVar = eyfc.a;
        eyib eyibVar = eyib.a;
        return mergeFrom(eyelVar, eyfc.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eyhr
    public BuilderType mergeFrom(eyhs eyhsVar) {
        if (getDefaultInstanceForType().getClass().isInstance(eyhsVar)) {
            return (BuilderType) internalMergeFrom((eydl) eyhsVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    @Override // defpackage.eyhr
    public BuilderType mergeFrom(InputStream inputStream) {
        eyel K = eyel.K(inputStream);
        m373mergeFrom(K);
        K.z(0);
        return this;
    }

    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public BuilderType m374mergeFrom(InputStream inputStream, eyfc eyfcVar) {
        eyel K = eyel.K(inputStream);
        mergeFrom(K, eyfcVar);
        K.z(0);
        return this;
    }

    @Override // defpackage.eyhr
    public BuilderType mergeFrom(byte[] bArr) {
        return mo375mergeFrom(bArr, 0, bArr.length);
    }

    @Override // 
    /* renamed from: mergeFrom */
    public BuilderType mo375mergeFrom(byte[] bArr, int i, int i2) {
        try {
            eyel R = eyel.R(bArr, i, i2);
            m373mergeFrom(R);
            R.z(0);
            return this;
        } catch (eygu e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(getReadingExceptionMessage("byte array"), e2);
        }
    }

    @Override // 
    /* renamed from: mergeFrom */
    public BuilderType mo376mergeFrom(byte[] bArr, int i, int i2, eyfc eyfcVar) {
        try {
            eyel R = eyel.R(bArr, i, i2);
            mergeFrom(R, eyfcVar);
            R.z(0);
            return this;
        } catch (eygu e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(getReadingExceptionMessage("byte array"), e2);
        }
    }

    @Override // defpackage.eyhr
    public BuilderType mergeFrom(byte[] bArr, eyfc eyfcVar) {
        return mo376mergeFrom(bArr, 0, bArr.length, eyfcVar);
    }
}
