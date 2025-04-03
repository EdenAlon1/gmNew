package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fbbb implements fbba, fazb {
    public final Object a;

    private fbbb(Object obj) {
        this.a = obj;
    }

    public static fbba a(Object obj) {
        obj.getClass();
        return new fbbb(obj);
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final Object b() {
        return this.a;
    }
}
