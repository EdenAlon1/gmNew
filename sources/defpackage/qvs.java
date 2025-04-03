package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qvs extends qvx {
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
        return (qsyVar == qsy.RESOURCE_DISK_CACHE || qsyVar == qsy.MEMORY_CACHE) ? false : true;
    }
}
