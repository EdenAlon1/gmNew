package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eyd extends ffkk implements ffix {
    final /* synthetic */ eyh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyd(eyh eyhVar) {
        super(0);
        this.a = eyhVar;
    }

    @Override // defpackage.ffix
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke() {
        eyh eyhVar = this.a;
        jlm jlmVar = eyhVar.b;
        jpg a = eyhVar.a();
        return Boolean.valueOf(ffkj.e(jlmVar, a != null ? a.a.a : null));
    }
}
