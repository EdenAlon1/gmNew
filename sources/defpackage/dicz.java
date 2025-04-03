package defpackage;

import android.net.Uri;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dicz implements dhzm {
    private final Uri a;
    private final byte[] b;
    private final Map c;

    /* JADX WARN: Multi-variable type inference failed */
    public dicz(dhzm dhzmVar) {
        this.a = dhzmVar.a();
        this.b = ((dfux) dhzmVar).gO();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : dhzmVar.b().entrySet()) {
            if (entry.getKey() != null) {
                hashMap.put((String) entry.getKey(), (dhzn) ((dhzn) entry.getValue()).d());
            }
        }
        this.c = DesugarCollections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.dhzm
    public final Uri a() {
        return this.a;
    }

    @Override // defpackage.dhzm
    public final Map b() {
        return this.c;
    }

    @Override // defpackage.dhzm
    public final byte[] c() {
        return this.b;
    }

    public final String toString() {
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder sb = new StringBuilder("DataItemEntity{ ");
        sb.append("uri=".concat(String.valueOf(String.valueOf(this.a))));
        byte[] bArr = this.b;
        sb.append(", dataSz=".concat((bArr == null ? "null" : Integer.valueOf(bArr.length)).toString()));
        sb.append(", numAssets=" + this.c.size());
        if (isLoggable && !this.c.isEmpty()) {
            sb.append(", assets=[");
            String str = "";
            for (Map.Entry entry : this.c.entrySet()) {
                sb.append(str + ((String) entry.getKey()) + ": " + ((dhzn) entry.getValue()).b());
                str = ", ";
            }
            sb.append("]");
        }
        sb.append(" }");
        return sb.toString();
    }

    @Override // defpackage.dfvc
    public final /* bridge */ /* synthetic */ Object d() {
        return this;
    }
}
