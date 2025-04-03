package defpackage;

import com.google.communication.synapse.security.scytale.NativeBaseCrypto;
import com.google.communication.synapse.security.scytale.Scope;
import com.google.media.webrtc.common.StatusOr;
import google.internal.communications.instantmessaging.v1.TachyonCommon$PublicPreKeySets;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cadw {
    public static final cskc a = cskc.g("BugleEtouffee", "PrekeysManager");
    public final cafi b;
    public final bzvx c;
    public final errl d;
    public final fazb e;

    public cadw(cafi cafiVar, bzvx bzvxVar, errl errlVar, fazb fazbVar) {
        this.b = cafiVar;
        this.c = bzvxVar;
        this.d = errlVar;
        this.e = fazbVar;
    }

    public final elfl a(String str) {
        final int intValue = ((Integer) bzwd.d.e()).intValue();
        csjb a2 = a.a();
        a2.I("Generating new prekey set");
        a2.y("count", intValue);
        a2.r();
        this.e.b();
        final Scope create = Scope.create(this.b.b());
        return this.c.a(str).h(new emwl() { // from class: cadq
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((NativeBaseCrypto) obj).generatePrekeySet(Scope.this, intValue);
            }
        }, this.d).h(new emwl() { // from class: cadr
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return (TachyonCommon$PublicPreKeySets) cafo.a((StatusOr) obj);
            }
        }, erpp.a);
    }
}
