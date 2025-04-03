package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahqf extends abo {
    final /* synthetic */ ahqt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahqf(ahqt ahqtVar) {
        super(false);
        this.a = ahqtVar;
    }

    @Override // defpackage.abo
    public final void b() {
        if (!this.a.a().isPresent()) {
            throw new IllegalArgumentException("expecting action mode is be able to exit action mode on back pressed");
        }
        this.a.b();
        this.a.z.p("handled back press by dismssing action mode");
    }
}
