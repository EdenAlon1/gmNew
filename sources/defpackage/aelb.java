package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aelb implements aekj {
    final /* synthetic */ aelc a;

    public aelb(aelc aelcVar) {
        this.a = aelcVar;
    }

    @Override // defpackage.aekj
    public final void a(aelx aelxVar, aeki aekiVar, aekq aekqVar) {
        aelu aeluVar;
        String str;
        aekiVar.getClass();
        aekqVar.getClass();
        aqys aqysVar = aekqVar.c;
        if (aqysVar == null || aqysVar == aqys.a || ((aekiVar.d() != 3 || aekiVar.c() <= 1) && aekiVar.z() != ckte.j)) {
            aeluVar = (aelu) aelxVar;
            str = null;
        } else {
            str = this.a.a.getString(R.string.conversation_not_available);
            aeluVar = (aelu) aelxVar;
        }
        aeluVar.K = str;
    }
}
