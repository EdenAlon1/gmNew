package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crsx extends LinkedHashMap {
    private final int a = BasePaymentResult.ERROR_REQUEST_FAILED;

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        entry.getClass();
        return super.size() > this.a;
    }
}
