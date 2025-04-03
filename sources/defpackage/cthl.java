package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cthl {
    private final ffbr a;

    public cthl(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.a = ffbrVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(ConversationIdType conversationIdType, MessageIdType messageIdType, List list, String str) {
        conversationIdType.getClass();
        messageIdType.getClass();
        ctgv ctgvVar = (ctgv) this.a.b();
        ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dltq dltqVar = (dltq) it.next();
            dltqVar.getClass();
            fbuj fbujVar = (fbuj) fbuk.a.createBuilder();
            fbujVar.getClass();
            fbol.b(fbqt.UX_COMPONENT_ANNOTATION, fbujVar);
            fbol.e(fbujVar);
            fbol.d(dltqVar.b(), fbujVar);
            fbol.c(dltqVar.a(), fbujVar);
            int i = 8;
            if (dltqVar instanceof dlto) {
                switch (((dlto) dltqVar).a.ordinal()) {
                    case 0:
                        i = 3;
                        fbol.f(i, fbujVar);
                        break;
                    case 1:
                        i = 4;
                        fbol.f(i, fbujVar);
                        break;
                    case 2:
                        i = 5;
                        fbol.f(i, fbujVar);
                        break;
                    case 3:
                        i = 6;
                        fbol.f(i, fbujVar);
                        break;
                    case 4:
                        i = 7;
                        fbol.f(i, fbujVar);
                        break;
                    case 5:
                        fbol.f(i, fbujVar);
                        break;
                    case 6:
                        i = 9;
                        fbol.f(i, fbujVar);
                        break;
                    case 7:
                        i = 10;
                        fbol.f(i, fbujVar);
                        break;
                    case 8:
                        i = 11;
                        fbol.f(i, fbujVar);
                        break;
                    case 9:
                        i = 16;
                        fbol.f(i, fbujVar);
                        break;
                    case 10:
                        i = 12;
                        fbol.f(i, fbujVar);
                        break;
                    case 11:
                        i = 13;
                        fbol.f(i, fbujVar);
                        break;
                    case 12:
                        i = 14;
                        fbol.f(i, fbujVar);
                        break;
                    case 13:
                        i = 17;
                        fbol.f(i, fbujVar);
                        break;
                    case 14:
                        i = 18;
                        fbol.f(i, fbujVar);
                        break;
                    case 15:
                        i = 19;
                        fbol.f(i, fbujVar);
                        break;
                    case 16:
                        i = 20;
                        fbol.f(i, fbujVar);
                        break;
                    default:
                        throw new ffcd();
                }
            } else if (dltqVar instanceof dltp) {
                fbud fbudVar = (fbud) fbue.a.createBuilder();
                fbudVar.getClass();
                String str2 = ((dltp) dltqVar).a;
                fbudVar.copyOnWrite();
                ((fbue) fbudVar.instance).c = str2;
                eyfy build = fbudVar.build();
                build.getClass();
                fbujVar.copyOnWrite();
                fbuk fbukVar = (fbuk) fbujVar.instance;
                fbukVar.d = (fbue) build;
                fbukVar.c = 8;
            } else if (dltqVar instanceof dltn) {
                fbtx fbtxVar = (fbtx) fbty.a.createBuilder();
                fbtxVar.getClass();
                String str3 = ((dltn) dltqVar).a;
                fbtxVar.copyOnWrite();
                ((fbty) fbtxVar.instance).b = str3;
                eyfy build2 = fbtxVar.build();
                build2.getClass();
                fbujVar.copyOnWrite();
                fbuk fbukVar2 = (fbuk) fbujVar.instance;
                fbukVar2.d = (fbty) build2;
                fbukVar2.c = 21;
            } else {
                if (!(dltqVar instanceof dltm)) {
                    throw new ffcd();
                }
                fbol.f(15, fbujVar);
            }
            arrayList.add(fbol.a(fbujVar));
        }
        fbuj fbujVar2 = (fbuj) fbuk.a.createBuilder();
        fbujVar2.getClass();
        fbol.b(fbqt.UX_COMPONENT_ANNOTATION, fbujVar2);
        fbol.e(fbujVar2);
        fbol.d(0, fbujVar2);
        fbol.c(0, fbujVar2);
        fbuh fbuhVar = (fbuh) fbui.a.createBuilder();
        fbuhVar.getClass();
        fbuhVar.copyOnWrite();
        ((fbui) fbuhVar.instance).b = str;
        eyfy build3 = fbuhVar.build();
        build3.getClass();
        fbujVar2.copyOnWrite();
        fbuk fbukVar3 = (fbuk) fbujVar2.instance;
        fbukVar3.d = (fbui) build3;
        fbukVar3.c = 22;
        ctgvVar.b(conversationIdType, messageIdType, ffdx.ae(arrayList, fbol.a(fbujVar2)));
    }
}
