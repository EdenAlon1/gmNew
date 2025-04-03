package defpackage;

import com.google.android.apps.messaging.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
final /* synthetic */ class cwej extends ffju implements ffjn {
    public cwej(Object obj) {
        super(3, obj, cwfa.class, "transformPersonal", "transformPersonal(Lcom/google/android/apps/messaging/startchat/suggestion/PersonalSearchResults;Lcom/google/android/apps/messaging/startchat/tracker/ContactSelectionState;)Lcom/google/android/apps/messaging/startchat/suggestion/ContactSuggestionListUiData;", 4);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        final cwgh cwghVar = (cwgh) obj;
        cwir cwirVar = (cwir) obj2;
        String str = cwghVar.a;
        final cwfa cwfaVar = (cwfa) this.b;
        ArrayList arrayList = new ArrayList();
        for (ambn ambnVar : cwghVar.b) {
            String f = ambnVar.f();
            arrayList.add(cwfaVar.f(ambnVar, "personal_contact_".concat(f), cwirVar, cwghVar.c));
        }
        return new cwec(cwghVar.a, arrayList, new ffix() { // from class: cwee
            @Override // defpackage.ffix
            public final Object invoke() {
                ecri ecriVar = cwgh.this.d;
                if (ecriVar != null) {
                    ((ecrj) cwfaVar.d.b()).f(ecriVar, csra.d, null, ecrh.SUCCESS);
                }
                return ffcu.a;
            }
        }, cwfaVar.b.getString(R.string.a11y_contact_suggestions), new cweb(((auvr) cwfaVar.h.b()).a(), cwfaVar.i.a()), 16);
    }
}
