package defpackage;

import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyds extends ffhv implements ffjm {
    final /* synthetic */ cydx a;
    final /* synthetic */ engw b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyds(ffgu ffguVar, cydx cydxVar, engw engwVar) {
        super(2, ffguVar);
        this.a = cydxVar;
        this.b = engwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cyds) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        cyee cyeeVar;
        aoku g;
        ffci.b(obj);
        engw engwVar = this.b;
        engwVar.getClass();
        if (!((Boolean) ((cfup) cydz.a.get()).e()).booleanValue()) {
            cyeeVar = cyea.a;
        } else if (engwVar.size() != 1) {
            cyeeVar = cyea.a;
        } else {
            ResolvedRecipient resolvedRecipient = (ResolvedRecipient) engwVar.get(0);
            cyeeVar = !resolvedRecipient.g().r() ? cyea.a : resolvedRecipient.h() != aorb.MODIFIED_AREA_CODE ? cyea.a : resolvedRecipient.e() == null ? cyea.a : new cyee(true, resolvedRecipient);
        }
        aokr aokrVar = null;
        if (!cyeeVar.a) {
            return null;
        }
        Resources resources = this.a.b.getResources();
        ResolvedRecipient resolvedRecipient2 = cyeeVar.b;
        if (resolvedRecipient2 != null && (g = resolvedRecipient2.g()) != null) {
            aokrVar = g.H(true);
        }
        String string = resources.getString(R.string.conversation_area_code_popup_paragraph_2, aokrVar);
        ssi ssiVar = new ssi(dmzz.bK);
        String string2 = this.a.b.getResources().getString(R.string.add_area_code_banner_button);
        string2.getClass();
        return new ssg("add_area_code", null, string, ssiVar, new ssc(string2, new cydt(this.a, cyeeVar)), null, null, new cydu(this.a, cyeeVar), 992);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cyds cydsVar = new cyds(ffguVar, this.a, this.b);
        cydsVar.c = obj;
        return cydsVar;
    }
}
