package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class enit<K, V> extends enhz<K, V> implements enpj<K, V> {
    private static final long serialVersionUID = 0;
    private transient enit a;
    private transient enip b;
    private final transient enip<V> emptySet;

    public enit(enhk enhkVar, int i) {
        super(enhkVar, i);
        this.emptySet = n(null);
    }

    private static enip n(Comparator comparator) {
        return comparator == null ? enpd.a : enjc.G(comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
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
            enin eninVar = comparator == null ? new enin() : new enja(comparator);
            for (int i3 = 0; i3 < readInt2; i3++) {
                Object readObject2 = objectInputStream.readObject();
                readObject2.getClass();
                eninVar.c(readObject2);
            }
            enip g = eninVar.g();
            if (g.size() != readInt2) {
                throw new InvalidObjectException("Duplicate key-value pairs exist for key ".concat(readObject.toString()));
            }
            enhdVar.k(readObject, g);
            i += readInt2;
        }
        try {
            enhx.a.b(this, enhdVar.c());
            enhx.b.a(this, i);
            enis.a.b(this, n(comparator));
        } catch (IllegalArgumentException e) {
            throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        enip<V> enipVar = this.emptySet;
        objectOutputStream.writeObject(enipVar instanceof enjc ? ((enjc) enipVar).a : null);
        enpi.c(this, objectOutputStream);
    }

    @Override // defpackage.enhz
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ engi c(Object obj) {
        throw null;
    }

    @Override // defpackage.enhz, defpackage.encm, defpackage.ennd
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final enip u() {
        enip enipVar = this.b;
        if (enipVar != null) {
            return enipVar;
        }
        enir enirVar = new enir(this);
        this.b = enirVar;
        return enirVar;
    }

    @Override // defpackage.enhz, defpackage.ennd
    @Deprecated
    public final /* bridge */ /* synthetic */ Collection d(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.enpj
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final enip c(Object obj) {
        return (enip) emxa.c((enip) this.map.get(obj), this.emptySet);
    }

    public final enit f() {
        enit enitVar = this.a;
        if (enitVar != null) {
            return enitVar;
        }
        eniq eniqVar = new eniq();
        enqu listIterator = u().listIterator();
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            eniqVar.b(entry.getValue(), entry.getKey());
        }
        enit a = eniqVar.a();
        a.a = this;
        this.a = a;
        return a;
    }
}
