package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abbu {
    public final abbv a;
    public final drau b;
    private final ffsk c;
    private final ffbr d;
    private final abak e;

    public abbu(ffsk ffskVar, ffsk ffskVar2, ffbr ffbrVar, cslr cslrVar, abak abakVar, abbv abbvVar, Optional optional) {
        ffskVar.getClass();
        ffskVar2.getClass();
        cslrVar.getClass();
        abakVar.getClass();
        abbvVar.getClass();
        optional.getClass();
        this.c = ffskVar2;
        this.d = ffbrVar;
        this.e = abakVar;
        this.a = abbvVar;
        this.b = (drau) fflm.b(optional);
    }

    public final void a(apyv apyvVar, MessageId messageId, cmrx cmrxVar, cmrm cmrmVar, apxz apxzVar) {
        apyvVar.getClass();
        messageId.getClass();
        cmrxVar.getClass();
        cmrmVar.getClass();
        fjay a = cslr.a();
        if (fffi.d(cmrm.ADD_REACTION, cmrm.REPLACE_REACTION).contains(cmrmVar)) {
            abak abakVar = this.e;
            a.getClass();
            abakVar.a(a);
        }
        axol.k(this.c, null, new abbt(cmrmVar, (alye) this.d.b(), messageId, apyvVar, cmrxVar, a, apxzVar, this, null), 3);
    }
}
