package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dael extends ffhv implements ffjm {
    final /* synthetic */ daem a;
    final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dael(daem daemVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = daemVar;
        this.b = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dael) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        String str = "";
        for (ewgz ewgzVar : ewgz.values()) {
            if (ewgzVar.equals(ewgz.CONFIGURATION_TYPE_RCS_ONBOARDING_FLAGS) || ewgzVar.equals(ewgz.CONFIGURATION_TYPE_RCS_UPI_POLICY_FLAGS)) {
                String str2 = str + "Configuration Type: " + ewgzVar.name() + "\n";
                enhk enhkVar = enoz.a;
                if (ewgzVar == ewgz.CONFIGURATION_TYPE_RCS_ONBOARDING_FLAGS) {
                    enhkVar = ((cguo) this.a.d.b()).a(this.b);
                } else if (ewgzVar == ewgz.CONFIGURATION_TYPE_RCS_UPI_POLICY_FLAGS) {
                    enhkVar = ((cguo) this.a.d.b()).b(this.b);
                }
                enqu listIterator = enhkVar.keySet().listIterator();
                listIterator.getClass();
                while (listIterator.hasNext()) {
                    String str3 = (String) listIterator.next();
                    str2 = str2 + str3 + ": " + enhkVar.get(str3) + "\n";
                }
                str = str2.concat("\n");
            }
        }
        this.a.f.put(this.b, str);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dael(this.a, this.b, ffguVar);
    }
}
