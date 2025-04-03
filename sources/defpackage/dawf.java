package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.ui.debug.LoadLinkPreviewsReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dawf extends ffhv implements ffjm {
    final /* synthetic */ LoadLinkPreviewsReceiver a;
    final /* synthetic */ Iterator b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dawf(LoadLinkPreviewsReceiver loadLinkPreviewsReceiver, Iterator it, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = loadLinkPreviewsReceiver;
        this.b = it;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dawf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        fazb fazbVar;
        ffbr ffbrVar;
        ffci.b(obj);
        do {
            fazbVar = this.a.d;
            ffbrVar = null;
            if (fazbVar == null) {
                ffkj.c("syncManager");
                fazbVar = null;
            }
        } while (((coxg) fazbVar.b()).v());
        ffbr ffbrVar2 = this.a.e;
        if (ffbrVar2 == null) {
            ffkj.c("transactionManager");
        } else {
            ffbrVar = ffbrVar2;
        }
        dtuu dtuuVar = (dtuu) ffbrVar.b();
        final Iterator it = this.b;
        dtuuVar.d("LoadLinkPreviewsReceiver#transaction", new Runnable() { // from class: dawe
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                String[] strArr = btqq.a;
                btqg btqgVar = new btqg();
                btqgVar.f("LoadLinkPreviewReceiver#processBroadcast.delete");
                btqgVar.e();
                btqgVar.d();
                buxo d = MessagesTable.d();
                d.z("LoadLinkPreviewsReceiver.processBroadcast");
                d.d(new buxl(MessagesTable.c.i, false));
                enqv it2 = d.b().g().iterator();
                it2.getClass();
                while (it2.hasNext()) {
                    Iterator it3 = it;
                    MessageIdType messageIdType = (MessageIdType) it2.next();
                    if (!it3.hasNext()) {
                        break;
                    }
                    List<String> V = ffpc.V((String) it3.next(), new String[]{","}, 5, 2);
                    ArrayList arrayList = new ArrayList(ffdx.n(V, 10));
                    for (String str : V) {
                        if (true == ffkj.e(str, "null")) {
                            str = null;
                        }
                        arrayList.add(str);
                    }
                    LoadLinkPreviewsReceiver.a.p("Trying to insert preview " + messageIdType + " " + arrayList.get(2) + " " + arrayList.size());
                    CharSequence charSequence = (CharSequence) arrayList.get(4);
                    if (charSequence == null || ffpc.J(charSequence)) {
                        LoadLinkPreviewsReceiver.a.p("Skipping inserting preview: link preview has no target url");
                    } else {
                        btos btosVar = new btos();
                        btosVar.l((String) arrayList.get(0));
                        btosVar.g((String) arrayList.get(1));
                        btosVar.i((String) arrayList.get(2));
                        btosVar.f((String) arrayList.get(2));
                        btosVar.h((String) arrayList.get(3));
                        btosVar.m(messageIdType);
                        btosVar.e(2000L);
                        btosVar.n((String) arrayList.get(4));
                        btosVar.j(false);
                        btosVar.j(false);
                        btosVar.k(false);
                        btosVar.d();
                    }
                }
                LoadLinkPreviewsReceiver.a.p("Done inserting preview");
            }
        });
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dawf(this.a, this.b, ffguVar);
    }
}
