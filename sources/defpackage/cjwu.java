package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjwu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cjwz b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjwu(ffgu ffguVar, cjwz cjwzVar) {
        super(2, ffguVar);
        this.b = cjwzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjwu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        boolean z;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            cjwz cjwzVar = this.b;
            this.a = 1;
            obj = cjwzVar.c.invoke(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        int i = 0;
        for (bseh bsehVar : (Iterable) obj) {
            List L = ((bczy) this.b.b.b()).L(bsehVar.C());
            if (cjwt.a(bsehVar)) {
                L.getClass();
                if (!L.isEmpty()) {
                    enqv it = ((engw) L).iterator();
                    while (it.hasNext()) {
                        if (((ParticipantsTable.BindData) it.next()).G() == cjwi.PROFILE_PEOPLE_SHARING_SOURCE) {
                            z = true;
                            break;
                        }
                    }
                }
            }
            z = false;
            i += cjwt.b(z);
        }
        return new Integer(i);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cjwu cjwuVar = new cjwu(ffguVar, this.b);
        cjwuVar.c = obj;
        return cjwuVar;
    }
}
