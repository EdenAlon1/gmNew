package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ewn extends ffkk implements ffji {
    public static final ewn a = new ewn();

    public ewn() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        fgq fgqVar = (fgq) obj;
        Integer e = fgqVar.e();
        if (e != null) {
            return new jui(0, e.intValue() - jpm.a(fgqVar.c));
        }
        return null;
    }
}
