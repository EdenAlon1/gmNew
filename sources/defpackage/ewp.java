package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ewp extends ffkk implements ffji {
    public static final ewp a = new ewp();

    public ewp() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        fgq fgqVar = (fgq) obj;
        Integer c = fgqVar.c();
        if (c != null) {
            return new jui(0, c.intValue() - jpm.a(fgqVar.c));
        }
        return null;
    }
}
