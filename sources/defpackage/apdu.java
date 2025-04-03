package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apdu implements apuh {
    private final apdy a;

    public apdu(apdy apdyVar) {
        apdyVar.getClass();
        this.a = apdyVar;
    }

    @Override // defpackage.apuh
    public final bwdf b(bwdf bwdfVar) {
        String[] strArr = VmtTable.a;
        bwdfVar.G(dtvz.i(new byyg(VmtTable.a).b(), VmtTable.c.a, PartsTable.d.a).g());
        return bwdfVar;
    }

    @Override // defpackage.apuh
    public final boolean c() {
        return true;
    }

    @Override // defpackage.apuh
    public final void d(apuf apufVar, MessagesTable.BindData bindData, aoug aougVar, enhk enhkVar, amfx amfxVar, aptd aptdVar) {
        bindData.getClass();
        aougVar.getClass();
        enhkVar.getClass();
        amfxVar.getClass();
        String[] strArr = VmtTable.a;
        VmtTable.BindData[] bindDataArr = (VmtTable.BindData[]) bindData.aG("vmt", new VmtTable.BindData[0]);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator a = ffjw.a(bindDataArr);
        while (a.hasNext()) {
            VmtTable.BindData bindData2 = (VmtTable.BindData) a.next();
            String m = bindData2.m();
            String n = bindData2.n();
            ardn k = bindData2.k();
            int i = 1;
            if (k != null) {
                switch (k.ordinal()) {
                    case 1:
                        i = 2;
                        break;
                    case 2:
                        i = 3;
                        break;
                    case 3:
                        i = 4;
                        break;
                    case 4:
                        i = 5;
                        break;
                    case 5:
                        i = 6;
                        break;
                    case 6:
                        i = 7;
                        break;
                }
            }
            String l = bindData2.l();
            linkedHashMap.put(m, new apdv(n, i, l != null ? Locale.forLanguageTag(l) : null));
        }
        ((apsm) apufVar).f = engq.e(linkedHashMap);
    }

    @Override // defpackage.apuh
    public final aptb e() {
        return this.a;
    }

    @Override // defpackage.apuh
    public final buxo a(buxo buxoVar) {
        return buxoVar;
    }
}
