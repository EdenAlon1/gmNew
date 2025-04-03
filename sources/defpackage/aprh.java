package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aprh implements aqge {
    public final ffsk a;
    public final cblf b;
    public final MessageId c;
    public ctbx d;
    public final ctbl e;

    public aprh(ffsk ffskVar, cblf cblfVar, ctbk ctbkVar, MessageId messageId) {
        this.a = ffskVar;
        this.b = cblfVar;
        this.c = messageId;
        this.e = ctbkVar.a(new apre(this));
    }

    @Override // defpackage.aqge
    public final ctbx a(final aqgd aqgdVar) {
        return this.e.a(new ctbf() { // from class: aprb
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                return aqgd.this.a();
            }
        }, "RichCardFileTransferProgressSupplier:register", "RichCardFileTransferProgressSupplier:callback", "RichCardFileTransferProgressSupplier:unregister");
    }

    @Override // defpackage.aqge
    public final elfl b() {
        elfl c;
        c = axol.c(this.a, ffhe.a, ffsm.a, new aprc(this, null));
        return c;
    }

    @Override // defpackage.aqge
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }
}
