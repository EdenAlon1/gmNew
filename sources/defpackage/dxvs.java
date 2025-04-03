package defpackage;

import android.content.Context;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxvs {
    public static effs a(Context context, errl errlVar, final dxsy dxsyVar, dxnh dxnhVar, emxc emxcVar) {
        efgj d = efgm.d(context, errlVar);
        d.c = dxvw.d("gms_icing_mdd_groups", emxcVar);
        d.b();
        d.e = new dxvp(dxnhVar);
        d.d(new efgk() { // from class: dxvq
            @Override // defpackage.efgk
            public final eyhs a(efgl efglVar, eyhs eyhsVar) {
                dwtf dwtfVar = (dwtf) dwti.a.createBuilder();
                enqu listIterator = efglVar.b().entrySet().listIterator();
                dxsy dxsyVar2 = dxsy.this;
                while (listIterator.hasNext()) {
                    Map.Entry entry = (Map.Entry) listIterator.next();
                    try {
                        String str = (String) entry.getValue();
                        str.getClass();
                        try {
                            dwtfVar.a((String) entry.getKey(), (dwso) dxvw.b(str, dwso.a.getParserForType()));
                        } catch (eygu e) {
                            dxth.g("SharedPreferences file groups metadata had unexpected format: %s", e);
                            dxsyVar2.l(1084);
                        }
                    } catch (ClassCastException | NullPointerException e2) {
                        dxth.g("SharedPreferences file groups metadata key wasn't a string: %s", e2);
                        dxsyVar2.l(1083);
                    }
                }
                return (dwti) dwtfVar.build();
            }
        });
        return d.a();
    }

    public static effs b(Context context, errl errlVar, final dxsy dxsyVar, dxnh dxnhVar, emxc emxcVar) {
        efgj d = efgm.d(context, errlVar);
        d.c = dxvw.d("gms_icing_mdd_shared_files", emxcVar);
        d.b();
        d.e = new dxvp(dxnhVar);
        d.d(new efgk() { // from class: dxvr
            @Override // defpackage.efgk
            public final eyhs a(efgl efglVar, eyhs eyhsVar) {
                dwty dwtyVar = (dwty) dwua.a.createBuilder();
                enqu listIterator = efglVar.b().entrySet().listIterator();
                dxsy dxsyVar2 = dxsy.this;
                while (listIterator.hasNext()) {
                    Map.Entry entry = (Map.Entry) listIterator.next();
                    try {
                        String str = (String) entry.getValue();
                        str.getClass();
                        try {
                            dwtyVar.a((String) entry.getKey(), (dwtx) dxvw.b(str, dwtx.a.getParserForType()));
                        } catch (eygu e) {
                            dxth.g("SharedPreferences shared files metadata had unexpected format: %s", e);
                            dxsyVar2.l(1084);
                        }
                    } catch (ClassCastException | NullPointerException e2) {
                        dxth.g("SharedPreferences shared files metadata key wasn't a string: %s", e2);
                        dxsyVar2.l(1083);
                    }
                }
                return (dwua) dwtyVar.build();
            }
        });
        return d.a();
    }
}
