package defpackage;

import java.net.URL;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eais extends eaiy {
    public URL a;
    public String b;
    public Map c;
    public byte[] d;
    public int e;

    public eais() {
    }

    @Override // defpackage.eaiy
    public final eaja a() {
        Map map;
        int i;
        URL url = this.a;
        if (url != null && (map = this.c) != null && (i = this.e) != 0) {
            return new eait(url, this.b, map, this.d, i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" url");
        }
        if (this.c == null) {
            sb.append(" headers");
        }
        if (this.e == 0) {
            sb.append(" purpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.eaiy
    public final Map b() {
        Map map = this.c;
        if (map != null) {
            return map;
        }
        throw new IllegalStateException("Property \"headers\" has not been set");
    }

    public eais(eaja eajaVar) {
        eait eaitVar = (eait) eajaVar;
        this.a = eaitVar.a;
        this.b = eaitVar.b;
        this.c = eaitVar.c;
        this.d = eaitVar.d;
        this.e = eaitVar.e;
    }
}
