package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emxz extends emyc {
    final /* synthetic */ emwa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emxz(emye emyeVar, CharSequence charSequence, emwa emwaVar) {
        super(emyeVar, charSequence);
        this.b = emwaVar;
    }

    @Override // defpackage.emyc
    public final int b(int i) {
        return ((emwq) this.b).a.end();
    }

    @Override // defpackage.emyc
    public final int c(int i) {
        if (((emwq) this.b).a.find(i)) {
            return ((emwq) this.b).a.start();
        }
        return -1;
    }
}
