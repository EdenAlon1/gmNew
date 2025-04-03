package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvdh extends ffhv implements ffjm {
    final /* synthetic */ List a;
    final /* synthetic */ cvdp b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvdh(ffgu ffguVar, List list, cvdp cvdpVar) {
        super(2, ffguVar);
        this.a = list;
        this.b = cvdpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvdh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        List<ResolvedRecipient> list = this.a;
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (ResolvedRecipient resolvedRecipient : list) {
                if (resolvedRecipient.g().B() || resolvedRecipient.g().E() || !resolvedRecipient.g().F() || (((aspy) this.b.c.b()).a() && resolvedRecipient.g().A())) {
                    break;
                }
            }
        }
        List list2 = this.a;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (!((aqrv) ((ResolvedRecipient) it.next()).m()).a) {
                    break;
                }
            }
        }
        z = true;
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cvdh cvdhVar = new cvdh(ffguVar, this.a, this.b);
        cvdhVar.c = obj;
        return cvdhVar;
    }
}
