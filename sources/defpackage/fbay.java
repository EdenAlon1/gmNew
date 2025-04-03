package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fbay implements fbba {
    private fbbf a;

    public static void a(fbay fbayVar, fbbf fbbfVar) {
        fbbfVar.getClass();
        if (fbayVar.a != null) {
            throw new IllegalStateException();
        }
        fbayVar.a = fbbfVar;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final Object b() {
        fbbf fbbfVar = this.a;
        if (fbbfVar != null) {
            return fbbfVar.b();
        }
        throw new IllegalStateException();
    }
}
