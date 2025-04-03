package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jga extends ffkk implements ffix {
    final /* synthetic */ iya a;
    final /* synthetic */ jgb b;
    final /* synthetic */ jfz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jga(iya iyaVar, jgb jgbVar, jfz jfzVar) {
        super(0);
        this.a = iyaVar;
        this.b = jgbVar;
        this.c = jfzVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        this.a.removeOnAttachStateChangeListener(this.b);
        kzq.a(this.a).a.remove(this.c);
        return ffcu.a;
    }
}
