package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffgr extends ffkk implements ffjm {
    public static final ffgr a = new ffgr();

    public ffgr() {
        super(2);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        String str = (String) obj;
        ffha ffhaVar = (ffha) obj2;
        str.getClass();
        ffhaVar.getClass();
        if (str.length() == 0) {
            return ffhaVar.toString();
        }
        return str + ", " + ffhaVar;
    }
}
