package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qvw extends qvx {
    @Override // defpackage.qvx
    public final boolean a() {
        return true;
    }

    @Override // defpackage.qvx
    public final boolean b() {
        return true;
    }

    @Override // defpackage.qvx
    public final boolean c(qsy qsyVar) {
        return qsyVar == qsy.REMOTE;
    }

    @Override // defpackage.qvx
    public final boolean d(boolean z, qsy qsyVar, int i) {
        return ((z && qsyVar == qsy.DATA_DISK_CACHE) || qsyVar == qsy.LOCAL) && i == 2;
    }
}
