package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cluo {
    private final ffbr a;
    private final ffbr b;

    public cluo(ffbr ffbrVar, ffbr ffbrVar2) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
    }

    public final void a() {
        ((akzt) this.b.b()).c("Bugle.Notification.RcsNotDelivered.Tapped.Count");
        equx equxVar = (equx) equz.a.createBuilder();
        equxVar.copyOnWrite();
        equz equzVar = (equz) equxVar.instance;
        equzVar.c = 4;
        equzVar.b |= 1;
        equz equzVar2 = (equz) equxVar.build();
        eqvk eqvkVar = (eqvk) eqvm.a.createBuilder();
        eqvkVar.copyOnWrite();
        eqvm eqvmVar = (eqvm) eqvkVar.instance;
        equzVar2.getClass();
        eqvmVar.d = equzVar2;
        eqvmVar.c = 5;
        eqvkVar.copyOnWrite();
        eqvm eqvmVar2 = (eqvm) eqvkVar.instance;
        eqvmVar2.g = 2;
        eqvmVar2.b = 4 | eqvmVar2.b;
        eqvm eqvmVar3 = (eqvm) eqvkVar.build();
        akxl akxlVar = (akxl) this.a.b();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.NOTIFICATION_METRICS_EVENT;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eqvmVar3.getClass();
        eolvVar2.bn = eqvmVar3;
        eolvVar2.f |= 2048;
        akxlVar.j(eoluVar);
    }
}
