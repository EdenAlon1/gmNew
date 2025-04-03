package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahym implements ffxy {
    final /* synthetic */ ahzb a;

    public ahym(ahzb ahzbVar) {
        this.a = ahzbVar;
    }

    @Override // defpackage.ffxy
    public final /* bridge */ /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        dqmn dqmnVar = this.a.i.f;
        String str = (String) obj;
        if (!ffkj.e(str, dqmnVar.a())) {
            if (str == null) {
                dqmnVar.e();
            } else {
                dqmnVar.i(str);
            }
        }
        return ffcu.a;
    }
}
