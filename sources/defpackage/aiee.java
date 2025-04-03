package defpackage;

import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class aiee extends ffju implements ffjp {
    public aiee(Object obj) {
        super(5, obj, aiew.class, "transformWithGroupChats", "transformWithGroupChats(Lcom/google/android/apps/messaging/multishare/suggestion/SuggestionListUiData;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/google/android/apps/messaging/multishare/suggestion/SuggestionListUiData;", 4);
    }

    @Override // defpackage.ffjp
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        final aidv aidvVar = (aidv) obj;
        List list = (List) obj2;
        List list2 = (List) obj3;
        final List list3 = (List) obj4;
        final aiew aiewVar = (aiew) this.b;
        if (((CharSequence) aiewVar.e.a().a()).length() == 0) {
            return aiewVar.k;
        }
        aiew.a.m("combining personal, work and corp contact and group chat suggestions");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(aidvVar.b);
        if (!list3.isEmpty()) {
            String string = aiewVar.b.getString(R.string.multi_share_group_directory_header);
            string.getClass();
            arrayList.add(new aide("group_header", new dngr(string)));
            arrayList.addAll(list3);
        }
        if (!list.isEmpty() || !list2.isEmpty()) {
            String string2 = aiewVar.b.getString(R.string.multi_share_contact_work_directory_header);
            string2.getClass();
            arrayList.add(new aide("work_header", new dngr(string2)));
            arrayList.addAll(list);
            arrayList.addAll(list2);
        }
        return new aidv(aidvVar.a, arrayList, new ffix() { // from class: aidx
            @Override // defpackage.ffix
            public final Object invoke() {
                aidv.this.c.invoke();
                aiew aiewVar2 = aiewVar;
                aifv aifvVar = (aifv) aiewVar2.h.b();
                if (!list3.isEmpty()) {
                    aifvVar.c(16, aiewVar2.j);
                    ((ecrj) aifvVar.a.b()).g(aifw.i, null, null, ecrh.SUCCESS);
                    ((ecrj) aifvVar.a.b()).e(aifw.j);
                }
                return ffcu.a;
            }
        }, new aidu(true));
    }
}
