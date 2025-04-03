package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.multishare.chip.ChipData;
import com.google.android.apps.messaging.multishare.chip.ChipId;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class aief extends ffju implements ffjn {
    public aief(Object obj) {
        super(3, obj, aiew.class, "transformPersonal", "transformPersonal(Lcom/google/android/apps/messaging/multishare/suggestion/PersonalSearchResults;Lcom/google/android/apps/messaging/multishare/chip/ChipsState;)Lcom/google/android/apps/messaging/multishare/suggestion/SuggestionListUiData;", 4);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        final aidr aidrVar = (aidr) obj;
        final ahut ahutVar = (ahut) obj2;
        final aiew aiewVar = (aiew) this.b;
        ArrayList arrayList = new ArrayList();
        String str = aidrVar.a;
        if (((cpdg) aiewVar.d.b()).l(str)) {
            final aoku n = ((aolr) aiewVar.c.b()).n(str);
            if (!ahutVar.f(n)) {
                arrayList.add(new aidq("phone_number", new ffix() { // from class: aieb
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        final aiew aiewVar2 = aiew.this;
                        Uri k = crjm.k(aiewVar2.b);
                        k.getClass();
                        dnyo dnyoVar = new dnyo(new dnwn(k, null, null, null, null, 30), null, 0, null, 0.0f, null, 62);
                        Context context = aiewVar2.b;
                        final aoku aokuVar = n;
                        String string = context.getString(R.string.multi_share_phone_number_suggestion_prefix);
                        String n2 = aokuVar.n();
                        n2.getClass();
                        return new aide("phone_number", new dngv(dnyoVar, string + " " + n2, String.valueOf(aokuVar.p(true)), ahutVar.f(aokuVar), null, new ffix() { // from class: aiea
                            @Override // defpackage.ffix
                            public final Object invoke() {
                                aoku aokuVar2 = aokuVar;
                                ChipData chipData = new ChipData(new ChipId.Identity(aokuVar2), ttz.a(aokuVar2), null, null, false, 28, null);
                                aiew aiewVar3 = aiew.this;
                                aiewVar3.f.c(chipData);
                                aiewVar3.e.c();
                                return ffcu.a;
                            }
                        }, null, 80));
                    }
                }));
            }
        }
        for (ambn ambnVar : aidrVar.b) {
            String f = ambnVar.f();
            arrayList.add(aiewVar.b(ambnVar, "personal_contact_".concat(f), ahutVar, aidrVar.c));
        }
        return new aidv(aidrVar.a, arrayList, new ffix() { // from class: aidz
            @Override // defpackage.ffix
            public final Object invoke() {
                ecri ecriVar = aidr.this.d;
                if (ecriVar != null) {
                    ((ecrj) aiewVar.g.b()).f(ecriVar, aifw.a, null, ecrh.SUCCESS);
                }
                return ffcu.a;
            }
        }, new aidu(true));
    }
}
