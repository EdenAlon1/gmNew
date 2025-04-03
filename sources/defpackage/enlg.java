package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enlg extends enku {
    private static final long serialVersionUID = 3;

    public enlg(enlh enlhVar, enlh enlhVar2, emwj emwjVar, int i, ConcurrentMap concurrentMap) {
        super(enlhVar, enlhVar2, emwjVar, i, concurrentMap);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        enks enksVar = new enks();
        int i = enksVar.b;
        emxf.n(i == -1, "initial capacity was already set to %s", i);
        emxf.a(readInt >= 0);
        enksVar.b = readInt;
        enlh enlhVar = enksVar.d;
        emxf.p(enlhVar == null, "Key strength was already set to %s", enlhVar);
        enlh enlhVar2 = this.a;
        enlhVar2.getClass();
        enksVar.d = enlhVar2;
        if (enlhVar2 != enlh.STRONG) {
            enksVar.a = true;
        }
        enksVar.f(this.b);
        emwj emwjVar = this.c;
        emwj emwjVar2 = enksVar.f;
        emxf.p(emwjVar2 == null, "key equivalence was already set to %s", emwjVar2);
        emwjVar.getClass();
        enksVar.f = emwjVar;
        enksVar.a = true;
        int i2 = this.d;
        int i3 = enksVar.c;
        emxf.n(i3 == -1, "concurrency level was already set to %s", i3);
        emxf.a(i2 > 0);
        enksVar.c = i2;
        this.e = enksVar.e();
        while (true) {
            Object readObject = objectInputStream.readObject();
            if (readObject == null) {
                return;
            } else {
                this.e.put(readObject, objectInputStream.readObject());
            }
        }
    }

    private Object readResolve() {
        return this.e;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.e.size());
        for (Map.Entry entry : this.e.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
        objectOutputStream.writeObject(null);
    }
}
