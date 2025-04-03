package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eusn implements eusf {
    public static final eusd a;
    public static final eusd b;
    private static final Charset d = Charset.forName("UTF-8");
    private static final euse e;
    public final Map c;
    private OutputStream f;
    private final Map g;
    private final euse h;
    private final eusr i = new eusr();

    static {
        eusc euscVar = new eusc("key");
        euscVar.b(new eush(1, eusk.DEFAULT));
        a = euscVar.a();
        eusc euscVar2 = new eusc(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE);
        euscVar2.b(new eush(2, eusk.DEFAULT));
        b = euscVar2.a();
        e = new euse() { // from class: eusm
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.eusa
            public final void a(Object obj, Object obj2) {
                Map.Entry entry = (Map.Entry) obj;
                obj2.b(eusn.a, entry.getKey());
                obj2.b(eusn.b, entry.getValue());
            }
        };
    }

    public eusn(OutputStream outputStream, Map map, Map map2, euse euseVar) {
        this.f = outputStream;
        this.c = map;
        this.g = map2;
        this.h = euseVar;
    }

    private static int g(eusd eusdVar) {
        eusl euslVar = (eusl) eusdVar.a(eusl.class);
        if (euslVar != null) {
            return euslVar.a();
        }
        throw new eusb("Field has no @Protobuf config");
    }

    private static eusl h(eusd eusdVar) {
        eusl euslVar = (eusl) eusdVar.a(eusl.class);
        if (euslVar != null) {
            return euslVar;
        }
        throw new eusb("Field has no @Protobuf config");
    }

    private static ByteBuffer i(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void j(int i) {
        while (true) {
            int i2 = i & 127;
            if ((i & (-128)) == 0) {
                this.f.write(i2);
                return;
            } else {
                this.f.write(i2 | 128);
                i >>>= 7;
            }
        }
    }

    private final void k(long j) {
        while (true) {
            int i = ((int) j) & 127;
            if (((-128) & j) == 0) {
                this.f.write(i);
                return;
            } else {
                this.f.write(i | 128);
                j >>>= 7;
            }
        }
    }

    private final void l(euse euseVar, eusd eusdVar, Object obj, boolean z) {
        eusi eusiVar = new eusi();
        try {
            OutputStream outputStream = this.f;
            this.f = eusiVar;
            try {
                euseVar.a(obj, this);
                this.f = outputStream;
                long j = eusiVar.a;
                eusiVar.close();
                if (z && j == 0) {
                    return;
                }
                j((g(eusdVar) << 3) | 2);
                k(j);
                euseVar.a(obj, this);
            } catch (Throwable th) {
                this.f = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                eusiVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // defpackage.eusf
    public final /* bridge */ /* synthetic */ void a(eusd eusdVar, long j) {
        d(eusdVar, j, true);
    }

    @Override // defpackage.eusf
    public final void b(eusd eusdVar, Object obj) {
        f(eusdVar, obj, true);
    }

    final void c(eusd eusdVar, int i, boolean z) {
        if (z && i == 0) {
            return;
        }
        eusl h = h(eusdVar);
        int ordinal = h.b().ordinal();
        if (ordinal == 0) {
            j(h.a() << 3);
            j(i);
        } else if (ordinal == 1) {
            j(h.a() << 3);
            j((i + i) ^ (i >> 31));
        } else {
            if (ordinal != 2) {
                return;
            }
            j((h.a() << 3) | 5);
            this.f.write(i(4).putInt(i).array());
        }
    }

    final void d(eusd eusdVar, long j, boolean z) {
        if (z && j == 0) {
            return;
        }
        eusl h = h(eusdVar);
        int ordinal = h.b().ordinal();
        if (ordinal == 0) {
            j(h.a() << 3);
            k(j);
        } else if (ordinal == 1) {
            j(h.a() << 3);
            k((j >> 63) ^ (j + j));
        } else {
            if (ordinal != 2) {
                return;
            }
            j((h.a() << 3) | 1);
            this.f.write(i(8).putLong(j).array());
        }
    }

    public final void e(eusd eusdVar, int i) {
        c(eusdVar, i, true);
    }

    final void f(eusd eusdVar, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            j((g(eusdVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(d);
            j(bytes.length);
            this.f.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                f(eusdVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                l(e, eusdVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (z && doubleValue == eobe.a) {
                return;
            }
            j((g(eusdVar) << 3) | 1);
            this.f.write(i(8).putDouble(doubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (z && floatValue == 0.0f) {
                return;
            }
            j((g(eusdVar) << 3) | 5);
            this.f.write(i(4).putFloat(floatValue).array());
            return;
        }
        if (obj instanceof Number) {
            d(eusdVar, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            c(eusdVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            j((g(eusdVar) << 3) | 2);
            j(bArr.length);
            this.f.write(bArr);
            return;
        }
        euse euseVar = (euse) this.c.get(obj.getClass());
        if (euseVar != null) {
            l(euseVar, eusdVar, obj, z);
            return;
        }
        eusg eusgVar = (eusg) this.g.get(obj.getClass());
        if (eusgVar != null) {
            eusgVar.a(obj, this.i);
            return;
        }
        if (obj instanceof eusj) {
            e(eusdVar, ((eusj) obj).a());
        } else if (obj instanceof Enum) {
            e(eusdVar, ((Enum) obj).ordinal());
        } else {
            l(this.h, eusdVar, obj, z);
        }
    }
}
