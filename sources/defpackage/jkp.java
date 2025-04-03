package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jkp extends ffkk implements ffjm {
    public static final jkp a = new jkp();

    public jkp() {
        super(2);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        String str;
        ffbv ffbvVar;
        jjb jjbVar = (jjb) obj;
        jjb jjbVar2 = (jjb) obj2;
        if (jjbVar == null || (str = jjbVar.a) == null) {
            str = jjbVar2.a;
        }
        if (jjbVar == null || (ffbvVar = jjbVar.b) == null) {
            ffbvVar = jjbVar2.b;
        }
        return new jjb(str, ffbvVar);
    }
}
