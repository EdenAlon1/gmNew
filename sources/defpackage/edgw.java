package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class edgw implements dhqh {
    @Override // defpackage.dhqh
    public final Object a(dhre dhreVar) {
        Exception h = dhreVar.h();
        if (h != null) {
            return dhrt.b(h instanceof dfqu ? (dfqu) h : h instanceof fedn ? edgb.a((fedn) h) : ((h instanceof ExecutionException) && (h.getCause() instanceof fedn)) ? edgb.a((fedn) h.getCause()) : new dfqu(new Status(13, h.toString())));
        }
        return dhreVar;
    }
}
