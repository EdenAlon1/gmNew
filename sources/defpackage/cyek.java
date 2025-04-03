package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyek extends ffhv implements ffjm {
    final /* synthetic */ cyep a;
    final /* synthetic */ engw b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyek(ffgu ffguVar, cyep cyepVar, engw engwVar) {
        super(2, ffguVar);
        this.a = cyepVar;
        this.b = engwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cyek) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        cyew cyewVar;
        ctvf ctvfVar;
        aoku g;
        Optional f;
        ffci.b(obj);
        engw engwVar = this.b;
        engwVar.getClass();
        if (!((Boolean) ((cfup) cyer.a.get()).e()).booleanValue()) {
            cyewVar = cyes.a;
        } else if (engwVar.size() != 1) {
            cyewVar = cyes.a;
        } else {
            ResolvedRecipient resolvedRecipient = (ResolvedRecipient) engwVar.get(0);
            cyewVar = !resolvedRecipient.g().r() ? cyes.a : resolvedRecipient.h() != aorb.MODIFIED_COUNTRY_CODE ? cyes.a : resolvedRecipient.e() == null ? cyes.a : new cyew(true, resolvedRecipient);
        }
        ResolvedRecipient resolvedRecipient2 = cyewVar.b;
        if (resolvedRecipient2 == null || (g = resolvedRecipient2.g()) == null || (f = g.f()) == null || (ctvfVar = (ctvf) f.orElse(new ctvf(0))) == null) {
            ctvfVar = new ctvf(0);
        }
        if (!cyewVar.a) {
            return null;
        }
        String string = this.a.b.getResources().getString(R.string.conversation_country_code_popup_paragraph_2, ctvfVar, !ctvfVar.a() ? this.a.f.z(ctvfVar) : "");
        ssi ssiVar = new ssi(dmzz.bK);
        String string2 = this.a.b.getResources().getString(R.string.add_country_code_banner_button);
        string2.getClass();
        return new ssg("add_country_code", null, string, ssiVar, new ssc(string2, new cyel(this.a, cyewVar)), null, null, new cyem(this.a, cyewVar), 992);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cyek cyekVar = new cyek(ffguVar, this.a, this.b);
        cyekVar.c = obj;
        return cyekVar;
    }
}
