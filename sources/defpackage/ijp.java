package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ijp extends ffkk implements ffji {
    final /* synthetic */ fflb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ijp(fflb fflbVar) {
        super(1);
        this.a = fflbVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z;
        ixv ixvVar = (ixv) obj;
        if (ixvVar.C().z) {
            this.a.a = ixvVar;
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
