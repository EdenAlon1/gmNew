package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dce extends ffkk implements ffji {
    public static final dce a = new dce();

    public dce() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        cxy cxyVar = (cxy) obj;
        return new kaa((Math.round(cxyVar.a) << 32) | (Math.round(cxyVar.b) & 4294967295L));
    }
}
