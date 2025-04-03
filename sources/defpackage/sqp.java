package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sqp implements ctzc {
    private final Context a;
    private final ctyx b;
    private final sqr c;

    public sqp(Context context, ctyx ctyxVar, sqr sqrVar) {
        this.a = context;
        this.b = ctyxVar;
        this.c = sqrVar;
    }

    @Override // defpackage.ctzc
    public final boolean a(String str) {
        return str.equals(this.a.getString(R.string.rcs_tos_state_key)) || str.equals(this.a.getString(R.string.should_show_google_tos_prompt_key));
    }

    @Override // defpackage.dloz
    public final boolean b(String str) {
        Context context = this.a;
        boolean q = this.b.q(context.getString(R.string.enable_rcs_pref_key), context.getResources().getBoolean(R.bool.enable_rcs_pref_default));
        int d = this.b.d(this.a.getString(R.string.rcs_tos_state_key), 0);
        if (!q || d != 2) {
            return false;
        }
        sqr sqrVar = this.c;
        eqjy eqjyVar = (eqjy) eqjz.a.createBuilder();
        eqjyVar.copyOnWrite();
        eqjz eqjzVar = (eqjz) eqjyVar.instance;
        eqjzVar.d = 1;
        eqjzVar.b = 2 | eqjzVar.b;
        eqjz eqjzVar2 = (eqjz) eqjyVar.build();
        akxl akxlVar = (akxl) sqrVar.a.b();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_SYSTEM_BACKUP_EVENT;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eqjzVar2.getClass();
        eolvVar2.bJ = eqjzVar2;
        eolvVar2.g |= 32768;
        akxlVar.k(eoluVar, epyw.BUGLE_SYSTEM_BACKUP_EVENT);
        return true;
    }
}
