package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ewo extends ffkk implements ffji {
    public static final ewo a = new ewo();

    public ewo() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        fgq fgqVar = (fgq) obj;
        Integer d = fgqVar.d();
        if (d == null) {
            return null;
        }
        return new jui(jpm.a(fgqVar.c) - d.intValue(), 0);
    }
}
