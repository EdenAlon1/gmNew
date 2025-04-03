package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emxx extends emyc {
    final /* synthetic */ emvz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emxx(emye emyeVar, CharSequence charSequence, emvz emvzVar) {
        super(emyeVar, charSequence);
        this.b = emvzVar;
    }

    @Override // defpackage.emyc
    public final int b(int i) {
        return i + 1;
    }

    @Override // defpackage.emyc
    public final int c(int i) {
        return this.b.e(this.c, i);
    }
}
