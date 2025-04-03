package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxzk implements dxxr {
    @Override // defpackage.dxxr
    public final ListenableFuture a(List list) {
        int i = engw.d;
        engr engrVar = new engr();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dwph dwphVar = (dwph) it.next();
            if (dwphVar.c.startsWith("global") || dwphVar.c.equals("model_metadata.pb") || dwphVar.c.equals("word_embeddings") || dwphVar.c.equals("RefNet.tflite")) {
                engrVar.h(dwphVar);
            }
        }
        return erqt.i(engrVar.g());
    }
}
