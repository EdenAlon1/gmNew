package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djgt implements djgy {
    private final dket a;

    public djgt(dket dketVar) {
        this.a = dketVar;
    }

    @Override // defpackage.djgy
    public final dklp createIncomingSession(eenk eenkVar) {
        throw null;
    }

    @Override // defpackage.djgy
    public final dkli createOutgoingSession(String str) {
        return this.a.createOutgoingSession(str);
    }

    @Override // defpackage.djgy
    public final dkli createOutgoingSlmSession(String str) {
        return this.a.createOutgoingSlmSession(str);
    }
}
