package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jbs extends ffkk implements ffji {
    final /* synthetic */ jer a;
    final /* synthetic */ jbu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jbs(jer jerVar, jbu jbuVar) {
        super(1);
        this.a = jerVar;
        this.b = jbuVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jer jerVar = this.a;
        synchronized (jerVar.c) {
            jerVar.e = true;
            hne hneVar = jerVar.d;
            Object[] objArr = hneVar.a;
            int i = hneVar.b;
            for (int i2 = 0; i2 < i; i2++) {
                jvd jvdVar = (jvd) ((ixy) objArr[i2]).get();
                if (jvdVar != null) {
                    jvdVar.b();
                }
            }
            jerVar.d.g();
        }
        jvw jvwVar = this.b.b;
        jvwVar.b.set(null);
        jvwVar.a.f();
        return ffcu.a;
    }
}
