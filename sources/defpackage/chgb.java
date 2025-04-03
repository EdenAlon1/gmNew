package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chgb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ chgf b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chgb(ffgu ffguVar, chgf chgfVar) {
        super(2, ffguVar);
        this.b = chgfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chgb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Iterator it;
        Object obj2 = ffhh.a;
        if (this.a != 0) {
            it = (Iterator) this.c;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            Set f = ((crgh) this.b.f.b()).f(crgf.c);
            if (f.isEmpty()) {
                ensk h = chgf.a.h();
                h.Y(ente.a, "BugleNetwork");
                ((enrr) h.h("com/google/android/apps/messaging/shared/net/TachyonTachygramBindDelegate$bindAllIdentitiesForTachygramIfNeeded$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 54, "TachyonTachygramBindDelegate.kt")).q("No TG identities in CTC, skipping channel binding.");
                return ffcu.a;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : f) {
                awui awuiVar = (awui) obj3;
                awuh b = awuh.b(awuiVar.c);
                if (b == null) {
                    b = awuh.UNKNOWN_TYPE;
                }
                if (b != awuh.PHONE) {
                    ensk h2 = chgf.a.h();
                    h2.Y(ente.a, "BugleNetwork");
                    ((enrr) h2.h("com/google/android/apps/messaging/shared/net/TachyonTachygramBindDelegate", "filterNonEmptyPhoneId", 67, "TachyonTachygramBindDelegate.kt")).t("Not a phone identity, skipping TG channel binding for id=%s.", awuiVar.d);
                } else {
                    String str = awuiVar.d;
                    str.getClass();
                    if (str.length() == 0) {
                        ensk h3 = chgf.a.h();
                        h3.Y(ente.a, "BugleNetwork");
                        ((enrr) h3.h("com/google/android/apps/messaging/shared/net/TachyonTachygramBindDelegate", "filterNonEmptyPhoneId", 70, "TachyonTachygramBindDelegate.kt")).q("Skip Phone bind because RCS MSISDN is empty.");
                    } else {
                        arrayList.add(obj3);
                    }
                }
            }
            it = arrayList.iterator();
        }
        while (it.hasNext()) {
            awui awuiVar2 = (awui) it.next();
            chgf chgfVar = this.b;
            this.c = it;
            this.a = 1;
            Object a = ffra.a(ekxi.a(chgfVar.c), new chge(null, awuiVar2, chgfVar), this);
            if (a != ffhh.a) {
                a = ffcu.a;
            }
            if (a == obj2) {
                return obj2;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        chgb chgbVar = new chgb(ffguVar, this.b);
        chgbVar.c = obj;
        return chgbVar;
    }
}
