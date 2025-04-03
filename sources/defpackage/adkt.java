package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adkt extends ffhv implements ffjm {
    int a;
    final /* synthetic */ eixn b;
    final /* synthetic */ adkv c;
    final /* synthetic */ String d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adkt(ffgu ffguVar, eixn eixnVar, adkv adkvVar, String str) {
        super(2, ffguVar);
        this.b = eixnVar;
        this.c = adkvVar;
        this.d = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((adkt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        String str = this.b.b().k;
        int hashCode = str.hashCode();
        if (hashCode != -1425037495) {
            if (hashCode == -1240244679 && str.equals("google")) {
                adkv adkvVar = this.c;
                eixn eixnVar = this.b;
                String str2 = this.d;
                eisx a = eixnVar.a();
                this.a = 1;
                Object d = adkvVar.d(a, str2, this);
                return d == ffhhVar ? ffhhVar : d;
            }
        } else if (str.equals("pseudonymous")) {
            ensk h = adkv.a.h();
            h.Y(ente.a, "BugleGaia");
            ((enrr) h.h("com/google/android/apps/messaging/gaia/capability/GmsGaiaCapabilityRetriever$hasCapabilityInternal$$inlined$withLegacyPropagatingContext$2", "invokeSuspend", 141, "GmsGaiaCapabilityRetriever.kt")).q("Skipped retrieving capability. Pseudonymous account.");
            return adko.SKIPPED_PSEUDONYMOUS_ACCOUNT;
        }
        this.c.e(9);
        ensk j = adkv.a.j();
        j.Y(ente.a, "BugleGaia");
        ((enrr) j.h("com/google/android/apps/messaging/gaia/capability/GmsGaiaCapabilityRetriever$hasCapabilityInternal$$inlined$withLegacyPropagatingContext$2", "invokeSuspend", 148, "GmsGaiaCapabilityRetriever.kt")).t("Failed retrieving capability. Unknown account type: %s", this.b.b().k);
        return adko.FAILED;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        adkt adktVar = new adkt(ffguVar, this.b, this.c, this.d);
        adktVar.e = obj;
        return adktVar;
    }
}
