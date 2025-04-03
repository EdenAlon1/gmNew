package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhgv {
    public final fhgk a;
    public final String b;
    public final fhgh c;
    public final fhgz d;
    public final Map e;
    public fhfc f;

    public fhgv(fhgk fhgkVar, String str, fhgh fhghVar, fhgz fhgzVar, Map map) {
        str.getClass();
        map.getClass();
        this.a = fhgkVar;
        this.b = str;
        this.c = fhghVar;
        this.d = fhgzVar;
        this.e = map;
    }

    public final String a(String str) {
        return this.c.b(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.a);
        if (this.c.a() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Object obj : this.c) {
                int i2 = i + 1;
                if (i < 0) {
                    ffdx.l();
                }
                ffcf ffcfVar = (ffcf) obj;
                String str = (String) ffcfVar.a;
                String str2 = (String) ffcfVar.b;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i = i2;
            }
            sb.append(']');
        }
        if (!this.e.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.e);
        }
        sb.append('}');
        return sb.toString();
    }
}
