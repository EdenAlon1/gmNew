package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jeq extends ffkk implements ffji {
    final /* synthetic */ jer a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jeq(jer jerVar) {
        super(1);
        this.a = jerVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jvd jvdVar = (jvd) obj;
        jvdVar.b();
        hne hneVar = this.a.d;
        Object[] objArr = hneVar.a;
        int i = hneVar.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                i2 = -1;
                break;
            }
            if (ffkj.e((ixy) objArr[i2], jvdVar)) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            this.a.d.c(i2);
        }
        jer jerVar = this.a;
        if (jerVar.d.b == 0) {
            jerVar.b.invoke();
        }
        return ffcu.a;
    }
}
