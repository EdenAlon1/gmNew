package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dfa extends ffkk implements ffji {
    final /* synthetic */ ffkx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dfa(ffkx ffkxVar) {
        super(1);
        this.a = ffkxVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z;
        ixv ixvVar = (ixv) obj;
        ffkx ffkxVar = this.a;
        if (!ffkxVar.a) {
            ixvVar.getClass();
            if (!((drf) ixvVar).b) {
                z = false;
                ffkxVar.a = z;
                return Boolean.valueOf(!z);
            }
        }
        z = true;
        ffkxVar.a = z;
        return Boolean.valueOf(!z);
    }
}
