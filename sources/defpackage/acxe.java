package defpackage;

import android.content.Context;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acxe implements acus {
    private final Context a;
    private final acxa b;

    public acxe(Context context, acxa acxaVar) {
        this.a = context;
        this.b = acxaVar;
    }

    @Override // defpackage.acus
    public final elfl a(esnk esnkVar, esnl esnlVar) {
        esnv esnvVar = esnkVar.b == 105 ? (esnv) esnkVar.c : esnv.a;
        if (esnvVar.equals(esnv.a)) {
            throw new IllegalStateException("Request has incorrect payload");
        }
        acxa acxaVar = this.b;
        esly eslyVar = esnvVar.b;
        if (eslyVar == null) {
            eslyVar = esly.a;
        }
        String str = eslyVar.d;
        esly eslyVar2 = esnvVar.b;
        if (eslyVar2 == null) {
            eslyVar2 = esly.a;
        }
        String str2 = eslyVar2.b;
        esol esolVar = esnvVar.h;
        if (esolVar == null) {
            esolVar = esol.a;
        }
        knr a = this.b.a();
        if (!esnvVar.d.isEmpty()) {
            knq knqVar = new knq();
            knqVar.d = esnvVar.d;
            if (esnvVar.e.isEmpty()) {
                knqVar.a = this.a.getResources().getString(R.string.unknown_person_name);
            } else {
                knqVar.a = esnvVar.e;
            }
            if (!esnvVar.g.isEmpty() && esnvVar.f.d() > 0) {
                knqVar.b = IconCompat.k(esnvVar.f.I(), esnvVar.f.d());
            }
            a = new knr(knqVar);
        }
        esly eslyVar3 = esnvVar.b;
        if (eslyVar3 == null) {
            eslyVar3 = esly.a;
        }
        acxaVar.d(str, str2, esolVar, new kmz(eslyVar3.c, esnvVar.c, a));
        eyex eyexVar = eyex.a;
        esnlVar.copyOnWrite();
        esnn esnnVar = (esnn) esnlVar.instance;
        esnn esnnVar2 = esnn.a;
        eyexVar.getClass();
        esnnVar.c = eyexVar;
        esnnVar.b = 105;
        return elfo.e(esnlVar.build());
    }
}
