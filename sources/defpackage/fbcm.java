package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fbcm extends fbcg {
    private final fbcg b;

    public fbcm(fbcg fbcgVar) {
        this.b = fbcgVar;
    }

    @Override // defpackage.fbcg
    public final fbch a(Object obj) {
        try {
            return new fbcn(this.b.a(obj));
        } catch (RuntimeException e) {
            fbco.b(e, this.b, obj);
            return fbch.a;
        }
    }
}
