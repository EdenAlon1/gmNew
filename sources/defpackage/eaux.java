package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaux implements eaiw {
    private final evah a;

    public eaux(evah evahVar) {
        this.a = evahVar;
    }

    @Override // defpackage.eaiw
    public final ListenableFuture a(eaja eajaVar) {
        evay evayVar = new evay();
        eait eaitVar = (eait) eajaVar;
        evayVar.e(eaitVar.a.toString());
        for (Map.Entry entry : eaitVar.c.entrySet()) {
            for (String str : (List) entry.getValue()) {
                evax b = evax.b(((eaix) entry.getKey()).a());
                str.getClass();
                evayVar.b.t(b, str);
            }
        }
        byte[] bArr = eaitVar.d;
        if (bArr != null) {
            evayVar.d(eaitVar.b, (ByteBuffer) ByteBuffer.allocateDirect(bArr.length).put(bArr).position(0));
            evayVar.c("POST");
        } else {
            evayVar.c("GET");
        }
        return erny.f(this.a.a(evayVar.a()), eldl.a(new emwl() { // from class: eauw
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                byte[] bArr2;
                evbg evbgVar = (evbg) obj;
                eaiu eaiuVar = new eaiu();
                eaiuVar.b = new HashMap();
                eaiuVar.f = true;
                eaiuVar.a = Integer.valueOf(evbgVar.c);
                ByteBuffer byteBuffer = evbgVar.b;
                if (byteBuffer == null) {
                    bArr2 = new byte[0];
                } else if (byteBuffer.hasArray()) {
                    int arrayOffset = byteBuffer.arrayOffset();
                    if (arrayOffset == 0) {
                        if (byteBuffer.array().length == byteBuffer.limit()) {
                            bArr2 = byteBuffer.array();
                        } else {
                            arrayOffset = 0;
                        }
                    }
                    bArr2 = Arrays.copyOfRange(byteBuffer.array(), arrayOffset, byteBuffer.limit() + arrayOffset);
                } else {
                    byte[] bArr3 = new byte[byteBuffer.limit()];
                    int position = byteBuffer.position();
                    byteBuffer.position(0);
                    byteBuffer.get(bArr3);
                    byteBuffer.position(position);
                    bArr2 = bArr3;
                }
                eaiuVar.c = bArr2;
                enkg enkgVar = evbgVar.a;
                enhd enhdVar = new enhd();
                for (Map.Entry entry2 : enkgVar.w().entrySet()) {
                    enhdVar.k(eaix.b(((evax) entry2.getKey()).a()), (List) entry2.getValue());
                }
                eaiuVar.a().putAll(enhdVar.c());
                if (eaiuVar.f) {
                    eaiuVar.d = eaiuVar.c;
                } else {
                    try {
                        Map a = eaiuVar.a();
                        byte[] bArr4 = eaiuVar.c;
                        if (a.containsKey(eaix.a)) {
                            List list = (List) a.get(eaix.a);
                            if (!list.isEmpty() && emuz.e((CharSequence) list.get(0), "gzip")) {
                                bArr4 = eoej.b(new GZIPInputStream(new ByteArrayInputStream(bArr4)));
                            }
                        }
                        eaiuVar.d = bArr4;
                    } catch (IOException e) {
                        eaiuVar.e = e;
                    }
                }
                Map map = eaiuVar.b;
                if (map != null) {
                    return new eaiv(eaiuVar.a, map, eaiuVar.c, eaiuVar.d, eaiuVar.e);
                }
                throw new IllegalStateException("Missing required properties: headers");
            }
        }), erpp.a);
    }

    @Override // defpackage.eaiw
    public final String b() {
        return "tiktok";
    }
}
