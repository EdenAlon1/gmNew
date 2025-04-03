package defpackage;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class didb extends dfux implements dhzm {
    private final int c;

    public didb(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.c = i2;
    }

    @Override // defpackage.dhzm
    public final Uri a() {
        return Uri.parse(gN("path"));
    }

    @Override // defpackage.dhzm
    public final Map b() {
        HashMap hashMap = new HashMap(this.c);
        for (int i = 0; i < this.c; i++) {
            dicy dicyVar = new dicy(this.a, this.b + i);
            if (dicyVar.a() != null) {
                hashMap.put(dicyVar.a(), dicyVar);
            }
        }
        return hashMap;
    }

    @Override // defpackage.dhzm
    public final byte[] c() {
        return gO();
    }

    @Override // defpackage.dfvc
    public final /* synthetic */ Object d() {
        return new dicz(this);
    }

    public final String toString() {
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        byte[] gO = gO();
        Map b = b();
        StringBuilder sb = new StringBuilder("DataItemRef{ ");
        sb.append("uri=".concat(String.valueOf(String.valueOf(a()))));
        sb.append(", dataSz=".concat((gO == null ? "null" : Integer.valueOf(gO.length)).toString()));
        sb.append(", numAssets=" + b.size());
        if (isLoggable && !b.isEmpty()) {
            sb.append(", assets=[");
            String str = "";
            for (Map.Entry entry : b.entrySet()) {
                sb.append(str + ((String) entry.getKey()) + ": " + ((dhzn) entry.getValue()).b());
                str = ", ";
            }
            sb.append("]");
        }
        sb.append(" }");
        return sb.toString();
    }
}
