package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class huu extends ffkk implements ffjm {
    public static final huu a = new huu();

    public huu() {
        super(2);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        String str = (String) obj;
        hvg hvgVar = (hvg) obj2;
        if (str.length() == 0) {
            return hvgVar.toString();
        }
        return str + ", " + hvgVar;
    }
}
