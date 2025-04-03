package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caks extends ffhv implements ffjm {
    final /* synthetic */ cakw a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public caks(ffgu ffguVar, cakw cakwVar) {
        super(2, ffguVar);
        this.a = cakwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((caks) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        bczy bczyVar = (bczy) this.a.b.b();
        capz capzVar = this.a.g;
        List L = bczyVar.L(bdgq.b(capzVar.c == 2 ? (String) capzVar.d : ""));
        L.getClass();
        ArrayList arrayList = new ArrayList(ffdx.n(L, 10));
        enqv it = ((engw) L).iterator();
        while (it.hasNext()) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
            cakw cakwVar = this.a;
            bindData.getClass();
            String j = bdqu.j(bindData);
            if (j == null) {
                throw new IllegalStateException("Unable to create ChatEndpoint");
            }
            awui a = ((avkc) cakwVar.d.b()).a(j, false);
            a.getClass();
            arrayList.add(a);
        }
        return arrayList;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        caks caksVar = new caks(ffguVar, this.a);
        caksVar.b = obj;
        return caksVar;
    }
}
