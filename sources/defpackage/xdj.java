package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import j$.util.Optional;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xdj extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    private /* synthetic */ Object c;

    public xdj(ffgu ffguVar) {
        super(3, ffguVar);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        xdj xdjVar = new xdj((ffgu) obj3);
        xdjVar.c = (ffxy) obj;
        xdjVar.b = obj2;
        return xdjVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        aqge i;
        ffhh ffhhVar = ffhh.a;
        int i2 = this.a;
        ffci.b(obj);
        if (i2 == 0) {
            ?? r5 = this.c;
            Iterator<E> it = ((engw) this.b).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((ResolvedRecipient) obj2).g().B()) {
                    break;
                }
            }
            ResolvedRecipient resolvedRecipient = (ResolvedRecipient) obj2;
            ffxx ffygVar = (resolvedRecipient == null || (i = resolvedRecipient.i()) == null) ? new ffyg(Optional.empty()) : aqfu.a(i);
            this.a = 1;
            if (ffyk.c(r5, ffygVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
