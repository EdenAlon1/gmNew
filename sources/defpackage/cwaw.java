package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final /* synthetic */ class cwaw extends ffju implements ffjn {
    public cwaw(Object obj) {
        super(3, obj, cwax.class, "transform", "transform(Lcom/google/android/apps/messaging/startchat/groupname/GroupNameUiData;Lcom/google/android/apps/messaging/startchat/tracker/ContactSelectionState;)Lcom/google/android/libraries/communications/ux/components/extendedfab/ExtendedFabUiData;", 4);
    }

    @Override // defpackage.ffjn
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cvzr cvzrVar = (cvzr) obj;
        cwir cwirVar = (cwir) obj2;
        cwax cwaxVar = (cwax) this.b;
        if (cvzrVar.j) {
            return new dmyg(cvzrVar.g, cvzrVar.h, null, cvzrVar.n, 4);
        }
        if (!cwirVar.e.isEmpty()) {
            cwjb cwjbVar = cwirVar.d;
            if (!cwjbVar.d()) {
                if (cwjbVar.a() && cwirVar.a.size() <= 1) {
                    return null;
                }
                String string = cwaxVar.a.getString(R.string.start_chat_mirror_extended_fab_text);
                string.getClass();
                return new dmyg(string, false, dmzz.u, cwaxVar.c.b(cwaxVar.b), 2);
            }
        }
        return null;
    }
}
