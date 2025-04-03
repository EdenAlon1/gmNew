package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egtj {
    public final dvxe a;
    public final dvxi b;

    public egtj(dvxe dvxeVar, dvxi dvxiVar) {
        dvxiVar.getClass();
        this.a = dvxeVar;
        this.b = dvxiVar;
    }

    public final ffix a(final ffix ffixVar) {
        ffixVar.getClass();
        return new ffix() { // from class: egti
            @Override // defpackage.ffix
            public final Object invoke() {
                egtj egtjVar = egtj.this;
                egtjVar.b.b(dvxh.e(), egtjVar.a);
                ffixVar.invoke();
                return ffcu.a;
            }
        };
    }
}
