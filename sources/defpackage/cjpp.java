package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjpp implements cjlh {
    @Override // defpackage.cjlh
    public final /* bridge */ /* synthetic */ cjko a(Object obj) {
        cjpg cjpgVar = (cjpg) obj;
        cjpgVar.getClass();
        if (cjpgVar instanceof cjpe) {
            return new cjko(3);
        }
        if (cjpgVar instanceof cjpf) {
            return new cjko(3);
        }
        if (cjpgVar instanceof cjpb) {
            return new cjko(1);
        }
        if (!(cjpgVar instanceof cjpd)) {
            throw new ffcd();
        }
        if (((cjpd) cjpgVar) instanceof cjpc) {
            return new cjko(2);
        }
        throw new ffcd();
    }
}
