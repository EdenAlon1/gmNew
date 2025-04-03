package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ewm extends ffkk implements ffji {
    public static final ewm a = new ewm();

    public ewm() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        fgq fgqVar = (fgq) obj;
        Integer f = fgqVar.f();
        if (f == null) {
            return null;
        }
        return new jui(jpm.a(fgqVar.c) - f.intValue(), 0);
    }
}
