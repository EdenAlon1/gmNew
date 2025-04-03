package defpackage;

import android.os.Bundle;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewxt {
    public final String a;
    public final float b;
    public final Bundle c;
    public final int d;
    public final int e;

    public ewxt(String str, Float f, int i, int i2, Bundle bundle) {
        str.getClass();
        this.a = str;
        f.getClass();
        this.b = f.floatValue();
        this.c = bundle;
        this.d = i;
        this.e = i2;
    }

    public final engw a() {
        byte[] byteArray = this.c.getByteArray("textclassifier.extras.EXTRA_SERIALIZED_ENTITY_DATA");
        engr engrVar = new engr();
        if (byteArray != null) {
            ByteBuffer wrap = ByteBuffer.wrap(byteArray);
            fgjw fgjwVar = new fgjw();
            wrap.order(ByteOrder.LITTLE_ENDIAN);
            fgjwVar.h(wrap.getInt(wrap.position()) + wrap.position(), wrap);
            fgjx fgjxVar = new fgjx();
            int d = fgjwVar.d(10);
            if (d != 0) {
                fgjxVar.h(fgjwVar.c(d + fgjwVar.a), fgjwVar.b);
            } else {
                fgjxVar = null;
            }
            if (fgjxVar != null) {
                int i = 0;
                while (true) {
                    int d2 = fgjxVar.d(8);
                    if (i >= (d2 != 0 ? fgjxVar.f(d2) : 0)) {
                        break;
                    }
                    fgjy a = fgjxVar.a(i);
                    int d3 = a.d(4);
                    int i2 = d3 != 0 ? a.b.getInt(d3 + a.a) : 0;
                    enhk enhkVar = ewxh.m;
                    Integer valueOf = Integer.valueOf(i2);
                    emxf.d(enhkVar.containsKey(valueOf), "Unknown datetime component type value: %s", i2);
                    ewxh ewxhVar = (ewxh) ewxh.m.get(valueOf);
                    fgjy a2 = fgjxVar.a(i);
                    int d4 = a2.d(10);
                    int i3 = d4 != 0 ? a2.b.getInt(d4 + a2.a) : 0;
                    enhk enhkVar2 = ewxi.d;
                    Integer valueOf2 = Integer.valueOf(i3);
                    emxf.d(enhkVar2.containsKey(valueOf2), "Unknown datetime relation type value: %s", i3);
                    ewxi ewxiVar = (ewxi) ewxi.d.get(valueOf2);
                    fgjy a3 = fgjxVar.a(i);
                    int d5 = a3.d(6);
                    int i4 = d5 != 0 ? a3.b.getInt(d5 + a3.a) : 0;
                    fgjy a4 = fgjxVar.a(i);
                    int d6 = a4.d(8);
                    engrVar.h(new ewxj(ewxhVar, ewxiVar, i4, d6 != 0 ? a4.b.getInt(d6 + a4.a) : 0));
                    i++;
                }
            }
        }
        return engrVar.g();
    }

    public final ewxk b() {
        if (this.c.containsKey("textclassifier.extras.DATETIME_GRANULARITY")) {
            return ewxk.a(this.c.getInt("textclassifier.extras.DATETIME_GRANULARITY"));
        }
        return null;
    }

    public final String toString() {
        return String.format(Locale.US, "Entity {type=%s, score=%s, start=%s, end=%s, extras=%s}", this.a, Float.valueOf(this.b), Integer.valueOf(this.d), Integer.valueOf(this.e), this.c);
    }
}
