package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class engy extends enhz implements enkg {
    private static final long serialVersionUID = 0;
    public transient engy b;

    public engy(enhk enhkVar, int i) {
        super(enhkVar, i);
    }

    public static engy e(ennd enndVar) {
        if (enndVar.A()) {
            return enet.a;
        }
        if (enndVar instanceof engy) {
            engy engyVar = (engy) enndVar;
            if (!engyVar.E()) {
                return engyVar;
            }
        }
        Set<Map.Entry> entrySet = enndVar.w().entrySet();
        if (entrySet.isEmpty()) {
            return enet.a;
        }
        enhd enhdVar = new enhd(entrySet.size());
        int i = 0;
        for (Map.Entry entry : entrySet) {
            Object key = entry.getKey();
            engw n = engw.n((Collection) entry.getValue());
            if (!n.isEmpty()) {
                enhdVar.k(key, n);
                i += n.size();
            }
        }
        return new engy(enhdVar.c(), i);
    }

    public static engy f(Object obj, Object obj2) {
        engx engxVar = new engx();
        engxVar.b(obj, obj2);
        return engxVar.a();
    }

    @Deprecated
    public static final engw n() {
        throw new UnsupportedOperationException();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException(a.h(readInt, "Invalid key count "));
        }
        enhd enhdVar = new enhd();
        int i = 0;
        for (int i2 = 0; i2 < readInt; i2++) {
            Object readObject = objectInputStream.readObject();
            readObject.getClass();
            int readInt2 = objectInputStream.readInt();
            if (readInt2 <= 0) {
                throw new InvalidObjectException(a.h(readInt2, "Invalid value count "));
            }
            int i3 = engw.d;
            engr engrVar = new engr();
            for (int i4 = 0; i4 < readInt2; i4++) {
                Object readObject2 = objectInputStream.readObject();
                readObject2.getClass();
                engrVar.h(readObject2);
            }
            enhdVar.k(readObject, engrVar.g());
            i += readInt2;
        }
        try {
            enhx.a.b(this, enhdVar.c());
            enhx.b.a(this, i);
        } catch (IllegalArgumentException e) {
            throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        enpi.c(this, objectOutputStream);
    }

    @Override // defpackage.enkg
    /* renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final engw c(Object obj) {
        engw engwVar = (engw) this.map.get(obj);
        if (engwVar != null) {
            return engwVar;
        }
        int i = engw.d;
        return enou.a;
    }

    @Override // defpackage.enhz, defpackage.ennd
    @Deprecated
    public final /* bridge */ /* synthetic */ Collection d(Object obj) {
        return n();
    }

    @Override // defpackage.enkg
    @Deprecated
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ List d(Object obj) {
        return n();
    }
}
