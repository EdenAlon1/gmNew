package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aozk implements aqge {
    public final MessageId a;
    private final alye b;

    public aozk(alye alyeVar, MessageId messageId) {
        messageId.getClass();
        this.b = alyeVar;
        this.a = messageId;
    }

    @Override // defpackage.aqge
    public final ctbx a(aqgd aqgdVar) {
        return this.b.k(new aozj(this, aqgdVar));
    }

    @Override // defpackage.aqge
    public final elfl b() {
        return this.b.u(this.a);
    }

    @Override // defpackage.aqge
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException("Blocking API is not supported.");
    }
}
