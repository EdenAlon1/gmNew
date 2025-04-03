package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djsb extends ffhv implements ffjm {
    final /* synthetic */ djsh a;
    final /* synthetic */ String b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djsb(ffgu ffguVar, djsh djshVar, String str) {
        super(2, ffguVar);
        this.a = djshVar;
        this.b = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((djsb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        eqwf w = ((ckge) this.a.b.a()).w(new djro(this.b));
        w.getClass();
        ensk h = djsh.a.h();
        h.Y(ente.a, "IdentityMappingPopulator");
        ((enrr) h.h("com/google/android/ims/provisioning/api/identitymapping/IdentityMappingProducerImpl$getAvailabilityForSimId$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 109, "IdentityMappingProducerImpl.kt")).D("Availability: %s for sim id: %s", w, dktx.SIM_ID.c(this.b));
        return w;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        djsb djsbVar = new djsb(ffguVar, this.a, this.b);
        djsbVar.c = obj;
        return djsbVar;
    }
}
