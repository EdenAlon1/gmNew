package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jgc extends ffkk implements ffix {
    final /* synthetic */ iya a;
    final /* synthetic */ jge b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgc(iya iyaVar, jge jgeVar) {
        super(0);
        this.a = iyaVar;
        this.b = jgeVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        this.a.removeOnAttachStateChangeListener(this.b);
        return ffcu.a;
    }
}
