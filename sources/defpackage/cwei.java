package defpackage;

import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final /* synthetic */ class cwei extends ffju implements ffjr {
    public cwei(Object obj) {
        super(7, obj, cwfa.class, "transformWithGroupChats", "transformWithGroupChats(Lcom/google/android/apps/messaging/startchat/suggestion/ProfileSuggestionUiData;Lcom/google/android/apps/messaging/startchat/suggestion/ContactSuggestionListUiData;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/google/android/apps/messaging/startchat/emergency/EmergencyRowUiData;)Lcom/google/android/apps/messaging/startchat/suggestion/ContactSuggestionListUiData;", 4);
    }

    @Override // defpackage.ffjr
    public final /* bridge */ /* synthetic */ Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        List a;
        cwgi cwgiVar = (cwgi) obj;
        final cwec cwecVar = (cwec) obj2;
        List list = (List) obj3;
        List list2 = (List) obj4;
        final List list3 = (List) obj5;
        cvxm cvxmVar = (cvxm) obj6;
        final cwfa cwfaVar = (cwfa) this.b;
        if (((CharSequence) cwfaVar.c.a().a()).length() == 0) {
            return cwfaVar.j;
        }
        if (cwgiVar.a == null && list.isEmpty() && list2.isEmpty()) {
            fffs fffsVar = new fffs((byte[]) null);
            fffsVar.addAll(cwecVar.b);
            if (!list3.isEmpty()) {
                fffsVar.add(cwfaVar.b());
                fffsVar.addAll(list3);
            }
            a = ffdx.a(fffsVar);
        } else {
            fffs fffsVar2 = new fffs((byte[]) null);
            ensk e = cwfa.a.e();
            e.Y(ente.a, "BugleContacts");
            ((enrr) e.h("com/google/android/apps/messaging/startchat/suggestion/ContactSuggestionsAdapterImpl", "transformWithGroupChats", 246, "ContactSuggestionsAdapterImpl.kt")).q("combining personal, work and corp contact and group chat suggestions");
            cwgp cwgpVar = cwgiVar.a;
            if (cwgpVar != null) {
                fffsVar2.add((cwfb) cwgpVar);
            }
            fffsVar2.addAll(cwecVar.b);
            if (!list3.isEmpty()) {
                fffsVar2.add(cwfaVar.b());
                fffsVar2.addAll(list3);
            }
            if (!list.isEmpty() || !list2.isEmpty()) {
                String string = cwfaVar.b.getString(R.string.work_directory_header);
                string.getClass();
                fffsVar2.add(new cwfb("work_header", new dngr(string)));
            }
            fffsVar2.addAll(list);
            fffsVar2.addAll(list2);
            a = ffdx.a(fffsVar2);
        }
        return new cwec(cwecVar.a, a, new ffix() { // from class: cweg
            @Override // defpackage.ffix
            public final Object invoke() {
                cwec.this.c.invoke();
                boolean z = !list3.isEmpty();
                cwav cwavVar = cwfaVar.e;
                cwavVar.b.d(7, cwavVar.f);
                cwavVar.c(z);
                return ffcu.a;
            }
        }, cwfaVar.b.getString(R.string.a11y_contact_suggestions), cvxmVar, new cweb(((auvr) cwfaVar.h.b()).a(), cwfaVar.i.a()));
    }
}
