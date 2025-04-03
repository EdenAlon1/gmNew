package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egds implements lms {
    private final egif a;
    private final eghv b;
    private final eghn c;
    private final emxc d;

    public egds(emxc emxcVar, egif egifVar, eghv eghvVar, eghn eghnVar) {
        this.a = egifVar;
        this.b = eghvVar;
        this.c = eghnVar;
        this.d = emxcVar;
    }

    @Override // defpackage.lms
    public final lml a(Class cls) {
        if (!cls.isAssignableFrom(egdr.class)) {
            throw new IllegalArgumentException("Unknown model class ".concat(cls.toString()));
        }
        emxc emxcVar = this.d;
        egif egifVar = this.a;
        eghv eghvVar = this.b;
        eghn eghnVar = this.c;
        emxc b = emxcVar.b(new emwl() { // from class: egdq
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return new egeo((egej) obj);
            }
        });
        eghq eghqVar = new eghq(egifVar);
        eghy eghyVar = new eghy(egifVar);
        egig egigVar = new egig(egifVar);
        eghs eghsVar = (eghs) eghvVar.a.b();
        eghsVar.getClass();
        errl errlVar = (errl) eghvVar.b.b();
        errlVar.getClass();
        egdu egduVar = (egdu) eghvVar.c.b();
        egduVar.getClass();
        egct egctVar = (egct) eghvVar.d.b();
        egctVar.getClass();
        egdg egdgVar = (egdg) eghvVar.e.b();
        egdgVar.getClass();
        eghu eghuVar = new eghu(eghsVar, errlVar, egduVar, egctVar, egdgVar);
        Context context = (Context) eghnVar.a.b();
        context.getClass();
        errl errlVar2 = (errl) eghnVar.b.b();
        errlVar2.getClass();
        return (lml) cls.cast(new egdm(b, eghqVar, eghyVar, egigVar, eghuVar, new eghm(context, errlVar2)));
    }

    @Override // defpackage.lms
    public final /* synthetic */ lml b(Class cls, lnx lnxVar) {
        return lmr.c(this, cls);
    }

    @Override // defpackage.lms
    public final /* synthetic */ lml c(ffmo ffmoVar, lnx lnxVar) {
        return lmr.a(this, ffmoVar, lnxVar);
    }
}
