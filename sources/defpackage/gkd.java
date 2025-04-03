package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gkd extends ffkk implements ffji {
    final /* synthetic */ ffix a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gkd(ffix ffixVar) {
        super(1);
        this.a = ffixVar;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        jkv jkvVar = (jkv) obj;
        Object invoke = this.a.invoke();
        if (true == Float.isNaN(((Number) invoke).floatValue())) {
            invoke = null;
        }
        Float f = (Float) invoke;
        jkr.p(jkvVar, new jji(f != null ? f.floatValue() : 0.0f, new ffmf(0.0f, 1.0f)));
        return ffcu.a;
    }
}
