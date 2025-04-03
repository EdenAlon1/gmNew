package defpackage;

import android.util.Log;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pot {
    public static final pot a = new pon().a();
    public final Map b;

    public pot(pot potVar) {
        potVar.getClass();
        this.b = new HashMap(potVar.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final pot c(byte[] bArr) {
        Object obj;
        bArr.getClass();
        int length = bArr.length;
        if (length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        if (length == 0) {
            return a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            byte[] bArr2 = new byte[2];
            byteArrayInputStream.read(bArr2);
            boolean z = bArr2[0] == -84 && bArr2[1] == -19;
            byteArrayInputStream.reset();
            if (z) {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int readInt = objectInputStream.readInt();
                    for (int i = 0; i < readInt; i++) {
                        String readUTF = objectInputStream.readUTF();
                        readUTF.getClass();
                        linkedHashMap.put(readUTF, objectInputStream.readObject());
                    }
                    ffig.a(objectInputStream, null);
                } finally {
                }
            } else {
                DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                try {
                    short readShort = dataInputStream.readShort();
                    if (readShort != -21521) {
                        throw new IllegalStateException(a.h(readShort, "Magic number doesn't match: "));
                    }
                    short readShort2 = dataInputStream.readShort();
                    if (readShort2 != 1) {
                        throw new IllegalStateException(a.h(readShort2, "Unsupported version number: "));
                    }
                    int readInt2 = dataInputStream.readInt();
                    for (int i2 = 0; i2 < readInt2; i2++) {
                        byte readByte = dataInputStream.readByte();
                        if (readByte == 0) {
                            obj = null;
                        } else if (readByte == 1) {
                            obj = Boolean.valueOf(dataInputStream.readBoolean());
                        } else if (readByte == 2) {
                            obj = Byte.valueOf(dataInputStream.readByte());
                        } else if (readByte == 3) {
                            obj = Integer.valueOf(dataInputStream.readInt());
                        } else if (readByte == 4) {
                            obj = Long.valueOf(dataInputStream.readLong());
                        } else if (readByte == 5) {
                            obj = Float.valueOf(dataInputStream.readFloat());
                        } else if (readByte == 6) {
                            obj = Double.valueOf(dataInputStream.readDouble());
                        } else if (readByte == 7) {
                            obj = dataInputStream.readUTF();
                        } else if (readByte == 8) {
                            int readInt3 = dataInputStream.readInt();
                            Boolean[] boolArr = new Boolean[readInt3];
                            for (int i3 = 0; i3 < readInt3; i3++) {
                                boolArr[i3] = Boolean.valueOf(dataInputStream.readBoolean());
                            }
                            obj = (Serializable) boolArr;
                        } else if (readByte == 9) {
                            int readInt4 = dataInputStream.readInt();
                            Byte[] bArr3 = new Byte[readInt4];
                            for (int i4 = 0; i4 < readInt4; i4++) {
                                bArr3[i4] = Byte.valueOf(dataInputStream.readByte());
                            }
                            obj = (Serializable) bArr3;
                        } else if (readByte == 10) {
                            int readInt5 = dataInputStream.readInt();
                            Integer[] numArr = new Integer[readInt5];
                            for (int i5 = 0; i5 < readInt5; i5++) {
                                numArr[i5] = Integer.valueOf(dataInputStream.readInt());
                            }
                            obj = (Serializable) numArr;
                        } else if (readByte == 11) {
                            int readInt6 = dataInputStream.readInt();
                            Long[] lArr = new Long[readInt6];
                            for (int i6 = 0; i6 < readInt6; i6++) {
                                lArr[i6] = Long.valueOf(dataInputStream.readLong());
                            }
                            obj = (Serializable) lArr;
                        } else if (readByte == 12) {
                            int readInt7 = dataInputStream.readInt();
                            Float[] fArr = new Float[readInt7];
                            for (int i7 = 0; i7 < readInt7; i7++) {
                                fArr[i7] = Float.valueOf(dataInputStream.readFloat());
                            }
                            obj = (Serializable) fArr;
                        } else if (readByte == 13) {
                            int readInt8 = dataInputStream.readInt();
                            Double[] dArr = new Double[readInt8];
                            for (int i8 = 0; i8 < readInt8; i8++) {
                                dArr[i8] = Double.valueOf(dataInputStream.readDouble());
                            }
                            obj = (Serializable) dArr;
                        } else {
                            if (readByte != 14) {
                                throw new IllegalStateException(a.h(readByte, "Unsupported type "));
                            }
                            int readInt9 = dataInputStream.readInt();
                            String[] strArr = new String[readInt9];
                            for (int i9 = 0; i9 < readInt9; i9++) {
                                String readUTF2 = dataInputStream.readUTF();
                                if (true == ffkj.e(readUTF2, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                                    readUTF2 = null;
                                }
                                strArr[i9] = readUTF2;
                            }
                            obj = (Serializable) strArr;
                        }
                        String readUTF3 = dataInputStream.readUTF();
                        readUTF3.getClass();
                        linkedHashMap.put(readUTF3, obj);
                    }
                    ffig.a(dataInputStream, null);
                } finally {
                }
            }
        } catch (IOException e) {
            String str = pou.a;
            ppt.c();
            Log.e(str, "Error in Data#fromByteArray: ", e);
        } catch (ClassNotFoundException e2) {
            String str2 = pou.a;
            ppt.c();
            Log.e(str2, "Error in Data#fromByteArray: ", e2);
        }
        return new pot(linkedHashMap);
    }

    public final int a(String str, int i) {
        Map map = this.b;
        Object valueOf = Integer.valueOf(i);
        Object obj = map.get(str);
        if (true == (obj instanceof Integer)) {
            valueOf = obj;
        }
        return ((Number) valueOf).intValue();
    }

    public final long b(String str, long j) {
        Map map = this.b;
        Object valueOf = Long.valueOf(j);
        Object obj = map.get(str);
        if (true == (obj instanceof Long)) {
            valueOf = obj;
        }
        return ((Number) valueOf).longValue();
    }

    public final String d(String str) {
        Object obj = this.b.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final Map e() {
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(this.b);
        unmodifiableMap.getClass();
        return unmodifiableMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto L69
            java.lang.Class r2 = r7.getClass()
            java.lang.Class r3 = r8.getClass()
            boolean r2 = defpackage.ffkj.e(r2, r3)
            if (r2 != 0) goto L16
            goto L69
        L16:
            pot r8 = (defpackage.pot) r8
            java.util.Map r2 = r7.b
            java.util.Map r3 = r8.b
            java.util.Set r2 = r2.keySet()
            java.util.Set r3 = r3.keySet()
            boolean r3 = defpackage.ffkj.e(r2, r3)
            if (r3 != 0) goto L2b
            return r1
        L2b:
            java.util.Iterator r2 = r2.iterator()
        L2f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L68
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.util.Map r4 = r7.b
            java.lang.Object r4 = r4.get(r3)
            java.util.Map r5 = r8.b
            java.lang.Object r3 = r5.get(r3)
            if (r4 == 0) goto L65
            if (r3 != 0) goto L4c
            goto L65
        L4c:
            boolean r5 = r4 instanceof java.lang.Object[]
            if (r5 == 0) goto L5e
            r5 = r4
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            boolean r6 = r3 instanceof java.lang.Object[]
            if (r6 == 0) goto L5e
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            boolean r3 = defpackage.ffdo.b(r5, r3)
            goto L62
        L5e:
            boolean r3 = defpackage.ffkj.e(r4, r3)
        L62:
            if (r3 != 0) goto L2f
            goto L67
        L65:
            if (r4 == r3) goto L2f
        L67:
            return r1
        L68:
            return r0
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pot.equals(java.lang.Object):boolean");
    }

    public final boolean f(String str, Class cls) {
        Object obj = this.b.get(str);
        return obj != null && cls.isAssignableFrom(obj.getClass());
    }

    public final byte[] g(String str) {
        str.getClass();
        Object obj = this.b.get(str);
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Object[]) {
                int length = objArr.length;
                pop popVar = new pop(obj);
                byte[] bArr = new byte[length];
                for (int i = 0; i < length; i++) {
                    bArr[i] = ((Number) popVar.invoke(Integer.valueOf(i))).byteValue();
                }
                return bArr;
            }
        }
        return null;
    }

    public final boolean h(String str) {
        Object obj = this.b.get(str);
        return ((Boolean) (true == (obj instanceof Boolean) ? obj : false)).booleanValue();
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : this.b.entrySet()) {
            Object value = entry.getValue();
            i += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return i * 31;
    }

    public final String toString() {
        return "Data {" + ffdx.aA(this.b.entrySet(), null, null, null, pos.a, 31) + "}";
    }

    public pot(Map map) {
        this.b = new HashMap(map);
    }
}
