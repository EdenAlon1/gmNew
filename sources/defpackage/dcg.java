package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dcg extends ffkk implements ffji {
    public static final dcg a = new dcg();

    public dcg() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        cxy cxyVar = (cxy) obj;
        int round = Math.round(cxyVar.a);
        if (round < 0) {
            round = 0;
        }
        return new kaf((Math.round(cxyVar.b) >= 0 ? r5 : 0) | (round << 32));
    }
}
