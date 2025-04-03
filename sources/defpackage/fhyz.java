package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhyz implements Serializable {
    private static final long serialVersionUID = 1;
    public int a;
    public transient int b;
    private transient fhzm c;
    private final int d;
    private final List e;
    private int f;
    private fhzz g;
    private List h;
    private Map i;
    private Stack j;
    private Map k;
    private boolean l;

    public fhyz(fhyz fhyzVar) {
        this.c = new fhzm(fhyzVar.c.a);
        this.d = fhyzVar.d;
        this.f = fhyzVar.f;
        this.g = fhyzVar.g;
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        arrayList.addAll(fhyzVar.h);
        this.i = new TreeMap();
        for (Integer num : fhyzVar.i.keySet()) {
            this.i.put(num, (LinkedList) ((LinkedList) fhyzVar.i.get(num)).clone());
        }
        Stack stack = new Stack();
        this.j = stack;
        stack.addAll(fhyzVar.j);
        this.e = new ArrayList();
        Iterator it = fhyzVar.e.iterator();
        while (it.hasNext()) {
            this.e.add(((fhzb) it.next()).clone());
        }
        this.k = new TreeMap(fhyzVar.k);
        this.a = fhyzVar.a;
        this.b = fhyzVar.b;
        this.l = fhyzVar.l;
    }

    private final void a(byte[] bArr, byte[] bArr2, fhzl fhzlVar) {
        fhzi fhziVar = new fhzi();
        fhziVar.e = fhzlVar.d;
        fhziVar.f = fhzlVar.e;
        fhzj fhzjVar = new fhzj(fhziVar);
        fhzf fhzfVar = new fhzf();
        fhzfVar.e = fhzlVar.d;
        fhzfVar.f = fhzlVar.e;
        fhzg fhzgVar = new fhzg(fhzfVar);
        for (int i = 0; i < (1 << this.d); i++) {
            fhzk fhzkVar = new fhzk();
            fhzkVar.e = fhzlVar.d;
            fhzkVar.f = fhzlVar.e;
            fhzkVar.a = i;
            fhzkVar.b = fhzlVar.b;
            fhzkVar.c = fhzlVar.c;
            fhzkVar.g = fhzlVar.f;
            fhzlVar = new fhzl(fhzkVar);
            fhzm fhzmVar = this.c;
            fhzmVar.b(fhzmVar.c(bArr2, fhzlVar), bArr);
            fhzp a = this.c.a(fhzlVar);
            fhzi fhziVar2 = new fhzi();
            fhziVar2.e = fhzjVar.d;
            fhziVar2.f = fhzjVar.e;
            fhziVar2.a = i;
            fhziVar2.b = fhzjVar.b;
            fhziVar2.c = fhzjVar.c;
            fhziVar2.g = fhzjVar.f;
            fhzjVar = new fhzj(fhziVar2);
            fhzz a2 = fiaa.a(this.c, a, fhzjVar);
            fhzf fhzfVar2 = new fhzf();
            fhzfVar2.e = fhzgVar.d;
            fhzfVar2.f = fhzgVar.e;
            fhzfVar2.b = i;
            fhzfVar2.g = fhzgVar.f;
            fhzgVar = new fhzg(fhzfVar2);
            while (!this.j.isEmpty()) {
                int i2 = ((fhzz) this.j.peek()).a;
                int i3 = a2.a;
                if (i2 == i3) {
                    int i4 = i / (1 << i3);
                    if (i4 == 1) {
                        this.h.add(a2);
                        i4 = 1;
                    }
                    if (i4 == 3) {
                        int i5 = a2.a;
                        if (i5 < this.d - this.f) {
                            fhzb fhzbVar = (fhzb) this.e.get(i5);
                            fhzbVar.a = a2;
                            int i6 = a2.a;
                            fhzbVar.c = i6;
                            if (i6 == fhzbVar.b) {
                                fhzbVar.f = true;
                            }
                        }
                        i4 = 3;
                    }
                    if (i4 >= 3 && (i4 & 1) == 1) {
                        int i7 = a2.a;
                        int i8 = this.d;
                        if (i7 >= i8 - this.f && i7 <= i8 - 2) {
                            if (this.i.get(Integer.valueOf(i7)) == null) {
                                LinkedList linkedList = new LinkedList();
                                linkedList.add(a2);
                                this.i.put(Integer.valueOf(a2.a), linkedList);
                            } else {
                                ((LinkedList) this.i.get(Integer.valueOf(a2.a))).add(a2);
                            }
                        }
                    }
                    fhzf fhzfVar3 = new fhzf();
                    fhzfVar3.e = fhzgVar.d;
                    fhzfVar3.f = fhzgVar.e;
                    fhzfVar3.a = fhzgVar.a;
                    fhzfVar3.b = (fhzgVar.b - 1) / 2;
                    fhzfVar3.g = fhzgVar.f;
                    fhzg fhzgVar2 = new fhzg(fhzfVar3);
                    fhzz b = fiaa.b(this.c, (fhzz) this.j.pop(), a2, fhzgVar2);
                    fhzz fhzzVar = new fhzz(b.a + 1, b.a());
                    fhzf fhzfVar4 = new fhzf();
                    fhzfVar4.e = fhzgVar2.d;
                    fhzfVar4.f = fhzgVar2.e;
                    fhzfVar4.a = fhzgVar2.a + 1;
                    fhzfVar4.b = fhzgVar2.b;
                    fhzfVar4.g = fhzgVar2.f;
                    fhzgVar = new fhzg(fhzfVar4);
                    a2 = fhzzVar;
                }
            }
            this.j.push(a2);
        }
        this.g = (fhzz) this.j.pop();
    }

    private final void b(byte[] bArr, byte[] bArr2, fhzl fhzlVar) {
        if (this.l) {
            throw new IllegalStateException("index already used");
        }
        int i = this.a;
        if (i > this.b - 1) {
            throw new IllegalStateException("index out of bounds");
        }
        int i2 = this.d;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                i3 = 0;
                break;
            } else if (((i >> i3) & 1) == 0) {
                break;
            } else {
                i3++;
            }
        }
        if (((this.a >> (i3 + 1)) & 1) == 0 && i3 < this.d - 1) {
            this.k.put(Integer.valueOf(i3), (fhzz) this.h.get(i3));
        }
        fhzi fhziVar = new fhzi();
        fhziVar.e = fhzlVar.d;
        fhziVar.f = fhzlVar.e;
        fhzj fhzjVar = new fhzj(fhziVar);
        fhzf fhzfVar = new fhzf();
        fhzfVar.e = fhzlVar.d;
        fhzfVar.f = fhzlVar.e;
        fhzg fhzgVar = new fhzg(fhzfVar);
        if (i3 == 0) {
            fhzk fhzkVar = new fhzk();
            fhzkVar.e = fhzlVar.d;
            fhzkVar.f = fhzlVar.e;
            fhzkVar.a = this.a;
            fhzkVar.b = fhzlVar.b;
            fhzkVar.c = fhzlVar.c;
            fhzkVar.g = fhzlVar.f;
            fhzlVar = new fhzl(fhzkVar);
            fhzm fhzmVar = this.c;
            fhzmVar.b(fhzmVar.c(bArr2, fhzlVar), bArr);
            fhzp a = this.c.a(fhzlVar);
            fhzi fhziVar2 = new fhzi();
            fhziVar2.e = fhzjVar.d;
            fhziVar2.f = fhzjVar.e;
            fhziVar2.a = this.a;
            fhziVar2.b = fhzjVar.b;
            fhziVar2.c = fhzjVar.c;
            fhziVar2.g = fhzjVar.f;
            this.h.set(0, fiaa.a(this.c, a, new fhzj(fhziVar2)));
        } else {
            fhzf fhzfVar2 = new fhzf();
            fhzfVar2.e = fhzgVar.d;
            fhzfVar2.f = fhzgVar.e;
            int i4 = i3 - 1;
            fhzfVar2.a = i4;
            fhzfVar2.b = this.a >> i3;
            fhzfVar2.g = fhzgVar.f;
            fhzg fhzgVar2 = new fhzg(fhzfVar2);
            fhzm fhzmVar2 = this.c;
            fhzmVar2.b(fhzmVar2.c(bArr2, fhzlVar), bArr);
            fhzm fhzmVar3 = this.c;
            fhzz fhzzVar = (fhzz) this.h.get(i4);
            Map map = this.k;
            Integer valueOf = Integer.valueOf(i4);
            fhzz b = fiaa.b(fhzmVar3, fhzzVar, (fhzz) map.get(valueOf), fhzgVar2);
            this.h.set(i3, new fhzz(b.a + 1, b.a()));
            this.k.remove(valueOf);
            for (int i5 = 0; i5 < i3; i5++) {
                if (i5 < this.d - this.f) {
                    this.h.set(i5, ((fhzb) this.e.get(i5)).a);
                } else {
                    this.h.set(i5, (fhzz) ((LinkedList) this.i.get(Integer.valueOf(i5))).removeFirst());
                }
            }
            int min = Math.min(i3, this.d - this.f);
            for (int i6 = 0; i6 < min; i6++) {
                int i7 = this.a + 1 + ((1 << i6) * 3);
                if (i7 < (1 << this.d)) {
                    fhzb fhzbVar = (fhzb) this.e.get(i6);
                    fhzbVar.a = null;
                    fhzbVar.c = fhzbVar.b;
                    fhzbVar.d = i7;
                    fhzbVar.e = true;
                    fhzbVar.f = false;
                }
            }
        }
        for (int i8 = 0; i8 < ((this.d - this.f) >> 1); i8++) {
            fhzb fhzbVar2 = null;
            for (fhzb fhzbVar3 : this.e) {
                if (!fhzbVar3.f && fhzbVar3.e && (fhzbVar2 == null || fhzbVar3.a() < fhzbVar2.a() || (fhzbVar3.a() == fhzbVar2.a() && fhzbVar3.d < fhzbVar2.d))) {
                    fhzbVar2 = fhzbVar3;
                }
            }
            if (fhzbVar2 != null) {
                Stack stack = this.j;
                fhzm fhzmVar4 = this.c;
                if (fhzbVar2.f || !fhzbVar2.e) {
                    throw new IllegalStateException("finished or not initialized");
                }
                fhzk fhzkVar2 = new fhzk();
                fhzkVar2.e = fhzlVar.d;
                fhzkVar2.f = fhzlVar.e;
                int i9 = fhzbVar2.d;
                fhzkVar2.a = i9;
                fhzkVar2.b = fhzlVar.b;
                fhzkVar2.c = fhzlVar.c;
                fhzkVar2.g = fhzlVar.f;
                fhzl fhzlVar2 = new fhzl(fhzkVar2);
                fhzi fhziVar3 = new fhzi();
                fhziVar3.e = fhzlVar2.d;
                fhziVar3.f = fhzlVar2.e;
                fhziVar3.a = i9;
                fhzj fhzjVar2 = new fhzj(fhziVar3);
                fhzf fhzfVar3 = new fhzf();
                fhzfVar3.e = fhzlVar2.d;
                fhzfVar3.f = fhzlVar2.e;
                fhzfVar3.b = i9;
                fhzg fhzgVar3 = new fhzg(fhzfVar3);
                fhzmVar4.b(fhzmVar4.c(bArr2, fhzlVar2), bArr);
                fhzz a2 = fiaa.a(fhzmVar4, fhzmVar4.a(fhzlVar2), fhzjVar2);
                while (!stack.isEmpty() && ((fhzz) stack.peek()).a == a2.a && ((fhzz) stack.peek()).a != fhzbVar2.b) {
                    fhzf fhzfVar4 = new fhzf();
                    fhzfVar4.e = fhzgVar3.d;
                    fhzfVar4.f = fhzgVar3.e;
                    fhzfVar4.a = fhzgVar3.a;
                    fhzfVar4.b = (fhzgVar3.b - 1) / 2;
                    fhzfVar4.g = fhzgVar3.f;
                    fhzg fhzgVar4 = new fhzg(fhzfVar4);
                    fhzz b2 = fiaa.b(fhzmVar4, (fhzz) stack.pop(), a2, fhzgVar4);
                    fhzz fhzzVar2 = new fhzz(b2.a + 1, b2.a());
                    fhzf fhzfVar5 = new fhzf();
                    fhzfVar5.e = fhzgVar4.d;
                    fhzfVar5.f = fhzgVar4.e;
                    fhzfVar5.a = fhzgVar4.a + 1;
                    fhzfVar5.b = fhzgVar4.b;
                    fhzfVar5.g = fhzgVar4.f;
                    fhzgVar3 = new fhzg(fhzfVar5);
                    a2 = fhzzVar2;
                }
                fhzz fhzzVar3 = fhzbVar2.a;
                if (fhzzVar3 == null) {
                    fhzbVar2.a = a2;
                } else {
                    if (fhzzVar3.a == a2.a) {
                        fhzf fhzfVar6 = new fhzf();
                        fhzfVar6.e = fhzgVar3.d;
                        fhzfVar6.f = fhzgVar3.e;
                        fhzfVar6.a = fhzgVar3.a;
                        fhzfVar6.b = (fhzgVar3.b - 1) / 2;
                        fhzfVar6.g = fhzgVar3.f;
                        fhzg fhzgVar5 = new fhzg(fhzfVar6);
                        a2 = new fhzz(fhzbVar2.a.a + 1, fiaa.b(fhzmVar4, fhzzVar3, a2, fhzgVar5).a());
                        fhzbVar2.a = a2;
                        fhzf fhzfVar7 = new fhzf();
                        fhzfVar7.e = fhzgVar5.d;
                        fhzfVar7.f = fhzgVar5.e;
                        fhzfVar7.a = fhzgVar5.a + 1;
                        fhzfVar7.b = fhzgVar5.b;
                        fhzfVar7.g = fhzgVar5.f;
                    } else {
                        stack.push(a2);
                    }
                }
                if (fhzbVar2.a.a == fhzbVar2.b) {
                    fhzbVar2.f = true;
                } else {
                    fhzbVar2.c = a2.a;
                    fhzbVar2.d++;
                }
            }
        }
        this.a++;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        int i;
        objectInputStream.defaultReadObject();
        if (objectInputStream.available() != 0) {
            i = objectInputStream.readInt();
            this.b = i;
        } else {
            i = (1 << this.d) - 1;
            this.b = i;
        }
        if (i > (1 << this.d) - 1 || this.a > i + 1 || objectInputStream.available() != 0) {
            throw new IOException("inconsistent BDS data detected");
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.b);
    }

    public fhyz(fhyz fhyzVar, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.c = new fhzm(new fhzo(aSN1ObjectIdentifier));
        this.d = fhyzVar.d;
        this.f = fhyzVar.f;
        this.g = fhyzVar.g;
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        arrayList.addAll(fhyzVar.h);
        this.i = new TreeMap();
        for (Integer num : fhyzVar.i.keySet()) {
            this.i.put(num, (LinkedList) ((LinkedList) fhyzVar.i.get(num)).clone());
        }
        Stack stack = new Stack();
        this.j = stack;
        stack.addAll(fhyzVar.j);
        this.e = new ArrayList();
        Iterator it = fhyzVar.e.iterator();
        while (it.hasNext()) {
            this.e.add(((fhzb) it.next()).clone());
        }
        this.k = new TreeMap(fhyzVar.k);
        int i = fhyzVar.a;
        this.a = i;
        this.b = fhyzVar.b;
        this.l = fhyzVar.l;
        if (this.h != null) {
            if (this.i != null) {
                if (this.j != null) {
                    if (!fiai.f(this.d, i)) {
                        throw new IllegalStateException("index in BDS state out of bounds");
                    }
                    return;
                }
                throw new IllegalStateException("stack == null");
            }
            throw new IllegalStateException("retain == null");
        }
        throw new IllegalStateException("authenticationPath == null");
    }

    public fhyz(fhyz fhyzVar, byte[] bArr, byte[] bArr2, fhzl fhzlVar) {
        this.c = new fhzm(fhyzVar.c.a);
        this.d = fhyzVar.d;
        this.f = fhyzVar.f;
        this.g = fhyzVar.g;
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        arrayList.addAll(fhyzVar.h);
        this.i = new TreeMap();
        for (Integer num : fhyzVar.i.keySet()) {
            this.i.put(num, (LinkedList) ((LinkedList) fhyzVar.i.get(num)).clone());
        }
        Stack stack = new Stack();
        this.j = stack;
        stack.addAll(fhyzVar.j);
        this.e = new ArrayList();
        Iterator it = fhyzVar.e.iterator();
        while (it.hasNext()) {
            this.e.add(((fhzb) it.next()).clone());
        }
        this.k = new TreeMap(fhyzVar.k);
        this.a = fhyzVar.a;
        this.b = fhyzVar.b;
        this.l = false;
        b(bArr, bArr2, fhzlVar);
    }

    private fhyz(fhzm fhzmVar, int i, int i2, int i3) {
        this.c = fhzmVar;
        this.d = i;
        this.b = i3;
        this.f = i2;
        if (i2 <= i && i2 >= 2) {
            int i4 = i - i2;
            if (i4 % 2 == 0) {
                this.h = new ArrayList();
                this.i = new TreeMap();
                this.j = new Stack();
                this.e = new ArrayList();
                for (int i5 = 0; i5 < i4; i5++) {
                    this.e.add(new fhzb(i5));
                }
                this.k = new TreeMap();
                this.a = 0;
                this.l = false;
                return;
            }
        }
        throw new IllegalArgumentException("illegal value for BDS parameter k");
    }

    public fhyz(fiac fiacVar, int i, int i2) {
        this(fiacVar.a(), fiacVar.c, fiacVar.d, i2);
        this.b = i;
        this.a = i2;
        this.l = true;
    }

    public fhyz(fiac fiacVar, byte[] bArr, byte[] bArr2, fhzl fhzlVar) {
        this(fiacVar.a(), fiacVar.c, fiacVar.d, (1 << r1) - 1);
        a(bArr, bArr2, fhzlVar);
    }

    public fhyz(fiac fiacVar, byte[] bArr, byte[] bArr2, fhzl fhzlVar, int i) {
        this(fiacVar.a(), fiacVar.c, fiacVar.d, (1 << r1) - 1);
        a(bArr, bArr2, fhzlVar);
        while (this.a < i) {
            b(bArr, bArr2, fhzlVar);
            this.l = false;
        }
    }
}
