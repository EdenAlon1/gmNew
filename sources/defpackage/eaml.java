package defpackage;

import android.content.SharedPreferences;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eaml extends ffhv implements ffjm {
    long a;
    int b;
    final /* synthetic */ eamp c;
    final /* synthetic */ List d;
    final /* synthetic */ Map e;
    final /* synthetic */ exus f;
    final /* synthetic */ eagp g;
    final /* synthetic */ exyd h;
    final /* synthetic */ int i;
    final /* synthetic */ eamb j;
    final /* synthetic */ String k;
    final /* synthetic */ String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eaml(eamp eampVar, List list, Map map, exus exusVar, eagp eagpVar, exyd exydVar, int i, eamb eambVar, String str, String str2, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = eampVar;
        this.d = list;
        this.e = map;
        this.f = exusVar;
        this.g = eagpVar;
        this.h = exydVar;
        this.i = i;
        this.j = eambVar;
        this.k = str;
        this.l = str2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eaml) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        eaml eamlVar;
        long j;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            j = this.a;
            ffci.b(obj);
            eamlVar = this;
        } else {
            ffci.b(obj);
            long epochMilli = this.c.b.f().toEpochMilli();
            eamp eampVar = this.c;
            List list = this.d;
            Map map = this.e;
            exus exusVar = this.f;
            eagp eagpVar = this.g;
            this.a = epochMilli;
            this.b = 1;
            eamlVar = this;
            obj = eampVar.d(list, map, exusVar, eagpVar, epochMilli, eamlVar);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
            j = epochMilli;
        }
        eafl eaflVar = (eafl) obj;
        if (eaflVar.g()) {
            eamp eampVar2 = eamlVar.c;
            eagp eagpVar2 = eamlVar.g;
            int i = eamlVar.i;
            eanl c = eampVar2.c(eagpVar2);
            Object b = eampVar2.c.b();
            b.getClass();
            eamb eambVar = eamlVar.j;
            String str = eamlVar.k;
            String str2 = eamlVar.l;
            String str3 = (String) b;
            boolean z = eamlVar.g.a() && eamlVar.g.b();
            eambVar.getClass();
            SharedPreferences.Editor putBoolean = ((SharedPreferences) c.a.b()).edit().putInt("last_successful_registration_request_hash_code", i).putString("last_successful_registration_environment_url", str3).putLong("last_successful_registration_time_ms", j).putBoolean("is_registered_to_unified_fcm_registration", z);
            if (eambVar != eamb.a) {
                putBoolean.putInt("last_successful_registration_account_type", eambVar.f);
            }
            if (str != null) {
                putBoolean.putString("last_successful_registration_pseudonymous_cookie", str);
            }
            if (str2 != null) {
                putBoolean.putString("last_successful_fcm_registration_token", str2);
            }
            putBoolean.apply();
        }
        return eaflVar;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new eaml(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, ffguVar);
    }
}
