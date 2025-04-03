package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ewl extends ffkk implements ffji {
    public static final ewl a = new ewl();

    public ewl() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        fgq fgqVar = (fgq) obj;
        int a2 = fgqVar.a();
        if (a2 != -1) {
            return new jui(0, a2 - jpm.a(fgqVar.c));
        }
        return null;
    }
}
