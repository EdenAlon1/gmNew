package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fank {
    public static final fanj a(InputStream inputStream, fanm fanmVar) {
        boolean z;
        try {
            fanj b = b(inputStream, fanmVar);
            if (z) {
                try {
                    fanmVar.close();
                } catch (IOException unused) {
                }
            }
            return b;
        } finally {
            if (inputStream instanceof ByteArrayInputStream) {
                try {
                    fanmVar.close();
                } catch (IOException unused2) {
                }
            }
        }
    }

    private static final fanj b(InputStream inputStream, fanm fanmVar) {
        byte b;
        byte b2;
        boolean z;
        int i;
        boolean z2;
        try {
            fanl b3 = fanmVar.b();
            if (b3 == null) {
                throw new fand("Parser being asked to parse an empty input stream");
            }
            try {
                b = b3.b;
                b2 = b3.a;
                z = true;
                i = 0;
            } catch (IOException | RuntimeException e) {
                e = e;
            }
            try {
                if (b2 == Byte.MIN_VALUE) {
                    fanmVar.d(Byte.MIN_VALUE);
                    fanmVar.c();
                    long a = fanmVar.a();
                    if (a < 0) {
                        throw new UnsupportedOperationException(String.format("the maximum supported array length is %s", Long.MAX_VALUE));
                    }
                    if (a > 0) {
                        fanmVar.b.d(a);
                    }
                    if (a > 1000) {
                        throw new fand("Parser being asked to read a large CBOR array");
                    }
                    c(b, a);
                    fanj[] fanjVarArr = new fanj[(int) a];
                    while (i < a) {
                        fanjVarArr[i] = b(inputStream, fanmVar);
                        i++;
                    }
                    return new fana(engw.p(fanjVarArr));
                }
                if (b2 == -96) {
                    fanmVar.d((byte) -96);
                    fanmVar.c();
                    long a2 = fanmVar.a();
                    if (a2 < 0 || a2 > 4611686018427387903L) {
                        throw new UnsupportedOperationException("the maximum supported map length is 4611686018427387903L");
                    }
                    if (a2 > 0) {
                        fanmVar.b.d(a2 + a2);
                    }
                    if (a2 > 1000) {
                        throw new fand("Parser being asked to read a large CBOR map");
                    }
                    c(b, a2);
                    int i2 = (int) a2;
                    fanf[] fanfVarArr = new fanf[i2];
                    fanj fanjVar = null;
                    int i3 = 0;
                    while (i3 < a2) {
                        fanj b4 = b(inputStream, fanmVar);
                        if (fanjVar != null && b4.compareTo(fanjVar) <= 0) {
                            throw new famz(String.format("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: %s\nCurrent key: %s", fanjVar.toString(), b4.toString()));
                        }
                        fanfVarArr[i3] = new fanf(b4, b(inputStream, fanmVar));
                        i3++;
                        fanjVar = b4;
                    }
                    TreeMap treeMap = new TreeMap();
                    while (i < i2) {
                        fanf fanfVar = fanfVarArr[i];
                        if (treeMap.containsKey(fanfVar.a)) {
                            throw new famz("Attempted to add duplicate key to canonical CBOR Map.");
                        }
                        treeMap.put(fanfVar.a, fanfVar.b);
                        i++;
                    }
                    return new fang(eniz.a(treeMap, eniz.a));
                }
                if (b2 == -64) {
                    throw new fand("Tags are currently unsupported");
                }
                if (b2 == -32) {
                    fanmVar.d((byte) -32);
                    if (fanmVar.a.b > 24) {
                        throw new IllegalStateException("expected simple value");
                    }
                    int a3 = (int) fanmVar.a();
                    if (a3 == 20) {
                        z = false;
                    } else if (a3 != 21) {
                        throw new IllegalStateException(String.format("expected FALSE or TRUE", new Object[0]));
                    }
                    return new fanb(z);
                }
                if (b2 != 0 && b2 != 32) {
                    if (b2 == 64) {
                        fanmVar.d((byte) 64);
                        byte[] e2 = fanmVar.e();
                        c(b, e2.length);
                        return new fanc(eyee.x(e2));
                    }
                    if (b2 == 96) {
                        fanmVar.d((byte) 96);
                        String str = new String(fanmVar.e(), StandardCharsets.UTF_8);
                        c(b, str.length());
                        return new fanh(str);
                    }
                    throw new fand("Unidentifiable major type: " + b3.a());
                }
                fanmVar.b();
                fanl fanlVar = fanmVar.a;
                byte b5 = fanlVar.a;
                if (b5 == 0) {
                    z2 = true;
                } else {
                    if (b5 != 32) {
                        throw new IllegalStateException(String.format("expected major type 0 or 1 but found %s", Integer.valueOf(fanlVar.a())));
                    }
                    z2 = false;
                }
                long a4 = fanmVar.a();
                if (a4 < 0) {
                    throw new UnsupportedOperationException(String.format("the maximum supported unsigned/negative integer is %s", Long.MAX_VALUE));
                }
                if (!z2) {
                    a4 = ~a4;
                }
                c(b, a4 > 0 ? a4 : ~a4);
                return new fane(a4);
            } catch (RuntimeException e3) {
                e = e3;
                throw new fand(e);
            }
        } catch (IOException e4) {
            throw new fand(e4);
        }
    }

    private static final void c(byte b, long j) {
        switch (b) {
            case 24:
                if (j < 24) {
                    throw new famz(a.y(j, "Integer value ", " after add info could have been represented in 0 additional bytes, but used 1"));
                }
                return;
            case 25:
                if (j < 256) {
                    throw new famz(a.y(j, "Integer value ", " after add info could have been represented in 0-1 additional bytes, but used 2"));
                }
                return;
            case 26:
                if (j < 65536) {
                    throw new famz(a.y(j, "Integer value ", " after add info could have been represented in 0-2 additional bytes, but used 4"));
                }
                return;
            case 27:
                if (j < 4294967296L) {
                    throw new famz(a.y(j, "Integer value ", " after add info could have been represented in 0-4 additional bytes, but used 8"));
                }
                return;
            default:
                return;
        }
    }
}
