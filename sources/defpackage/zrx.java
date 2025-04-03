package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Optional;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zrx {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/messagelist/message/MessageUiDataCache");
    public final zsi b;
    public final ffhd c;
    public final zrv d;
    public HashSet e;
    public HashSet f;
    private final ffsk g;

    public zrx(zsi zsiVar, ffsk ffskVar, ffhd ffhdVar, Optional optional) {
        zsiVar.getClass();
        ffskVar.getClass();
        ffhdVar.getClass();
        this.b = zsiVar;
        this.g = ffskVar;
        this.c = ffskVar.hT();
        zry zryVar = (zry) fflm.b(optional);
        this.d = new zrv(zryVar != null ? zryVar.a.b() : BasePaymentResult.ERROR_REQUEST_FAILED, new zrw(this));
        this.e = new HashSet();
        this.f = new HashSet();
    }
}
