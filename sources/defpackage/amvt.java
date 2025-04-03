package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amvt implements aqge {
    public final ffbr a;
    public final Conversation b;
    public final alxl c;
    public final aqge d;
    private final ffsk e;

    public amvt(ffsk ffskVar, ffbr ffbrVar, Conversation conversation, alxl alxlVar, aqge aqgeVar) {
        this.e = ffskVar;
        this.a = ffbrVar;
        this.b = conversation;
        this.c = alxlVar;
        this.d = aqgeVar;
    }

    @Override // defpackage.aqge
    public final ctbx a(aqgd aqgdVar) {
        ctbx a = this.b.g().a(aqgdVar);
        a.getClass();
        return a;
    }

    @Override // defpackage.aqge
    public final elfl b() {
        elfl c;
        c = axol.c(this.e, ffhe.a, ffsm.a, new amvs(this, null));
        return c;
    }

    @Override // defpackage.aqge
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException("PenpalBotConversationLocalIdentitiesSupplier.getBlocking is not supported.");
    }
}
